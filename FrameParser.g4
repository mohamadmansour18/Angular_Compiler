parser grammar FrameParser;

@parser::package {Parser}
options { tokenVocab=FrameLexer; }

rootprogram : program* EOF ;

program: statements+ ;

statements: (
   stetment
) SEMICOLON?;

stetment:
       importStatement                  # ImportStatement1
       | classStatement                 # ClassStatement1
       | componentDecorator             # ComponentStatement1
       | functionDeclaration            # FunctionStatement
       | constructorDeclaration         # ConstructorStatement
       | varDeclareStatement            # VarDeclareStatement1
       | typeAliasStatement             # TypeAliasStatement1
       | exprStatement                  # ExprStatement1
       ;


importStatement
    : IMPORT_KW LBRACKETS (IDENTIFIER | COMPONENT_KW | SIGNAL_KW | ROUTES_TYPE) RBRACKETS FROM_KW STRING
    ;

classStatement
    : EXPORT_KW? CLASS_KW IDENTIFIER LBRACKETS classBody RBRACKETS
    ;

classBody
    : classMember*
    ;

classMember
    : constructorDeclaration
    | functionDeclaration
    | propertyDeclaration
    | exprStatement
    ;

propertyDeclaration
    : routesPropertyDeclaration
    | normalPropertyDeclaration
    ;

routesPropertyDeclaration
    : ROUTES_TYPE COLON ROUTES_TYPE EQUALS assignmentExpr SEMICOLON
    ;

normalPropertyDeclaration
    : IDENTIFIER generalTypeAnnotation? EQUALS assignmentExpr SEMICOLON
    ;


//component
 componentDecorator
     : ATT COMPONENT_KW LPAREN LBRACKETS componentOptions RBRACKETS RPAREN
     ;


componentOptions
    : selectorProperty (COMMA standaloneProperty)? (COMMA importsProperty)? (COMMA templateProperty)?
    ;

selectorProperty
    : SELECTOR_KW COLON STRING
    ;

standaloneProperty
    : STANDALONE_KW COLON BOOLEAN
    ;

importsProperty
    : IMPORTS_KW COLON LBRACKET IDENTIFIER (COMMA IDENTIFIER)* RBRACKET
    ;

templateProperty
    : TEMPLATE_KW COLON ANGULAR_QUT htmlSection* ANGULAR_QUT
    ;

//function & constructors
constructorDeclaration
    : CONSTRUCTOR_KW LPAREN constructorParamList? RPAREN block
    ;

constructorParamList
    : constructorParam (COMMA constructorParam)*
    ;

constructorParam
    : ACCESS_MODIFIER? IDENTIFIER COLON (IDENTIFIER|Type)
    ;

functionDeclaration
    : IDENTIFIER LPAREN paramList? RPAREN block
    ;

paramList
    :  param (COMMA param)*
    ;

param
    :  ACCESS_MODIFIER? IDENTIFIER (COLON (IDENTIFIER|Type))?
    ;

block
    : LBRACKETS blockContent? RBRACKETS
    ;

blockContent
    : statementInBlock*
    ;

statementInBlock
    : varDeclareStatement
    | exprStatement
    | ifStatement
    | returnStatement
    ;

ifStatement
    : IF LPAREN expr RPAREN (block | exprStatement | returnStatement) (ELSE (block | exprStatement | returnStatement))?
    ;

returnStatement
    : RETURN expr? SEMICOLON
    ;

// تصريح متغيّر: يسمح بالـ type annotation فقط إذا كان الاسم routes وبالنوع Routes
varDeclareStatement
    : EXPORT_KW? (CONST_KW | LET) varDecl (COMMA varDecl)* SEMICOLON
    ;

varDecl
  : ROUTES_ID (COLON ROUTES_TYPE)? (EQUALS assignmentExpr)?
  | IDENTIFIER generalTypeAnnotation? (EQUALS assignmentExpr)?
  ;


generalTypeAnnotation
    : COLON typeRef
    ;




// === Type Alias & Object Type Literals (Plan A) ===
typeAliasStatement
    : TYPE_DECLARE IDENTIFIER EQUALS objectType SEMICOLON
    ;

// { id: string; name?: string; price: number | null; }
objectType
    : LBRACKETS objectTypeMembers? RBRACKETS
    ;

