lexer grammar FrameLexer;
@lexer::package {Parser}

//new tokens
ExportKW: 'export';
ComponentKW  : 'Component';
SelectorKW   : 'selector';
StandaloneKW : 'standalone';
ImportsKW    : 'imports';
ImportKW    : 'import';
FromKW       : 'from';
TemplateKW   : 'template';
RoutesType : 'Routes';
SignalKW : 'signal';



ClassKW: 'class';
ConstructorKW: 'constructor';
ConstKW : 'const';
AS          : 'as';
LET         : 'let';
If     : 'if';
Else   : 'else';
Return: 'return';
AngularQut:'`';




//old
Accessmodifier: 'public' | 'private' | 'protected';
Type: 'number' | 'string' | 'boolean' | 'any' | 'Array';
TypeDeclare: 'type';
Arrow: '=>';


//basics
NON_NULL_DOT : '!.';
SEMICOLON   : ';';
ATT         : '@';
COMMA       : ',';
COLON       : ':';
INTERP_OPEN  : '{{';
INTERP_CLOSE : '}}';
LBRACKETS   :'{';
RBRACKETS   :'}';
LPAREN      : '(';
RPAREN      : ')';
LBRACKET    : '[';
RBRACKET    : ']';
EQUALS      : '=';
EQUALEQUAL:'==';
TEQUAL:'===';
NTEQUAL     : '!==';
NOTEQUAL:'!=';
QUESTION    : '?';
PIPE        : '|';
OROR   : '||';
ANDAND : '&&';

NOT : '!';
PLUS      : '+';
MINUS     : '-';
ASTERISK    : '*';
DIV       : '/';
DOT         : '.';
LT          : '<';
GT          : '>';
LTE : '<=';
GTE : '>=';


ELLIPSIS   : '...';
QDOT       : '?.';
NULLISH    : '??';


///////////////////////////////////////////
//html

DIV_TAG_OPEN         : '<div';
DIV_TAG_CLOSE        : '</div>';
STYLE                : 'style';
STAR_NG_IF          : '*ngIf';
STAR_NG_FOR         : '*ngFor';
CLICK                : '(click)';
NG_MODEL           : '[ngModel]';
NG_MODEL_TWO_WAY   : '[(ngModel)]';
FORM_TAG_OPEN      : '<form';
FORM_TAG_CLOSE     : '</form>';
ID                   : 'id';
P_TAG_OPEN         : '<p';
P_TAG_CLOSE        : '</p>';
BUTTON_TAG_OPEN      : '<button';
BUTTON_TAG_CLOSE     : '</button>';
DISABLED             : 'disabled';
INPUT_TAG_OPEN       : '<input';
TAG_SELF_CLOSE   : '/>';
PLACEHOLDER          : 'placeholder';
VALUE                : 'value';
NAME                 : 'name';
IMG_TAG_OPEN         : '<img';
SRC                  : 'src';
ALT                  : 'alt';
LABEL_TAG_OPEN     : '<label';
LABEL_TAG_CLOSE    : '</label>';
FOR                : 'for';
SPAN_TAG_OPEN : '<span';
SPAN_TAG_CLOSE: '</span>';
A_TAG_OPEN    :  '<a';
A_TAG_CLOSE   : '</a>';
HREF          : 'href';
TARGET        : 'target';
REL           : 'rel';
ROUTER_LINK_BINDING : '[routerLink]';
ROUTER_OUTLET_TAG   : '<router-outlet></router-outlet>';
NG_SUBMIT          : '(ngSubmit)';








STRING: ('"' ~["]* '"') | ('\'' ~[']* '\'');
NUMBER      : '-'? DIGIT+ ('.' DIGIT+)?;
BOOLEAN     : 'true' | 'false';
NULL        : 'null';

IDENTIFIER  : LETTER (LETTER | DIGIT | '_' | '$' | '-')*;
IDENT:IDENTIFIER;

ESCAPE      : '\\\\' [btnfr"\\'];


WS          : [ \t\r\n]+ -> skip;

fragment LETTER : [a-zA-Z#];
fragment DIGIT : [0-9];


///////////
//trash
/*

// Tokens from TypeScriptLexer
//COMPARISON: (LT  |GT | '<=' | '>=');
//Void: 'void';
//SLASH_GT    : '</';
//SLASH_LT    : '/>';
//Async: 'async';
//Await: 'await';
//ReadOnly: 'readonly';
//SetGet: 'set' | 'get';
//LBRACKET_PAREN : '[(';
//RBRACKET_PAREN : ')]';
//
//
//OF          : 'of';
//
TEMPLATE_STRING
    : '`' ( ~'`' )* '`'
    ;


*/