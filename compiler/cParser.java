// Generated from c.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, CHAR=3, IF=4, ELSE=5, WHILE=6, FOR=7, PRINTX=8, ID=9, 
		STRING=10, SEMI=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, COMMA=16, 
		PLUS=17, MINUS=18, MULT=19, DIV=20, MOD=21, ASSIGN=22, PLUS_ASSIGN=23, 
		MINUS_ASSIGN=24, MULT_ASSIGN=25, DIV_ASSIGN=26, MOD_ASSIGN=27, INCREMENT=28, 
		DECREMENT=29, EQ=30, NEQ=31, LT=32, GT=33, LTEQ=34, GTEQ=35, AND=36, OR=37, 
		NOT=38, WS=39, INT_LITERAL=40, FLOAT_LITERAL=41, CHAR_LITERAL=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variable_declaration = 2, RULE_data_type = 3, 
		RULE_assignment_statement = 4, RULE_print_statement = 5, RULE_if_statement = 6, 
		RULE_while_statement = 7, RULE_for_statement = 8, RULE_expression = 9, 
		RULE_logical_term = 10, RULE_logical_factor = 11, RULE_relation = 12, 
		RULE_additive_expression = 13, RULE_multiplicative_expression = 14, RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variable_declaration", "data_type", "assignment_statement", 
			"print_statement", "if_statement", "while_statement", "for_statement", 
			"expression", "logical_term", "logical_factor", "relation", "additive_expression", 
			"multiplicative_expression", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'char'", "'if'", "'else'", "'while'", "'for'", 
			"'printx'", null, null, "';'", "'('", "')'", "'{'", "'}'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'++'", "'--'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", 
			"'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "CHAR", "IF", "ELSE", "WHILE", "FOR", "PRINTX", 
			"ID", "STRING", "SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "INCREMENT", "DECREMENT", 
			"EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "AND", "OR", "NOT", "WS", "INT_LITERAL", 
			"FLOAT_LITERAL", "CHAR_LITERAL"
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
	public String getGrammarFileName() { return "c.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINTX) | (1L << ID))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				variable_declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				assignment_statement();
				}
				break;
			case PRINTX:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				print_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				for_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(cParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(cParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(cParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			data_type();
			setState(46);
			match(ID);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(47);
				match(ASSIGN);
				setState(48);
				expression();
				}
			}

			setState(51);
			match(SEMI);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(cParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(cParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(cParser.CHAR, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(cParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(cParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(cParser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(cParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(cParser.DECREMENT, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(cParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(cParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(cParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(cParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(cParser.MOD_ASSIGN, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55);
				match(ID);
				setState(56);
				match(INCREMENT);
				}
				break;
			case 2:
				{
				setState(57);
				match(ID);
				setState(58);
				match(DECREMENT);
				}
				break;
			case 3:
				{
				setState(59);
				match(ID);
				}
				break;
			case 4:
				{
				setState(60);
				match(ID);
				setState(61);
				match(PLUS_ASSIGN);
				}
				break;
			case 5:
				{
				setState(62);
				match(ID);
				setState(63);
				match(MINUS_ASSIGN);
				}
				break;
			case 6:
				{
				setState(64);
				match(ID);
				setState(65);
				match(MULT_ASSIGN);
				}
				break;
			case 7:
				{
				setState(66);
				match(ID);
				setState(67);
				match(DIV_ASSIGN);
				}
				break;
			case 8:
				{
				setState(68);
				match(ID);
				setState(69);
				match(MOD_ASSIGN);
				}
				break;
			}
			setState(72);
			match(ASSIGN);
			setState(73);
			expression();
			setState(74);
			match(SEMI);
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINTX() { return getToken(cParser.PRINTX, 0); }
		public TerminalNode LPAREN() { return getToken(cParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(cParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(cParser.SEMI, 0); }
		public TerminalNode STRING() { return getToken(cParser.STRING, 0); }
		public TerminalNode ID() { return getToken(cParser.ID, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PRINTX);
			setState(77);
			match(LPAREN);
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			match(RPAREN);
			setState(80);
			match(SEMI);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(cParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(cParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(cParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(cParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(cParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(cParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(cParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			match(LPAREN);
			setState(84);
			expression();
			setState(85);
			match(RPAREN);
			setState(86);
			match(LBRACE);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINTX) | (1L << ID))) != 0) );
			setState(92);
			match(RBRACE);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(93);
				match(ELSE);
				setState(94);
				match(LBRACE);
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					statement();
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINTX) | (1L << ID))) != 0) );
				setState(100);
				match(RBRACE);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(cParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(cParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(cParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(WHILE);
			setState(105);
			match(LPAREN);
			setState(106);
			expression();
			setState(107);
			match(RPAREN);
			setState(108);
			match(LBRACE);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINTX) | (1L << ID))) != 0) );
			setState(114);
			match(RBRACE);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(cParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(cParser.LPAREN, 0); }
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(cParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(cParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(cParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FOR);
			setState(117);
			match(LPAREN);
			setState(118);
			assignment_statement();
			setState(119);
			expression();
			setState(120);
			match(SEMI);
			setState(121);
			assignment_statement();
			setState(122);
			match(RPAREN);
			setState(123);
			match(LBRACE);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINTX) | (1L << ID))) != 0) );
			setState(129);
			match(RBRACE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Logical_termContext> logical_term() {
			return getRuleContexts(Logical_termContext.class);
		}
		public Logical_termContext logical_term(int i) {
			return getRuleContext(Logical_termContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(cParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(cParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			logical_term();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(132);
					match(OR);
					}
					setState(133);
					logical_term();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Logical_termContext extends ParserRuleContext {
		public List<Logical_factorContext> logical_factor() {
			return getRuleContexts(Logical_factorContext.class);
		}
		public Logical_factorContext logical_factor(int i) {
			return getRuleContext(Logical_factorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(cParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(cParser.AND, i);
		}
		public Logical_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterLogical_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitLogical_term(this);
		}
	}

	public final Logical_termContext logical_term() throws RecognitionException {
		Logical_termContext _localctx = new Logical_termContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			logical_factor();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(140);
					match(AND);
					}
					setState(141);
					logical_factor();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Logical_factorContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(cParser.LPAREN, 0); }
		public Logical_termContext logical_term() {
			return getRuleContext(Logical_termContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(cParser.NOT, 0); }
		public Logical_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterLogical_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitLogical_factor(this);
		}
	}

	public final Logical_factorContext logical_factor() throws RecognitionException {
		Logical_factorContext _localctx = new Logical_factorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logical_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(147);
				match(NOT);
				}
			}

			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(150);
				relation();
				}
				break;
			case 2:
				{
				setState(151);
				match(LPAREN);
				setState(152);
				logical_term();
				setState(153);
				match(RPAREN);
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

	public static class RelationContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(cParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(cParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(cParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(cParser.NEQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(cParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(cParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(cParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(cParser.GT, i);
		}
		public List<TerminalNode> LTEQ() { return getTokens(cParser.LTEQ); }
		public TerminalNode LTEQ(int i) {
			return getToken(cParser.LTEQ, i);
		}
		public List<TerminalNode> GTEQ() { return getTokens(cParser.GTEQ); }
		public TerminalNode GTEQ(int i) {
			return getToken(cParser.GTEQ, i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			additive_expression();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LTEQ) | (1L << GTEQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(159);
					additive_expression();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(cParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(cParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(cParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(cParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			multiplicative_expression();
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(167);
					multiplicative_expression();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(cParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(cParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(cParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(cParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(cParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(cParser.MOD, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			factor();
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(175);
					factor();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(cParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(cParser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(cParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(cParser.DECREMENT, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(cParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(cParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(cParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(cParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(cParser.MOD_ASSIGN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(cParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(cParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(cParser.CHAR_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(cParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(cParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cListener ) ((cListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(181);
					match(ID);
					setState(182);
					match(INCREMENT);
					}
					break;
				case 2:
					{
					setState(183);
					match(ID);
					setState(184);
					match(DECREMENT);
					}
					break;
				case 3:
					{
					setState(185);
					match(ID);
					setState(186);
					match(PLUS_ASSIGN);
					}
					break;
				case 4:
					{
					setState(187);
					match(ID);
					setState(188);
					match(MINUS_ASSIGN);
					}
					break;
				case 5:
					{
					setState(189);
					match(ID);
					setState(190);
					match(MULT_ASSIGN);
					}
					break;
				case 6:
					{
					setState(191);
					match(ID);
					setState(192);
					match(DIV_ASSIGN);
					}
					break;
				case 7:
					{
					setState(193);
					match(ID);
					setState(194);
					match(MOD_ASSIGN);
					}
					break;
				}
				setState(197);
				match(ASSIGN);
				setState(198);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(INT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(FLOAT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(LPAREN);
				setState(204);
				expression();
				setState(205);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\b[\n\b\r\b\16\b\\\3\b\3\b\3\b\3\b\6\bc\n\b\r\b\16\bd\3"+
		"\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\6\tq\n\t\r\t\16\tr\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0080\n\n\r\n\16\n\u0081\3\n\3\n"+
		"\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\3\f\3\f\3\f\7\f"+
		"\u0091\n\f\f\f\16\f\u0094\13\f\3\r\5\r\u0097\n\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u009e\n\r\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16\3\17"+
		"\3\17\3\17\7\17\u00ab\n\17\f\17\16\17\u00ae\13\17\3\20\3\20\3\20\7\20"+
		"\u00b3\n\20\f\20\16\20\u00b6\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c6\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d2\n\21\3\21\2\2\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\7\3\2\3\5\3\2\13\f\3\2 %\3\2\23\24\3\2"+
		"\25\27\2\u00e8\2#\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b\67\3\2\2\2\nH\3\2\2"+
		"\2\fN\3\2\2\2\16T\3\2\2\2\20j\3\2\2\2\22v\3\2\2\2\24\u0085\3\2\2\2\26"+
		"\u008d\3\2\2\2\30\u0096\3\2\2\2\32\u009f\3\2\2\2\34\u00a7\3\2\2\2\36\u00af"+
		"\3\2\2\2 \u00d1\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&\3\3\2\2\2\'.\5\6\4\2(.\5\n\6\2).\5\f\7\2*.\5\16\b\2+.\5\20\t\2"+
		",.\5\22\n\2-\'\3\2\2\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2"+
		"\2.\5\3\2\2\2/\60\5\b\5\2\60\63\7\13\2\2\61\62\7\30\2\2\62\64\5\24\13"+
		"\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\r\2\2\66\7\3\2\2"+
		"\2\678\t\2\2\28\t\3\2\2\29:\7\13\2\2:I\7\36\2\2;<\7\13\2\2<I\7\37\2\2"+
		"=I\7\13\2\2>?\7\13\2\2?I\7\31\2\2@A\7\13\2\2AI\7\32\2\2BC\7\13\2\2CI\7"+
		"\33\2\2DE\7\13\2\2EI\7\34\2\2FG\7\13\2\2GI\7\35\2\2H9\3\2\2\2H;\3\2\2"+
		"\2H=\3\2\2\2H>\3\2\2\2H@\3\2\2\2HB\3\2\2\2HD\3\2\2\2HF\3\2\2\2IJ\3\2\2"+
		"\2JK\7\30\2\2KL\5\24\13\2LM\7\r\2\2M\13\3\2\2\2NO\7\n\2\2OP\7\16\2\2P"+
		"Q\t\3\2\2QR\7\17\2\2RS\7\r\2\2S\r\3\2\2\2TU\7\6\2\2UV\7\16\2\2VW\5\24"+
		"\13\2WX\7\17\2\2XZ\7\20\2\2Y[\5\4\3\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]^\3\2\2\2^h\7\21\2\2_`\7\7\2\2`b\7\20\2\2ac\5\4\3\2ba\3\2"+
		"\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\21\2\2gi\3\2\2\2h_\3"+
		"\2\2\2hi\3\2\2\2i\17\3\2\2\2jk\7\b\2\2kl\7\16\2\2lm\5\24\13\2mn\7\17\2"+
		"\2np\7\20\2\2oq\5\4\3\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2"+
		"\2\2tu\7\21\2\2u\21\3\2\2\2vw\7\t\2\2wx\7\16\2\2xy\5\n\6\2yz\5\24\13\2"+
		"z{\7\r\2\2{|\5\n\6\2|}\7\17\2\2}\177\7\20\2\2~\u0080\5\4\3\2\177~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\7\21\2\2\u0084\23\3\2\2\2\u0085\u008a\5\26\f\2\u0086"+
		"\u0087\7\'\2\2\u0087\u0089\5\26\f\2\u0088\u0086\3\2\2\2\u0089\u008c\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0092\5\30\r\2\u008e\u008f\7&\2\2\u008f\u0091\5\30"+
		"\r\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\27\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\7(\2\2"+
		"\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009d\3\2\2\2\u0098\u009e"+
		"\5\32\16\2\u0099\u009a\7\16\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7\17"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009e"+
		"\31\3\2\2\2\u009f\u00a4\5\34\17\2\u00a0\u00a1\t\4\2\2\u00a1\u00a3\5\34"+
		"\17\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\33\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ac\5\36\20"+
		"\2\u00a8\u00a9\t\5\2\2\u00a9\u00ab\5\36\20\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\35\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00af\u00b4\5 \21\2\u00b0\u00b1\t\6\2\2\u00b1\u00b3"+
		"\5 \21\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\37\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\13\2"+
		"\2\u00b8\u00c6\7\36\2\2\u00b9\u00ba\7\13\2\2\u00ba\u00c6\7\37\2\2\u00bb"+
		"\u00bc\7\13\2\2\u00bc\u00c6\7\31\2\2\u00bd\u00be\7\13\2\2\u00be\u00c6"+
		"\7\32\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c6\7\33\2\2\u00c1\u00c2\7\13\2"+
		"\2\u00c2\u00c6\7\34\2\2\u00c3\u00c4\7\13\2\2\u00c4\u00c6\7\35\2\2\u00c5"+
		"\u00b7\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00bd\3\2"+
		"\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\7\30\2\2\u00c8\u00d2\5\24\13\2\u00c9\u00d2"+
		"\7\13\2\2\u00ca\u00d2\7*\2\2\u00cb\u00d2\7+\2\2\u00cc\u00d2\7,\2\2\u00cd"+
		"\u00ce\7\16\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7\17\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1"+
		"\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2!\3\2\2\2"+
		"\24%-\63H\\dhr\u0081\u008a\u0092\u0096\u009d\u00a4\u00ac\u00b4\u00c5\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}