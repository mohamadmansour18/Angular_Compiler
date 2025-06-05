lexer grammar FrameLexer;

// ====== Keywords ======
Body            : 'body';
Import          : 'import';
From            : 'from';
Export          : 'export';
Interface       : 'interface';
TypeDeclare     : 'type';
Enum            : 'enum';
Function        : 'function';
Constructor     : 'constructor';
Class           : 'class';
Implements      : 'implements';
Return          : 'return';
If              : 'if';
Else            : 'else';
For             : 'for';
While           : 'while';
Async           : 'async';
Await           : 'await';
Injectable      : 'Injectable';

// ====== Type Keywords ======
Type            : 'number' | 'string' | 'boolean' | 'any' | 'Array';
Void            : 'void';
Never           : 'never';
BOOLEAN         : 'true' | 'false';
NULL            : 'null';

// ====== Modifiers ======
Accessmodifier  : 'public' | 'private' | 'protected';
SetGet          : 'set' | 'get';
ReadOnly        : 'readonly';

// ====== Variables ======
Const           : 'const';
LET             : 'let';
OF              : 'of';
AS              : 'as';

// ====== Angular Specific ======
Component       : 'Component';
ATT             : '@';
STRUCTURAL_DIRECTIVE : '*' IDENTIFIER;
AngularQut      : '`';

// ====== Operators ======
Arrow           : '=>';
EQUALS          : '=';
TEQUAL          : '===';
EQUALEQUAL      : '==';
NOTEQUAL        : '!=';
COMPARISON      : LT | GT | '<=' | '>=';
PLUS            : '+';
MINUS           : '-';
DIV             : '/';
ANDAND          : '&&';
OROR            : '||';
NOT             : '!';

// ====== Symbols ======
ASTERISK        : '*';
LT              : '<';
GT              : '>';
SLASH_GT        : '</';
SLASH_LT        : '/>';
HASH            : '#';
LBRACKET        : '[';
RBRACKET        : ']';
LPAREN          : '(';
RPAREN          : ')';
LBRACKET_PAREN  : '[(';
RBRACKET_PAREN  : ')]';
LBRACE          : '{{';
RBRACE          : '}}';
LBRACKETS       : '{';
RBRACKETS       : '}';
COLON           : ':';
SEMICOLON       : ';';
COMMA           : ',';
DOT             : '.';
QUESTION        : '?';
PIPE            : '|';

// ====== Literals ======
STRING          : ('"' ~["]* '"') | ('\'' ~[']* '\'');
NUMBER          : '-'? DIGIT+ ('.' DIGIT+)?;
IDENTIFIER      : LETTER (LETTER | DIGIT | '_' | '$' | '-')*;
IDENT           : IDENTIFIER;

// ====== Escapes & Whitespace ======
ESCAPE          : '\\\\' [btnfr"\\'];
WS              : [ \t\r\n]+ -> skip;

// ====== Fragments ======
fragment LETTER : [a-zA-Z#];
fragment DIGIT  : [0-9];