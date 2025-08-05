parser grammar FrameParser;

@parser::package {Parser}
options { tokenVocab=FrameLexer; }

root
    : htmlSection* tsSection* EOF
    ;

htmlSection
    : htmlDivTag         #HTMLDivLabel
    | htmlFormTag        #HTMLFormLabel
    | htmlParagraphTag   #HTMLParagraphLabel
    | htmlButtonTag      #HTMLButtonLabel
    | htmlInputTag       #HTMLInputLabel
    | htmlImageTag       #HTMLImageLabel
    | htmlLabelTag       #HTMLLabel
    | routerOutletTag    #HTMLRouterOutletLabel
    ;

tsSection
    : componentDeclaration     #TSComponentLabel
    | serviceDeclaration       #TSServiceLabel
    | classDeclaration         #TSClassLabel
    | functionDeclaration      #TSFunctionLabel
    | arrowFunction            #TSArrowFunctionLabel
    | variableDeclaration      #TSVariableLabel
    | interfaceDeclaration     #TSInterfaceLabel
    | enumDeclaration          #TSEnumLabel
    //---------------<state mangment>---------------//
    | routingDeclaration         #TSRoutingLabel
    | ngrxActionDeclaration      #TSActionLabel
    | ngrxReducerDeclaration     #TSReducerLabel
    ;


//---------------------< HTML >--------------------

//<img src="image.png" alt="description" style="color: red; font-size: 16px;" />
htmlImageTag
    : IMG_TAG_OPEN imgAttribute* TAG_SELF_CLOSE
    ;

imgAttribute
    : SRC EQ STRING
    | ALT EQ STRING
    | STYLE EQ STRING
    ;

//-----------------------------------------

//<button type="submit" disabled (click)="handleClick()" style="color: red; font-size: 16px;"> Click Me</button>
htmlButtonTag
    : BUTTON_TAG_OPEN buttonAttribute* GT buttonContent? BUTTON_TAG_CLOSE
    ;

buttonAttribute
    : TYPE EQ STRING
    | DISABLED
    | CLICK EQ STRING
    | STYLE EQ STRING
    | STAR_NG_IF EQ STRING
    | STAR_NG_FOR EQ STRING
    | CLICK EQ STRING
    | NG_MODEL EQ STRING
    | NG_MODEL_TWO_WAY EQ STRING

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
    : TYPE EQ STRING
    | PLACEHOLDER EQ STRING
    | STYLE EQ STRING
    | VALUE EQ STRING
    | NAME EQ STRING
    | ID EQ STRING
    | NG_MODEL EQ STRING
    | NG_MODEL_TWO_WAY EQ STRING
    ;

//-----------------------------------------

//<p id="msg" style="color: red;">Welcome to Angular!</p>
htmlParagraphTag
    : P_TAG_OPEN paragraphAttribute* GT paragraphContent? P_TAG_CLOSE
    ;

paragraphAttribute
    : ID EQ STRING
    | CLASS EQ STRING
    | STYLE EQ STRING
    | STAR_NG_IF EQ STRING
    | STAR_NG_FOR EQ STRING
    | CLICK EQ STRING
    | NG_MODEL EQ STRING
    | NG_MODEL_TWO_WAY EQ STRING
    ;

paragraphContent
    : STRING                                      #ParagraphTextLabel
    | htmlImageTag                                #ParagraphImageLabel
    | htmlButtonTag                               #ParagraphButtonLabel
    | htmlInputTag                                #ParagraphInputLabel
    ;

//-----------------------------------------

//<label for="username">Username:</label>
htmlLabelTag
    : LABEL_TAG_OPEN labelAttribute* GT labelContent? LABEL_TAG_CLOSE
    ;

labelAttribute
    : FOR EQ STRING
    | STYLE EQ STRING
    | CLASS EQ STRING
    ;

labelContent
    : STRING
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
    : ID EQ STRING
    | CLASS EQ STRING
    | STYLE EQ STRING
    | STAR_NG_IF EQ STRING
    | STAR_NG_FOR EQ STRING
    | CLICK EQ STRING
    | NG_MODEL EQ STRING
    | NG_MODEL_TWO_WAY EQ STRING
    ;

divContent
    : htmlImageTag                 #DivImageLabel
    | htmlButtonTag                #DivButtonLabel
    | htmlInputTag                 #DivInputLabel
    | htmlParagraphTag             #DivParagraphLabel
    | htmlDivTag                   #DivNestedLabel
    | routerOutletTag              #DivRouterOutletLabel
    | ngIfDirective                #DivNgIfLabel
    | ngForDirective               #DivNgForLabel
    | STRING                       #DivPlainTextLabel
    ;

