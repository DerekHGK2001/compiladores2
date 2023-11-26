grammar Interpreter;

options {
  caseInsensitive = true;
}

// Program Definition
program: PROGRAM ID SEMICOLON
    declarations*
    BEGIN
    statements
    ENDPROGRAM;

// Declarations
declarations: ( VAR var_variables+ | CONST const_variables+ | function_declaration )+;

//funcion read
read_call: READ OPEN_PARENTHESIS (ID | array_access | arrayBi_access) CLOSE_PARENTHESIS SEMICOLON;

//funcion readln
readln_call: READLN OPEN_PARENTHESIS (ID | array_access | arrayBi_access) CLOSE_PARENTHESIS SEMICOLON;

// Variable Declaration
variable_declaration: ID (COMMA ID)* COLON TYPE SEMICOLON;

// Array Declaration
array_declaration: ID COLON ARRAY OPEN_BRACKET array_range CLOSE_BRACKET OF TYPE SEMICOLON;

array_range: NUMBER DOTDOT NUMBER;

// 2D Array Declaration
arraybi_declaration: ID COLON ARRAY OPEN_BRACKET array_range COMMA array_range CLOSE_BRACKET OF TYPE SEMICOLON;

//donde se declaran las variables var
var_variables: variable_declaration | array_declaration | arraybi_declaration ;

// Variable Declaration const
const_variable_declaration: ID '=' ( TEXT | CHAR ) SEMICOLON;

//donde se declaran las variables const
const_variables: const_variable_declaration;

// Statements
statements: statement*;

// Variable Initialization
variable_init: ID ASSIGN (ID | NUMBER | TEXT | CHAR | BOOLEANVALUE | simple_expression | array_access | arrayBi_access | function_Call) SEMICOLON;

// Array Initialization
array_init: array_access ASSIGN (ID | NUMBER | TEXT | CHAR | BOOLEANVALUE | simple_expression | array_access | arrayBi_access | function_Call) SEMICOLON;

// 2D Array Initialization
arrayBi_init: arrayBi_access ASSIGN (ID | NUMBER | TEXT | CHAR | BOOLEANVALUE | simple_expression | array_access | arrayBi_access | function_Call) SEMICOLON;

// Array Access
array_access: ID OPEN_BRACKET index CLOSE_BRACKET;

index: NUMBER|ID;

// 2D Array Access
arrayBi_access: ID OPEN_BRACKET index COMMA index CLOSE_BRACKET;

// For Loop
for_loop: FOR ID ASSIGN (NUMBER | ID) (TO | DOWNTO) (NUMBER | ID) DO (statement_bucle | BEGIN statement_bucle* END);

// Write Line Statement
writeln_stmt: WRITELN OPEN_PARENTHESIS (ID | TEXTWRITE | CHAR | array_access | arrayBi_access) (COMMA (ID | TEXTWRITE | CHAR | array_access | arrayBi_access ))* CLOSE_PARENTHESIS SEMICOLON;

// Write Statement
write: WRITE OPEN_PARENTHESIS (ID | TEXTWRITE | CHAR | array_access | arrayBi_access) (COMMA (ID | TEXTWRITE | CHAR | array_access | arrayBi_access))* CLOSE_PARENTHESIS SEMICOLON;

// While Loop
while_loop: WHILE (OPEN_PARENTHESIS (expression|comparison) CLOSE_PARENTHESIS | (expression|comparison) ) DO BEGIN statement_bucle* END;

// If Statement
if_statement: IF (expression|comparison) THEN (statement | BEGIN statements END) (ELSE (statement | BEGIN statements END))?;

// General Statement
statement: variable_init | array_init | arrayBi_init | for_loop | writeln_stmt | write | while_loop | if_statement | read_call | readln_call;

// bucle Statement
statement_bucle: declarations | variable_init | array_init | arrayBi_init | for_loop | writeln_stmt | write | while_loop | if_statement | read_call | readln_call;

// Expressions
expression: simple_expression (operaciones simple_expression)?;

//Comparacion de strings
comparison: terms (EQUALS | NOT_EQUALS) terms;

terms: (ID | TEXT | CHAR | NUMBER | BOOLEANVALUE | simple_expression);

// Simple Expressions
simple_expression: factor (operaciones_simples factor)*;
// Factors
factor: ID | NUMBER | operacones_parentesis;

operacones_parentesis:OPEN_PARENTHESIS simple_expression CLOSE_PARENTHESIS;

// Operaciones Matemáticas Simples
operaciones_simples: PLUS | MINUS | MULT | DIV;

// Operaciones de Comparación
operaciones: LESS_THAN | LESS_THAN_OR_EQUALS | GREATER_THAN | GREATER_THAN_OR_EQUALS;

// Function Declaration
function_declaration: FUNCTION ID OPEN_PARENTHESIS parameters_declaration? CLOSE_PARENTHESIS COLON TYPE SEMICOLON declarations* BEGIN statement_function* END;

statement_function: variable_init | array_init | arrayBi_init | for_loop | writeln_stmt | write | while_loop | if_statement | read_call | readln_call;

function_Call: ID OPEN_PARENTHESIS parameter_init? CLOSE_PARENTHESIS;

// Parameters
parameters_declaration: (ID (COMMA ID)*) COLON TYPE (SEMICOLON parameters_declaration)*;

parameter_init: terms (COMMA terms)*;

// Keywords and Operators
READLN: 'readln';
READ: 'read';
TO: 'to';
OF: 'of';
DOWNTO: 'downto';
PROGRAM: 'program';
PROCEDURE: 'procedure';
BEGIN: 'begin';
END: 'end;';
ENDPROGRAM: 'end.';
VAR: 'var';
CONST:'const';
PRINTLN: 'println';
COMMA: ',';
FOR: 'for';
WHILE: 'while';
COMMENT : '{' .*? '}' -> skip;
DO: 'do';
ARRAY: 'array';
WRITELN: 'writeln';
WRITE: 'write';
PLUS: '+';
MINUS: '-';
MULT: '*' | 'div' | 'mod';
DIV: '/';
ELSE: 'else';
IF: 'if';
THEN: 'then';
AND: 'and';
OR: 'or';
NOT: 'not';
FUNCTION: 'function';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_THAN_OR_EQUALS: '>=';
LESS_THAN_OR_EQUALS: '<=';
EQUALS: '=';
NOT_EQUALS: '<>';
TYPE: 'integer' | 'string' | 'boolean' | 'char' | 'const';
ASSIGN: ':=';

// Punctuation and Delimiters
COLON: ':';
DOTDOT: '..';
POINT: '.';
OPEN_PARENTHESIS: '(';
CLOSE_PARENTHESIS: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
SEMICOLON: ';';

// Boolean Values
BOOLEANVALUE: 'true'|'false';

// Identifiers
ID:[a-zA-Z][a-zA-Z0-9]*([_][a-zA-Z0-9]+)*;
// Numbers
NUMBER: [0-9]+ ;

// Text (Strings)
TEXT: '"' ( ~["\r\n] | '""' )* '"';

// Char
CHAR: '\'' ~['\r\n] '\'';

TEXTWRITE: '\'' ( ~["\r\n] | '\'\'' )* '\'';

// Whitespace
WS: [ \t\n\r]+ -> skip;

// Character Escapes
STRING: '\'' (ESC | ~[\\'])* '\'';
fragment ESC: '\\' .;