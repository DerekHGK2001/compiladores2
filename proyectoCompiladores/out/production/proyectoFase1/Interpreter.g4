grammar Interpreter;

options { caseInsensitive = true; }

program: PROGRAM ID SEMICOLON
    declarations*
    BEGIN
    statements
    ENDPROGRAM;

declarations: VAR (variable_declaration | array_declaration | arraybi_declaration | function_declaration)+;
variable_declaration: ID (COMMA ID)* COLON TYPE SEMICOLON;
array_declaration: ID COLON ARRAY (OPEN_BRACKET NUMBER DOTDOT NUMBER CLOSE_BRACKET)? OF TYPE SEMICOLON;
arraybi_declaration: ID COLON ARRAY OPEN_BRACKET NUMBER DOTDOT NUMBER COMMA NUMBER DOTDOT NUMBER CLOSE_BRACKET OF TYPE SEMICOLON;
function_declaration: FUNCTION ID OPEN_PARENTHESIS parameters CLOSE_PARENTHESIS COLON TYPE SEMICOLON BEGIN statements END;
parameters: (parameter (COMMA parameter)*)?;
parameter: ID COLON TYPE;
statements: statement*;
variable_init: ID ASSIGN (ID| NUMBER | TEXT | expression | anidar | array_access | arrayBi_access) SEMICOLON;
array_init: array_access ASSIGN (ID| NUMBER | TEXT | expression | anidar | array_access | arrayBi_access) SEMICOLON;
arrayBi_init: arrayBi_access ASSIGN (ID| NUMBER | TEXT | expression | anidar | array_access | arrayBi_access) SEMICOLON;
array_access: ID OPEN_BRACKET expression CLOSE_BRACKET;
arrayBi_access: ID OPEN_BRACKET expression COMMA expression CLOSE_BRACKET;
for_loop: FOR ID ASSIGN (NUMBER | ID) (TO | DOWNTO) (NUMBER | ID) DO (BEGIN statements END | statement);
writeln_stmt: WRITELN OPEN_PARENTHESIS (ID | TEXT) (COMMA (ID | TEXT | array_access))* CLOSE_PARENTHESIS SEMICOLON;
write: WRITE OPEN_PARENTHESIS (ID | TEXT) (COMMA (ID | TEXT | array_access))* CLOSE_PARENTHESIS SEMICOLON;
while_loop: WHILE expression DO BEGIN statements END;
if_statement: IF expression THEN (statement | BEGIN statements END) (ELSE (statement | BEGIN statements END))?;
statement: variable_init | array_init | arrayBi_init | for_loop | writeln_stmt | write | while_loop | if_statement | BEGIN statements END;
expression: simple_expression ((EQUALS | NOT_EQUALS | LESS_THAN | LESS_THAN_OR_EQUALS | GREATER_THAN | GREATER_THAN_OR_EQUALS) simple_expression)?;
simple_expression: term ((PLUS | MINUS) term)*;
term: factor ((MULT | DIV) factor)*;
factor: ID | NUMBER | STRING | TRUE | FALSE | OPEN_PARENTHESIS expression CLOSE_PARENTHESIS | NOT factor;
anidar: TEXT (PLUS TEXT)*;

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
TYPE: 'integer' | 'string' | 'boolean' | 'char' | 'float';
ASSIGN: ':=';

COLON: ':';
DOTDOT: '..';
POINT: '.';
OPEN_PARENTHESIS: '(';
CLOSE_PARENTHESIS: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
SEMICOLON: ';';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: MINUS?[0-9]+;

TRUE: 'true';
FALSE: 'false';
TEXT: '"' ( ~["\r\n] | '""' )* '"';
WS: [ \t\n\r]+ -> skip;
STRING: '\'' (ESC | ~[\\'])* '\'';
fragment ESC: '\\' .;