//-----------------------------------------
//<form id="userForm" (ngSubmit)="submitForm()" style="margin: 10px;"></form>
htmlFormTag
    : FORM_TAG_OPEN formAttribute* GT formContent* FORM_TAG_CLOSE
    ;

formAttribute
    : ID EQ STRING
    | CLASS EQ STRING
    | STYLE EQ STRING
    | NG_SUBMIT EQ STRING
    ;

formContent
    : htmlInputTag         #FormInputLabel
    | htmlButtonTag        #FormButtonLabel
    | htmlLabelTag         #FormLabel
    | htmlDivTag           #FormDivLabel
    | STRING               #FormTextLabel
    ;

//-----------------------------------------

routerOutletTag
    : ROUTER_OUTLET_TAG
    ;

ngIfDirective
    : STAR_NG_IF EQ STRING
    ;

ngForDirective
    : STAR_NG_FOR EQ STRING
    ;


//--------------------< TS >---------------------

//@Component({
//  selector: "x",
//  template: "...",
//  styleUrls: ["..."]
//})
//export class HeaderComponent {}
componentDeclaration
    : AT_COMPONENT LPAREN componentBody RPAREN EXPORT CLASS IDENTITY classBlock
    ;

componentBody
    : LBRACE componentProperty (COMMA componentProperty)* RBRACE
    ;

componentProperty
    : SELECTOR COLON STRING
    | TEMPLATE COLON STRING
    | STYLEURLS COLON arrayLiteral
    ;

//[] , ["X"] , ["a","b","c"] , [1,2,3] , [true , false] , [User , "user" , 1]
arrayLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK
    ;

//export class TestComponent {
//  title: string = "Hello";
//  count: number;
//  constructor() {}
//  handleClick(): void {}
//}
classBlock
    : LBRACE classMember* RBRACE
    ;

classMember
    : variableDeclaration SEMI         #ClassVariableLabel
    | constructorDeclaration           #ClassConstructorLabel
    | methodDeclaration                #ClassMethodLabel
    ;

//title: string;
//count: number = 0;
//name: string = "Angular";
//data: Product[];
variableDeclaration
    : ( LET | CONST | VAR ) IDENTITY COLON type (EQ expression)?
    ;

type
    : PRIMITIVE_TYPE
    | IDENTITY (LBRACK RBRACK)?
    ;

//10
//"Hello"
//true
//x + 5
//count > 0
//arr[0]
//matrix[i][j]
//users[index + 1]
//{ name: "Ali" }
//{ age: 25, active: true }
//{ data: user, meta: { count: 2 } }
expression
    : expression binaryOp expression   #BinaryExpressionLabel ////
    | unaryOp expression               #UnaryExpressionLabel    ////
    | literal                          #LiteralExpressionLabel ////
    | expression arrayAccess           #ArrayAccessExpression ////
    | IDENTITY                         #IdentifierExpressionLabel ////
    | objectLiteral                    #ObjectLiteralExpressionLabel ////
    | LPAREN expression RPAREN         #ParenExpressionLabel ////
    | storeSelectExpression            #SelectExpressionLabel
    ;

binaryOp
    : PLUS
    | MINUS
    | STAR
    | DIV
    | GT
    | LT
    | AND
    | OR
    ;

unaryOp
    : MINUS
    | NOT
    ;

literal
    : NUMBER
    | STRING
    | BOOLEAN
    ;

arrayAccess
    : LBRACK expression RBRACK
    ;

objectLiteral
    : LBRACE (objectProperty (COMMA objectProperty)*)? RBRACE
    ;

objectProperty
    : IDENTITY COLON expression
    ;

//constructor() {}
//constructor(private name: string, age: number) {
//  this.name = name;
//  this.log();
//  count = 0;
//  print("hello", 5);
//  let x: number = 10;
//}

constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN block
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : ( PUBLIC | PRIVATE | PROTECTED )? IDENTITY COLON type
    ;

block
    : LBRACE statement* RBRACE
    ;

statement
    : assignmentStatement        #AssignmentStmtLabel
    | functionCallStatement      #FunctionCallStmtLabel
    | variableDeclaration SEMI   #VarDeclarationStmtLabel
    | returnStatement            #ReturnStmtLabel
    | storeDispatchStatement     #DispatchStmtLabel
    ;

//this.name = name ;  & x = 5 ;
assignmentStatement
    : (THIS DOT)? IDENTITY EQ expression SEMI
    ;

//this.log(); & sayHello(name);
functionCallStatement
    : (THIS DOT)? IDENTITY LPAREN argumentList? RPAREN SEMI
    ;

argumentList
    : expression (COMMA expression)*
    ;


//log(): void {
//  console.log("Hello");
//}
//private calculate(a: number, b: number): number {
//  return a + b;
//}

