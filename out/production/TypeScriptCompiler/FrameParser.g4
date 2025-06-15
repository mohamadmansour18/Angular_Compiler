// Main parser grammar for TypeScript-like input with Angular support
parser grammar FrameParser;

// This parser uses tokens defined in FrameLexer.g4
options { tokenVocab=FrameLexer; }

// Entry point of the TypeScript program: can be multiple programs or just EOF
rootprogram: (program)* | EOF;

// A single program consists of one or more statements
program: statements+;

// A statement can optionally start with 'export' or 'await', followed by a core statement
statements: Export? Await? (
   stetment
) SEMICOLON?;

// Core statement types in the language (variable declaration, function, class, etc.)
stetment:
    services                         # ServicesStatement
  | component                        # ComponentStatement
  | print                            # PrintStatement
  | vardeclare                       # VarDeclareStatement
  | function                         # FunctionStatement
  | cullfunction                     # CallFunctionStatement
  | access                           # AccessStatement
  | typedeclare                      # TypeDeclareStatement
  | enum                             # EnumStatement
  | interface                        # InterfaceStatement
  | class                            # ClassStatement
  | operations                       # OperationsStatement
  | import_rule                      # ImportStatement
  | template                         # TemplateStatement
  | if_statement                     # IfStatement
  | loop_statement                   # LoopStatement
  | prefix                           # PrefixStatement;

// TypeScript prefix increment/decrement syntax: x++ or x--
prefix :IDENTIFIER (PLUS PLUS|MINUS MINUS);

// TypeScript component decorator syntax: @Component({...}) or @Component(template)
component: ATT Component LPAREN  objects RPAREN 
         | ATT Component LPAREN  template RPAREN ;

// TypeScript service decorator syntax: @Injectable({...})
services: ATT Injectable LPAREN  objects RPAREN ;

// TypeScript import syntax: import { Component | IDENTIFIER } from "STRING";
import_rule: Import LBRACKETS (Component | IDENTIFIER)(COMMA  (Component | IDENTIFIER))* RBRACKETS From STRING SEMICOLON?;

// TypeScript operation syntax: access = value
operations: access equal;

// TypeScript class syntax: class IDENTIFIER { ... } with optional 'implements'
class: Class IDENTIFIER (Implements IDENT )? LBRACKETS (Accessmodifier? classbody )* RBRACKETS;

// TypeScript variable inside class: readonly? IDENTIFIER followed by type or value assignment
var: ReadOnly? ((IDENTIFIER) ((type | equal) | (type equal)));

// TypeScript class body: can include variables, constructors, or functions (with optional getter/setter)
classbody: (var | constructor | (((SetGet)? class_function)))SEMICOLON?;

// TypeScript constructor syntax: constructor(parameters) { statements }
constructor: Constructor LPAREN   prameters? RPAREN  LBRACKETS (statements)* RBRACKETS;

// TypeScript interface declaration: interface IDENTIFIER { ... }
interface: Interface IDENTIFIER LBRACKETS (interfacebody)* RBRACKETS;

// Interface body can include method declarations or variable declarations
interfacebody: interfacefun | interfacevar;

// TypeScript method inside interface: IDENTIFIER(parameters): Type;
interfacefun: IDENTIFIER LPAREN  prameters? RPAREN  COLON  Type;

// TypeScript variable inside interface: readonly? IDENTIFIER?: Type;
interfacevar: ReadOnly? IDENTIFIER PIPE ? COLON  Type;

// TypeScript enum syntax: enum IDENTIFIER { key = value, ... }
enum: Enum IDENTIFIER LBRACKETS enumassignable? RBRACKETS;

// TypeScript enum assignments: key = value, ...
enumassignable: enumAssin (COMMA  enumAssin)* COMMA ?;

// TypeScript enum assignment syntax: key = number|STRING|BOOLEAN or just key
enumAssin: (IDENTIFIER EQUALS number_STRING_BOOLEAN) | (IDENTIFIER);

// TypeScript basic data types: number, STRING, BOOLEAN
number_STRING_BOOLEAN : NUMBER | STRING | BOOLEAN;

// TypeScript function syntax inside class or interface: IDENTIFIER(parameters): Type { ... }
class_function: IDENTIFIER header body;

// TypeScript standalone function syntax: function IDENTIFIER(parameters): Type { ... }
function: Function class_function;

// TypeScript body without curly braces: optional statements or return
body_with_out_curly: (statements? (return)?);

// TypeScript body with curly braces: { statements return }
body: LBRACKETS (statements* (return)?) RBRACKETS;

