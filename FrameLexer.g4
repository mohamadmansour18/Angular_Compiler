lexer grammar FrameLexer;
@lexer::package {Parser}

//new tokens
EXPORT_KW      : 'export';
COMPONENT_KW   : 'Component';
SELECTOR_KW    : 'selector';
STANDALONE_KW  : 'standalone';
IMPORTS_KW     : 'imports';
IMPORT_KW      : 'import';
FROM_KW        : 'from';
TEMPLATE_KW    : 'template';
ROUTES_TYPE    : 'Routes';
ROUTES_ID      : 'routes';
SIGNAL_KW      : 'signal';


CLASS_KW        : 'class';
CONSTRUCTOR_KW  : 'constructor';
CONST_KW        : 'const';
AS              : 'as';
LET             : 'let';
IF              : 'if';
ELSE            : 'else';
RETURN          : 'return';
ANGULAR_QUT     : '`';




//old
ACCESS_MODIFIER : 'public' | 'private' | 'protected';
TYPE            : 'number' | 'string' | 'boolean' | 'any' | 'Array';
TYPE_DECLARE    : 'type';
ARROW           : '=>';




/*



*/





//basics
NON_NULL_DOT : '!.';
SEMICOLON   : ';';
DOLAR : '$';
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