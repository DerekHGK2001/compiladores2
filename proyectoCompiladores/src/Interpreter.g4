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
declarations: ((CONTS | VAR) variable_declaration | (CONTS | VAR) array_declaration | (CONTS | VAR) arraybi_declaration | function_declaration | procedure_declaration)+;

// Variable Declaration
variable_declaration: ID (COMMA ID)* COLON TYPE SEMICOLON;

// Array Declaration
array_declaration: ID COLON ARRAY (OPEN_BRACKET MINUS* NUMBER DOTDOT MINUS* NUMBER CLOSE_BRACKET)? OF TYPE SEMICOLON;

// 2D Array Declaration
arraybi_declaration: ID COLON ARRAY OPEN_BRACKET MINUS* NUMBER DOTDOT MINUS* NUMBER COMMA MINUS* NUMBER DOTDOT MINUS* NUMBER CLOSE_BRACKET OF TYPE SEMICOLON;

// Statements
statements: statement*;

// Variable Initialization
variable_init: ID ASSIGN (ID | NUMBER | TEXT | simple_expression | array_access | arrayBi_access) SEMICOLON;

// Array Initialization
array_init: array_access ASSIGN (ID | NUMBER | TEXT | simple_expression | array_access | arrayBi_access) SEMICOLON;

// 2D Array Initialization
arrayBi_init: arrayBi_access ASSIGN (ID | NUMBER | TEXT | simple_expression | array_access | arrayBi_access) SEMICOLON;

// Array Access
array_access: ID OPEN_BRACKET (simple_expression|NUMBER|ID) CLOSE_BRACKET;

// 2D Array Access
arrayBi_access: ID OPEN_BRACKET (simple_expression|NUMBER|ID) COMMA (simple_expression|NUMBER|ID) CLOSE_BRACKET;

// For Loop
for_loop: FOR ID ASSIGN (NUMBER | ID) (TO | DOWNTO) (NUMBER | ID) DO (BEGIN statements END | statement);

// Write Line Statement
writeln_stmt: WRITELN OPEN_PARENTHESIS (ID | TEXT) (COMMA (ID | TEXT | array_access | arrayBi_access ))* CLOSE_PARENTHESIS SEMICOLON;

// Write Statement
write: WRITE OPEN_PARENTHESIS (ID | TEXT) (COMMA (ID | TEXT | array_access | arrayBi_access))* CLOSE_PARENTHESIS SEMICOLON;

// While Loop
while_loop: WHILE expression DO BEGIN statements END;

// If Statement
if_statement: IF expression THEN (statement | BEGIN statements END) (ELSE (statement | BEGIN statements END))?;

// General Statement
statement: variable_init | array_init | arrayBi_init | for_loop | writeln_stmt | write | while_loop | if_statement | procedure_call | function_Call | BEGIN statements END;

// Expressions
expression: simple_expression (operaciones simple_expression)?;

// Simple Expressions
simple_expression: term (operaciones_simples term)*;

// Terms
term: factor (operaciones_simples factor)*;

// Factors
factor: ID | NUMBER | (OPEN_PARENTHESIS expression CLOSE_PARENTHESIS);

// Operaciones Matemáticas Simples
operaciones_simples: PLUS | MINUS | MULT | DIV;

// Operaciones de Comparación
operaciones: EQUALS | NOT_EQUALS | LESS_THAN | LESS_THAN_OR_EQUALS | GREATER_THAN | GREATER_THAN_OR_EQUALS;

// Procedure Declaration
procedure_declaration: PROCEDURE ID  OPEN_PARENTHESIS parameters  COLON TYPE CLOSE_PARENTHESIS SEMICOLON procedure_body;

procedure_body:BEGIN declarations* statements END;

procedure_call: ID OPEN_PARENTHESIS (parameter_dec) CLOSE_PARENTHESIS SEMICOLON ;

// Function Declaration
function_declaration: FUNCTION ID OPEN_PARENTHESIS parameters  COLON TYPE CLOSE_PARENTHESIS COLON TYPE SEMICOLON BEGIN statements END;

function_Call: ID OPEN_PARENTHESIS (parameter_dec) CLOSE_PARENTHESIS SEMICOLON;

// Parameters
parameters: ((ID) (COMMA ID)*)?;

parameter_dec: (((ID|TEXT|NUMBER) | simple_expression) (COMMA ((ID|TEXT|NUMBER) | simple_expression))*)?;

// Keywords and Operators
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
TYPE: 'integer' | 'string' | 'boolean' | 'char' | 'float' | 'const';
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

// Identifiers
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Numbers
NUMBER: [0-9]+;

// Boolean Values
TRUE: 'true';
FALSE: 'false';

// Text (Strings)
TEXT: '"' ( ~["\r\n] | '""' )* '"';

// Whitespace
WS: [ \t\n\r]+ -> skip;

// Character Escapes
STRING: '\'' (ESC | ~[\\'])* '\'';
fragment ESC: '\\' .;