objectTypeMembers
    : objectTypeMember (SEMICOLON objectTypeMember)* SEMICOLON?
    ;

// name?: TypeRef
objectTypeMember
    : IDENTIFIER QUESTION? COLON typeRef
    ;

// Basic type references with arrays and unions, allowing NULL as a type
// Examples: string, number[], Product, Product[], number | null, Product[] | null
typeRef
    : (IDENTIFIER | TYPE | NULL) (LBRACKET RBRACKET)* (PIPE typeRef)*
    ;

exprStatement
    : expr SEMICOLON
    ;

// === Expressions (full simple set) ===
expr
    : assignmentExpr
    ;

// right-assoc: a = b = c

assignmentExpr
        : assignable EQUALS assignmentExpr
        | conditionalExpr
        ;


    // LHS قابل للإسناد: اسم + (وصول عضو/فهرسة) بدون ?. وبدون نداء دوال
assignable
    : (IDENTIFIER | LPAREN expr RPAREN)
      (
          DOT (IDENTIFIER|SRC|TARGET)
        | LBRACKET expr RBRACKET
      )*
    ;

conditionalExpr
    : nullishExpr (QUESTION expr COLON expr)?
    ;

// nullish coalescing (??)
// ملاحظة: JS ما بيسمح خلط ?? مع ||/&& بدون أقواس.
// هون ما عم نفرض هالقاعدة سيمنتيكياً؛ إذا بدك تشدّدها لاحقاً منضيف حارس.
nullishExpr
    : logicalOrExpr (NULLISH logicalOrExpr)*
    ;

// || (left-assoc)
logicalOrExpr
    : logicalOrExpr OROR logicalAndExpr
    | logicalAndExpr
    ;

// && (left-assoc)
logicalAndExpr
    : logicalAndExpr ANDAND equalityExpr
    | equalityExpr
    ;

// ===, ==, != (left-assoc)
equalityExpr
    : equalityExpr (TEQUAL | EQUALEQUAL | NTEQUAL | NOTEQUAL) relationalExpr
    | relationalExpr
    ;


// <, >, <=, >= (left-assoc)
relationalExpr
    : relationalExpr (LT | GT | LTE | GTE) additiveExpr
    | additiveExpr
    ;

// +, - (left-assoc)
additiveExpr
    : additiveExpr (PLUS | MINUS) multiplicativeExpr
    | multiplicativeExpr
    ;

    // *, / (left-assoc)
multiplicativeExpr
    : multiplicativeExpr (ASTERISK | DIV) unaryExpr
    | unaryExpr
    ;

// !x, +x, -x (right-assoc)
unaryExpr
    : (NOT | PLUS | MINUS) unaryExpr
    | asExpression
    ;

asExpression
    : postfixExpr (AS typeRef)*
    ;

// calls / member access / indexing / optional chaining (left-assoc chain)
postfixExpr
    : primary
      (
          (DOT | QDOT) (IDENTIFIER|SRC|TARGET)
        | LPAREN argumentList? RPAREN
        | QDOT LPAREN argumentList? RPAREN
        | LBRACKET expr RBRACKET
        | QDOT LBRACKET expr RBRACKET
        | NON_NULL_DOT (IDENTIFIER | SRC | TARGET)
      )*
    ;

// signal<Product[]>(args)
signalGenericCallPrimary
    : SIGNAL_KW LT signalGenericArgs GT LPAREN argumentList? RPAREN
    ;

signalGenericArgs
    : signalGenericArg (COMMA signalGenericArg)*
    ;

signalGenericArg
    : (IDENTIFIER | Type) (LBRACKET RBRACKET)*
    ;

    // f(a, b, c)
argumentList
    : expr (COMMA expr)*
    ;

// === primary ===
// ملاحظة: arrowFunction جاية أولاً مع lookahead بسيط لتمييز IDENTIFIER '=>' عن IDENTIFIER العادي

primary
        : arrowFunction
        | NUMBER
        | ROUTES_ID
        | STRING
        | BOOLEAN
        | NULL
        | ANGULAR_QUT htmlSection* ANGULAR_QUT
        | arrayLiteral
        | objectLiteral
        | signalGenericCallPrimary
        | importCallPrimary
        | SIGNAL_KW
        | IDENTIFIER
        | IMPORT_KW
        | LPAREN expr RPAREN
        ;