// Base data types: primitives, objects, function calls, access, arrays, templates
basedata:
    info
  | IDENTIFIER;

// Wrapper for multiple data types and calls
info: number_STRING_BOOLEAN                #Variable
    | objects                              #Objectss
    | cullfunction                         #CallFunction
    | access                               #Accesss
    | array                                #Arrays
    | template                             #AngularTemplet
    | (AngularQut template AngularQut)     #QuitAngulat;

// TypeScript array syntax: [element, ...]
array: LBRACKET (basedata (COMMA  basedata)* COMMA ?)? RBRACKET;

// TypeScript data expression: either arrow function or base data
data: (arrowfunction | basedata);

// TypeScript type assignment syntax: = value or structure
typeequal: EQUALS (number_STRING_BOOLEAN | cullfunction | access | typecurles);

// TypeScript return statement: return value;
return: Return basedata SEMICOLON?;

// TypeScript type declaration syntax: type IDENTIFIER = value;
typedeclare: TypeDeclare IDENTIFIER typeequal;

// TypeScript function parameters syntax: one or more parameters with optional access modifiers
prameters: (Accessmodifier? prameter (COMMA Accessmodifier? prameter)*);

// TypeScript function header syntax: (parameters): Type
header: LPAREN prameters? RPAREN type?;

// TypeScript arrow function syntax: async? (parameters) => { body }
arrowfunction: Async? header Arrow (body | body_with_out_curly);

// TypeScript console log syntax: console.log(value);
print: Console DOT IDENTIFIER LPAREN (arguments) RPAREN;

// TypeScript parameter syntax: IDENTIFIER: Type = value | { object }
prameter: IDENTIFIER ((type? equal?) | (objects));

// TypeScript function arguments syntax: argument, ...
arguments: (argument) (COMMA argument)*;

// TypeScript argument syntax: IDENTIFIER = value | object | value
argument: (IDENTIFIER equalbasedata?) | objects | basedata | arrowfunction;

// TypeScript variable declaration: const/let/var IDENTIFIER: Type = value;
vardeclare: keyword prameter;

// TypeScript variable declaration keyword: const or let
keyword: Const | LET;

// TypeScript equal syntax: = or === followed by data and optional casting
equal: ((EQUALS | TEQUAL) data (AS IDENTIFIER)?);

equalbasedata: EQUALS basedata;

// TypeScript types: Type, IDENTIFIER, void, never, object types, optionally with array brackets
types: (Type | IDENTIFIER | Void | Never | objectstype) ((LBRACKET RBRACKET)? (LBRACKET RBRACKET)?);

// TypeScript type annotation: : Type [& Type | or Type]
type: (COLON types ((And | Or) types)*);

// TypeScript access syntax: obj.property.subproperty
access: culls (DOT culls)+;

// TypeScript chained calls or identifiers: identifier, function call, or identifier with array access
culls: ((IDENTIFIER | cullfunction | (IDENTIFIER array)) PIPE ?);

// TypeScript function call syntax: IDENTIFIER(arguments)
cullfunction: IDENTIFIER LPAREN arguments? RPAREN;

// TypeScript object syntax: { key: value, ... }
objects: LBRACKETS (object (COMMA object)* COMMA ?)? RBRACKETS;

// TypeScript object key-value pair: key: value
object: IDENTIFIER (COLON data)?;

// TypeScript object type syntax: { key: Type, ... }
objectstype: LBRACKETS (objecttype (COMMA objecttype)*)? RBRACKETS;

// TypeScript object type key-value pair: key: Type
objecttype: IDENTIFIER COLON Type;

// TypeScript type curly braces: { key?: Type, ... }
typecurles: LBRACKETS (typecurle ((COMMA | SEMICOLONColon) typecurle)*)? RBRACKETS;

typecurle: ReadOnly? IDENTIFIER PIPE ? COLON (Type | data);

// Angular template: collection of HTML or Angular elements or text
template : (element | text)+;

// Angular template elements: standard HTML or Angular component
element :
    htmlElement
  | angularComponent;

// Angular template content: can be a character, text, or any element
content:
    character          #Characters
  | text               #Texts
  | htmlElement        #Html
  | angularComponent   #AngularComponents
  | directiveElement   #Directive;

// Container for multiple content elements
elementContent : (content)*;

// HTML element structure with optional content or empty tag
htmlElement : (tagOpen elementContent tagClose) | (tagOpenEmpty);

// Special characters allowed in template
character:(PLUS | MINUS);

