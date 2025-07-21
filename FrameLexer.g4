lexer grammar FrameLexer;

IMG_TAG_OPEN         : '<img';
IMG_TAG_SELF_CLOSE   : '/>';
SRC                  : 'src';
ALT                  : 'alt';
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