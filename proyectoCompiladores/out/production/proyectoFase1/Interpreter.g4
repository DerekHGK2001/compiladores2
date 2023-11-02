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
declarations: VAR (variable_declaration | array_declaration | arraybi_declaration | function_declaration | procedure_declaration)+;

// Variable Declaration
variable_declaration: ID (COMMA ID)* COLON TYPE SEMICOLON;

// Array Declaration
array_declaration: ID COLON ARRAY (OPEN_BRACKET NUMBER DOTDOT NUMBER CLOSE_BRACKET)? OF TYPE SEMICOLON;

// 2D Array Declaration
arraybi_declaration: ID COLON ARRAY OPEN_BRACKET NUMBER DOTDOT NUMBER COMMA NUMBER DOTDOT NUMBER CLOSE_BRACKET OF TYPE SEMICOLON;

// Function Declaration
function_declaration: FUNCTION ID OPEN_PARENTHESIS parameters CLOSE_PARENTHESIS COLON TYPE SEMICOLON BEGIN statements END;

// Parameters
parameters: (parameter (COMMA parameter)*)?;
parameter: ID COLON TYPE;

// Statements
statements: statement*;

// Variable Initialization
variable_init: ID ASSIGN assign_variables SEMICOLON;

//variables de asignacion
assign_variables: ID | NUMBER | TEXT | expression | anidar | array_access | arrayBi_access;

// Array Initialization
array_init: array_access ASSIGN assign_variables SEMICOLON;

// 2D Array Initialization
arrayBi_init: arrayBi_access ASSIGN assign_variables SEMICOLON;

// Array Access
array_access: ID OPEN_BRACKET expression CLOSE_BRACKET;

// 2D Array Access
arrayBi_access: ID OPEN_BRACKET expression COMMA expression CLOSE_BRACKET;

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
statement: variable_init | array_init | arrayBi_init | for_loop | writeln_stmt | write | while_loop | if_statement | BEGIN statements END;

// Expressions
expression: simple_expression ((EQUALS | NOT_EQUALS | LESS_THAN | LESS_THAN_OR_EQUALS | GREATER_THAN | GREATER_THAN_OR_EQUALS) simple_expression)?;

// Simple Expressions
simple_expression: term ((PLUS | MINUS) term)*;

// Terms
term: factor ((MULT | DIV) factor)*;

// Factors
factor: ID | NUMBER | STRING | TRUE | FALSE | OPEN_PARENTHESIS expression CLOSE_PARENTHESIS | NOT factor;

// Nested Text
anidar: TEXT (PLUS TEXT)*;

// Procedure Declaration
procedure_declaration: PROCEDURE ID OPEN_PARENTHESIS parameters CLOSE_PARENTHESIS SEMICOLON declarations* BEGIN statements END SEMICOLON;

// Keywords and Operators
TO: 'to';
OF: 'of';
DOWNTO: 'downto';
PROGRAM: 'program';
BEGIN: 'begin';
END: 'end;';
ENDPROGRAM: 'end.';
VAR: 'var';
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
NUMBER: MINUS?[0-9]+;

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