// import('./path').then(...).catch(...)
// يسمح بسلسلة .then(...).catch(...) أو حتى استدعاء مباشر بعد import(...)
importCallPrimary
    : IMPORT_KW LPAREN STRING RPAREN (DOT IDENTIFIER LPAREN argumentList? RPAREN)*
    ;


// (x) => expr  |  (a,b)=>{...}  |  x => expr
arrowFunction
    : IDENTIFIER ARROW (expr | block)                          // single param
    | LPAREN paramListSimple? RPAREN ARROW (expr | block)      // (a,b)=>...
    ;

// a, b, c
paramListSimple
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

// [a, b, ...rest]
arrayLiteral
    : LBRACKET ( arrayElement (COMMA arrayElement)* )? COMMA? RBRACKET
    ;

arrayElement
    : ELLIPSIS expr
    | expr
    ;

// { key: value, "x": y, ...obj }
objectLiteral
    : LBRACKETS ( objectProperty (COMMA objectProperty)* )? COMMA? RBRACKETS
    ;

objectProperty
    : ELLIPSIS expr
    | (IDENTIFIER | STRING) COLON expr
    | IDENTIFIER
    ;


interpolation
    : DOLAR? INTERP_OPEN expr INTERP_CLOSE
    ;



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//html

htmlSection
    : htmlDivTag         #HTMLDivLabel
    | htmlFormTag        #HTMLFormLabel
    | htmlParagraphTag   #HTMLParagraphLabel
    | htmlButtonTag      #HTMLButtonLabel
    | htmlInputTag       #HTMLInputLabel
    | htmlImageTag       #HTMLImageLabel
    | htmlLabelTag       #HTMLLabel
    | htmlSpanTag        #HTMLSpanLabel  ///////////////////////////
    | htmlAnchorTag      #HTMLAnchorLabel  ////////////////////////
    | routerOutletTag    #HTMLRouterOutletLabel
    ;

//<img src="image.png" alt="description" style="color: red; font-size: 16px;" />
htmlImageTag
    : IMG_TAG_OPEN imgAttribute* TAG_SELF_CLOSE
    ;

imgAttribute
    : SRC EQUALS STRING
    | ALT EQUALS STRING
    | STYLE EQUALS STRING
    ;

//-----------------------------------------

//<button type="submit" disabled (click)="handleClick()" style="color: red; font-size: 16px;"> Click Me</button>
htmlButtonTag
    : BUTTON_TAG_OPEN buttonAttribute* GT buttonContent? BUTTON_TAG_CLOSE
    ;

buttonAttribute
    : TYPE_DECLARE EQUALS STRING
    | DISABLED
    | STYLE EQUALS STRING
    | STAR_NG_IF EQUALS STRING
    | STAR_NG_FOR EQUALS STRING
    | CLICK EQUALS STRING
    | NG_MODEL EQUALS STRING
    | NG_MODEL_TWO_WAY EQUALS STRING
    ;

buttonContent
    : STRING
    ;

//-----------------------------------------

//<input id="username" name="username" [(ngModel)]="user.name" value="Ali"  type="text" placeholder="Your name" style="color: blue;" />
htmlInputTag
    : INPUT_TAG_OPEN inputAttribute* TAG_SELF_CLOSE
    ;

inputAttribute
    : TYPE_DECLARE EQUALS STRING
    | PLACEHOLDER EQUALS STRING
    | STYLE EQUALS STRING
    | VALUE EQUALS STRING
    | NAME EQUALS STRING
    | ID EQUALS STRING
    | NG_MODEL EQUALS STRING
    | NG_MODEL_TWO_WAY EQUALS STRING
    ;

//-----------------------------------------

//<p id="msg" style="color: red;">Welcome to Angular!</p>
htmlParagraphTag
    : P_TAG_OPEN paragraphAttribute* GT paragraphContent? P_TAG_CLOSE
    ;

paragraphAttribute
    : ID EQUALS STRING
    | CLASS_KW EQUALS STRING
    | STYLE EQUALS STRING
    | STAR_NG_IF EQUALS STRING
    | STAR_NG_FOR EQUALS STRING
    | CLICK EQUALS STRING
    | NG_MODEL EQUALS STRING
    | NG_MODEL_TWO_WAY EQUALS STRING
    ;

