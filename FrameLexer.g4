lexer grammar FrameLexer;

IMG_TAG_OPEN         : '<img';
TAG_SELF_CLOSE   : '/>';
SRC                  : 'src';
ALT                  : 'alt';

BUTTON_TAG_OPEN      : '<button';
BUTTON_TAG_CLOSE     : '</button>';
TYPE                 : 'type';
DISABLED             : 'disabled';
CLICK                : '(click)';
STYLE                : 'style';


INPUT_TAG_OPEN       : '<input';
PLACEHOLDER          : 'placeholder';
VALUE                : 'value';
NAME                 : 'name';
ID                   : 'id';

DIV_TAG_OPEN         : '<div';
DIV_TAG_CLOSE        : '</div>';
CLASS                : 'class';

P_TAG_OPEN         : '<p';
P_TAG_CLOSE        : '</p>';

ROUTER_OUTLET_TAG   : '<router-outlet></router-outlet>';
STAR_NG_IF          : '*ngIf';
STAR_NG_FOR         : '*ngFor';
NG_MODEL           : '[ngModel]';
NG_MODEL_TWO_WAY   : '[(ngModel)]';

FORM_TAG_OPEN      : '<form';
FORM_TAG_CLOSE     : '</form>';
NG_SUBMIT          : '(ngSubmit)';

LABEL_TAG_OPEN     : '<label';
LABEL_TAG_CLOSE    : '</label>';
FOR                : 'for';

AT_COMPONENT  : '@Component';
SELECTOR      : 'selector';
TEMPLATE      : 'template';
STYLEURLS     : 'styleUrls';
EXPORT        : 'export';
PRIMITIVE_TYPE
    : 'string'
    | 'number'
    | 'boolean'
    | 'void'
    | 'any'
    ;

PLUS       : '+';
MINUS      : '-';
STAR       : '*';
DIV        : '/';
GT         : '>';
LT         : '<';
AND        : '&&';
OR         : '||';
NOT        : '!';
NUMBER     : [0-9]+;
BOOLEAN    : 'true' | 'false';

LBRACE        : '{';
RBRACE        : '}';
LPAREN        : '(';
RPAREN        : ')';
COLON         : ':';
COMMA         : ',';
LBRACK       : '[';
RBRACK       : ']';
IDENTITY      : [a-zA-Z_][a-zA-Z0-9_]*;


CONSTRUCTOR       : 'constructor';

THIS         : 'this';
DOT          : '.';
SEMI         : ';';

LET    : 'let';
CONST  : 'const';
VAR    : 'var';
RETURN : 'return';

PUBLIC     : 'public';
PRIVATE    : 'private';
PROTECTED  : 'protected';
STATIC     : 'static';
ASYNC      : 'async';

AT_INJECTABLE  : '@Injectable';
PROVIDEDIN     : 'providedIn';
USECLASS       : 'useClass';
USEVALUE       : 'useValue';
EXTENDS  : 'extends';
UNCTION : 'function';
ARROW : '=>';
INTERFACE : 'interface';
ENUM : 'enum';

ROUTES    : 'Routes';
PATH      : 'path';
COMPONENT : 'component';

EQ                   : '=';
STRING               : '"' (~["\r\n])* '"';
WS                   : [ \t\r\n]+ -> skip;

//// ====== Literals ======
//STRING          : ('"' ~["]* '"') | ('\'' ~[']* '\'');
//NUMBER          : '-'? DIGIT+ ('.' DIGIT+)?;
//IDENTIFIER      : LETTER (LETTER | DIGIT | '_' | '$' | '-')*;
//IDENT           : IDENTIFIER;
//
//// ====== Escapes & Whitespace ======
//ESCAPE          : '\\\\' [btnfr"\\'];
//WS              : [ \t\r\n]+ -> skip;
//
//// ====== Fragments ======
//fragment LETTER : [a-zA-Z#];
//fragment DIGIT  : [0-9];