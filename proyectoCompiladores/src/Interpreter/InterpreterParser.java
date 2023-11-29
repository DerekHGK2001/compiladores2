// Generated from C:/Users/dhenr/Documents/GitHub/compiladores2/proyectoCompiladores/src\Interpreter.g4 by ANTLR 4.12.0
package Interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READLN=1, READ=2, TO=3, OF=4, DOWNTO=5, PROGRAM=6, PROCEDURE=7, BEGIN=8, 
		END=9, ENDP=10, VAR=11, CONST=12, PRINTLN=13, COMMA=14, FOR=15, WHILE=16, 
		COMMENT=17, DO=18, ARRAY=19, WRITELN=20, WRITE=21, PLUS=22, MINUS=23, 
		MULT=24, DIV=25, ELSE=26, IF=27, THEN=28, AND=29, OR=30, NOT=31, FUNCTION=32, 
		GREATER_THAN=33, LESS_THAN=34, GREATER_THAN_OR_EQUALS=35, LESS_THAN_OR_EQUALS=36, 
		EQUALS=37, NOT_EQUALS=38, TYPE=39, ASSIGN=40, COLON=41, DOTDOT=42, POINT=43, 
		OPEN_PARENTHESIS=44, CLOSE_PARENTHESIS=45, OPEN_BRACKET=46, CLOSE_BRACKET=47, 
		SEMICOLON=48, BOOLEANVALUE=49, ID=50, NUMBER=51, TEXT=52, CHAR=53, TEXTWRITE=54, 
		WS=55, STRING=56;
	public static final int
		RULE_program = 0, RULE_endprogram = 1, RULE_declarations = 2, RULE_read_call = 3, 
		RULE_readln_call = 4, RULE_variable_declaration = 5, RULE_array_declaration = 6, 
		RULE_array_range = 7, RULE_arraybi_declaration = 8, RULE_var_variables = 9, 
		RULE_const_variable_declaration = 10, RULE_const_variables = 11, RULE_statements = 12, 
		RULE_variable_init = 13, RULE_array_init = 14, RULE_arrayBi_init = 15, 
		RULE_array_access = 16, RULE_index = 17, RULE_arrayBi_access = 18, RULE_for_loop = 19, 
		RULE_writeln_stmt = 20, RULE_write = 21, RULE_while_loop = 22, RULE_if_statement = 23, 
		RULE_else_statement = 24, RULE_if_statement2 = 25, RULE_statement = 26, 
		RULE_statement_bucle = 27, RULE_expression = 28, RULE_comparison = 29, 
		RULE_terms = 30, RULE_simple_expression = 31, RULE_factor = 32, RULE_operacones_parentesis = 33, 
		RULE_operaciones_simples = 34, RULE_operaciones = 35, RULE_function_declaration = 36, 
		RULE_statement_function = 37, RULE_function_Call = 38, RULE_parameters_declaration = 39, 
		RULE_parameter_init = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "endprogram", "declarations", "read_call", "readln_call", 
			"variable_declaration", "array_declaration", "array_range", "arraybi_declaration", 
			"var_variables", "const_variable_declaration", "const_variables", "statements", 
			"variable_init", "array_init", "arrayBi_init", "array_access", "index", 
			"arrayBi_access", "for_loop", "writeln_stmt", "write", "while_loop", 
			"if_statement", "else_statement", "if_statement2", "statement", "statement_bucle", 
			"expression", "comparison", "terms", "simple_expression", "factor", "operacones_parentesis", 
			"operaciones_simples", "operaciones", "function_declaration", "statement_function", 
			"function_Call", "parameters_declaration", "parameter_init"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'readln'", "'read'", "'to'", "'of'", "'downto'", "'program'", 
			"'procedure'", "'begin'", "'end;'", "'end'", "'var'", "'const'", "'println'", 
			"','", "'for'", "'while'", null, "'do'", "'array'", "'writeln'", "'write'", 
			"'+'", "'-'", null, "'/'", "'else'", "'if'", "'then'", "'and'", "'or'", 
			"'not'", "'function'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", null, 
			"':='", "':'", "'..'", "'.'", "'('", "')'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READLN", "READ", "TO", "OF", "DOWNTO", "PROGRAM", "PROCEDURE", 
			"BEGIN", "END", "ENDP", "VAR", "CONST", "PRINTLN", "COMMA", "FOR", "WHILE", 
			"COMMENT", "DO", "ARRAY", "WRITELN", "WRITE", "PLUS", "MINUS", "MULT", 
			"DIV", "ELSE", "IF", "THEN", "AND", "OR", "NOT", "FUNCTION", "GREATER_THAN", 
			"LESS_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN_OR_EQUALS", "EQUALS", 
			"NOT_EQUALS", "TYPE", "ASSIGN", "COLON", "DOTDOT", "POINT", "OPEN_PARENTHESIS", 
			"CLOSE_PARENTHESIS", "OPEN_BRACKET", "CLOSE_BRACKET", "SEMICOLON", "BOOLEANVALUE", 
			"ID", "NUMBER", "TEXT", "CHAR", "TEXTWRITE", "WS", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(InterpreterParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public EndprogramContext endprogram() {
			return getRuleContext(EndprogramContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PROGRAM);
			setState(83);
			match(ID);
			setState(84);
			match(SEMICOLON);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294973440L) != 0)) {
				{
				{
				setState(85);
				declarations();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(BEGIN);
			setState(92);
			statements();
			setState(93);
			endprogram();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndprogramContext extends ParserRuleContext {
		public TerminalNode ENDP() { return getToken(InterpreterParser.ENDP, 0); }
		public TerminalNode POINT() { return getToken(InterpreterParser.POINT, 0); }
		public EndprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterEndprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitEndprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitEndprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndprogramContext endprogram() throws RecognitionException {
		EndprogramContext _localctx = new EndprogramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_endprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ENDP);
			setState(96);
			match(POINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(InterpreterParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(InterpreterParser.VAR, i);
		}
		public List<TerminalNode> CONST() { return getTokens(InterpreterParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(InterpreterParser.CONST, i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Var_variablesContext> var_variables() {
			return getRuleContexts(Var_variablesContext.class);
		}
		public Var_variablesContext var_variables(int i) {
			return getRuleContext(Var_variablesContext.class,i);
		}
		public List<Const_variablesContext> const_variables() {
			return getRuleContexts(Const_variablesContext.class);
		}
		public Const_variablesContext const_variables(int i) {
			return getRuleContext(Const_variablesContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(111);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(98);
						match(VAR);
						setState(100); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(99);
								var_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(102); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case CONST:
						{
						setState(104);
						match(CONST);
						setState(106); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(105);
								const_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(108); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case FUNCTION:
						{
						setState(110);
						function_declaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_callContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(InterpreterParser.READ, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Read_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterRead_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitRead_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitRead_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_callContext read_call() throws RecognitionException {
		Read_callContext _localctx = new Read_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(READ);
			setState(116);
			match(OPEN_PARENTHESIS);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(117);
				match(ID);
				}
				break;
			case 2:
				{
				setState(118);
				array_access();
				}
				break;
			case 3:
				{
				setState(119);
				arrayBi_access();
				}
				break;
			}
			setState(122);
			match(CLOSE_PARENTHESIS);
			setState(123);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Readln_callContext extends ParserRuleContext {
		public TerminalNode READLN() { return getToken(InterpreterParser.READLN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Readln_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readln_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterReadln_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitReadln_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitReadln_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Readln_callContext readln_call() throws RecognitionException {
		Readln_callContext _localctx = new Readln_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_readln_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(READLN);
			setState(126);
			match(OPEN_PARENTHESIS);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(127);
				match(ID);
				}
				break;
			case 2:
				{
				setState(128);
				array_access();
				}
				break;
			case 3:
				{
				setState(129);
				arrayBi_access();
				}
				break;
			}
			setState(132);
			match(CLOSE_PARENTHESIS);
			setState(133);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				match(ID);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(COLON);
			setState(144);
			match(TYPE);
			setState(145);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode ARRAY() { return getToken(InterpreterParser.ARRAY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public Array_rangeContext array_range() {
			return getRuleContext(Array_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(COLON);
			setState(149);
			match(ARRAY);
			setState(150);
			match(OPEN_BRACKET);
			setState(151);
			array_range();
			setState(152);
			match(CLOSE_BRACKET);
			setState(153);
			match(OF);
			setState(154);
			match(TYPE);
			setState(155);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_rangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public TerminalNode DOTDOT() { return getToken(InterpreterParser.DOTDOT, 0); }
		public Array_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_rangeContext array_range() throws RecognitionException {
		Array_rangeContext _localctx = new Array_rangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(NUMBER);
			setState(158);
			match(DOTDOT);
			setState(159);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arraybi_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode ARRAY() { return getToken(InterpreterParser.ARRAY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<Array_rangeContext> array_range() {
			return getRuleContexts(Array_rangeContext.class);
		}
		public Array_rangeContext array_range(int i) {
			return getRuleContext(Array_rangeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(InterpreterParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public Arraybi_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybi_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArraybi_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArraybi_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArraybi_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybi_declarationContext arraybi_declaration() throws RecognitionException {
		Arraybi_declarationContext _localctx = new Arraybi_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arraybi_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(COLON);
			setState(163);
			match(ARRAY);
			setState(164);
			match(OPEN_BRACKET);
			setState(165);
			array_range();
			setState(166);
			match(COMMA);
			setState(167);
			array_range();
			setState(168);
			match(CLOSE_BRACKET);
			setState(169);
			match(OF);
			setState(170);
			match(TYPE);
			setState(171);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_variablesContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Arraybi_declarationContext arraybi_declaration() {
			return getRuleContext(Arraybi_declarationContext.class,0);
		}
		public Var_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterVar_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitVar_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitVar_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_variablesContext var_variables() throws RecognitionException {
		Var_variablesContext _localctx = new Var_variablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_variables);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				array_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				arraybi_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_variable_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(InterpreterParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public Const_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConst_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConst_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitConst_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_variable_declarationContext const_variable_declaration() throws RecognitionException {
		Const_variable_declarationContext _localctx = new Const_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_const_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
			setState(179);
			match(EQUALS);
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_variablesContext extends ParserRuleContext {
		public Const_variable_declarationContext const_variable_declaration() {
			return getRuleContext(Const_variable_declarationContext.class,0);
		}
		public Const_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConst_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConst_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitConst_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_variablesContext const_variables() throws RecognitionException {
		Const_variablesContext _localctx = new Const_variablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_const_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			const_variable_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
				{
				{
				setState(185);
				statement();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_initContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Function_CallContext function_Call() {
			return getRuleContext(Function_CallContext.class,0);
		}
		public Variable_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterVariable_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitVariable_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitVariable_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initContext variable_init() throws RecognitionException {
		Variable_initContext _localctx = new Variable_initContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			setState(192);
			match(ASSIGN);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(193);
				match(ID);
				}
				break;
			case 2:
				{
				setState(194);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(195);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(196);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(197);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(198);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(199);
				array_access();
				}
				break;
			case 8:
				{
				setState(200);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(201);
				function_Call();
				}
				break;
			}
			setState(204);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_initContext extends ParserRuleContext {
		public List<Array_accessContext> array_access() {
			return getRuleContexts(Array_accessContext.class);
		}
		public Array_accessContext array_access(int i) {
			return getRuleContext(Array_accessContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Function_CallContext function_Call() {
			return getRuleContext(Function_CallContext.class,0);
		}
		public Array_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initContext array_init() throws RecognitionException {
		Array_initContext _localctx = new Array_initContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			array_access();
			setState(207);
			match(ASSIGN);
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(208);
				match(ID);
				}
				break;
			case 2:
				{
				setState(209);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(210);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(211);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(212);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(213);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(214);
				array_access();
				}
				break;
			case 8:
				{
				setState(215);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(216);
				function_Call();
				}
				break;
			}
			setState(219);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBi_initContext extends ParserRuleContext {
		public List<ArrayBi_accessContext> arrayBi_access() {
			return getRuleContexts(ArrayBi_accessContext.class);
		}
		public ArrayBi_accessContext arrayBi_access(int i) {
			return getRuleContext(ArrayBi_accessContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Function_CallContext function_Call() {
			return getRuleContext(Function_CallContext.class,0);
		}
		public ArrayBi_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBi_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArrayBi_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArrayBi_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArrayBi_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBi_initContext arrayBi_init() throws RecognitionException {
		ArrayBi_initContext _localctx = new ArrayBi_initContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayBi_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			arrayBi_access();
			setState(222);
			match(ASSIGN);
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(223);
				match(ID);
				}
				break;
			case 2:
				{
				setState(224);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(225);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(226);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(227);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(228);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(229);
				array_access();
				}
				break;
			case 8:
				{
				setState(230);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(231);
				function_Call();
				}
				break;
			}
			setState(234);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
			setState(237);
			match(OPEN_BRACKET);
			setState(238);
			index();
			setState(239);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBi_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(InterpreterParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public ArrayBi_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBi_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArrayBi_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArrayBi_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArrayBi_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBi_accessContext arrayBi_access() throws RecognitionException {
		ArrayBi_accessContext _localctx = new ArrayBi_accessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayBi_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ID);
			setState(244);
			match(OPEN_BRACKET);
			setState(245);
			index();
			setState(246);
			match(COMMA);
			setState(247);
			index();
			setState(248);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(InterpreterParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(InterpreterParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(InterpreterParser.DOWNTO, 0); }
		public List<Statement_bucleContext> statement_bucle() {
			return getRuleContexts(Statement_bucleContext.class);
		}
		public Statement_bucleContext statement_bucle(int i) {
			return getRuleContext(Statement_bucleContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FOR);
			setState(251);
			match(ID);
			setState(252);
			match(ASSIGN);
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256);
			match(DO);
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READLN:
			case READ:
			case VAR:
			case CONST:
			case FOR:
			case WHILE:
			case WRITELN:
			case WRITE:
			case IF:
			case FUNCTION:
			case ID:
				{
				setState(257);
				statement_bucle();
				}
				break;
			case BEGIN:
				{
				setState(258);
				match(BEGIN);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
					{
					{
					setState(259);
					statement_bucle();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Writeln_stmtContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(InterpreterParser.WRITELN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> TEXTWRITE() { return getTokens(InterpreterParser.TEXTWRITE); }
		public TerminalNode TEXTWRITE(int i) {
			return getToken(InterpreterParser.TEXTWRITE, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(InterpreterParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(InterpreterParser.CHAR, i);
		}
		public List<Array_accessContext> array_access() {
			return getRuleContexts(Array_accessContext.class);
		}
		public Array_accessContext array_access(int i) {
			return getRuleContext(Array_accessContext.class,i);
		}
		public List<ArrayBi_accessContext> arrayBi_access() {
			return getRuleContexts(ArrayBi_accessContext.class);
		}
		public ArrayBi_accessContext arrayBi_access(int i) {
			return getRuleContext(ArrayBi_accessContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Writeln_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWriteln_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWriteln_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWriteln_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Writeln_stmtContext writeln_stmt() throws RecognitionException {
		Writeln_stmtContext _localctx = new Writeln_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_writeln_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(WRITELN);
			setState(269);
			match(OPEN_PARENTHESIS);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(270);
				match(ID);
				}
				break;
			case 2:
				{
				setState(271);
				match(TEXTWRITE);
				}
				break;
			case 3:
				{
				setState(272);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(273);
				array_access();
				}
				break;
			case 5:
				{
				setState(274);
				arrayBi_access();
				}
				break;
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277);
				match(COMMA);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(278);
					match(ID);
					}
					break;
				case 2:
					{
					setState(279);
					match(TEXTWRITE);
					}
					break;
				case 3:
					{
					setState(280);
					match(CHAR);
					}
					break;
				case 4:
					{
					setState(281);
					array_access();
					}
					break;
				case 5:
					{
					setState(282);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(CLOSE_PARENTHESIS);
			setState(291);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(InterpreterParser.WRITE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> TEXTWRITE() { return getTokens(InterpreterParser.TEXTWRITE); }
		public TerminalNode TEXTWRITE(int i) {
			return getToken(InterpreterParser.TEXTWRITE, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(InterpreterParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(InterpreterParser.CHAR, i);
		}
		public List<Array_accessContext> array_access() {
			return getRuleContexts(Array_accessContext.class);
		}
		public Array_accessContext array_access(int i) {
			return getRuleContext(Array_accessContext.class,i);
		}
		public List<ArrayBi_accessContext> arrayBi_access() {
			return getRuleContexts(ArrayBi_accessContext.class);
		}
		public ArrayBi_accessContext arrayBi_access(int i) {
			return getRuleContext(ArrayBi_accessContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(WRITE);
			setState(294);
			match(OPEN_PARENTHESIS);
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(295);
				match(ID);
				}
				break;
			case 2:
				{
				setState(296);
				match(TEXTWRITE);
				}
				break;
			case 3:
				{
				setState(297);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(298);
				array_access();
				}
				break;
			case 5:
				{
				setState(299);
				arrayBi_access();
				}
				break;
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(303);
					match(ID);
					}
					break;
				case 2:
					{
					setState(304);
					match(TEXTWRITE);
					}
					break;
				case 3:
					{
					setState(305);
					match(CHAR);
					}
					break;
				case 4:
					{
					setState(306);
					array_access();
					}
					break;
				case 5:
					{
					setState(307);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(CLOSE_PARENTHESIS);
			setState(316);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(InterpreterParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public List<Statement_bucleContext> statement_bucle() {
			return getRuleContexts(Statement_bucleContext.class);
		}
		public Statement_bucleContext statement_bucle(int i) {
			return getRuleContext(Statement_bucleContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(WHILE);
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(319);
				match(OPEN_PARENTHESIS);
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(320);
					expression();
					}
					break;
				case 2:
					{
					setState(321);
					comparison();
					}
					break;
				}
				setState(324);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(326);
					expression();
					}
					break;
				case 2:
					{
					setState(327);
					comparison();
					}
					break;
				}
				}
				break;
			}
			setState(332);
			match(DO);
			setState(333);
			match(BEGIN);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
				{
				{
				setState(334);
				statement_bucle();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(InterpreterParser.IF, 0); }
		public TerminalNode THEN() { return getToken(InterpreterParser.THEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<If_statement2Context> if_statement2() {
			return getRuleContexts(If_statement2Context.class);
		}
		public If_statement2Context if_statement2(int i) {
			return getRuleContext(If_statement2Context.class,i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(InterpreterParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(InterpreterParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(InterpreterParser.END); }
		public TerminalNode END(int i) {
			return getToken(InterpreterParser.END, i);
		}
		public TerminalNode ELSE() { return getToken(InterpreterParser.ELSE, 0); }
		public List<Else_statementContext> else_statement() {
			return getRuleContexts(Else_statementContext.class);
		}
		public Else_statementContext else_statement(int i) {
			return getRuleContext(Else_statementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(IF);
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(343);
				expression();
				}
				break;
			case 2:
				{
				setState(344);
				comparison();
				}
				break;
			}
			setState(347);
			match(THEN);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READLN:
			case READ:
			case FOR:
			case WHILE:
			case WRITELN:
			case WRITE:
			case IF:
			case ID:
				{
				setState(348);
				if_statement2();
				}
				break;
			case BEGIN:
				{
				setState(349);
				match(BEGIN);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
					{
					{
					setState(350);
					if_statement2();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(359);
				match(ELSE);
				setState(369);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case READLN:
				case READ:
				case FOR:
				case WHILE:
				case WRITELN:
				case WRITE:
				case IF:
				case ID:
					{
					setState(360);
					else_statement();
					}
					break;
				case BEGIN:
					{
					setState(361);
					match(BEGIN);
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
						{
						{
						setState(362);
						else_statement();
						}
						}
						setState(367);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(368);
					match(END);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ArrayBi_initContext arrayBi_init() {
			return getRuleContext(ArrayBi_initContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Writeln_stmtContext writeln_stmt() {
			return getRuleContext(Writeln_stmtContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Readln_callContext readln_call() {
			return getRuleContext(Readln_callContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_else_statement);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(379);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(380);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(381);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(382);
				readln_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statement2Context extends ParserRuleContext {
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ArrayBi_initContext arrayBi_init() {
			return getRuleContext(ArrayBi_initContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Writeln_stmtContext writeln_stmt() {
			return getRuleContext(Writeln_stmtContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Readln_callContext readln_call() {
			return getRuleContext(Readln_callContext.class,0);
		}
		public If_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIf_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIf_statement2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIf_statement2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statement2Context if_statement2() throws RecognitionException {
		If_statement2Context _localctx = new If_statement2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_statement2);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(392);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(393);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(394);
				readln_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ArrayBi_initContext arrayBi_init() {
			return getRuleContext(ArrayBi_initContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Writeln_stmtContext writeln_stmt() {
			return getRuleContext(Writeln_stmtContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Readln_callContext readln_call() {
			return getRuleContext(Readln_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(403);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(404);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(405);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(406);
				readln_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_bucleContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ArrayBi_initContext arrayBi_init() {
			return getRuleContext(ArrayBi_initContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Writeln_stmtContext writeln_stmt() {
			return getRuleContext(Writeln_stmtContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Readln_callContext readln_call() {
			return getRuleContext(Readln_callContext.class,0);
		}
		public Statement_bucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatement_bucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatement_bucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatement_bucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bucleContext statement_bucle() throws RecognitionException {
		Statement_bucleContext _localctx = new Statement_bucleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement_bucle);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				variable_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				array_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				arrayBi_init();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				writeln_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(415);
				write();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(416);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(417);
				if_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(418);
				read_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(419);
				readln_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			simple_expression();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) {
				{
				setState(423);
				operaciones();
				setState(424);
				simple_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(InterpreterParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(InterpreterParser.NOT_EQUALS, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			terms();
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(430);
			terms();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_terms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(432);
				match(ID);
				}
				break;
			case 2:
				{
				setState(433);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(434);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(435);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(436);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(437);
				array_access();
				}
				break;
			case 7:
				{
				setState(438);
				arrayBi_access();
				}
				break;
			case 8:
				{
				setState(439);
				simple_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_expressionContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Operaciones_simplesContext> operaciones_simples() {
			return getRuleContexts(Operaciones_simplesContext.class);
		}
		public Operaciones_simplesContext operaciones_simples(int i) {
			return getRuleContext(Operaciones_simplesContext.class,i);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			factor();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(443);
				operaciones_simples();
				setState(444);
				factor();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Operacones_parentesisContext operacones_parentesis() {
			return getRuleContext(Operacones_parentesisContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				array_access();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				arrayBi_access();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				operacones_parentesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operacones_parentesisContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public Operacones_parentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacones_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperacones_parentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperacones_parentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperacones_parentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacones_parentesisContext operacones_parentesis() throws RecognitionException {
		Operacones_parentesisContext _localctx = new Operacones_parentesisContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operacones_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(OPEN_PARENTHESIS);
			setState(459);
			simple_expression();
			setState(460);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operaciones_simplesContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(InterpreterParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(InterpreterParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(InterpreterParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(InterpreterParser.DIV, 0); }
		public Operaciones_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperaciones_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperaciones_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperaciones_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operaciones_simplesContext operaciones_simples() throws RecognitionException {
		Operaciones_simplesContext _localctx = new Operaciones_simplesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operaciones_simples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionesContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(InterpreterParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(InterpreterParser.LESS_THAN_OR_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(InterpreterParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(InterpreterParser.GREATER_THAN_OR_EQUALS, 0); }
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(InterpreterParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public Parameters_declarationContext parameters_declaration() {
			return getRuleContext(Parameters_declarationContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<Statement_functionContext> statement_function() {
			return getRuleContexts(Statement_functionContext.class);
		}
		public Statement_functionContext statement_function(int i) {
			return getRuleContext(Statement_functionContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(FUNCTION);
			setState(467);
			match(ID);
			setState(468);
			match(OPEN_PARENTHESIS);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(469);
				parameters_declaration();
				}
			}

			setState(472);
			match(CLOSE_PARENTHESIS);
			setState(473);
			match(COLON);
			setState(474);
			match(TYPE);
			setState(475);
			match(SEMICOLON);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294973440L) != 0)) {
				{
				{
				setState(476);
				declarations();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(BEGIN);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
				{
				{
				setState(483);
				statement_function();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_functionContext extends ParserRuleContext {
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ArrayBi_initContext arrayBi_init() {
			return getRuleContext(ArrayBi_initContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Writeln_stmtContext writeln_stmt() {
			return getRuleContext(Writeln_stmtContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Readln_callContext readln_call() {
			return getRuleContext(Readln_callContext.class,0);
		}
		public Statement_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatement_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatement_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatement_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_functionContext statement_function() throws RecognitionException {
		Statement_functionContext _localctx = new Statement_functionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement_function);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(496);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(497);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(498);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(499);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(500);
				readln_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public Parameter_initContext parameter_init() {
			return getRuleContext(Parameter_initContext.class,0);
		}
		public Function_CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_Call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFunction_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFunction_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFunction_Call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_CallContext function_Call() throws RecognitionException {
		Function_CallContext _localctx = new Function_CallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_Call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(ID);
			setState(504);
			match(OPEN_PARENTHESIS);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17469040742105088L) != 0)) {
				{
				setState(505);
				parameter_init();
				}
			}

			setState(508);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameters_declarationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(InterpreterParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(InterpreterParser.SEMICOLON, i);
		}
		public List<Parameters_declarationContext> parameters_declaration() {
			return getRuleContexts(Parameters_declarationContext.class);
		}
		public Parameters_declarationContext parameters_declaration(int i) {
			return getRuleContext(Parameters_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Parameters_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterParameters_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitParameters_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameters_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_declarationContext parameters_declaration() throws RecognitionException {
		Parameters_declarationContext _localctx = new Parameters_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameters_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(510);
			match(ID);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				match(ID);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(518);
			match(COLON);
			setState(519);
			match(TYPE);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					match(SEMICOLON);
					setState(521);
					parameters_declaration();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_initContext extends ParserRuleContext {
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Parameter_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterParameter_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitParameter_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameter_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_initContext parameter_init() throws RecognitionException {
		Parameter_initContext _localctx = new Parameter_initContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameter_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			terms();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(528);
				match(COMMA);
				setState(529);
				terms();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u0218\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000W"+
		"\b\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0004\u0002e\b\u0002\u000b\u0002\f\u0002f\u0001\u0002\u0001\u0002\u0004"+
		"\u0002k\b\u0002\u000b\u0002\f\u0002l\u0001\u0002\u0004\u0002p\b\u0002"+
		"\u000b\u0002\f\u0002q\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0083\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u008b\b\u0005\n\u0005\f\u0005\u008e\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00b1\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u00bb"+
		"\b\f\n\f\f\f\u00be\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cb\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00da\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00e9\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0105\b\u0013\n\u0013\f\u0013\u0108\t\u0013\u0001\u0013\u0003"+
		"\u0013\u010b\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0114\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u011c"+
		"\b\u0014\u0005\u0014\u011e\b\u0014\n\u0014\f\u0014\u0121\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012d\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0135\b\u0015\u0005\u0015\u0137\b\u0015\n\u0015\f\u0015\u013a\t"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0143\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0149\b\u0016\u0003\u0016\u014b\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0150\b\u0016\n\u0016"+
		"\f\u0016\u0153\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u015a\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0160\b\u0017\n\u0017\f\u0017\u0163\t\u0017\u0001"+
		"\u0017\u0003\u0017\u0166\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u016c\b\u0017\n\u0017\f\u0017\u016f\t\u0017\u0001\u0017"+
		"\u0003\u0017\u0172\b\u0017\u0003\u0017\u0174\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0180\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u018c\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0198\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a5\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ab\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01b9\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u01bf\b\u001f\n\u001f\f\u001f\u01c2\t\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01c9\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u01d7\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u01de\b$\n$\f$\u01e1\t$\u0001$\u0001$\u0005"+
		"$\u01e5\b$\n$\f$\u01e8\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01f6\b%\u0001&\u0001&\u0001"+
		"&\u0003&\u01fb\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u0202"+
		"\b\'\n\'\f\'\u0205\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u020b\b"+
		"\'\n\'\f\'\u020e\t\'\u0001(\u0001(\u0001(\u0005(\u0213\b(\n(\f(\u0216"+
		"\t(\u0001(\u0000\u0000)\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0006"+
		"\u0001\u000045\u0001\u000023\u0002\u0000\u0003\u0003\u0005\u0005\u0001"+
		"\u0000%&\u0001\u0000\u0016\u0019\u0001\u0000!$\u0274\u0000R\u0001\u0000"+
		"\u0000\u0000\u0002_\u0001\u0000\u0000\u0000\u0004o\u0001\u0000\u0000\u0000"+
		"\u0006s\u0001\u0000\u0000\u0000\b}\u0001\u0000\u0000\u0000\n\u0087\u0001"+
		"\u0000\u0000\u0000\f\u0093\u0001\u0000\u0000\u0000\u000e\u009d\u0001\u0000"+
		"\u0000\u0000\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00b0\u0001\u0000"+
		"\u0000\u0000\u0014\u00b2\u0001\u0000\u0000\u0000\u0016\u00b7\u0001\u0000"+
		"\u0000\u0000\u0018\u00bc\u0001\u0000\u0000\u0000\u001a\u00bf\u0001\u0000"+
		"\u0000\u0000\u001c\u00ce\u0001\u0000\u0000\u0000\u001e\u00dd\u0001\u0000"+
		"\u0000\u0000 \u00ec\u0001\u0000\u0000\u0000\"\u00f1\u0001\u0000\u0000"+
		"\u0000$\u00f3\u0001\u0000\u0000\u0000&\u00fa\u0001\u0000\u0000\u0000("+
		"\u010c\u0001\u0000\u0000\u0000*\u0125\u0001\u0000\u0000\u0000,\u013e\u0001"+
		"\u0000\u0000\u0000.\u0156\u0001\u0000\u0000\u00000\u017f\u0001\u0000\u0000"+
		"\u00002\u018b\u0001\u0000\u0000\u00004\u0197\u0001\u0000\u0000\u00006"+
		"\u01a4\u0001\u0000\u0000\u00008\u01a6\u0001\u0000\u0000\u0000:\u01ac\u0001"+
		"\u0000\u0000\u0000<\u01b8\u0001\u0000\u0000\u0000>\u01ba\u0001\u0000\u0000"+
		"\u0000@\u01c8\u0001\u0000\u0000\u0000B\u01ca\u0001\u0000\u0000\u0000D"+
		"\u01ce\u0001\u0000\u0000\u0000F\u01d0\u0001\u0000\u0000\u0000H\u01d2\u0001"+
		"\u0000\u0000\u0000J\u01f5\u0001\u0000\u0000\u0000L\u01f7\u0001\u0000\u0000"+
		"\u0000N\u01fe\u0001\u0000\u0000\u0000P\u020f\u0001\u0000\u0000\u0000R"+
		"S\u0005\u0006\u0000\u0000ST\u00052\u0000\u0000TX\u00050\u0000\u0000UW"+
		"\u0003\u0004\u0002\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\b\u0000\u0000\\]\u0003"+
		"\u0018\f\u0000]^\u0003\u0002\u0001\u0000^\u0001\u0001\u0000\u0000\u0000"+
		"_`\u0005\n\u0000\u0000`a\u0005+\u0000\u0000a\u0003\u0001\u0000\u0000\u0000"+
		"bd\u0005\u000b\u0000\u0000ce\u0003\u0012\t\u0000dc\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gp\u0001\u0000\u0000\u0000hj\u0005\f\u0000\u0000ik\u0003\u0016\u000b"+
		"\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000np\u0003"+
		"H$\u0000ob\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000r\u0005\u0001\u0000\u0000\u0000st\u0005\u0002\u0000"+
		"\u0000tx\u0005,\u0000\u0000uy\u00052\u0000\u0000vy\u0003 \u0010\u0000"+
		"wy\u0003$\u0012\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005-\u0000\u0000"+
		"{|\u00050\u0000\u0000|\u0007\u0001\u0000\u0000\u0000}~\u0005\u0001\u0000"+
		"\u0000~\u0082\u0005,\u0000\u0000\u007f\u0083\u00052\u0000\u0000\u0080"+
		"\u0083\u0003 \u0010\u0000\u0081\u0083\u0003$\u0012\u0000\u0082\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"-\u0000\u0000\u0085\u0086\u00050\u0000\u0000\u0086\t\u0001\u0000\u0000"+
		"\u0000\u0087\u008c\u00052\u0000\u0000\u0088\u0089\u0005\u000e\u0000\u0000"+
		"\u0089\u008b\u00052\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005)\u0000\u0000\u0090\u0091"+
		"\u0005\'\u0000\u0000\u0091\u0092\u00050\u0000\u0000\u0092\u000b\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u00052\u0000\u0000\u0094\u0095\u0005)\u0000"+
		"\u0000\u0095\u0096\u0005\u0013\u0000\u0000\u0096\u0097\u0005.\u0000\u0000"+
		"\u0097\u0098\u0003\u000e\u0007\u0000\u0098\u0099\u0005/\u0000\u0000\u0099"+
		"\u009a\u0005\u0004\u0000\u0000\u009a\u009b\u0005\'\u0000\u0000\u009b\u009c"+
		"\u00050\u0000\u0000\u009c\r\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"3\u0000\u0000\u009e\u009f\u0005*\u0000\u0000\u009f\u00a0\u00053\u0000"+
		"\u0000\u00a0\u000f\u0001\u0000\u0000\u0000\u00a1\u00a2\u00052\u0000\u0000"+
		"\u00a2\u00a3\u0005)\u0000\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4"+
		"\u00a5\u0005.\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007\u0000\u00a6\u00a7"+
		"\u0005\u000e\u0000\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000\u00a8\u00a9"+
		"\u0005/\u0000\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa\u00ab\u0005"+
		"\'\u0000\u0000\u00ab\u00ac\u00050\u0000\u0000\u00ac\u0011\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b1\u0003\n\u0005\u0000\u00ae\u00b1\u0003\f\u0006"+
		"\u0000\u00af\u00b1\u0003\u0010\b\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u0013\u0001\u0000\u0000\u0000\u00b2\u00b3\u00052\u0000\u0000\u00b3"+
		"\u00b4\u0005%\u0000\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000\u00b5\u00b6"+
		"\u00050\u0000\u0000\u00b6\u0015\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0014\n\u0000\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9\u00bb\u00034"+
		"\u001a\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u0019\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u00052\u0000\u0000\u00c0\u00ca\u0005(\u0000\u0000"+
		"\u00c1\u00cb\u00052\u0000\u0000\u00c2\u00cb\u00053\u0000\u0000\u00c3\u00cb"+
		"\u00054\u0000\u0000\u00c4\u00cb\u00055\u0000\u0000\u00c5\u00cb\u00051"+
		"\u0000\u0000\u00c6\u00cb\u0003>\u001f\u0000\u00c7\u00cb\u0003 \u0010\u0000"+
		"\u00c8\u00cb\u0003$\u0012\u0000\u00c9\u00cb\u0003L&\u0000\u00ca\u00c1"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000\u0000\u00ca\u00c3"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c5"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u00050\u0000\u0000\u00cd\u001b\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003"+
		" \u0010\u0000\u00cf\u00d9\u0005(\u0000\u0000\u00d0\u00da\u00052\u0000"+
		"\u0000\u00d1\u00da\u00053\u0000\u0000\u00d2\u00da\u00054\u0000\u0000\u00d3"+
		"\u00da\u00055\u0000\u0000\u00d4\u00da\u00051\u0000\u0000\u00d5\u00da\u0003"+
		">\u001f\u0000\u00d6\u00da\u0003 \u0010\u0000\u00d7\u00da\u0003$\u0012"+
		"\u0000\u00d8\u00da\u0003L&\u0000\u00d9\u00d0\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d9\u00d2\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u00050\u0000\u0000\u00dc\u001d"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0003$\u0012\u0000\u00de\u00e8\u0005"+
		"(\u0000\u0000\u00df\u00e9\u00052\u0000\u0000\u00e0\u00e9\u00053\u0000"+
		"\u0000\u00e1\u00e9\u00054\u0000\u0000\u00e2\u00e9\u00055\u0000\u0000\u00e3"+
		"\u00e9\u00051\u0000\u0000\u00e4\u00e9\u0003>\u001f\u0000\u00e5\u00e9\u0003"+
		" \u0010\u0000\u00e6\u00e9\u0003$\u0012\u0000\u00e7\u00e9\u0003L&\u0000"+
		"\u00e8\u00df\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e1\u0001\u0000\u0000\u0000\u00e8\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u00050\u0000\u0000\u00eb\u001f\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u00052\u0000\u0000\u00ed\u00ee\u0005.\u0000\u0000\u00ee\u00ef\u0003"+
		"\"\u0011\u0000\u00ef\u00f0\u0005/\u0000\u0000\u00f0!\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0007\u0001\u0000\u0000\u00f2#\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u00052\u0000\u0000\u00f4\u00f5\u0005.\u0000\u0000\u00f5\u00f6"+
		"\u0003\"\u0011\u0000\u00f6\u00f7\u0005\u000e\u0000\u0000\u00f7\u00f8\u0003"+
		"\"\u0011\u0000\u00f8\u00f9\u0005/\u0000\u0000\u00f9%\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u000f\u0000\u0000\u00fb\u00fc\u00052\u0000\u0000"+
		"\u00fc\u00fd\u0005(\u0000\u0000\u00fd\u00fe\u0007\u0001\u0000\u0000\u00fe"+
		"\u00ff\u0007\u0002\u0000\u0000\u00ff\u0100\u0007\u0001\u0000\u0000\u0100"+
		"\u010a\u0005\u0012\u0000\u0000\u0101\u010b\u00036\u001b\u0000\u0102\u0106"+
		"\u0005\b\u0000\u0000\u0103\u0105\u00036\u001b\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010b\u0005"+
		"\t\u0000\u0000\u010a\u0101\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000"+
		"\u0000\u0000\u010b\'\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0014\u0000"+
		"\u0000\u010d\u0113\u0005,\u0000\u0000\u010e\u0114\u00052\u0000\u0000\u010f"+
		"\u0114\u00056\u0000\u0000\u0110\u0114\u00055\u0000\u0000\u0111\u0114\u0003"+
		" \u0010\u0000\u0112\u0114\u0003$\u0012\u0000\u0113\u010e\u0001\u0000\u0000"+
		"\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u011f\u0001\u0000\u0000\u0000\u0115\u011b\u0005\u000e\u0000"+
		"\u0000\u0116\u011c\u00052\u0000\u0000\u0117\u011c\u00056\u0000\u0000\u0118"+
		"\u011c\u00055\u0000\u0000\u0119\u011c\u0003 \u0010\u0000\u011a\u011c\u0003"+
		"$\u0012\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000"+
		"\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000"+
		"\u0000\u0000\u011d\u0115\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005-\u0000\u0000\u0123\u0124\u00050\u0000\u0000"+
		"\u0124)\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0015\u0000\u0000\u0126"+
		"\u012c\u0005,\u0000\u0000\u0127\u012d\u00052\u0000\u0000\u0128\u012d\u0005"+
		"6\u0000\u0000\u0129\u012d\u00055\u0000\u0000\u012a\u012d\u0003 \u0010"+
		"\u0000\u012b\u012d\u0003$\u0012\u0000\u012c\u0127\u0001\u0000\u0000\u0000"+
		"\u012c\u0128\u0001\u0000\u0000\u0000\u012c\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u0138\u0001\u0000\u0000\u0000\u012e\u0134\u0005\u000e\u0000\u0000"+
		"\u012f\u0135\u00052\u0000\u0000\u0130\u0135\u00056\u0000\u0000\u0131\u0135"+
		"\u00055\u0000\u0000\u0132\u0135\u0003 \u0010\u0000\u0133\u0135\u0003$"+
		"\u0012\u0000\u0134\u012f\u0001\u0000\u0000\u0000\u0134\u0130\u0001\u0000"+
		"\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000"+
		"\u0000\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005-\u0000\u0000\u013c\u013d\u00050\u0000\u0000"+
		"\u013d+\u0001\u0000\u0000\u0000\u013e\u014a\u0005\u0010\u0000\u0000\u013f"+
		"\u0142\u0005,\u0000\u0000\u0140\u0143\u00038\u001c\u0000\u0141\u0143\u0003"+
		":\u001d\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0005-\u0000"+
		"\u0000\u0145\u014b\u0001\u0000\u0000\u0000\u0146\u0149\u00038\u001c\u0000"+
		"\u0147\u0149\u0003:\u001d\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148"+
		"\u0147\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u013f\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0012\u0000\u0000\u014d"+
		"\u0151\u0005\b\u0000\u0000\u014e\u0150\u00036\u001b\u0000\u014f\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154"+
		"\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0005\t\u0000\u0000\u0155-\u0001\u0000\u0000\u0000\u0156\u0159\u0005"+
		"\u001b\u0000\u0000\u0157\u015a\u00038\u001c\u0000\u0158\u015a\u0003:\u001d"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0165\u0005\u001c\u0000"+
		"\u0000\u015c\u0166\u00032\u0019\u0000\u015d\u0161\u0005\b\u0000\u0000"+
		"\u015e\u0160\u00032\u0019\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0164\u0166\u0005\t\u0000\u0000\u0165\u015c"+
		"\u0001\u0000\u0000\u0000\u0165\u015d\u0001\u0000\u0000\u0000\u0166\u0173"+
		"\u0001\u0000\u0000\u0000\u0167\u0171\u0005\u001a\u0000\u0000\u0168\u0172"+
		"\u00030\u0018\u0000\u0169\u016d\u0005\b\u0000\u0000\u016a\u016c\u0003"+
		"0\u0018\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u0170\u0172\u0005\t\u0000\u0000\u0171\u0168\u0001\u0000\u0000"+
		"\u0000\u0171\u0169\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000"+
		"\u0000\u0173\u0167\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174/\u0001\u0000\u0000\u0000\u0175\u0180\u0003\u001a\r\u0000"+
		"\u0176\u0180\u0003\u001c\u000e\u0000\u0177\u0180\u0003\u001e\u000f\u0000"+
		"\u0178\u0180\u0003&\u0013\u0000\u0179\u0180\u0003(\u0014\u0000\u017a\u0180"+
		"\u0003*\u0015\u0000\u017b\u0180\u0003,\u0016\u0000\u017c\u0180\u0003."+
		"\u0017\u0000\u017d\u0180\u0003\u0006\u0003\u0000\u017e\u0180\u0003\b\u0004"+
		"\u0000\u017f\u0175\u0001\u0000\u0000\u0000\u017f\u0176\u0001\u0000\u0000"+
		"\u0000\u017f\u0177\u0001\u0000\u0000\u0000\u017f\u0178\u0001\u0000\u0000"+
		"\u0000\u017f\u0179\u0001\u0000\u0000\u0000\u017f\u017a\u0001\u0000\u0000"+
		"\u0000\u017f\u017b\u0001\u0000\u0000\u0000\u017f\u017c\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u01801\u0001\u0000\u0000\u0000\u0181\u018c\u0003\u001a\r\u0000"+
		"\u0182\u018c\u0003\u001c\u000e\u0000\u0183\u018c\u0003\u001e\u000f\u0000"+
		"\u0184\u018c\u0003&\u0013\u0000\u0185\u018c\u0003(\u0014\u0000\u0186\u018c"+
		"\u0003*\u0015\u0000\u0187\u018c\u0003,\u0016\u0000\u0188\u018c\u0003."+
		"\u0017\u0000\u0189\u018c\u0003\u0006\u0003\u0000\u018a\u018c\u0003\b\u0004"+
		"\u0000\u018b\u0181\u0001\u0000\u0000\u0000\u018b\u0182\u0001\u0000\u0000"+
		"\u0000\u018b\u0183\u0001\u0000\u0000\u0000\u018b\u0184\u0001\u0000\u0000"+
		"\u0000\u018b\u0185\u0001\u0000\u0000\u0000\u018b\u0186\u0001\u0000\u0000"+
		"\u0000\u018b\u0187\u0001\u0000\u0000\u0000\u018b\u0188\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000"+
		"\u0000\u018c3\u0001\u0000\u0000\u0000\u018d\u0198\u0003\u001a\r\u0000"+
		"\u018e\u0198\u0003\u001c\u000e\u0000\u018f\u0198\u0003\u001e\u000f\u0000"+
		"\u0190\u0198\u0003&\u0013\u0000\u0191\u0198\u0003(\u0014\u0000\u0192\u0198"+
		"\u0003*\u0015\u0000\u0193\u0198\u0003,\u0016\u0000\u0194\u0198\u0003."+
		"\u0017\u0000\u0195\u0198\u0003\u0006\u0003\u0000\u0196\u0198\u0003\b\u0004"+
		"\u0000\u0197\u018d\u0001\u0000\u0000\u0000\u0197\u018e\u0001\u0000\u0000"+
		"\u0000\u0197\u018f\u0001\u0000\u0000\u0000\u0197\u0190\u0001\u0000\u0000"+
		"\u0000\u0197\u0191\u0001\u0000\u0000\u0000\u0197\u0192\u0001\u0000\u0000"+
		"\u0000\u0197\u0193\u0001\u0000\u0000\u0000\u0197\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000"+
		"\u0000\u01985\u0001\u0000\u0000\u0000\u0199\u01a5\u0003\u0004\u0002\u0000"+
		"\u019a\u01a5\u0003\u001a\r\u0000\u019b\u01a5\u0003\u001c\u000e\u0000\u019c"+
		"\u01a5\u0003\u001e\u000f\u0000\u019d\u01a5\u0003&\u0013\u0000\u019e\u01a5"+
		"\u0003(\u0014\u0000\u019f\u01a5\u0003*\u0015\u0000\u01a0\u01a5\u0003,"+
		"\u0016\u0000\u01a1\u01a5\u0003.\u0017\u0000\u01a2\u01a5\u0003\u0006\u0003"+
		"\u0000\u01a3\u01a5\u0003\b\u0004\u0000\u01a4\u0199\u0001\u0000\u0000\u0000"+
		"\u01a4\u019a\u0001\u0000\u0000\u0000\u01a4\u019b\u0001\u0000\u0000\u0000"+
		"\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4\u019d\u0001\u0000\u0000\u0000"+
		"\u01a4\u019e\u0001\u0000\u0000\u0000\u01a4\u019f\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a57\u0001\u0000\u0000\u0000\u01a6\u01aa\u0003>\u001f\u0000\u01a7\u01a8"+
		"\u0003F#\u0000\u01a8\u01a9\u0003>\u001f\u0000\u01a9\u01ab\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003<\u001e\u0000"+
		"\u01ad\u01ae\u0007\u0003\u0000\u0000\u01ae\u01af\u0003<\u001e\u0000\u01af"+
		";\u0001\u0000\u0000\u0000\u01b0\u01b9\u00052\u0000\u0000\u01b1\u01b9\u0005"+
		"4\u0000\u0000\u01b2\u01b9\u00055\u0000\u0000\u01b3\u01b9\u00053\u0000"+
		"\u0000\u01b4\u01b9\u00051\u0000\u0000\u01b5\u01b9\u0003 \u0010\u0000\u01b6"+
		"\u01b9\u0003$\u0012\u0000\u01b7\u01b9\u0003>\u001f\u0000\u01b8\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b1\u0001\u0000\u0000\u0000\u01b8\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b3\u0001\u0000\u0000\u0000\u01b8\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9=\u0001\u0000"+
		"\u0000\u0000\u01ba\u01c0\u0003@ \u0000\u01bb\u01bc\u0003D\"\u0000\u01bc"+
		"\u01bd\u0003@ \u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1?\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c9\u00052\u0000"+
		"\u0000\u01c4\u01c9\u00053\u0000\u0000\u01c5\u01c9\u0003 \u0010\u0000\u01c6"+
		"\u01c9\u0003$\u0012\u0000\u01c7\u01c9\u0003B!\u0000\u01c8\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c4\u0001\u0000\u0000\u0000\u01c8\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c9A\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005,\u0000"+
		"\u0000\u01cb\u01cc\u0003>\u001f\u0000\u01cc\u01cd\u0005-\u0000\u0000\u01cd"+
		"C\u0001\u0000\u0000\u0000\u01ce\u01cf\u0007\u0004\u0000\u0000\u01cfE\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0007\u0005\u0000\u0000\u01d1G\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005 \u0000\u0000\u01d3\u01d4\u00052\u0000\u0000"+
		"\u01d4\u01d6\u0005,\u0000\u0000\u01d5\u01d7\u0003N\'\u0000\u01d6\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005-\u0000\u0000\u01d9\u01da\u0005"+
		")\u0000\u0000\u01da\u01db\u0005\'\u0000\u0000\u01db\u01df\u00050\u0000"+
		"\u0000\u01dc\u01de\u0003\u0004\u0002\u0000\u01dd\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e6\u0005\b\u0000\u0000"+
		"\u01e3\u01e5\u0003J%\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\t\u0000\u0000\u01eaI\u0001"+
		"\u0000\u0000\u0000\u01eb\u01f6\u0003\u001a\r\u0000\u01ec\u01f6\u0003\u001c"+
		"\u000e\u0000\u01ed\u01f6\u0003\u001e\u000f\u0000\u01ee\u01f6\u0003&\u0013"+
		"\u0000\u01ef\u01f6\u0003(\u0014\u0000\u01f0\u01f6\u0003*\u0015\u0000\u01f1"+
		"\u01f6\u0003,\u0016\u0000\u01f2\u01f6\u0003.\u0017\u0000\u01f3\u01f6\u0003"+
		"\u0006\u0003\u0000\u01f4\u01f6\u0003\b\u0004\u0000\u01f5\u01eb\u0001\u0000"+
		"\u0000\u0000\u01f5\u01ec\u0001\u0000\u0000\u0000\u01f5\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f5\u01ee\u0001\u0000\u0000\u0000\u01f5\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f0\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6K\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u00052\u0000\u0000\u01f8\u01fa\u0005,\u0000\u0000\u01f9"+
		"\u01fb\u0003P(\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005"+
		"-\u0000\u0000\u01fdM\u0001\u0000\u0000\u0000\u01fe\u0203\u00052\u0000"+
		"\u0000\u01ff\u0200\u0005\u000e\u0000\u0000\u0200\u0202\u00052\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000"+
		"\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0005)\u0000\u0000\u0207\u020c\u0005\'\u0000\u0000\u0208"+
		"\u0209\u00050\u0000\u0000\u0209\u020b\u0003N\'\u0000\u020a\u0208\u0001"+
		"\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020dO\u0001\u0000"+
		"\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0214\u0003<\u001e"+
		"\u0000\u0210\u0211\u0005\u000e\u0000\u0000\u0211\u0213\u0003<\u001e\u0000"+
		"\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000\u0000"+
		"\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000"+
		"\u0215Q\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000/X"+
		"floqx\u0082\u008c\u00b0\u00bc\u00ca\u00d9\u00e8\u0106\u010a\u0113\u011b"+
		"\u011f\u012c\u0134\u0138\u0142\u0148\u014a\u0151\u0159\u0161\u0165\u016d"+
		"\u0171\u0173\u017f\u018b\u0197\u01a4\u01aa\u01b8\u01c0\u01c8\u01d6\u01df"+
		"\u01e6\u01f5\u01fa\u0203\u020c\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}