paragraphContent
    : htmlImageTag                                #ParagraphImageLabel
    | htmlButtonTag                               #ParagraphButtonLabel
    | htmlInputTag                                #ParagraphInputLabel
    | interpolation                               #ParagraphPolationLabel
    | STRING                                      #ParagraphTextLabel
    ;

//-----------------------------------------

//<label for="username">Username:</label>
htmlLabelTag
    : LABEL_TAG_OPEN labelAttribute* GT labelContent* LABEL_TAG_CLOSE       ///////////////
    ;

labelAttribute
    : FOR EQUALS STRING
    | STYLE EQUALS STRING
    | CLASS_KW EQUALS STRING
    ;

labelContent
    : STRING
    | htmlSpanTag               ///////////////
    | htmlInputTag              ///////////////
    ;

//-----------------------------------------

//<div id="container" style="margin: 10px;">
//    <p>Hello</p>
//    <button>Click</button>
//</div>

htmlDivTag
    : DIV_TAG_OPEN divAttribute* GT divContent* DIV_TAG_CLOSE
    ;

divAttribute
    : ID EQUALS STRING
    | CLASS_KW EQUALS STRING
    | STYLE EQUALS STRING
    | STAR_NG_IF EQUALS STRING
    | STAR_NG_FOR EQUALS STRING
    | CLICK EQUALS STRING
    | NG_MODEL EQUALS STRING
    | NG_MODEL_TWO_WAY EQUALS STRING
    ;

divContent
    : htmlImageTag                 #DivImageLabel
    | htmlButtonTag                #DivButtonLabel
    | htmlInputTag                 #DivInputLabel
    | htmlParagraphTag             #DivParagraphLabel
    | htmlDivTag                   #DivNestedLabel
    | htmlSpanTag        #DivSpanLabel          ///////////////
    | htmlAnchorTag      #DivAnchorLabel        ///////////////
    | htmlLabelTag       #DivLabel              ///////////////
    | routerOutletTag              #DivRouterOutletLabel
    | ngIfDirective                #DivNgIfLabel
    | ngForDirective               #DivNgForLabel
    | interpolation                #DivInterpolationLabel
    | STRING                       #DivPlainTextLabel
    ;

//-----------------------------------------
//<form id="userForm" (ngSubmit)="submitForm()" style="margin: 10px;"></form>
htmlFormTag
    : FORM_TAG_OPEN formAttribute* GT formContent* FORM_TAG_CLOSE
    ;

formAttribute
    : ID EQUALS STRING
    | CLASS_KW EQUALS STRING
    | STYLE EQUALS STRING
    | NG_SUBMIT EQUALS STRING
    ;

formContent
    : htmlInputTag         #FormInputLabel
    | htmlButtonTag        #FormButtonLabel
    | htmlLabelTag         #FormLabel
    | htmlDivTag           #FormDivLabel
    | STRING               #FormTextLabel
    ;

    //-----------------------------------------
    //<span class="note" style="color:red;">"هذا نص داخل span"</span>
    htmlSpanTag                                                                 ///////////////
        : SPAN_TAG_OPEN spanAttribute* GT spanContent? SPAN_TAG_CLOSE
        ;

    spanAttribute
        : STYLE EQUALS STRING
        | CLASS_KW EQUALS STRING
        ;

    spanContent
        : STRING
        ;

    //-----------------------------------------
    //<a href="https://example.com" target="_blank" rel="noopener" class="link" style="text-decoration:none;">"اذهب إلى Example"</a>
    htmlAnchorTag                                                               ///////////////
        : A_TAG_OPEN anchorAttribute* GT anchorContent? A_TAG_CLOSE
        ;

    anchorAttribute
        : HREF EQUALS STRING
        | TARGET EQUALS STRING
        | REL EQUALS STRING
        | STYLE EQUALS STRING
        | CLASS_KW EQUALS STRING
        | ROUTER_LINK_BINDING EQUALS STRING
        ;

    anchorContent
        : STRING
        ;
    //-----------------------------------------

    routerOutletTag
        : ROUTER_OUTLET_TAG
        ;

    ngIfDirective
        : STAR_NG_IF EQUALS STRING
        ;

    ngForDirective
        : STAR_NG_FOR EQUALS STRING
        ;