methodDeclaration
    : methodModifier* ASYNC? IDENTITY LPAREN parameterList? RPAREN COLON type block
    ;

methodModifier
    : PUBLIC
    | PRIVATE
    | PROTECTED
    | STATIC
    ;

//return;
//return 5;
//return this.value;
returnStatement
    : RETURN expression? SEMI
    ;


//-----------------------------------------

//@Injectable({
//  providedIn: 'root'
//  useClass: MockService,
//  useValue: 42
//})
//export class MyService {
//  properties
//  methods
//}

serviceDeclaration
    : AT_INJECTABLE LPAREN injectableBody RPAREN EXPORT CLASS IDENTITY classBlock
    ;

injectableBody
    : LBRACE injectableProperty (COMMA injectableProperty)* RBRACE
    ;

injectableProperty
    : PROVIDEDIN COLON STRING
    | USECLASS COLON IDENTITY
    | USEVALUE COLON expression
    ;

//-----------------------------------------

//export class MyService { ... }
//export class MyComponent extends BaseComponent { ... }

classDeclaration
    : EXPORT CLASS IDENTITY (EXTENDS IDENTITY)? classBlock
    ;

//-----------------------------------------

//function sayHello(): void {
//  console.log("Hi");
//}
//function sum(a: number, b: number): number {
//  return a + b;
//}

functionDeclaration
    : ASYNC? FUNCTION IDENTITY LPAREN parameterList? RPAREN COLON type block
    ;

//-----------------------------------------

//كامل
//(): void => { console.log("hi"); }

//بدون اقواس
//(a: number, b: number): number => a + b;

// بدون جسم كتلوي
//(x: number) => x * 2;

arrowFunction
    : LPAREN parameterList? RPAREN (COLON type)? ARROW (block | expression)
    ;

//-----------------------------------------

//export interface InterfaceName {
//  key: type;
//  key2: type;
//}

interfaceDeclaration
    : EXPORT INTERFACE IDENTITY interfaceBody
    ;

interfaceBody
    : LBRACE interfaceProperty* RBRACE
    ;

interfaceProperty
    : IDENTITY COLON type SEMI
    ;

//-----------------------------------------

//export enum Direction {
//  Up,
//  Down,
//  Left = 2,
//  Right
//}

enumDeclaration
    : EXPORT ENUM IDENTITY enumBody
    ;

enumBody
    : LBRACE enumMember (COMMA enumMember)* COMMA? RBRACE
    ;

enumMember
    : IDENTITY (EQ expression)?
    ;

//--------------------< STATE MANGMENT >---------------------

// عملية التوجيه في أنغولر تستخدم لتجعل المستخدم يتنقل بين الصفحات المختلفة بدون اعادة التحميل
//const routes: Routes = [
//  { path: 'home', component: HomeComponent },
//  { path: 'about', component: AboutComponent }
//];

routingDeclaration
    : CONST IDENTITY COLON ROUTES EQ LBRACK routeConfig (COMMA routeConfig)* RBRACK SEMI
    ;

routeConfig
    : LBRACE pathProperty COMMA routeComponentProperty RBRACE
    ;

pathProperty
    : PATH COLON STRING
    ;

routeComponentProperty
    : COMPONENT COLON IDENTITY
    ;

//-----------------------------------------

// في NgRx ال Action هو كائن يستخدم لاخبار التخزين ان شيئا حدث
//export const login = createAction('[Auth] Login');

ngrxActionDeclaration
    : EXPORT CONST IDENTITY EQ CREATEACTION LPAREN actionType RPAREN SEMI
    ;

actionType
    : STRING
    ;


//-----------------------------------------

//this.store.dispatch(actionName());
storeDispatchStatement
    : THIS DOT STORE DOT DISPATCH LPAREN actionCall RPAREN SEMI
    ;

actionCall
    : IDENTITY LPAREN RPAREN
    ;

//-----------------------------------------

//this.store.select(someSelector);
storeSelectExpression
    : THIS DOT STORE DOT SELECT LPAREN selectorCall RPAREN
    ;

selectorCall
    : IDENTITY
    ;

//-----------------------------------------

// نستخدم Reduce للاستماع لل Action وتحديث ال State بناءا على كل Action

//export const myReducer = createReducer(
//  initialState,
//  on(toggle, state => { return { ...state, active: !state.active }; }),
//  on(reset, state => { return initialState; })
//);

ngrxReducerDeclaration
    : EXPORT CONST IDENTITY EQ CREATEREDUCER LPAREN reducerConfig RPAREN SEMI
    ;

reducerConfig
    : IDENTITY COMMA onReducerBlock+
    ;

onReducerBlock
    : COMMA ON LPAREN IDENTITY COMMA ARROW block RPAREN
    ;