// HTML empty tag syntax: <tag .../>
tagOpenEmpty : LT IDENTIFIER ((elementContent)|attribute)(attribute)* SLASH_LT;

// HTML opening tag syntax: <tag ...>
tagOpen : LT IDENTIFIER ((elementContent)|attribute)(attribute*) GT;

// HTML closing tag syntax: </tag>
tagClose : SLASH_GT IDENTIFIER GT;

// HTML or Angular attribute syntax: key="value" or key={expression}
attribute : (IDENTIFIER|(LPAREN expression RPAREN)|Class) ( EQUALS (STRING | NUMBER | BOOLEAN  | NULL) )?;

// Angular component as custom element
angularComponent : LT IDENTIFIER (attribute)* GT;

// Angular directive: structural, attribute, or two-way binding
directiveElement :
    structuralDirective            #Structural
  | attributeDirective             #Attributes
  | twoWayDirective                #TwoWay;

// Structural directive syntax: *ngIf="condition"
structuralDirective : STRUCTURAL_DIRECTIVE EQUALS expression ;

// Attribute directive syntax: [attr]="expression"
attributeDirective : LBRACKET expression RBRACKET EQUALS expression;

// Two-way binding syntax: [(ngModel)]="value"
twoWayDirective : LBRACKET_PAREN expression RBRACKET_PAREN EQUALS expression;

// Top-level expression
expression
    : logicalOrExpression;

// Logical OR expression: a && b && c
logicalOrExpression
    : logicalAndExpression ( ANDAND logicalAndExpression )*;

// Logical AND expression: a || b || c
logicalAndExpression
    : equalityExpression ( OROR equalityExpression )*;

// Equality expression: a == b or a != b
equalityExpression
    : relationalExpression ( ( EQUALEQUAL | NOTEQUAL ) relationalExpression )*;

// Relational expression: a > b, a <= b, etc.
relationalExpression
    : additiveExpression ((LT|GT|(LT EQUALS)|(GT EQUALS))  additiveExpression )*;

// Additive expression: a + b, a - b
additiveExpression
    : multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )*;

// Multiplicative expression: a / b
multiplicativeExpression
    : unaryExpression ( ( DIV ) unaryExpression )*;

// Unary expression: -x or !x
unaryExpression
    : ( NOT | MINUS ) unaryExpression
    | primaryExpression;

// Primary expression: literals, identifiers, grouped expressions, function/array/object access
primaryExpression
    : literal
    | IDENTIFIER
    | LPAREN expression RPAREN
    | functionCall
    | arrayLiteral
    | objectLiteral
    | pipeExpression
    | propLitiral;

// Angular pipe syntax: value | pipe[:arg]
pipeExpression
    : baseExpression ( PIPE IDENTIFIER ( COLON expression )? )*;

// Base values for pipes and other expressions
baseExpression
    : literal
    | IDENTIFIER
    | functionCall
    | arrayLiteral
    | objectLiteral;

// Literal values in expressions
literal : STRING | NUMBER | BOOLEAN | NULL;

// Function call expression: identifier(arguments)
functionCall : IDENTIFIER LPAREN (baseExpression (COMMA  expression)*)? RPAREN;

// Array literal: [value1, value2, ...]
arrayLiteral : LBRACKET (baseExpression (COMMA  expression)*)? RBRACKET;

// Object literal: { key: value, ... }
objectLiteral : LBRACE (IDENTIFIER COLON expression (COMMA  IDENTIFIER COLON expression)*)? RBRACE;

// Property access chain: obj.prop.subprop
propLitiral: (baseExpression DOT expression)*;

// Angular interpolation: {{ expression }}
interpolation : LBRACE expression RBRACE;

// Text content in Angular templates
text : ( IDENTIFIER|STRING|interpolation)+;

// If statement: if (condition) { statements } else { statements }
if_statement
    : If LPAREN expression RPAREN LBRACKETS statements* RBRACKETS
     (Else LBRACKETS statements* RBRACKETS)?;

// Loop statement: while or for block
loop_statement
    : (while |for)
      LBRACKETS statements* RBRACKETS;

// While loop: while (condition)
while:While LPAREN expression RPAREN;

// For loop: for(init; condition; step)
for: For LPAREN loop_init? SEMICOLON expression? SEMICOLON loop_step? RPAREN;

// Initialization part of for loop
loop_init
    : vardeclare | expression (COMMA expression)*;

// Step (increment/decrement) part of for loop
loop_step
    : expression (COMMA expression)*;
