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
		RULE_forIndexValue = 20, RULE_forIndexLimit = 21, RULE_writeln_stmt = 22, 
		RULE_write_contain = 23, RULE_write = 24, RULE_while_loop = 25, RULE_if_statement = 26, 
		RULE_else_statement = 27, RULE_if_statement2 = 28, RULE_statement = 29, 
		RULE_statement_bucle = 30, RULE_expression = 31, RULE_comparison = 32, 
		RULE_terms = 33, RULE_simple_expression = 34, RULE_factor = 35, RULE_operacones_parentesis = 36, 
		RULE_operaciones_simples = 37, RULE_operaciones = 38, RULE_function_declaration = 39, 
		RULE_statement_function = 40, RULE_function_Call = 41, RULE_parameters_declaration = 42, 
		RULE_parameter_init = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "endprogram", "declarations", "read_call", "readln_call", 
			"variable_declaration", "array_declaration", "array_range", "arraybi_declaration", 
			"var_variables", "const_variable_declaration", "const_variables", "statements", 
			"variable_init", "array_init", "arrayBi_init", "array_access", "index", 
			"arrayBi_access", "for_loop", "forIndexValue", "forIndexLimit", "writeln_stmt", 
			"write_contain", "write", "while_loop", "if_statement", "else_statement", 
			"if_statement2", "statement", "statement_bucle", "expression", "comparison", 
			"terms", "simple_expression", "factor", "operacones_parentesis", "operaciones_simples", 
			"operaciones", "function_declaration", "statement_function", "function_Call", 
			"parameters_declaration", "parameter_init"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'readln'", "'read'", "'to'", "'of'", "'downto'", "'program'", 
			"'procedure'", "'begin'", "'end;'", "'end'", "'var'", "'const'", "'println'", 
			"','", "'for'", "'while'", null, "'do'", "'array'", "'writeln'", "'write'", 
			"'+'", "'-'", null, null, "'else'", "'if'", "'then'", "'and'", "'or'", 
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
			setState(88);
			match(PROGRAM);
			setState(89);
			match(ID);
			setState(90);
			match(SEMICOLON);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294973440L) != 0)) {
				{
				{
				setState(91);
				declarations();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(BEGIN);
			setState(98);
			statements();
			setState(99);
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
			setState(101);
			match(ENDP);
			setState(102);
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
			setState(117); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(117);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(104);
						match(VAR);
						setState(106); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(105);
								var_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(108); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case CONST:
						{
						setState(110);
						match(CONST);
						setState(112); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(111);
								const_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(114); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case FUNCTION:
						{
						setState(116);
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
				setState(119); 
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
			setState(121);
			match(READ);
			setState(122);
			match(OPEN_PARENTHESIS);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(123);
				match(ID);
				}
				break;
			case 2:
				{
				setState(124);
				array_access();
				}
				break;
			case 3:
				{
				setState(125);
				arrayBi_access();
				}
				break;
			}
			setState(128);
			match(CLOSE_PARENTHESIS);
			setState(129);
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
			setState(131);
			match(READLN);
			setState(132);
			match(OPEN_PARENTHESIS);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(133);
				match(ID);
				}
				break;
			case 2:
				{
				setState(134);
				array_access();
				}
				break;
			case 3:
				{
				setState(135);
				arrayBi_access();
				}
				break;
			}
			setState(138);
			match(CLOSE_PARENTHESIS);
			setState(139);
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
			setState(141);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				match(ID);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(COLON);
			setState(150);
			match(TYPE);
			setState(151);
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
			setState(153);
			match(ID);
			setState(154);
			match(COLON);
			setState(155);
			match(ARRAY);
			setState(156);
			match(OPEN_BRACKET);
			setState(157);
			array_range();
			setState(158);
			match(CLOSE_BRACKET);
			setState(159);
			match(OF);
			setState(160);
			match(TYPE);
			setState(161);
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
			setState(163);
			match(NUMBER);
			setState(164);
			match(DOTDOT);
			setState(165);
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
			setState(167);
			match(ID);
			setState(168);
			match(COLON);
			setState(169);
			match(ARRAY);
			setState(170);
			match(OPEN_BRACKET);
			setState(171);
			array_range();
			setState(172);
			match(COMMA);
			setState(173);
			array_range();
			setState(174);
			match(CLOSE_BRACKET);
			setState(175);
			match(OF);
			setState(176);
			match(TYPE);
			setState(177);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				array_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
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
			setState(184);
			match(ID);
			setState(185);
			match(EQUALS);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
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
			setState(189);
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
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(196);
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
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
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
			setState(197);
			match(ID);
			setState(198);
			match(ASSIGN);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(199);
				match(ID);
				}
				break;
			case 2:
				{
				setState(200);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(201);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(202);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(203);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(204);
				array_access();
				}
				break;
			case 7:
				{
				setState(205);
				arrayBi_access();
				}
				break;
			case 8:
				{
				setState(206);
				simple_expression();
				}
				break;
			case 9:
				{
				setState(207);
				function_Call();
				}
				break;
			}
			setState(210);
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
			setState(212);
			array_access();
			setState(213);
			match(ASSIGN);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(214);
				match(ID);
				}
				break;
			case 2:
				{
				setState(215);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(216);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(217);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(218);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(219);
				array_access();
				}
				break;
			case 7:
				{
				setState(220);
				simple_expression();
				}
				break;
			case 8:
				{
				setState(221);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(222);
				function_Call();
				}
				break;
			}
			setState(225);
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
			setState(227);
			arrayBi_access();
			setState(228);
			match(ASSIGN);
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(229);
				match(ID);
				}
				break;
			case 2:
				{
				setState(230);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(231);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(232);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(233);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(234);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(235);
				array_access();
				}
				break;
			case 8:
				{
				setState(236);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(237);
				function_Call();
				}
				break;
			}
			setState(240);
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
			setState(242);
			match(ID);
			setState(243);
			match(OPEN_BRACKET);
			setState(244);
			index();
			setState(245);
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
			setState(247);
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
			setState(249);
			match(ID);
			setState(250);
			match(OPEN_BRACKET);
			setState(251);
			index();
			setState(252);
			match(COMMA);
			setState(253);
			index();
			setState(254);
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
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public ForIndexValueContext forIndexValue() {
			return getRuleContext(ForIndexValueContext.class,0);
		}
		public ForIndexLimitContext forIndexLimit() {
			return getRuleContext(ForIndexLimitContext.class,0);
		}
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
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
			setState(256);
			match(FOR);
			setState(257);
			match(ID);
			setState(258);
			match(ASSIGN);
			setState(259);
			forIndexValue();
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			forIndexLimit();
			setState(262);
			match(DO);
			setState(272);
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
				setState(263);
				statement_bucle();
				}
				break;
			case BEGIN:
				{
				setState(264);
				match(BEGIN);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
					{
					{
					setState(265);
					statement_bucle();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
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
	public static class ForIndexValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public ForIndexValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIndexValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterForIndexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitForIndexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitForIndexValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIndexValueContext forIndexValue() throws RecognitionException {
		ForIndexValueContext _localctx = new ForIndexValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forIndexValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
	public static class ForIndexLimitContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public ForIndexLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIndexLimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterForIndexLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitForIndexLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitForIndexLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIndexLimitContext forIndexLimit() throws RecognitionException {
		ForIndexLimitContext _localctx = new ForIndexLimitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forIndexLimit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
	public static class Writeln_stmtContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(InterpreterParser.WRITELN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public List<Write_containContext> write_contain() {
			return getRuleContexts(Write_containContext.class);
		}
		public Write_containContext write_contain(int i) {
			return getRuleContext(Write_containContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 44, RULE_writeln_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(WRITELN);
			setState(279);
			match(OPEN_PARENTHESIS);
			setState(280);
			write_contain();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				write_contain();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(CLOSE_PARENTHESIS);
			setState(289);
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
	public static class Write_containContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode TEXTWRITE() { return getToken(InterpreterParser.TEXTWRITE, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Write_containContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_contain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWrite_contain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWrite_contain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWrite_contain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_containContext write_contain() throws RecognitionException {
		Write_containContext _localctx = new Write_containContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_contain);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(TEXTWRITE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				array_access();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				arrayBi_access();
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
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(InterpreterParser.WRITE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public List<Write_containContext> write_contain() {
			return getRuleContexts(Write_containContext.class);
		}
		public Write_containContext write_contain(int i) {
			return getRuleContext(Write_containContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 48, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(WRITE);
			setState(299);
			match(OPEN_PARENTHESIS);
			setState(300);
			write_contain();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(301);
				match(COMMA);
				setState(302);
				write_contain();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(CLOSE_PARENTHESIS);
			setState(309);
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
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public List<Statement_bucleContext> statement_bucle() {
			return getRuleContexts(Statement_bucleContext.class);
		}
		public Statement_bucleContext statement_bucle(int i) {
			return getRuleContext(Statement_bucleContext.class,i);
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
		enterRule(_localctx, 50, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(WHILE);
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(312);
				match(OPEN_PARENTHESIS);
				setState(313);
				comparison();
				setState(314);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(316);
				comparison();
				}
				break;
			}
			setState(319);
			match(DO);
			setState(320);
			match(BEGIN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
				{
				{
				setState(321);
				statement_bucle();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
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
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode THEN() { return getToken(InterpreterParser.THEN, 0); }
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
		enterRule(_localctx, 52, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IF);
			setState(330);
			comparison();
			setState(331);
			match(THEN);
			setState(341);
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
				setState(332);
				if_statement2();
				}
				break;
			case BEGIN:
				{
				setState(333);
				match(BEGIN);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
					{
					{
					setState(334);
					if_statement2();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(343);
				match(ELSE);
				setState(353);
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
					setState(344);
					else_statement();
					}
					break;
				case BEGIN:
					{
					setState(345);
					match(BEGIN);
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
						{
						{
						setState(346);
						else_statement();
						}
						}
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(352);
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
		enterRule(_localctx, 54, RULE_else_statement);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(366);
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
		enterRule(_localctx, 56, RULE_if_statement2);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(376);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(377);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(378);
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
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(387);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(388);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(389);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(390);
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
		enterRule(_localctx, 60, RULE_statement_bucle);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				variable_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				array_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				arrayBi_init();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				writeln_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
				write();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(400);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(401);
				if_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(402);
				read_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(403);
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
		enterRule(_localctx, 62, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			simple_expression();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) {
				{
				setState(407);
				operaciones();
				setState(408);
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
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			terms();
			setState(413);
			operaciones();
			setState(414);
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
		enterRule(_localctx, 66, RULE_terms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(416);
				match(ID);
				}
				break;
			case 2:
				{
				setState(417);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(418);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(419);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(420);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(421);
				array_access();
				}
				break;
			case 7:
				{
				setState(422);
				arrayBi_access();
				}
				break;
			case 8:
				{
				setState(423);
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
		enterRule(_localctx, 68, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			factor();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(427);
				operaciones_simples();
				setState(428);
				factor();
				}
				}
				setState(434);
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
		enterRule(_localctx, 70, RULE_factor);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				array_access();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				arrayBi_access();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
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
		enterRule(_localctx, 72, RULE_operacones_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(OPEN_PARENTHESIS);
			setState(443);
			simple_expression();
			setState(444);
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
		enterRule(_localctx, 74, RULE_operaciones_simples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		public TerminalNode EQUALS() { return getToken(InterpreterParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(InterpreterParser.NOT_EQUALS, 0); }
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
		enterRule(_localctx, 76, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(FUNCTION);
			setState(451);
			match(ID);
			setState(452);
			match(OPEN_PARENTHESIS);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(453);
				parameters_declaration();
				}
			}

			setState(456);
			match(CLOSE_PARENTHESIS);
			setState(457);
			match(COLON);
			setState(458);
			match(TYPE);
			setState(459);
			match(SEMICOLON);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294973440L) != 0)) {
				{
				{
				setState(460);
				declarations();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(BEGIN);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
				{
				{
				setState(467);
				statement_function();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
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
		enterRule(_localctx, 80, RULE_statement_function);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(481);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(482);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(483);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(484);
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
		enterRule(_localctx, 82, RULE_function_Call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(ID);
			setState(488);
			match(OPEN_PARENTHESIS);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17469040742105088L) != 0)) {
				{
				setState(489);
				parameter_init();
				}
			}

			setState(492);
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
		enterRule(_localctx, 84, RULE_parameters_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(494);
			match(ID);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				match(ID);
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(502);
			match(COLON);
			setState(503);
			match(TYPE);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(504);
					match(SEMICOLON);
					setState(505);
					parameters_declaration();
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 86, RULE_parameter_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			terms();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(512);
				match(COMMA);
				setState(513);
				terms();
				}
				}
				setState(518);
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
		"\u0004\u00018\u0208\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002k\b\u0002\u000b\u0002"+
		"\f\u0002l\u0001\u0002\u0001\u0002\u0004\u0002q\b\u0002\u000b\u0002\f\u0002"+
		"r\u0001\u0002\u0004\u0002v\b\u0002\u000b\u0002\f\u0002w\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0089\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0091\b\u0005\n"+
		"\u0005\f\u0005\u0094\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00b7\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0005\f\u00c1\b\f\n\f\f\f\u00c4\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00d1\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e0\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00ef\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u010b\b\u0013\n"+
		"\u0013\f\u0013\u010e\t\u0013\u0001\u0013\u0003\u0013\u0111\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u011c\b\u0016\n\u0016\f\u0016"+
		"\u011f\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0129\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0130\b\u0018"+
		"\n\u0018\f\u0018\u0133\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u013e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0143"+
		"\b\u0019\n\u0019\f\u0019\u0146\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0150\b\u001a\n\u001a\f\u001a\u0153\t\u001a\u0001\u001a\u0003\u001a\u0156"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u015c"+
		"\b\u001a\n\u001a\f\u001a\u015f\t\u001a\u0001\u001a\u0003\u001a\u0162\b"+
		"\u001a\u0003\u001a\u0164\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0170\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u017c\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0188\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0195\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u019b\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01a9"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01af\b\"\n\"\f\"\u01b2\t"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01b9\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u01c7\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01ce\b\'"+
		"\n\'\f\'\u01d1\t\'\u0001\'\u0001\'\u0005\'\u01d5\b\'\n\'\f\'\u01d8\t\'"+
		"\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01e6\b(\u0001)\u0001)\u0001)\u0003)\u01eb\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0005*\u01f2\b*\n*\f*\u01f5\t*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u01fb\b*\n*\f*\u01fe\t*\u0001+\u0001+\u0001+\u0005"+
		"+\u0203\b+\n+\f+\u0206\t+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTV\u0000\u0005\u0001\u000045\u0001\u000023\u0002\u0000"+
		"\u0003\u0003\u0005\u0005\u0001\u0000\u0016\u0019\u0001\u0000!&\u0252\u0000"+
		"X\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000\u0004u\u0001"+
		"\u0000\u0000\u0000\u0006y\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000"+
		"\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000\f\u0099\u0001\u0000\u0000"+
		"\u0000\u000e\u00a3\u0001\u0000\u0000\u0000\u0010\u00a7\u0001\u0000\u0000"+
		"\u0000\u0012\u00b6\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000\u0000"+
		"\u0000\u0016\u00bd\u0001\u0000\u0000\u0000\u0018\u00c2\u0001\u0000\u0000"+
		"\u0000\u001a\u00c5\u0001\u0000\u0000\u0000\u001c\u00d4\u0001\u0000\u0000"+
		"\u0000\u001e\u00e3\u0001\u0000\u0000\u0000 \u00f2\u0001\u0000\u0000\u0000"+
		"\"\u00f7\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000\u0000&\u0100"+
		"\u0001\u0000\u0000\u0000(\u0112\u0001\u0000\u0000\u0000*\u0114\u0001\u0000"+
		"\u0000\u0000,\u0116\u0001\u0000\u0000\u0000.\u0128\u0001\u0000\u0000\u0000"+
		"0\u012a\u0001\u0000\u0000\u00002\u0137\u0001\u0000\u0000\u00004\u0149"+
		"\u0001\u0000\u0000\u00006\u016f\u0001\u0000\u0000\u00008\u017b\u0001\u0000"+
		"\u0000\u0000:\u0187\u0001\u0000\u0000\u0000<\u0194\u0001\u0000\u0000\u0000"+
		">\u0196\u0001\u0000\u0000\u0000@\u019c\u0001\u0000\u0000\u0000B\u01a8"+
		"\u0001\u0000\u0000\u0000D\u01aa\u0001\u0000\u0000\u0000F\u01b8\u0001\u0000"+
		"\u0000\u0000H\u01ba\u0001\u0000\u0000\u0000J\u01be\u0001\u0000\u0000\u0000"+
		"L\u01c0\u0001\u0000\u0000\u0000N\u01c2\u0001\u0000\u0000\u0000P\u01e5"+
		"\u0001\u0000\u0000\u0000R\u01e7\u0001\u0000\u0000\u0000T\u01ee\u0001\u0000"+
		"\u0000\u0000V\u01ff\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000"+
		"YZ\u00052\u0000\u0000Z^\u00050\u0000\u0000[]\u0003\u0004\u0002\u0000\\"+
		"[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0005\b\u0000\u0000bc\u0003\u0018\f\u0000cd\u0003\u0002"+
		"\u0001\u0000d\u0001\u0001\u0000\u0000\u0000ef\u0005\n\u0000\u0000fg\u0005"+
		"+\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hj\u0005\u000b\u0000\u0000"+
		"ik\u0003\u0012\t\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mv\u0001\u0000\u0000"+
		"\u0000np\u0005\f\u0000\u0000oq\u0003\u0016\u000b\u0000po\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tv\u0003N\'\u0000uh\u0001\u0000"+
		"\u0000\u0000un\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x\u0005\u0001\u0000\u0000\u0000yz\u0005\u0002\u0000\u0000z~\u0005,\u0000"+
		"\u0000{\u007f\u00052\u0000\u0000|\u007f\u0003 \u0010\u0000}\u007f\u0003"+
		"$\u0012\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"-\u0000\u0000\u0081\u0082\u00050\u0000\u0000\u0082\u0007\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0088\u0005,\u0000\u0000"+
		"\u0085\u0089\u00052\u0000\u0000\u0086\u0089\u0003 \u0010\u0000\u0087\u0089"+
		"\u0003$\u0012\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005-\u0000\u0000\u008b\u008c\u00050\u0000"+
		"\u0000\u008c\t\u0001\u0000\u0000\u0000\u008d\u0092\u00052\u0000\u0000"+
		"\u008e\u008f\u0005\u000e\u0000\u0000\u008f\u0091\u00052\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005)\u0000\u0000\u0096\u0097\u0005\'\u0000\u0000\u0097\u0098"+
		"\u00050\u0000\u0000\u0098\u000b\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"2\u0000\u0000\u009a\u009b\u0005)\u0000\u0000\u009b\u009c\u0005\u0013\u0000"+
		"\u0000\u009c\u009d\u0005.\u0000\u0000\u009d\u009e\u0003\u000e\u0007\u0000"+
		"\u009e\u009f\u0005/\u0000\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0"+
		"\u00a1\u0005\'\u0000\u0000\u00a1\u00a2\u00050\u0000\u0000\u00a2\r\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u00053\u0000\u0000\u00a4\u00a5\u0005*\u0000"+
		"\u0000\u00a5\u00a6\u00053\u0000\u0000\u00a6\u000f\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u00052\u0000\u0000\u00a8\u00a9\u0005)\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0013\u0000\u0000\u00aa\u00ab\u0005.\u0000\u0000\u00ab\u00ac\u0003"+
		"\u000e\u0007\u0000\u00ac\u00ad\u0005\u000e\u0000\u0000\u00ad\u00ae\u0003"+
		"\u000e\u0007\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af\u00b0\u0005\u0004"+
		"\u0000\u0000\u00b0\u00b1\u0005\'\u0000\u0000\u00b1\u00b2\u00050\u0000"+
		"\u0000\u00b2\u0011\u0001\u0000\u0000\u0000\u00b3\u00b7\u0003\n\u0005\u0000"+
		"\u00b4\u00b7\u0003\f\u0006\u0000\u00b5\u00b7\u0003\u0010\b\u0000\u00b6"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u00052\u0000\u0000\u00b9\u00ba\u0005%\u0000\u0000\u00ba\u00bb\u0007"+
		"\u0000\u0000\u0000\u00bb\u00bc\u00050\u0000\u0000\u00bc\u0015\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000\u00be\u0017\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c1\u0003:\u001d\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u0019\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u00052\u0000\u0000\u00c6"+
		"\u00d0\u0005(\u0000\u0000\u00c7\u00d1\u00052\u0000\u0000\u00c8\u00d1\u0005"+
		"3\u0000\u0000\u00c9\u00d1\u00054\u0000\u0000\u00ca\u00d1\u00055\u0000"+
		"\u0000\u00cb\u00d1\u00051\u0000\u0000\u00cc\u00d1\u0003 \u0010\u0000\u00cd"+
		"\u00d1\u0003$\u0012\u0000\u00ce\u00d1\u0003D\"\u0000\u00cf\u00d1\u0003"+
		"R)\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000"+
		"\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u00050\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u00df\u0005(\u0000\u0000\u00d6\u00e0"+
		"\u00052\u0000\u0000\u00d7\u00e0\u00053\u0000\u0000\u00d8\u00e0\u00054"+
		"\u0000\u0000\u00d9\u00e0\u00055\u0000\u0000\u00da\u00e0\u00051\u0000\u0000"+
		"\u00db\u00e0\u0003 \u0010\u0000\u00dc\u00e0\u0003D\"\u0000\u00dd\u00e0"+
		"\u0003$\u0012\u0000\u00de\u00e0\u0003R)\u0000\u00df\u00d6\u0001\u0000"+
		"\u0000\u0000\u00df\u00d7\u0001\u0000\u0000\u0000\u00df\u00d8\u0001\u0000"+
		"\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000"+
		"\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u00050\u0000"+
		"\u0000\u00e2\u001d\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003$\u0012\u0000"+
		"\u00e4\u00ee\u0005(\u0000\u0000\u00e5\u00ef\u00052\u0000\u0000\u00e6\u00ef"+
		"\u00053\u0000\u0000\u00e7\u00ef\u00054\u0000\u0000\u00e8\u00ef\u00055"+
		"\u0000\u0000\u00e9\u00ef\u00051\u0000\u0000\u00ea\u00ef\u0003D\"\u0000"+
		"\u00eb\u00ef\u0003 \u0010\u0000\u00ec\u00ef\u0003$\u0012\u0000\u00ed\u00ef"+
		"\u0003R)\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u00050\u0000\u0000\u00f1\u001f\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u00052\u0000\u0000\u00f3\u00f4\u0005.\u0000\u0000\u00f4"+
		"\u00f5\u0003\"\u0011\u0000\u00f5\u00f6\u0005/\u0000\u0000\u00f6!\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0007\u0001\u0000\u0000\u00f8#\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u00052\u0000\u0000\u00fa\u00fb\u0005.\u0000\u0000"+
		"\u00fb\u00fc\u0003\"\u0011\u0000\u00fc\u00fd\u0005\u000e\u0000\u0000\u00fd"+
		"\u00fe\u0003\"\u0011\u0000\u00fe\u00ff\u0005/\u0000\u0000\u00ff%\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005\u000f\u0000\u0000\u0101\u0102\u0005"+
		"2\u0000\u0000\u0102\u0103\u0005(\u0000\u0000\u0103\u0104\u0003(\u0014"+
		"\u0000\u0104\u0105\u0007\u0002\u0000\u0000\u0105\u0106\u0003*\u0015\u0000"+
		"\u0106\u0110\u0005\u0012\u0000\u0000\u0107\u0111\u0003<\u001e\u0000\u0108"+
		"\u010c\u0005\b\u0000\u0000\u0109\u010b\u0003<\u001e\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0111"+
		"\u0005\t\u0000\u0000\u0110\u0107\u0001\u0000\u0000\u0000\u0110\u0108\u0001"+
		"\u0000\u0000\u0000\u0111\'\u0001\u0000\u0000\u0000\u0112\u0113\u0007\u0001"+
		"\u0000\u0000\u0113)\u0001\u0000\u0000\u0000\u0114\u0115\u0007\u0001\u0000"+
		"\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0014\u0000\u0000"+
		"\u0117\u0118\u0005,\u0000\u0000\u0118\u011d\u0003.\u0017\u0000\u0119\u011a"+
		"\u0005\u000e\u0000\u0000\u011a\u011c\u0003.\u0017\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001"+
		"\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"-\u0000\u0000\u0121\u0122\u00050\u0000\u0000\u0122-\u0001\u0000\u0000"+
		"\u0000\u0123\u0129\u00052\u0000\u0000\u0124\u0129\u00056\u0000\u0000\u0125"+
		"\u0129\u00055\u0000\u0000\u0126\u0129\u0003 \u0010\u0000\u0127\u0129\u0003"+
		"$\u0012\u0000\u0128\u0123\u0001\u0000\u0000\u0000\u0128\u0124\u0001\u0000"+
		"\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129/\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u0015\u0000\u0000\u012b\u012c\u0005,\u0000\u0000"+
		"\u012c\u0131\u0003.\u0017\u0000\u012d\u012e\u0005\u000e\u0000\u0000\u012e"+
		"\u0130\u0003.\u0017\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0133"+
		"\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005-\u0000\u0000\u0135\u0136\u0005"+
		"0\u0000\u0000\u01361\u0001\u0000\u0000\u0000\u0137\u013d\u0005\u0010\u0000"+
		"\u0000\u0138\u0139\u0005,\u0000\u0000\u0139\u013a\u0003@ \u0000\u013a"+
		"\u013b\u0005-\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013e"+
		"\u0003@ \u0000\u013d\u0138\u0001\u0000\u0000\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0012"+
		"\u0000\u0000\u0140\u0144\u0005\b\u0000\u0000\u0141\u0143\u0003<\u001e"+
		"\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\t\u0000\u0000\u01483\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0005\u001b\u0000\u0000\u014a\u014b\u0003@ \u0000\u014b\u0155"+
		"\u0005\u001c\u0000\u0000\u014c\u0156\u00038\u001c\u0000\u014d\u0151\u0005"+
		"\b\u0000\u0000\u014e\u0150\u00038\u001c\u0000\u014f\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0156\u0005\t\u0000"+
		"\u0000\u0155\u014c\u0001\u0000\u0000\u0000\u0155\u014d\u0001\u0000\u0000"+
		"\u0000\u0156\u0163\u0001\u0000\u0000\u0000\u0157\u0161\u0005\u001a\u0000"+
		"\u0000\u0158\u0162\u00036\u001b\u0000\u0159\u015d\u0005\b\u0000\u0000"+
		"\u015a\u015c\u00036\u001b\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u0162\u0005\t\u0000\u0000\u0161\u0158"+
		"\u0001\u0000\u0000\u0000\u0161\u0159\u0001\u0000\u0000\u0000\u0162\u0164"+
		"\u0001\u0000\u0000\u0000\u0163\u0157\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u01645\u0001\u0000\u0000\u0000\u0165\u0170\u0003"+
		"\u001a\r\u0000\u0166\u0170\u0003\u001c\u000e\u0000\u0167\u0170\u0003\u001e"+
		"\u000f\u0000\u0168\u0170\u0003&\u0013\u0000\u0169\u0170\u0003,\u0016\u0000"+
		"\u016a\u0170\u00030\u0018\u0000\u016b\u0170\u00032\u0019\u0000\u016c\u0170"+
		"\u00034\u001a\u0000\u016d\u0170\u0003\u0006\u0003\u0000\u016e\u0170\u0003"+
		"\b\u0004\u0000\u016f\u0165\u0001\u0000\u0000\u0000\u016f\u0166\u0001\u0000"+
		"\u0000\u0000\u016f\u0167\u0001\u0000\u0000\u0000\u016f\u0168\u0001\u0000"+
		"\u0000\u0000\u016f\u0169\u0001\u0000\u0000\u0000\u016f\u016a\u0001\u0000"+
		"\u0000\u0000\u016f\u016b\u0001\u0000\u0000\u0000\u016f\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u01707\u0001\u0000\u0000\u0000\u0171\u017c\u0003\u001a\r"+
		"\u0000\u0172\u017c\u0003\u001c\u000e\u0000\u0173\u017c\u0003\u001e\u000f"+
		"\u0000\u0174\u017c\u0003&\u0013\u0000\u0175\u017c\u0003,\u0016\u0000\u0176"+
		"\u017c\u00030\u0018\u0000\u0177\u017c\u00032\u0019\u0000\u0178\u017c\u0003"+
		"4\u001a\u0000\u0179\u017c\u0003\u0006\u0003\u0000\u017a\u017c\u0003\b"+
		"\u0004\u0000\u017b\u0171\u0001\u0000\u0000\u0000\u017b\u0172\u0001\u0000"+
		"\u0000\u0000\u017b\u0173\u0001\u0000\u0000\u0000\u017b\u0174\u0001\u0000"+
		"\u0000\u0000\u017b\u0175\u0001\u0000\u0000\u0000\u017b\u0176\u0001\u0000"+
		"\u0000\u0000\u017b\u0177\u0001\u0000\u0000\u0000\u017b\u0178\u0001\u0000"+
		"\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017c9\u0001\u0000\u0000\u0000\u017d\u0188\u0003\u001a\r"+
		"\u0000\u017e\u0188\u0003\u001c\u000e\u0000\u017f\u0188\u0003\u001e\u000f"+
		"\u0000\u0180\u0188\u0003&\u0013\u0000\u0181\u0188\u0003,\u0016\u0000\u0182"+
		"\u0188\u00030\u0018\u0000\u0183\u0188\u00032\u0019\u0000\u0184\u0188\u0003"+
		"4\u001a\u0000\u0185\u0188\u0003\u0006\u0003\u0000\u0186\u0188\u0003\b"+
		"\u0004\u0000\u0187\u017d\u0001\u0000\u0000\u0000\u0187\u017e\u0001\u0000"+
		"\u0000\u0000\u0187\u017f\u0001\u0000\u0000\u0000\u0187\u0180\u0001\u0000"+
		"\u0000\u0000\u0187\u0181\u0001\u0000\u0000\u0000\u0187\u0182\u0001\u0000"+
		"\u0000\u0000\u0187\u0183\u0001\u0000\u0000\u0000\u0187\u0184\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001\u0000"+
		"\u0000\u0000\u0188;\u0001\u0000\u0000\u0000\u0189\u0195\u0003\u0004\u0002"+
		"\u0000\u018a\u0195\u0003\u001a\r\u0000\u018b\u0195\u0003\u001c\u000e\u0000"+
		"\u018c\u0195\u0003\u001e\u000f\u0000\u018d\u0195\u0003&\u0013\u0000\u018e"+
		"\u0195\u0003,\u0016\u0000\u018f\u0195\u00030\u0018\u0000\u0190\u0195\u0003"+
		"2\u0019\u0000\u0191\u0195\u00034\u001a\u0000\u0192\u0195\u0003\u0006\u0003"+
		"\u0000\u0193\u0195\u0003\b\u0004\u0000\u0194\u0189\u0001\u0000\u0000\u0000"+
		"\u0194\u018a\u0001\u0000\u0000\u0000\u0194\u018b\u0001\u0000\u0000\u0000"+
		"\u0194\u018c\u0001\u0000\u0000\u0000\u0194\u018d\u0001\u0000\u0000\u0000"+
		"\u0194\u018e\u0001\u0000\u0000\u0000\u0194\u018f\u0001\u0000\u0000\u0000"+
		"\u0194\u0190\u0001\u0000\u0000\u0000\u0194\u0191\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000"+
		"\u0195=\u0001\u0000\u0000\u0000\u0196\u019a\u0003D\"\u0000\u0197\u0198"+
		"\u0003L&\u0000\u0198\u0199\u0003D\"\u0000\u0199\u019b\u0001\u0000\u0000"+
		"\u0000\u019a\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b?\u0001\u0000\u0000\u0000\u019c\u019d\u0003B!\u0000\u019d"+
		"\u019e\u0003L&\u0000\u019e\u019f\u0003B!\u0000\u019fA\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a9\u00052\u0000\u0000\u01a1\u01a9\u00054\u0000\u0000\u01a2"+
		"\u01a9\u00055\u0000\u0000\u01a3\u01a9\u00053\u0000\u0000\u01a4\u01a9\u0005"+
		"1\u0000\u0000\u01a5\u01a9\u0003 \u0010\u0000\u01a6\u01a9\u0003$\u0012"+
		"\u0000\u01a7\u01a9\u0003D\"\u0000\u01a8\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a1\u0001\u0000\u0000\u0000\u01a8\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9C\u0001\u0000\u0000\u0000\u01aa"+
		"\u01b0\u0003F#\u0000\u01ab\u01ac\u0003J%\u0000\u01ac\u01ad\u0003F#\u0000"+
		"\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000"+
		"\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1E\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b9\u00052\u0000\u0000\u01b4\u01b9"+
		"\u00053\u0000\u0000\u01b5\u01b9\u0003 \u0010\u0000\u01b6\u01b9\u0003$"+
		"\u0012\u0000\u01b7\u01b9\u0003H$\u0000\u01b8\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b4\u0001\u0000\u0000\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b9G\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005,\u0000\u0000\u01bb\u01bc"+
		"\u0003D\"\u0000\u01bc\u01bd\u0005-\u0000\u0000\u01bdI\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0007\u0003\u0000\u0000\u01bfK\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0007\u0004\u0000\u0000\u01c1M\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0005 \u0000\u0000\u01c3\u01c4\u00052\u0000\u0000\u01c4\u01c6\u0005"+
		",\u0000\u0000\u01c5\u01c7\u0003T*\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0005-\u0000\u0000\u01c9\u01ca\u0005)\u0000\u0000\u01ca"+
		"\u01cb\u0005\'\u0000\u0000\u01cb\u01cf\u00050\u0000\u0000\u01cc\u01ce"+
		"\u0003\u0004\u0002\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d6\u0005\b\u0000\u0000\u01d3\u01d5\u0003"+
		"P(\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0005\t\u0000\u0000\u01daO\u0001\u0000\u0000\u0000"+
		"\u01db\u01e6\u0003\u001a\r\u0000\u01dc\u01e6\u0003\u001c\u000e\u0000\u01dd"+
		"\u01e6\u0003\u001e\u000f\u0000\u01de\u01e6\u0003&\u0013\u0000\u01df\u01e6"+
		"\u0003,\u0016\u0000\u01e0\u01e6\u00030\u0018\u0000\u01e1\u01e6\u00032"+
		"\u0019\u0000\u01e2\u01e6\u00034\u001a\u0000\u01e3\u01e6\u0003\u0006\u0003"+
		"\u0000\u01e4\u01e6\u0003\b\u0004\u0000\u01e5\u01db\u0001\u0000\u0000\u0000"+
		"\u01e5\u01dc\u0001\u0000\u0000\u0000\u01e5\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e5\u01de\u0001\u0000\u0000\u0000\u01e5\u01df\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e0\u0001\u0000\u0000\u0000\u01e5\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6Q\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u00052\u0000\u0000\u01e8\u01ea\u0005,\u0000\u0000\u01e9\u01eb\u0003"+
		"V+\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005-\u0000\u0000"+
		"\u01edS\u0001\u0000\u0000\u0000\u01ee\u01f3\u00052\u0000\u0000\u01ef\u01f0"+
		"\u0005\u000e\u0000\u0000\u01f0\u01f2\u00052\u0000\u0000\u01f1\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005"+
		")\u0000\u0000\u01f7\u01fc\u0005\'\u0000\u0000\u01f8\u01f9\u00050\u0000"+
		"\u0000\u01f9\u01fb\u0003T*\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fdU\u0001\u0000\u0000\u0000\u01fe\u01fc"+
		"\u0001\u0000\u0000\u0000\u01ff\u0204\u0003B!\u0000\u0200\u0201\u0005\u000e"+
		"\u0000\u0000\u0201\u0203\u0003B!\u0000\u0202\u0200\u0001\u0000\u0000\u0000"+
		"\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205W\u0001\u0000\u0000\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000)^lruw~\u0088\u0092\u00b6\u00c2\u00d0\u00df"+
		"\u00ee\u010c\u0110\u011d\u0128\u0131\u013d\u0144\u0151\u0155\u015d\u0161"+
		"\u0163\u016f\u017b\u0187\u0194\u019a\u01a8\u01b0\u01b8\u01c6\u01cf\u01d6"+
		"\u01e5\u01ea\u01f3\u01fc\u0204";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}