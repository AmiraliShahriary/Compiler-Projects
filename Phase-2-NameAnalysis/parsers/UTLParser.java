// Generated from /Users/sadeghmacbook/Downloads/faz2/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, SEMICOLON=2, COMMA=3, COLON=4, DOT=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, 
		AND=17, OR=18, NOT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, L_SHIFT=23, 
		R_SHIFT=24, BIT_NOT=25, LT=26, GT=27, EQ=28, NEQ=29, INC=30, DEC=31, ASSIGN=32, 
		ADD_ASSIGN=33, SUB_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, MOD_ASSIGN=37, 
		TRY=38, THROW=39, CATCH=40, IF=41, ELSE=42, FOR=43, WHILE=44, BREAK=45, 
		CONTINUE=46, RETURN=47, MAIN=48, ONINIT=49, ONSTART=50, FLOAT=51, DOUBLE=52, 
		STRING=53, BOOL=54, VOID=55, INT=56, BUY=57, SELL=58, ASK=59, BID=60, 
		TIME=61, HIGH=62, LOW=63, DIGITS=64, VOLUME=65, TYPE=66, TEXT=67, OPEN=68, 
		CLOSE=69, TRADE=70, ORDER=71, CANDLE=72, EXCEPTION=73, REFRESH_RATE=74, 
		GET_CANDLE=75, TERMINATE=76, CONNECT=77, OBSERVE=78, PRINT=79, ID=80, 
		INT_LITERAL=81, FLOAT_LITERAL=82, STRING_LITERAL=83, COMMENT=84;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_assignStatement = 4, RULE_mainDeclaration = 5, RULE_continueBreakStatement = 6, 
		RULE_returnStatement = 7, RULE_tryCatchStatement = 8, RULE_forStatement = 9, 
		RULE_initDeclaration = 10, RULE_startDeclaration = 11, RULE_ifStatement = 12, 
		RULE_whileStatement = 13, RULE_throwStatement = 14, RULE_functionCall = 15, 
		RULE_methodCall = 16, RULE_expression = 17, RULE_value = 18, RULE_primitiveType = 19, 
		RULE_complexType = 20, RULE_allType = 21, RULE_espetialFunction = 22, 
		RULE_espetialVariable = 23, RULE_espetialMethod = 24, RULE_assign = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDeclaration", "functionDeclaration", "assignStatement", 
			"mainDeclaration", "continueBreakStatement", "returnStatement", "tryCatchStatement", 
			"forStatement", "initDeclaration", "startDeclaration", "ifStatement", 
			"whileStatement", "throwStatement", "functionCall", "methodCall", "expression", 
			"value", "primitiveType", "complexType", "allType", "espetialFunction", 
			"espetialVariable", "espetialMethod", "assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", "'~'", "'<'", "'>'", "'=='", "'!='", "'++'", 
			"'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'try'", "'throw'", 
			"'catch'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'Main'", "'OnInit'", "'OnStart'", "'float'", "'double'", 
			"'string'", "'bool'", "'void'", "'int'", "'BUY'", "'SELL'", "'Ask'", 
			"'Bid'", "'Time'", "'High'", "'Low'", "'Digits'", "'Volume'", "'Type'", 
			"'Text'", "'Open'", "'Close'", "'Trade'", "'Order'", "'Candle'", "'Exception'", 
			"'RefreshRate'", "'GetCandle'", "'Terminate'", "'Connect'", "'Observe'", 
			"'Print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "SEMICOLON", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "L_SHIFT", 
			"R_SHIFT", "BIT_NOT", "LT", "GT", "EQ", "NEQ", "INC", "DEC", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"TRY", "THROW", "CATCH", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "MAIN", "ONINIT", "ONSTART", "FLOAT", "DOUBLE", "STRING", "BOOL", 
			"VOID", "INT", "BUY", "SELL", "ASK", "BID", "TIME", "HIGH", "LOW", "DIGITS", 
			"VOLUME", "TYPE", "TEXT", "OPEN", "CLOSE", "TRADE", "ORDER", "CANDLE", 
			"EXCEPTION", "REFRESH_RATE", "GET_CANDLE", "TERMINATE", "CONNECT", "OBSERVE", 
			"PRINT", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "COMMENT"
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
	public String getGrammarFileName() { return "UTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program pro;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public InitDeclarationContext initDeclaration;
		public StartDeclarationContext startDeclaration;
		public MainDeclarationContext mainDeclaration;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InitDeclarationContext> initDeclaration() {
			return getRuleContexts(InitDeclarationContext.class);
		}
		public InitDeclarationContext initDeclaration(int i) {
			return getRuleContext(InitDeclarationContext.class,i);
		}
		public List<StartDeclarationContext> startDeclaration() {
			return getRuleContexts(StartDeclarationContext.class);
		}
		public StartDeclarationContext startDeclaration(int i) {
			return getRuleContext(StartDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).pro =  new Program(); _localctx.pro.setLine(0);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(53);
						((ProgramContext)_localctx).varDeclaration = varDeclaration();
						 _localctx.pro.addVar(((ProgramContext)_localctx).varDeclaration.varDecRet); 
						}
						break;
					case 2:
						{
						setState(56);
						((ProgramContext)_localctx).functionDeclaration = functionDeclaration();
						 _localctx.pro.addFunction(((ProgramContext)_localctx).functionDeclaration.funcDecRet); 
						}
						break;
					case 3:
						{
						setState(59);
						((ProgramContext)_localctx).initDeclaration = initDeclaration();
						 _localctx.pro.addInit(((ProgramContext)_localctx).initDeclaration.initDecRet); 
						}
						break;
					case 4:
						{
						setState(62);
						((ProgramContext)_localctx).startDeclaration = startDeclaration();
						 _localctx.pro.addStart(((ProgramContext)_localctx).startDeclaration.startDecRet); 
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(70);
			((ProgramContext)_localctx).mainDeclaration = mainDeclaration();
			 _localctx.pro.setMain(((ProgramContext)_localctx).mainDeclaration.mainDecRet); 
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
		public Statement statementRet;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public AssignStatementContext assignStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public ReturnStatementContext returnStatement;
		public IfStatementContext ifStatement;
		public WhileStatementContext whileStatement;
		public ForStatementContext forStatement;
		public TryCatchStatementContext tryCatchStatement;
		public ThrowStatementContext throwStatement;
		public ExpressionContext expression;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(73);
				((StatementContext)_localctx).varDeclaration = varDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).varDeclaration.varDecRet; 
				}
				break;
			case 2:
				{
				setState(76);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).functionDeclaration.funcDecRet; 
				}
				break;
			case 3:
				{
				setState(79);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignStatement.assignStmtRet; 
				}
				break;
			case 4:
				{
				setState(82);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).continueBreakStatement.continueBreakStmtRet; 
				}
				break;
			case 5:
				{
				setState(85);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).returnStatement.returnStmtRet; 
				}
				break;
			case 6:
				{
				setState(88);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifStatement.ifStmtRet; 
				}
				break;
			case 7:
				{
				setState(91);
				((StatementContext)_localctx).whileStatement = whileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).whileStatement.whileStmtRet; 
				}
				break;
			case 8:
				{
				setState(94);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forStatement.forStmtRet; 
				}
				break;
			case 9:
				{
				setState(97);
				((StatementContext)_localctx).tryCatchStatement = tryCatchStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).tryCatchStatement.tryCatchStmtRet; 
				}
				break;
			case 10:
				{
				setState(100);
				((StatementContext)_localctx).throwStatement = throwStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).throwStatement.throwStmtRet; 
				}
				break;
			case 11:
				{
				setState(103);
				((StatementContext)_localctx).expression = expression(0);
				setState(104);
				match(SEMICOLON);
				 ExpressionStmt temp = new ExpressionStmt(((StatementContext)_localctx).expression.expressionRet);((StatementContext)_localctx).statementRet =  temp; 
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDecRet;
		public AllTypeContext allType;
		public Token INT_LITERAL;
		public Token ID;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VarDeclarationContext)_localctx).varDecRet =  new VarDeclaration(); 
			setState(110);
			((VarDeclarationContext)_localctx).allType = allType();
			 _localctx.varDecRet.setType(((VarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(112);
				match(LBRACK);
				setState(113);
				((VarDeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(114);
				match(RBRACK);
				 _localctx.varDecRet.setLength((((VarDeclarationContext)_localctx).INT_LITERAL!=null?Integer.valueOf(((VarDeclarationContext)_localctx).INT_LITERAL.getText()):0)); 
				}
			}

			setState(118);
			((VarDeclarationContext)_localctx).ID = match(ID);
			varDecRer.setLine((((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getLine():0));
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(120);
				match(ASSIGN);
				setState(121);
				expression(0);
				}
			}

			setState(124);
			match(SEMICOLON);
			 Identifier temp = new Identifier((((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getText():null)); _localctx.varDecRet.setIdentifier(temp); _localctx.varDecRet.setLine((((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getLine():0)); 
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration funcDecRet;
		public PrimitiveTypeContext primitiveType;
		public Token ID;
		public AllTypeContext a1;
		public Token int1;
		public Token id1;
		public AllTypeContext a2;
		public Token int2;
		public Token id2;
		public StatementContext st1;
		public StatementContext st2;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(UTLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UTLParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AllTypeContext> allType() {
			return getRuleContexts(AllTypeContext.class);
		}
		public AllTypeContext allType(int i) {
			return getRuleContext(AllTypeContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(UTLParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(UTLParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(UTLParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(UTLParser.RBRACK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(UTLParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(UTLParser.INT_LITERAL, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDeclarationContext)_localctx).funcDecRet =  new FunctionDeclaration(); 
			setState(128);
			((FunctionDeclarationContext)_localctx).primitiveType = primitiveType();
			 _localctx.funcDecRet.setReturnType(((FunctionDeclarationContext)_localctx).primitiveType.primitiveTypeRet); 
			setState(130);
			((FunctionDeclarationContext)_localctx).ID = match(ID);
			funcDecRet.setLine(((FunctionDeclarationContext)_localctx).ID.line()); Identifier temp = new Identifier((((FunctionDeclarationContext)_localctx).ID!=null?((FunctionDeclarationContext)_localctx).ID.getText():null)); _localctx.funcDecRet.setName(temp); _localctx.funcDecRet.setLine((((FunctionDeclarationContext)_localctx).ID!=null?((FunctionDeclarationContext)_localctx).ID.getLine():0)); 
			setState(132);
			match(LPAREN);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 7864383L) != 0)) {
				{
				setState(133);
				((FunctionDeclarationContext)_localctx).a1 = allType();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(134);
					match(LBRACK);
					setState(135);
					((FunctionDeclarationContext)_localctx).int1 = match(INT_LITERAL);
					setState(136);
					match(RBRACK);
					}
				}

				setState(139);
				((FunctionDeclarationContext)_localctx).id1 = match(ID);
				Identifier temp2 = new Identifier((((FunctionDeclarationContext)_localctx).id1!=null?((FunctionDeclarationContext)_localctx).id1.getText():null));VarDeclaration temp1 = new VarDeclaration(); temp1.setType(((FunctionDeclarationContext)_localctx).a1.allTypeRet); temp1.setIdentifier(temp2); _localctx.funcDecRet.addArg(temp1); 
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(141);
					match(COMMA);
					setState(142);
					((FunctionDeclarationContext)_localctx).a2 = allType();
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACK) {
						{
						setState(143);
						match(LBRACK);
						setState(144);
						((FunctionDeclarationContext)_localctx).int2 = match(INT_LITERAL);
						setState(145);
						match(RBRACK);
						}
					}

					setState(148);
					((FunctionDeclarationContext)_localctx).id2 = match(ID);
					 Identifier temp4 = new Identifier((((FunctionDeclarationContext)_localctx).id2!=null?((FunctionDeclarationContext)_localctx).id2.getText():null));VarDeclaration temp3 = new VarDeclaration(); temp1.setType(((FunctionDeclarationContext)_localctx).a2.allTypeRet); temp1.setIdentifier(temp4); _localctx.funcDecRet.addArg(temp3);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(158);
			match(RPAREN);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(159);
				match(THROW);
				setState(160);
				match(EXCEPTION);
				}
				break;
			}
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(163);
				match(LBRACE);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(164);
					((FunctionDeclarationContext)_localctx).st1 = statement();
					 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).st1.statementRet); 
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(173);
				((FunctionDeclarationContext)_localctx).st2 = statement();
				 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).st2.statementRet); 
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
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStmt assignStmtRet;
		public Token ID;
		public ExpressionContext lValue;
		public ExpressionContext rValue;
		public Token SEMICOLON;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((AssignStatementContext)_localctx).ID = match(ID);
			assignStmtRet.setLine(((AssignStatementContext)_localctx).ID.line())
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(180);
				match(LBRACK);
				setState(181);
				expression(0);
				setState(182);
				match(RBRACK);
				}
			}

			setState(186);
			assign();
			setState(187);
			((AssignStatementContext)_localctx).lValue = expression(0);
			 ((AssignStatementContext)_localctx).assignStmtRet =  new AssignStmt(); _localctx.assignStmtRet.setLValue(((AssignStatementContext)_localctx).lValue.expressionRet); 
			setState(189);
			match(ASSIGN);
			setState(190);
			((AssignStatementContext)_localctx).rValue = expression(0);
			setState(191);
			((AssignStatementContext)_localctx).SEMICOLON = match(SEMICOLON);
			 _localctx.assignStmtRet.setRValue(((AssignStatementContext)_localctx).rValue.expressionRet);  _localctx.assignStmtRet.setLine((((AssignStatementContext)_localctx).SEMICOLON!=null?((AssignStatementContext)_localctx).SEMICOLON.getLine():0)); 
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
	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration mainDecRet;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(UTLParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MainDeclarationContext)_localctx).mainDecRet =  new MainDeclaration(); 
			setState(195);
			match(VOID);
			setState(196);
			match(MAIN);
			setState(197);
			match(LPAREN);
			setState(198);
			match(RPAREN);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(199);
				match(LBRACE);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(200);
					((MainDeclarationContext)_localctx).s1 = statement();
					 _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).s1.statementRet); 
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(209);
				((MainDeclarationContext)_localctx).s2 = statement();
				 _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).s2.statementRet); 
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
	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public ContinueBreakStmt continueBreakStmtRet;
		public Token BREAK;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(UTLParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(UTLParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(214);
				((ContinueBreakStatementContext)_localctx).BREAK = match(BREAK);
				 ((ContinueBreakStatementContext)_localctx).continueBreakStmtRet =  new ContinueBreakStmt("BREAK"); 
				}
				break;
			case CONTINUE:
				{
				setState(216);
				match(CONTINUE);
				 ((ContinueBreakStatementContext)_localctx).continueBreakStmtRet =  new ContinueBreakStmt("CONTINUE"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			match(SEMICOLON);
			 _localctx.continueBreakStmtRet.setLine((((ContinueBreakStatementContext)_localctx).BREAK!=null?((ContinueBreakStatementContext)_localctx).BREAK.getLine():0)); 
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token RETURN;
		public ExpressionContext expr;
		public TerminalNode RETURN() { return getToken(UTLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(224);
			((ReturnStatementContext)_localctx).expr = expression(0);
			setState(225);
			match(SEMICOLON);
			 returnStmtRet.setLine(((ReturnStatementContext)_localctx).RETURN.line()); ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt(((ReturnStatementContext)_localctx).expr.expressionRet); _localctx.returnStmtRet.setLine((((ReturnStatementContext)_localctx).RETURN!=null?((ReturnStatementContext)_localctx).RETURN.getLine():0)); 
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
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TryCatchStmt tryCatchStmtRet;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode TRY() { return getToken(UTLParser.TRY, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(UTLParser.CATCH, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(TRY);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(229);
				match(LBRACE);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(230);
					((TryCatchStatementContext)_localctx).s1 = statement();
					 tryCatchStmtRet.setLine(TRY.line()); ((TryCatchStatementContext)_localctx).tryCatchStmtRet =  new TryCatchStmt(null); _localctx.tryCatchStmtRet.addThenStatement(((TryCatchStatementContext)_localctx).s1.statementRet); 
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(239);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(242);
				match(CATCH);
				setState(243);
				match(EXCEPTION);
				setState(244);
				match(ID);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(245);
					match(LBRACE);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(246);
						((TryCatchStatementContext)_localctx).s2 = statement();
						 _localctx.tryCatchStmtRet.addElseStatement(((TryCatchStatementContext)_localctx).s2.statementRet); 
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(254);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(255);
					statement();
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forStmtRet;
		public Token FOR;
		public StatementContext s1;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public StatementContext s2;
		public StatementContext s3;
		public TerminalNode FOR() { return getToken(UTLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ForStatementContext)_localctx).forStmtRet =  new ForStmt(); 
			setState(261);
			((ForStatementContext)_localctx).FOR = match(FOR);
			setState(262);
			match(LPAREN);
			setState(263);
			((ForStatementContext)_localctx).s1 = statement();
			_localctx.forStmtRet.setLine((((ForStatementContext)_localctx).FOR!=null?((ForStatementContext)_localctx).FOR.getLine():0)) ; _localctx.forStmtRet.addInit(((ForStatementContext)_localctx).s1.statementRet); 
			setState(265);
			((ForStatementContext)_localctx).e1 = expression(0);
			 _localctx.forStmtRet.setCondition(((ForStatementContext)_localctx).e1.expressionRet); 
			setState(267);
			match(SEMICOLON);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(268);
				((ForStatementContext)_localctx).e2 = expression(0);
				 _localctx.forStmtRet.setUpdate(((ForStatementContext)_localctx).e2.expressionRet); 
				}
			}

			setState(273);
			match(RPAREN);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(274);
				match(LBRACE);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(275);
					((ForStatementContext)_localctx).s2 = statement();
					 _localctx.forStmtRet.addBody(((ForStatementContext)_localctx).s2.statementRet); 
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(284);
				((ForStatementContext)_localctx).s3 = statement();
				 _localctx.forStmtRet.addBody(((ForStatementContext)_localctx).s3.statementRet); 
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
	public static class InitDeclarationContext extends ParserRuleContext {
		public OnInitDeclaration initDecRet;
		public Token ID;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode ONINIT() { return getToken(UTLParser.ONINIT, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterInitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitInitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitInitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclarationContext initDeclaration() throws RecognitionException {
		InitDeclarationContext _localctx = new InitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((InitDeclarationContext)_localctx).initDecRet =  new OnInitDeclaration(); 
			setState(290);
			match(VOID);
			setState(291);
			match(ONINIT);
			setState(292);
			match(LPAREN);
			setState(293);
			match(TRADE);
			setState(294);
			((InitDeclarationContext)_localctx).ID = match(ID);
			Identifier id = new Identifier((((InitDeclarationContext)_localctx).ID!=null?((InitDeclarationContext)_localctx).ID.getText():null));id.setLine((((InitDeclarationContext)_localctx).ID!=null?((InitDeclarationContext)_localctx).ID.getLine():0));
			setState(296);
			match(RPAREN);
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(297);
				match(THROW);
				setState(298);
				match(EXCEPTION);
				}
				break;
			}
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(301);
				match(LBRACE);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(302);
					((InitDeclarationContext)_localctx).s1 = statement();
					 _localctx.initDecRet.addStatement(((InitDeclarationContext)_localctx).s1.statementRet); 
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(311);
				((InitDeclarationContext)_localctx).s2 = statement();
				 _localctx.initDecRet.addStatement(((InitDeclarationContext)_localctx).s2.statementRet);_localctx.initDecRet.setTradeName(id); 
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
	public static class StartDeclarationContext extends ParserRuleContext {
		public OnStartDeclaration startDecRet;
		public Token VOID;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode ONSTART() { return getToken(UTLParser.ONSTART, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public StartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStartDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStartDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartDeclarationContext startDeclaration() throws RecognitionException {
		StartDeclarationContext _localctx = new StartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_startDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((StartDeclarationContext)_localctx).startDecRet =  new OnStartDeclaration(null); 
			setState(317);
			((StartDeclarationContext)_localctx).VOID = match(VOID);
			startDecRet.setLine((((StartDeclarationContext)_localctx).VOID!=null?((StartDeclarationContext)_localctx).VOID.getLine():0));
			setState(319);
			match(ONSTART);
			setState(320);
			match(LPAREN);
			setState(321);
			match(TRADE);
			setState(322);
			match(ID);
			setState(323);
			match(RPAREN);
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(324);
				match(THROW);
				setState(325);
				match(EXCEPTION);
				}
				break;
			}
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(328);
				match(LBRACE);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(329);
					((StartDeclarationContext)_localctx).statement = statement();
					 _localctx.startDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(338);
				((StartDeclarationContext)_localctx).statement = statement();
				 _localctx.startDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet); 
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
	public static class IfStatementContext extends ParserRuleContext {
		public IfElseStmt ifStmtRet;
		public Token IF;
		public ExpressionContext e1;
		public StatementContext s1;
		public StatementContext s2;
		public StatementContext s3;
		public StatementContext s4;
		public TerminalNode IF() { return getToken(UTLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UTLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((IfStatementContext)_localctx).ifStmtRet =  new IfElseStmt(); 
			setState(344);
			((IfStatementContext)_localctx).IF = match(IF);
			ifStmtRet.setLine((((IfStatementContext)_localctx).IF!=null?((IfStatementContext)_localctx).IF.getLine():0));
			setState(346);
			match(LPAREN);
			setState(347);
			((IfStatementContext)_localctx).e1 = expression(0);
			setState(348);
			match(RPAREN);
			_localctx.ifStmtRet.setCondition(((IfStatementContext)_localctx).e1.expressionRet);
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(350);
				match(LBRACE);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(351);
					((IfStatementContext)_localctx).s1 = statement();
					 _localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).s1.statementRet); 
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(360);
				((IfStatementContext)_localctx).s2 = statement();
				 _localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).s2.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(365);
				match(ELSE);
				setState(379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(366);
					match(LBRACE);
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(367);
						((IfStatementContext)_localctx).s3 = statement();
						 _localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).s3.statementRet); 
						}
						}
						setState(374);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(375);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(376);
					((IfStatementContext)_localctx).s4 = statement();
					 _localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).s4.statementRet); 
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
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStmt whileStmtRet;
		public Token WHILE;
		public ExpressionContext e1;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode WHILE() { return getToken(UTLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((WhileStatementContext)_localctx).whileStmtRet =  new WhileStmt(null); 
			setState(384);
			((WhileStatementContext)_localctx).WHILE = match(WHILE);
			whileStmtRet.setLine((((WhileStatementContext)_localctx).WHILE!=null?((WhileStatementContext)_localctx).WHILE.getLine():0));
			setState(386);
			match(LPAREN);
			setState(387);
			((WhileStatementContext)_localctx).e1 = expression(0);
			setCondition(((WhileStatementContext)_localctx).e1.expressionRet)
			setState(389);
			match(RPAREN);
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(390);
				match(LBRACE);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(391);
					((WhileStatementContext)_localctx).s1 = statement();
					 _localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).s1.statementRet); 
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(400);
				((WhileStatementContext)_localctx).s2 = statement();
				_localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).s2.statementRet); 
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStmt throwStmtRet;
		public Token THROW;
		public ExpressionContext expression;
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			((ThrowStatementContext)_localctx).THROW = match(THROW);
			throwStmtRet.setLine((((ThrowStatementContext)_localctx).THROW!=null?((ThrowStatementContext)_localctx).THROW.getLine():0));
			setState(407);
			((ThrowStatementContext)_localctx).expression = expression(0);
			setState(408);
			match(SEMICOLON);
			 ((ThrowStatementContext)_localctx).throwStmtRet =  new ThrowStmt(((ThrowStatementContext)_localctx).expression.expressionRet); _localctx.throwStmtRet.setLine((((ThrowStatementContext)_localctx).THROW!=null?((ThrowStatementContext)_localctx).THROW.getLine():0)); 
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall functionCallRet;
		public Token LPAREN;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public EspetialFunctionContext espetialFunction() {
			return getRuleContext(EspetialFunctionContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(null); 
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
				{
				setState(412);
				espetialFunction();
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(413);
				complexType();
				}
				break;
			case ID:
				{
				setState(414);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(417);
			((FunctionCallContext)_localctx).LPAREN = match(LPAREN);
			functionCallRet.setLine((((FunctionCallContext)_localctx).LPAREN!=null?((FunctionCallContext)_localctx).LPAREN.getLine():0));
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(419);
				expression(0);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(420);
					match(COMMA);
					setState(421);
					expression(0);
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(429);
			match(RPAREN);
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
	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methCallRet;
		public boolean temp;
		public Identifier id;
		public Token ID;
		public ExpressionContext expression;
		public EspetialMethodContext espetialMethod;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialMethodContext espetialMethod() {
			return getRuleContext(EspetialMethodContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			((MethodCallContext)_localctx).ID = match(ID);
			methCallRet.setLine((((MethodCallContext)_localctx).ID!=null?((MethodCallContext)_localctx).ID.getLine():0)); ((MethodCallContext)_localctx).temp =  false;
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(433);
				match(LBRACK);
				setState(434);
				((MethodCallContext)_localctx).expression = expression(0);
				setState(435);
				match(RBRACK);
				((MethodCallContext)_localctx).temp =  true;
				}
			}

			setState(440);
			match(DOT);
			setState(441);
			((MethodCallContext)_localctx).espetialMethod = espetialMethod();
			setState(442);
			match(LPAREN);

			        if(_localctx.temp){
			            ((MethodCallContext)_localctx).id =  new ArrayIdentifier((((MethodCallContext)_localctx).ID!=null?((MethodCallContext)_localctx).ID.getText():null) , ((MethodCallContext)_localctx).expression.expressionRet);
			            _localctx.id.setLine((((MethodCallContext)_localctx).ID!=null?((MethodCallContext)_localctx).ID.getLine():0));
			            ((MethodCallContext)_localctx).methCallRet =  new MethodCall(_localctx.id, ((MethodCallContext)_localctx).espetialMethod.espetialMethodRet);
			        }
			        else {
			            ((MethodCallContext)_localctx).id =  new Identifier((((MethodCallContext)_localctx).ID!=null?((MethodCallContext)_localctx).ID.getText():null));
			            _localctx.id.setLine((((MethodCallContext)_localctx).ID!=null?((MethodCallContext)_localctx).ID.getLine():0));
			            ((MethodCallContext)_localctx).methCallRet =  new MethodCall(_localctx.id, ((MethodCallContext)_localctx).espetialMethod.espetialMethodRet);
			        }
			        _localctx.methCallRet.setLine((((MethodCallContext)_localctx).ID!=null?((MethodCallContext)_localctx).ID.getLine():0));
			    
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(444);
				((MethodCallContext)_localctx).expression = expression(0);
				 _localctx.methCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet); 
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(446);
					match(COMMA);
					setState(447);
					((MethodCallContext)_localctx).expression = expression(0);
					 _localctx.methCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet); 
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(457);
			match(RPAREN);
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
		public Expression expressionRet;
		public UnaryOperator op1;
		public BinaryOperator op2;
		public int Line;
		public ExpressionContext lexpr;
		public ValueContext value;
		public Token NOT;
		public Token MINUS;
		public Token BIT_NOT;
		public Token INC;
		public Token DEC;
		public Token ID;
		public Token LPAREN;
		public FunctionCallContext functionCall;
		public MethodCallContext methodCall;
		public Token MULT;
		public Token DIV;
		public Token MOD;
		public ExpressionContext rexpr;
		public Token PLUS;
		public Token L_SHIFT;
		public Token R_SHIFT;
		public Token LT;
		public Token GT;
		public Token EQ;
		public Token NEQ;
		public Token BIT_AND;
		public Token BIT_OR;
		public Token BIT_XOR;
		public Token AND;
		public Token OR;
		public Token DOT;
		public EspetialVariableContext espetialVariable;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(UTLParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(UTLParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(UTLParser.BIT_NOT, 0); }
		public TerminalNode INC() { return getToken(UTLParser.INC, 0); }
		public TerminalNode DEC() { return getToken(UTLParser.DEC, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode MULT() { return getToken(UTLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(UTLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UTLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(UTLParser.PLUS, 0); }
		public TerminalNode L_SHIFT() { return getToken(UTLParser.L_SHIFT, 0); }
		public TerminalNode R_SHIFT() { return getToken(UTLParser.R_SHIFT, 0); }
		public TerminalNode LT() { return getToken(UTLParser.LT, 0); }
		public TerminalNode GT() { return getToken(UTLParser.GT, 0); }
		public TerminalNode EQ() { return getToken(UTLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(UTLParser.NEQ, 0); }
		public TerminalNode BIT_AND() { return getToken(UTLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(UTLParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(UTLParser.BIT_XOR, 0); }
		public TerminalNode AND() { return getToken(UTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(UTLParser.OR, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialVariableContext espetialVariable() {
			return getRuleContext(EspetialVariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(460);
				((ExpressionContext)_localctx).value = value();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).value.valueRet; expressionRet.setLine(((ExpressionContext)_localctx).value.valueRet.getLine());  
				}
				break;
			case 2:
				{
				setState(473);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(463);
					((ExpressionContext)_localctx).NOT = match(NOT);
					 expressionRet.setLine(((ExpressionContext)_localctx).NOT.getLine()); ((ExpressionContext)_localctx).op1 =  UnaryOperator.NOT; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).NOT!=null?((ExpressionContext)_localctx).NOT.getLine():0);
					}
					break;
				case MINUS:
					{
					setState(465);
					((ExpressionContext)_localctx).MINUS = match(MINUS);
					((ExpressionContext)_localctx).op1 =  UnaryOperator.MINUS; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).MINUS!=null?((ExpressionContext)_localctx).MINUS.getLine():0);
					}
					break;
				case BIT_NOT:
					{
					setState(467);
					((ExpressionContext)_localctx).BIT_NOT = match(BIT_NOT);
					((ExpressionContext)_localctx).op1 =  UnaryOperator.BIT_NOT; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).BIT_NOT!=null?((ExpressionContext)_localctx).BIT_NOT.getLine():0);
					}
					break;
				case INC:
					{
					setState(469);
					((ExpressionContext)_localctx).INC = match(INC);
					((ExpressionContext)_localctx).op1 =  UnaryOperator.INC; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).INC!=null?((ExpressionContext)_localctx).INC.getLine():0);
					}
					break;
				case DEC:
					{
					setState(471);
					((ExpressionContext)_localctx).DEC = match(DEC);
					((ExpressionContext)_localctx).op1 =  UnaryOperator.DEC; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).DEC!=null?((ExpressionContext)_localctx).DEC.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(475);
				((ExpressionContext)_localctx).lexpr = expression(13);
				 ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(_localctx.op1, ((ExpressionContext)_localctx).lexpr.expressionRet); _localctx.expressionRet.setLine(_localctx.Line); 
				}
				break;
			case 3:
				{
				setState(478);
				((ExpressionContext)_localctx).ID = match(ID);
				 expressionRet.setLine(((ExpressionContext)_localctx).ID.getLine()); boolean temp = false;
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(480);
					match(LBRACK);
					setState(481);
					((ExpressionContext)_localctx).lexpr = expression(0);
					setState(482);
					match(RBRACK);
					temp = true;
					}
					break;
				}
				 if(temp) ((ExpressionContext)_localctx).expressionRet =  new ArrayIdentifier((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).lexpr.expressionRet); else ((ExpressionContext)_localctx).expressionRet =  new Identifier((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getLine():0)); 
				}
				break;
			case 4:
				{
				setState(488);
				((ExpressionContext)_localctx).LPAREN = match(LPAREN);
				setState(489);
				((ExpressionContext)_localctx).lexpr = expression(0);
				setState(490);
				match(RPAREN);
				 expressionRet.setLine(((ExpressionContext)_localctx).LPAREN.getLine()); ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).lexpr.expressionRet; 
				}
				break;
			case 5:
				{
				setState(493);
				((ExpressionContext)_localctx).functionCall = functionCall();
				 ((ExpressionContext)_localctx).expressionRet =   ((ExpressionContext)_localctx).functionCall.functionCallRet; expressionRet.setLine(((ExpressionContext)_localctx).functionCall.functionCallRet.getLine()); 
				}
				break;
			case 6:
				{
				setState(496);
				((ExpressionContext)_localctx).methodCall = methodCall();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).methodCall.methCallRet; expressionRet.setLine(((ExpressionContext)_localctx).methodCall.methCallRet.getLine()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(590);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(508);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(502);
							((ExpressionContext)_localctx).MULT = match(MULT);
							 expressionRet.setLine(((ExpressionContext)_localctx).MULT.getLine()); ((ExpressionContext)_localctx).op2 =  BinaryOperator.MULT; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).MULT!=null?((ExpressionContext)_localctx).MULT.getLine():0);
							}
							break;
						case DIV:
							{
							setState(504);
							((ExpressionContext)_localctx).DIV = match(DIV);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.DIV; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).DIV!=null?((ExpressionContext)_localctx).DIV.getLine():0);
							}
							break;
						case MOD:
							{
							setState(506);
							((ExpressionContext)_localctx).MOD = match(MOD);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.MOD; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).MOD!=null?((ExpressionContext)_localctx).MOD.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(510);
						((ExpressionContext)_localctx).rexpr = expression(13);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(518);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(514);
							((ExpressionContext)_localctx).PLUS = match(PLUS);
							 expressionRet.setLine(((ExpressionContext)_localctx).PLUS.getLine()); ((ExpressionContext)_localctx).op2 =  BinaryOperator.PLUS; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).PLUS!=null?((ExpressionContext)_localctx).PLUS.getLine():0);
							}
							break;
						case MINUS:
							{
							setState(516);
							((ExpressionContext)_localctx).MINUS = match(MINUS);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.MINUS; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).MINUS!=null?((ExpressionContext)_localctx).MINUS.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(520);
						((ExpressionContext)_localctx).rexpr = expression(12);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(528);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case L_SHIFT:
							{
							setState(524);
							((ExpressionContext)_localctx).L_SHIFT = match(L_SHIFT);
							 expressionRet.setLine(((ExpressionContext)_localctx).L_SHIFT.getLine()); op2 = BinaryOperator.L_SHIFT; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).L_SHIFT!=null?((ExpressionContext)_localctx).L_SHIFT.getLine():0);
							}
							break;
						case R_SHIFT:
							{
							setState(526);
							((ExpressionContext)_localctx).R_SHIFT = match(R_SHIFT);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.R_SHIFT; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).R_SHIFT!=null?((ExpressionContext)_localctx).R_SHIFT.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(530);
						((ExpressionContext)_localctx).rexpr = expression(11);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(533);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(538);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(534);
							((ExpressionContext)_localctx).LT = match(LT);
							 expressionRet.setLine(((ExpressionContext)_localctx).LT.getLine()); ((ExpressionContext)_localctx).op2 =  BinaryOperator.LT; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).LT!=null?((ExpressionContext)_localctx).LT.getLine():0);
							}
							break;
						case GT:
							{
							setState(536);
							((ExpressionContext)_localctx).GT = match(GT);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.GT; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).GT!=null?((ExpressionContext)_localctx).GT.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(540);
						((ExpressionContext)_localctx).rexpr = expression(10);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(543);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(548);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(544);
							((ExpressionContext)_localctx).EQ = match(EQ);
							 expressionRet.setLine(((ExpressionContext)_localctx).EQ.getLine()); ((ExpressionContext)_localctx).op2 =  BinaryOperator.EQ; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).EQ!=null?((ExpressionContext)_localctx).EQ.getLine():0);
							}
							break;
						case NEQ:
							{
							setState(546);
							((ExpressionContext)_localctx).NEQ = match(NEQ);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.NEQ; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).NEQ!=null?((ExpressionContext)_localctx).NEQ.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(550);
						((ExpressionContext)_localctx).rexpr = expression(9);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(553);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(560);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BIT_AND:
							{
							setState(554);
							((ExpressionContext)_localctx).BIT_AND = match(BIT_AND);
							 expressionRet.setLine(((ExpressionContext)_localctx).BIT_AND.getLine()); ((ExpressionContext)_localctx).op2 =  BinaryOperator.BIT_AND; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).BIT_AND!=null?((ExpressionContext)_localctx).BIT_AND.getLine():0);
							}
							break;
						case BIT_OR:
							{
							setState(556);
							((ExpressionContext)_localctx).BIT_OR = match(BIT_OR);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.BIT_OR; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).BIT_OR!=null?((ExpressionContext)_localctx).BIT_OR.getLine():0);
							}
							break;
						case BIT_XOR:
							{
							setState(558);
							((ExpressionContext)_localctx).BIT_XOR = match(BIT_XOR);
							((ExpressionContext)_localctx).op2 =  BinaryOperator.BIT_XOR; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).BIT_XOR!=null?((ExpressionContext)_localctx).BIT_XOR.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(562);
						((ExpressionContext)_localctx).rexpr = expression(8);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(565);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(566);
						((ExpressionContext)_localctx).AND = match(AND);
						 expressionRet.setLine(((ExpressionContext)_localctx).AND.getLine()); ((ExpressionContext)_localctx).op2 =  BinaryOperator.AND; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).AND!=null?((ExpressionContext)_localctx).AND.getLine():0);
						setState(568);
						((ExpressionContext)_localctx).rexpr = expression(7);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(571);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(572);
						((ExpressionContext)_localctx).OR = match(OR);
						 expressionRet.setLine(((ExpressionContext)_localctx).OR.getLine()); ((ExpressionContext)_localctx).op2 =  BinaryOperator.OR; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).OR!=null?((ExpressionContext)_localctx).OR.getLine():0);
						setState(574);
						((ExpressionContext)_localctx).rexpr = expression(6);
						 ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).rexpr.expressionRet, _localctx.op2); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(577);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(578);
						((ExpressionContext)_localctx).DOT = match(DOT);
						setState(579);
						((ExpressionContext)_localctx).espetialVariable = espetialVariable();
						 expressionRet.setLine(((ExpressionContext)_localctx).DOT.getLine()); ((ExpressionContext)_localctx).expressionRet =  new MethodCall(((ExpressionContext)_localctx).lexpr.expressionRet, ((ExpressionContext)_localctx).espetialVariable.espetialVariableRet); 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(587);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INC:
							{
							setState(583);
							((ExpressionContext)_localctx).INC = match(INC);
							 expressionRet.setLine(((ExpressionContext)_localctx).INC.getLine()); ((ExpressionContext)_localctx).op1 =  UnaryOperator.INC; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).INC!=null?((ExpressionContext)_localctx).INC.getLine():0);
							}
							break;
						case DEC:
							{
							setState(585);
							((ExpressionContext)_localctx).DEC = match(DEC);
							((ExpressionContext)_localctx).op1 =  UnaryOperator.DEC; ((ExpressionContext)_localctx).Line =  (((ExpressionContext)_localctx).DEC!=null?((ExpressionContext)_localctx).DEC.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						 ((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(_localctx.op1, ((ExpressionContext)_localctx).lexpr.expressionRet); _localctx.expressionRet.setLine(_localctx.Line); 
						}
						break;
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public Token v1;
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(UTLParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UTLParser.STRING_LITERAL, 0); }
		public TerminalNode SELL() { return getToken(UTLParser.SELL, 0); }
		public TerminalNode BUY() { return getToken(UTLParser.BUY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				{
				setState(595);
				((ValueContext)_localctx).v1 = match(INT_LITERAL);
				IntValue intval = new IntValue(0); intval.setConstant((((ValueContext)_localctx).INT_LITERAL!=null?Integer.valueOf(((ValueContext)_localctx).INT_LITERAL.getText()):0));((ValueContext)_localctx).valueRet =  intval; 
				valueRet.setLine((((ValueContext)_localctx).v1!=null?((ValueContext)_localctx).v1.getLine():0));
				}
				break;
			case FLOAT_LITERAL:
				{
				setState(598);
				((ValueContext)_localctx).v1 = match(FLOAT_LITERAL);
				FloatValue floatval = new FloatValue(Float.parseFloat((((ValueContext)_localctx).FLOAT_LITERAL!=null?((ValueContext)_localctx).FLOAT_LITERAL.getText():null))); floatval.setConstant(Float.parseFloat((((ValueContext)_localctx).FLOAT_LITERAL!=null?((ValueContext)_localctx).FLOAT_LITERAL.getText():null)));((ValueContext)_localctx).valueRet =  floatval; 
				valueRet.setLine((((ValueContext)_localctx).v1!=null?((ValueContext)_localctx).v1.getLine():0));
				}
				break;
			case STRING_LITERAL:
				{
				setState(601);
				((ValueContext)_localctx).v1 = match(STRING_LITERAL);
				StringValue stringval = new StringValue(null); stringval.setConstant((((ValueContext)_localctx).STRING_LITERAL!=null?((ValueContext)_localctx).STRING_LITERAL.getText():null)); ((ValueContext)_localctx).valueRet =  stringval;
				valueRet.setLine((((ValueContext)_localctx).v1!=null?((ValueContext)_localctx).v1.getLine():0));
				}
				break;
			case SELL:
				{
				setState(604);
				((ValueContext)_localctx).v1 = match(SELL);
				TradeValue sellVal = new TradeValue(null); sellVal.setConstant((((ValueContext)_localctx).SELL!=null?((ValueContext)_localctx).SELL.getText():null));((ValueContext)_localctx).valueRet =  sellVal;
				valueRet.setLine((((ValueContext)_localctx).v1!=null?((ValueContext)_localctx).v1.getLine():0));
				}
				break;
			case BUY:
				{
				setState(607);
				((ValueContext)_localctx).v1 = match(BUY);
				TradeValue buyVal = new TradeValue(null); buyVal.setConstant((((ValueContext)_localctx).BUY!=null?((ValueContext)_localctx).BUY.getText():null));((ValueContext)_localctx).valueRet =  buyVal; 
				valueRet.setLine((((ValueContext)_localctx).v1!=null?((ValueContext)_localctx).v1.getLine():0));
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type primitiveTypeRet;
		public TerminalNode FLOAT() { return getToken(UTLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(UTLParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(UTLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(UTLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(UTLParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(612);
				match(FLOAT);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new FloatType(); 
				primitiveTypeRet.setLine(FLOAT.line();
				}
				break;
			case DOUBLE:
				{
				setState(615);
				match(DOUBLE);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new DoubleType(); 
				primitiveTypeRet.setLine(DOUBLE.line();
				}
				break;
			case INT:
				{
				setState(618);
				match(INT);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new IntType(); 
				primitiveTypeRet.setLine(INT.line();
				}
				break;
			case BOOL:
				{
				setState(621);
				match(BOOL);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new BoolType(); 
				primitiveTypeRet.setLine(BOOL.line();
				}
				break;
			case STRING:
				{
				setState(624);
				match(STRING);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new StringType(); 
				primitiveTypeRet.setLine(STRING.line();
				}
				break;
			case VOID:
				{
				setState(627);
				match(VOID);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new VoidType(); 
				primitiveTypeRet.setLine(VOID.line();
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
	public static class ComplexTypeContext extends ParserRuleContext {
		public Type complexTypeRet;
		public Token ORDER;
		public Token TRADE;
		public Token CANDLE;
		public Token EXCEPTION;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_complexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				{
				setState(632);
				((ComplexTypeContext)_localctx).ORDER = match(ORDER);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new OrderType(); 
				complexTypeRet.setLine((((ComplexTypeContext)_localctx).ORDER!=null?((ComplexTypeContext)_localctx).ORDER.getLine():0));
				}
				break;
			case TRADE:
				{
				setState(635);
				((ComplexTypeContext)_localctx).TRADE = match(TRADE);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new TradeType(); 
				complexTypeRet.setLine((((ComplexTypeContext)_localctx).TRADE!=null?((ComplexTypeContext)_localctx).TRADE.getLine():0));
				}
				break;
			case CANDLE:
				{
				setState(638);
				((ComplexTypeContext)_localctx).CANDLE = match(CANDLE);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new CandleType(); 
				complexTypeRet.setLine((((ComplexTypeContext)_localctx).CANDLE!=null?((ComplexTypeContext)_localctx).CANDLE.getLine():0));
				}
				break;
			case EXCEPTION:
				{
				setState(641);
				((ComplexTypeContext)_localctx).EXCEPTION = match(EXCEPTION);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new ExceptionType(); 
				complexTypeRet.setLine((((ComplexTypeContext)_localctx).EXCEPTION!=null?((ComplexTypeContext)_localctx).EXCEPTION.getLine():0));
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
	public static class AllTypeContext extends ParserRuleContext {
		public Type allTypeRet;
		public PrimitiveTypeContext primitiveType;
		public ComplexTypeContext complexType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public AllTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAllType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAllType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAllType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllTypeContext allType() throws RecognitionException {
		AllTypeContext _localctx = new AllTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_allType);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				((AllTypeContext)_localctx).primitiveType = primitiveType();
				 ((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).primitiveType.primitiveTypeRet; 
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				((AllTypeContext)_localctx).complexType = complexType();
				 ((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).complexType.complexTypeRet; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class EspetialFunctionContext extends ParserRuleContext {
		public Identifier espetialFunctionRet;
		public Token REFRESH_RATE;
		public Token CONNECT;
		public Token OBSERVE;
		public Token GET_CANDLE;
		public Token TERMINATE;
		public Token PRINT;
		public TerminalNode REFRESH_RATE() { return getToken(UTLParser.REFRESH_RATE, 0); }
		public TerminalNode CONNECT() { return getToken(UTLParser.CONNECT, 0); }
		public TerminalNode OBSERVE() { return getToken(UTLParser.OBSERVE, 0); }
		public TerminalNode GET_CANDLE() { return getToken(UTLParser.GET_CANDLE, 0); }
		public TerminalNode TERMINATE() { return getToken(UTLParser.TERMINATE, 0); }
		public TerminalNode PRINT() { return getToken(UTLParser.PRINT, 0); }
		public EspetialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialFunctionContext espetialFunction() throws RecognitionException {
		EspetialFunctionContext _localctx = new EspetialFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_espetialFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
				{
				setState(654);
				((EspetialFunctionContext)_localctx).REFRESH_RATE = match(REFRESH_RATE);
				espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).REFRESH_RATE!=null?((EspetialFunctionContext)_localctx).REFRESH_RATE.getLine():0)); ((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).REFRESH_RATE!=null?((EspetialFunctionContext)_localctx).REFRESH_RATE.getText():null)); _localctx.espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).REFRESH_RATE!=null?((EspetialFunctionContext)_localctx).REFRESH_RATE.getLine():0));
				}
				break;
			case CONNECT:
				{
				setState(656);
				((EspetialFunctionContext)_localctx).CONNECT = match(CONNECT);
				((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).CONNECT!=null?((EspetialFunctionContext)_localctx).CONNECT.getText():null)); _localctx.espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).CONNECT!=null?((EspetialFunctionContext)_localctx).CONNECT.getLine():0));
				}
				break;
			case OBSERVE:
				{
				setState(658);
				((EspetialFunctionContext)_localctx).OBSERVE = match(OBSERVE);
				((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).OBSERVE!=null?((EspetialFunctionContext)_localctx).OBSERVE.getText():null)); _localctx.espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).OBSERVE!=null?((EspetialFunctionContext)_localctx).OBSERVE.getLine():0));
				}
				break;
			case GET_CANDLE:
				{
				setState(660);
				((EspetialFunctionContext)_localctx).GET_CANDLE = match(GET_CANDLE);
				((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).GET_CANDLE!=null?((EspetialFunctionContext)_localctx).GET_CANDLE.getText():null)); _localctx.espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).GET_CANDLE!=null?((EspetialFunctionContext)_localctx).GET_CANDLE.getLine():0));
				}
				break;
			case TERMINATE:
				{
				setState(662);
				((EspetialFunctionContext)_localctx).TERMINATE = match(TERMINATE);
				((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).TERMINATE!=null?((EspetialFunctionContext)_localctx).TERMINATE.getText():null)); _localctx.espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).TERMINATE!=null?((EspetialFunctionContext)_localctx).TERMINATE.getLine():0));
				}
				break;
			case PRINT:
				{
				setState(664);
				((EspetialFunctionContext)_localctx).PRINT = match(PRINT);
				((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).PRINT!=null?((EspetialFunctionContext)_localctx).PRINT.getText():null)); _localctx.espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).PRINT!=null?((EspetialFunctionContext)_localctx).PRINT.getLine():0));
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
	public static class EspetialVariableContext extends ParserRuleContext {
		public Identifier espetialVariableRet;
		public Token ASK;
		public Token BID;
		public Token TIME;
		public Token HIGH;
		public Token LOW;
		public Token DIGITS;
		public Token VOLUME;
		public Token TYPE;
		public Token TEXT;
		public Token OPEN;
		public Token CLOSE;
		public TerminalNode ASK() { return getToken(UTLParser.ASK, 0); }
		public TerminalNode BID() { return getToken(UTLParser.BID, 0); }
		public TerminalNode TIME() { return getToken(UTLParser.TIME, 0); }
		public TerminalNode HIGH() { return getToken(UTLParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(UTLParser.LOW, 0); }
		public TerminalNode DIGITS() { return getToken(UTLParser.DIGITS, 0); }
		public TerminalNode VOLUME() { return getToken(UTLParser.VOLUME, 0); }
		public TerminalNode TYPE() { return getToken(UTLParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(UTLParser.TEXT, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspetialVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialVariableContext espetialVariable() throws RecognitionException {
		EspetialVariableContext _localctx = new EspetialVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_espetialVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASK:
				{
				setState(668);
				((EspetialVariableContext)_localctx).ASK = match(ASK);
				espetialVariableRet.setLine((((EspetialVariableContext)_localctx).ASK!=null?((EspetialVariableContext)_localctx).ASK.getLine():0)); ((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).ASK!=null?((EspetialVariableContext)_localctx).ASK.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).ASK!=null?((EspetialVariableContext)_localctx).ASK.getLine():0));
				}
				break;
			case BID:
				{
				setState(670);
				((EspetialVariableContext)_localctx).BID = match(BID);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).BID!=null?((EspetialVariableContext)_localctx).BID.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).BID!=null?((EspetialVariableContext)_localctx).BID.getLine():0));
				}
				break;
			case TIME:
				{
				setState(672);
				((EspetialVariableContext)_localctx).TIME = match(TIME);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).TIME!=null?((EspetialVariableContext)_localctx).TIME.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).TIME!=null?((EspetialVariableContext)_localctx).TIME.getLine():0));
				}
				break;
			case HIGH:
				{
				setState(674);
				((EspetialVariableContext)_localctx).HIGH = match(HIGH);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).HIGH!=null?((EspetialVariableContext)_localctx).HIGH.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).HIGH!=null?((EspetialVariableContext)_localctx).HIGH.getLine():0));
				}
				break;
			case LOW:
				{
				setState(676);
				((EspetialVariableContext)_localctx).LOW = match(LOW);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).LOW!=null?((EspetialVariableContext)_localctx).LOW.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).LOW!=null?((EspetialVariableContext)_localctx).LOW.getLine():0));
				}
				break;
			case DIGITS:
				{
				setState(678);
				((EspetialVariableContext)_localctx).DIGITS = match(DIGITS);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).DIGITS!=null?((EspetialVariableContext)_localctx).DIGITS.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).DIGITS!=null?((EspetialVariableContext)_localctx).DIGITS.getLine():0));
				}
				break;
			case VOLUME:
				{
				setState(680);
				((EspetialVariableContext)_localctx).VOLUME = match(VOLUME);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).VOLUME!=null?((EspetialVariableContext)_localctx).VOLUME.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).VOLUME!=null?((EspetialVariableContext)_localctx).VOLUME.getLine():0));
				}
				break;
			case TYPE:
				{
				setState(682);
				((EspetialVariableContext)_localctx).TYPE = match(TYPE);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).TYPE!=null?((EspetialVariableContext)_localctx).TYPE.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).TYPE!=null?((EspetialVariableContext)_localctx).TYPE.getLine():0));
				}
				break;
			case TEXT:
				{
				setState(684);
				((EspetialVariableContext)_localctx).TEXT = match(TEXT);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).TEXT!=null?((EspetialVariableContext)_localctx).TEXT.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).TEXT!=null?((EspetialVariableContext)_localctx).TEXT.getLine():0));
				}
				break;
			case OPEN:
				{
				setState(686);
				((EspetialVariableContext)_localctx).OPEN = match(OPEN);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).OPEN!=null?((EspetialVariableContext)_localctx).OPEN.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).OPEN!=null?((EspetialVariableContext)_localctx).OPEN.getLine():0));
				}
				break;
			case CLOSE:
				{
				setState(688);
				((EspetialVariableContext)_localctx).CLOSE = match(CLOSE);
				((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).CLOSE!=null?((EspetialVariableContext)_localctx).CLOSE.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).CLOSE!=null?((EspetialVariableContext)_localctx).CLOSE.getLine():0));
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
	public static class EspetialMethodContext extends ParserRuleContext {
		public Identifier espetialMethodRet;
		public Token OPEN;
		public Token CLOSE;
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspetialMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialMethodContext espetialMethod() throws RecognitionException {
		EspetialMethodContext _localctx = new EspetialMethodContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_espetialMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				{
				setState(692);
				((EspetialMethodContext)_localctx).OPEN = match(OPEN);
				espetialMethodRet.setLine((((EspetialMethodContext)_localctx).OPEN!=null?((EspetialMethodContext)_localctx).OPEN.getLine():0)); ((EspetialMethodContext)_localctx).espetialMethodRet =  new Identifier((((EspetialMethodContext)_localctx).OPEN!=null?((EspetialMethodContext)_localctx).OPEN.getText():null)); _localctx.espetialMethodRet.setLine((((EspetialMethodContext)_localctx).OPEN!=null?((EspetialMethodContext)_localctx).OPEN.getLine():0));
				}
				break;
			case CLOSE:
				{
				setState(694);
				((EspetialMethodContext)_localctx).CLOSE = match(CLOSE);
				((EspetialMethodContext)_localctx).espetialMethodRet =  new Identifier((((EspetialMethodContext)_localctx).CLOSE!=null?((EspetialMethodContext)_localctx).CLOSE.getText():null)); _localctx.espetialMethodRet.setLine((((EspetialMethodContext)_localctx).CLOSE!=null?((EspetialMethodContext)_localctx).CLOSE.getLine():0));
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UTLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UTLParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(UTLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(UTLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(UTLParser.MOD_ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001T\u02bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001l\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"u\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"{\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u008a\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0093\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0098\b"+
		"\u0003\n\u0003\f\u0003\u009b\t\u0003\u0003\u0003\u009d\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00a2\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00a8\b\u0003\n\u0003\f\u0003\u00ab"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b1"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00b9\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00cc\b\u0005\n\u0005\f\u0005\u00cf\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d5\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00db\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00ea\b\b\n\b\f\b\u00ed\t\b\u0001\b\u0001\b\u0003\b\u00f1\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00fa\b\b\n"+
		"\b\f\b\u00fd\t\b\u0001\b\u0001\b\u0003\b\u0101\b\b\u0003\b\u0103\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0110\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0117\b\t\n\t\f\t\u011a\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u0120\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u012c\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0132\b\n\n\n\f\n\u0135\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u013b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0147\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u014d\b\u000b\n\u000b\f\u000b\u0150\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0156\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0163"+
		"\b\f\n\f\f\f\u0166\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u016c\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0173\b\f\n\f\f\f\u0176"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u017c\b\f\u0003\f\u017e\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u018b\b\r\n\r\f\r\u018e\t\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u0194\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u01a0\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u01a7\b\u000f\n\u000f\f\u000f\u01aa"+
		"\t\u000f\u0003\u000f\u01ac\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01b7\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u01c3\b\u0010\n\u0010\f\u0010\u01c6\t\u0010\u0003\u0010\u01c8"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01da"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01e6"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01f4\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01fd\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0207\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0211\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u021b\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0225\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0231\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u024c"+
		"\b\u0011\u0001\u0011\u0005\u0011\u024f\b\u0011\n\u0011\f\u0011\u0252\t"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0263\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0277\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0285\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u028d\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u029b\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u02b3\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u02b9\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0001\""+
		"\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02\u0000\u0001\u0001\u0000 %\u0313\u00004\u0001"+
		"\u0000\u0000\u0000\u0002k\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000"+
		"\u0000\u0006\u007f\u0001\u0000\u0000\u0000\b\u00b2\u0001\u0000\u0000\u0000"+
		"\n\u00c2\u0001\u0000\u0000\u0000\f\u00da\u0001\u0000\u0000\u0000\u000e"+
		"\u00df\u0001\u0000\u0000\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012"+
		"\u0104\u0001\u0000\u0000\u0000\u0014\u0121\u0001\u0000\u0000\u0000\u0016"+
		"\u013c\u0001\u0000\u0000\u0000\u0018\u0157\u0001\u0000\u0000\u0000\u001a"+
		"\u017f\u0001\u0000\u0000\u0000\u001c\u0195\u0001\u0000\u0000\u0000\u001e"+
		"\u019b\u0001\u0000\u0000\u0000 \u01af\u0001\u0000\u0000\u0000\"\u01f3"+
		"\u0001\u0000\u0000\u0000$\u0262\u0001\u0000\u0000\u0000&\u0276\u0001\u0000"+
		"\u0000\u0000(\u0284\u0001\u0000\u0000\u0000*\u028c\u0001\u0000\u0000\u0000"+
		",\u029a\u0001\u0000\u0000\u0000.\u02b2\u0001\u0000\u0000\u00000\u02b8"+
		"\u0001\u0000\u0000\u00002\u02ba\u0001\u0000\u0000\u00004C\u0006\u0000"+
		"\uffff\uffff\u000056\u0003\u0004\u0002\u000067\u0006\u0000\uffff\uffff"+
		"\u00007B\u0001\u0000\u0000\u000089\u0003\u0006\u0003\u00009:\u0006\u0000"+
		"\uffff\uffff\u0000:B\u0001\u0000\u0000\u0000;<\u0003\u0014\n\u0000<=\u0006"+
		"\u0000\uffff\uffff\u0000=B\u0001\u0000\u0000\u0000>?\u0003\u0016\u000b"+
		"\u0000?@\u0006\u0000\uffff\uffff\u0000@B\u0001\u0000\u0000\u0000A5\u0001"+
		"\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000"+
		"A>\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000FG\u0003\n\u0005\u0000GH\u0006\u0000\uffff\uffff\u0000H\u0001"+
		"\u0001\u0000\u0000\u0000IJ\u0003\u0004\u0002\u0000JK\u0006\u0001\uffff"+
		"\uffff\u0000Kl\u0001\u0000\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0006"+
		"\u0001\uffff\uffff\u0000Nl\u0001\u0000\u0000\u0000OP\u0003\b\u0004\u0000"+
		"PQ\u0006\u0001\uffff\uffff\u0000Ql\u0001\u0000\u0000\u0000RS\u0003\f\u0006"+
		"\u0000ST\u0006\u0001\uffff\uffff\u0000Tl\u0001\u0000\u0000\u0000UV\u0003"+
		"\u000e\u0007\u0000VW\u0006\u0001\uffff\uffff\u0000Wl\u0001\u0000\u0000"+
		"\u0000XY\u0003\u0018\f\u0000YZ\u0006\u0001\uffff\uffff\u0000Zl\u0001\u0000"+
		"\u0000\u0000[\\\u0003\u001a\r\u0000\\]\u0006\u0001\uffff\uffff\u0000]"+
		"l\u0001\u0000\u0000\u0000^_\u0003\u0012\t\u0000_`\u0006\u0001\uffff\uffff"+
		"\u0000`l\u0001\u0000\u0000\u0000ab\u0003\u0010\b\u0000bc\u0006\u0001\uffff"+
		"\uffff\u0000cl\u0001\u0000\u0000\u0000de\u0003\u001c\u000e\u0000ef\u0006"+
		"\u0001\uffff\uffff\u0000fl\u0001\u0000\u0000\u0000gh\u0003\"\u0011\u0000"+
		"hi\u0005\u0002\u0000\u0000ij\u0006\u0001\uffff\uffff\u0000jl\u0001\u0000"+
		"\u0000\u0000kI\u0001\u0000\u0000\u0000kL\u0001\u0000\u0000\u0000kO\u0001"+
		"\u0000\u0000\u0000kR\u0001\u0000\u0000\u0000kU\u0001\u0000\u0000\u0000"+
		"kX\u0001\u0000\u0000\u0000k[\u0001\u0000\u0000\u0000k^\u0001\u0000\u0000"+
		"\u0000ka\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000kg\u0001\u0000"+
		"\u0000\u0000l\u0003\u0001\u0000\u0000\u0000mn\u0006\u0002\uffff\uffff"+
		"\u0000no\u0003*\u0015\u0000ot\u0006\u0002\uffff\uffff\u0000pq\u0005\n"+
		"\u0000\u0000qr\u0005Q\u0000\u0000rs\u0005\u000b\u0000\u0000su\u0006\u0002"+
		"\uffff\uffff\u0000tp\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0005P\u0000\u0000wz\u0006\u0002\uffff\uffff"+
		"\u0000xy\u0005 \u0000\u0000y{\u0003\"\u0011\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0002"+
		"\u0000\u0000}~\u0006\u0002\uffff\uffff\u0000~\u0005\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0006\u0003\uffff\uffff\u0000\u0080\u0081\u0003&\u0013"+
		"\u0000\u0081\u0082\u0006\u0003\uffff\uffff\u0000\u0082\u0083\u0005P\u0000"+
		"\u0000\u0083\u0084\u0006\u0003\uffff\uffff\u0000\u0084\u009c\u0005\u0006"+
		"\u0000\u0000\u0085\u0089\u0003*\u0015\u0000\u0086\u0087\u0005\n\u0000"+
		"\u0000\u0087\u0088\u0005Q\u0000\u0000\u0088\u008a\u0005\u000b\u0000\u0000"+
		"\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005P\u0000\u0000\u008c"+
		"\u0099\u0006\u0003\uffff\uffff\u0000\u008d\u008e\u0005\u0003\u0000\u0000"+
		"\u008e\u0092\u0003*\u0015\u0000\u008f\u0090\u0005\n\u0000\u0000\u0090"+
		"\u0091\u0005Q\u0000\u0000\u0091\u0093\u0005\u000b\u0000\u0000\u0092\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005P\u0000\u0000\u0095\u0096\u0006"+
		"\u0003\uffff\uffff\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u008d"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u0085"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0005\u0007\u0000\u0000\u009f\u00a0"+
		"\u0005\'\u0000\u0000\u00a0\u00a2\u0005I\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a9\u0005\b\u0000\u0000\u00a4\u00a5\u0003\u0002"+
		"\u0001\u0000\u00a5\u00a6\u0006\u0003\uffff\uffff\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b1\u0005\t\u0000\u0000\u00ad\u00ae\u0003\u0002"+
		"\u0001\u0000\u00ae\u00af\u0006\u0003\uffff\uffff\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00a3\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b1\u0007\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"P\u0000\u0000\u00b3\u00b8\u0006\u0004\uffff\uffff\u0000\u00b4\u00b5\u0005"+
		"\n\u0000\u0000\u00b5\u00b6\u0003\"\u0011\u0000\u00b6\u00b7\u0005\u000b"+
		"\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u00032\u0019\u0000\u00bb\u00bc\u0003\"\u0011"+
		"\u0000\u00bc\u00bd\u0006\u0004\uffff\uffff\u0000\u00bd\u00be\u0005 \u0000"+
		"\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u00c0\u0005\u0002\u0000\u0000"+
		"\u00c0\u00c1\u0006\u0004\uffff\uffff\u0000\u00c1\t\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0006\u0005\uffff\uffff\u0000\u00c3\u00c4\u00057\u0000\u0000"+
		"\u00c4\u00c5\u00050\u0000\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6"+
		"\u00d4\u0005\u0007\u0000\u0000\u00c7\u00cd\u0005\b\u0000\u0000\u00c8\u00c9"+
		"\u0003\u0002\u0001\u0000\u00c9\u00ca\u0006\u0005\uffff\uffff\u0000\u00ca"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d5\u0005\t\u0000\u0000\u00d1\u00d2"+
		"\u0003\u0002\u0001\u0000\u00d2\u00d3\u0006\u0005\uffff\uffff\u0000\u00d3"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d4\u00c7\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005-\u0000\u0000\u00d7\u00db\u0006\u0006\uffff\uffff\u0000\u00d8"+
		"\u00d9\u0005.\u0000\u0000\u00d9\u00db\u0006\u0006\uffff\uffff\u0000\u00da"+
		"\u00d6\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0002\u0000\u0000\u00dd"+
		"\u00de\u0006\u0006\uffff\uffff\u0000\u00de\r\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005/\u0000\u0000\u00e0\u00e1\u0003\"\u0011\u0000\u00e1\u00e2"+
		"\u0005\u0002\u0000\u0000\u00e2\u00e3\u0006\u0007\uffff\uffff\u0000\u00e3"+
		"\u000f\u0001\u0000\u0000\u0000\u00e4\u00f0\u0005&\u0000\u0000\u00e5\u00eb"+
		"\u0005\b\u0000\u0000\u00e6\u00e7\u0003\u0002\u0001\u0000\u00e7\u00e8\u0006"+
		"\b\uffff\uffff\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0005"+
		"\t\u0000\u0000\u00ef\u00f1\u0003\u0002\u0001\u0000\u00f0\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u0102\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0005(\u0000\u0000\u00f3\u00f4\u0005I\u0000\u0000"+
		"\u00f4\u0100\u0005P\u0000\u0000\u00f5\u00fb\u0005\b\u0000\u0000\u00f6"+
		"\u00f7\u0003\u0002\u0001\u0000\u00f7\u00f8\u0006\b\uffff\uffff\u0000\u00f8"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u0101\u0005\t\u0000\u0000\u00ff\u0101"+
		"\u0003\u0002\u0001\u0000\u0100\u00f5\u0001\u0000\u0000\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00f2"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0011"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0006\t\uffff\uffff\u0000\u0105\u0106"+
		"\u0005+\u0000\u0000\u0106\u0107\u0005\u0006\u0000\u0000\u0107\u0108\u0003"+
		"\u0002\u0001\u0000\u0108\u0109\u0006\t\uffff\uffff\u0000\u0109\u010a\u0003"+
		"\"\u0011\u0000\u010a\u010b\u0006\t\uffff\uffff\u0000\u010b\u010f\u0005"+
		"\u0002\u0000\u0000\u010c\u010d\u0003\"\u0011\u0000\u010d\u010e\u0006\t"+
		"\uffff\uffff\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u011f\u0005\u0007\u0000\u0000\u0112\u0118\u0005"+
		"\b\u0000\u0000\u0113\u0114\u0003\u0002\u0001\u0000\u0114\u0115\u0006\t"+
		"\uffff\uffff\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0113\u0001"+
		"\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u0120\u0005"+
		"\t\u0000\u0000\u011c\u011d\u0003\u0002\u0001\u0000\u011d\u011e\u0006\t"+
		"\uffff\uffff\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0112\u0001"+
		"\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u0120\u0013\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0006\n\uffff\uffff\u0000\u0122\u0123\u0005"+
		"7\u0000\u0000\u0123\u0124\u00051\u0000\u0000\u0124\u0125\u0005\u0006\u0000"+
		"\u0000\u0125\u0126\u0005F\u0000\u0000\u0126\u0127\u0005P\u0000\u0000\u0127"+
		"\u0128\u0006\n\uffff\uffff\u0000\u0128\u012b\u0005\u0007\u0000\u0000\u0129"+
		"\u012a\u0005\'\u0000\u0000\u012a\u012c\u0005I\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u013a"+
		"\u0001\u0000\u0000\u0000\u012d\u0133\u0005\b\u0000\u0000\u012e\u012f\u0003"+
		"\u0002\u0001\u0000\u012f\u0130\u0006\n\uffff\uffff\u0000\u0130\u0132\u0001"+
		"\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0132\u0135\u0001"+
		"\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0136\u013b\u0005\t\u0000\u0000\u0137\u0138\u0003\u0002"+
		"\u0001\u0000\u0138\u0139\u0006\n\uffff\uffff\u0000\u0139\u013b\u0001\u0000"+
		"\u0000\u0000\u013a\u012d\u0001\u0000\u0000\u0000\u013a\u0137\u0001\u0000"+
		"\u0000\u0000\u013b\u0015\u0001\u0000\u0000\u0000\u013c\u013d\u0006\u000b"+
		"\uffff\uffff\u0000\u013d\u013e\u00057\u0000\u0000\u013e\u013f\u0006\u000b"+
		"\uffff\uffff\u0000\u013f\u0140\u00052\u0000\u0000\u0140\u0141\u0005\u0006"+
		"\u0000\u0000\u0141\u0142\u0005F\u0000\u0000\u0142\u0143\u0005P\u0000\u0000"+
		"\u0143\u0146\u0005\u0007\u0000\u0000\u0144\u0145\u0005\'\u0000\u0000\u0145"+
		"\u0147\u0005I\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0155\u0001\u0000\u0000\u0000\u0148\u014e"+
		"\u0005\b\u0000\u0000\u0149\u014a\u0003\u0002\u0001\u0000\u014a\u014b\u0006"+
		"\u000b\uffff\uffff\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u0149"+
		"\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0151"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0156"+
		"\u0005\t\u0000\u0000\u0152\u0153\u0003\u0002\u0001\u0000\u0153\u0154\u0006"+
		"\u000b\uffff\uffff\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0148"+
		"\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0156\u0017"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0006\f\uffff\uffff\u0000\u0158\u0159"+
		"\u0005)\u0000\u0000\u0159\u015a\u0006\f\uffff\uffff\u0000\u015a\u015b"+
		"\u0005\u0006\u0000\u0000\u015b\u015c\u0003\"\u0011\u0000\u015c\u015d\u0005"+
		"\u0007\u0000\u0000\u015d\u016b\u0006\f\uffff\uffff\u0000\u015e\u0164\u0005"+
		"\b\u0000\u0000\u015f\u0160\u0003\u0002\u0001\u0000\u0160\u0161\u0006\f"+
		"\uffff\uffff\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015f\u0001"+
		"\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001"+
		"\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016c\u0005"+
		"\t\u0000\u0000\u0168\u0169\u0003\u0002\u0001\u0000\u0169\u016a\u0006\f"+
		"\uffff\uffff\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u015e\u0001"+
		"\u0000\u0000\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016c\u017d\u0001"+
		"\u0000\u0000\u0000\u016d\u017b\u0005*\u0000\u0000\u016e\u0174\u0005\b"+
		"\u0000\u0000\u016f\u0170\u0003\u0002\u0001\u0000\u0170\u0171\u0006\f\uffff"+
		"\uffff\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u016f\u0001\u0000"+
		"\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u017c\u0005\t\u0000"+
		"\u0000\u0178\u0179\u0003\u0002\u0001\u0000\u0179\u017a\u0006\f\uffff\uffff"+
		"\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u016e\u0001\u0000\u0000"+
		"\u0000\u017b\u0178\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000"+
		"\u0000\u017d\u016d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u0019\u0001\u0000\u0000\u0000\u017f\u0180\u0006\r\uffff\uffff"+
		"\u0000\u0180\u0181\u0005,\u0000\u0000\u0181\u0182\u0006\r\uffff\uffff"+
		"\u0000\u0182\u0183\u0005\u0006\u0000\u0000\u0183\u0184\u0003\"\u0011\u0000"+
		"\u0184\u0185\u0006\r\uffff\uffff\u0000\u0185\u0193\u0005\u0007\u0000\u0000"+
		"\u0186\u018c\u0005\b\u0000\u0000\u0187\u0188\u0003\u0002\u0001\u0000\u0188"+
		"\u0189\u0006\r\uffff\uffff\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a"+
		"\u0187\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c"+
		"\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018f\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f"+
		"\u0194\u0005\t\u0000\u0000\u0190\u0191\u0003\u0002\u0001\u0000\u0191\u0192"+
		"\u0006\r\uffff\uffff\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0186"+
		"\u0001\u0000\u0000\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0194\u001b"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0005\'\u0000\u0000\u0196\u0197\u0006"+
		"\u000e\uffff\uffff\u0000\u0197\u0198\u0003\"\u0011\u0000\u0198\u0199\u0005"+
		"\u0002\u0000\u0000\u0199\u019a\u0006\u000e\uffff\uffff\u0000\u019a\u001d"+
		"\u0001\u0000\u0000\u0000\u019b\u019f\u0006\u000f\uffff\uffff\u0000\u019c"+
		"\u01a0\u0003,\u0016\u0000\u019d\u01a0\u0003(\u0014\u0000\u019e\u01a0\u0005"+
		"P\u0000\u0000\u019f\u019c\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000"+
		"\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0005\u0006\u0000\u0000\u01a2\u01ab\u0006\u000f"+
		"\uffff\uffff\u0000\u01a3\u01a8\u0003\"\u0011\u0000\u01a4\u01a5\u0005\u0003"+
		"\u0000\u0000\u01a5\u01a7\u0003\"\u0011\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01a3\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0005\u0007\u0000\u0000\u01ae\u001f\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0005P\u0000\u0000\u01b0\u01b6\u0006\u0010\uffff\uffff"+
		"\u0000\u01b1\u01b2\u0005\n\u0000\u0000\u01b2\u01b3\u0003\"\u0011\u0000"+
		"\u01b3\u01b4\u0005\u000b\u0000\u0000\u01b4\u01b5\u0006\u0010\uffff\uffff"+
		"\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0005\u0005\u0000\u0000\u01b9\u01ba\u00030\u0018\u0000"+
		"\u01ba\u01bb\u0005\u0006\u0000\u0000\u01bb\u01c7\u0006\u0010\uffff\uffff"+
		"\u0000\u01bc\u01bd\u0003\"\u0011\u0000\u01bd\u01c4\u0006\u0010\uffff\uffff"+
		"\u0000\u01be\u01bf\u0005\u0003\u0000\u0000\u01bf\u01c0\u0003\"\u0011\u0000"+
		"\u01c0\u01c1\u0006\u0010\uffff\uffff\u0000\u01c1\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c2\u01be\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c7\u01bc\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u0007\u0000"+
		"\u0000\u01ca!\u0001\u0000\u0000\u0000\u01cb\u01cc\u0006\u0011\uffff\uffff"+
		"\u0000\u01cc\u01cd\u0003$\u0012\u0000\u01cd\u01ce\u0006\u0011\uffff\uffff"+
		"\u0000\u01ce\u01f4\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0013\u0000"+
		"\u0000\u01d0\u01da\u0006\u0011\uffff\uffff\u0000\u01d1\u01d2\u0005\r\u0000"+
		"\u0000\u01d2\u01da\u0006\u0011\uffff\uffff\u0000\u01d3\u01d4\u0005\u0019"+
		"\u0000\u0000\u01d4\u01da\u0006\u0011\uffff\uffff\u0000\u01d5\u01d6\u0005"+
		"\u001e\u0000\u0000\u01d6\u01da\u0006\u0011\uffff\uffff\u0000\u01d7\u01d8"+
		"\u0005\u001f\u0000\u0000\u01d8\u01da\u0006\u0011\uffff\uffff\u0000\u01d9"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d9\u01d1\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0003\"\u0011\r\u01dc\u01dd\u0006\u0011\uffff\uffff\u0000\u01dd"+
		"\u01f4\u0001\u0000\u0000\u0000\u01de\u01df\u0005P\u0000\u0000\u01df\u01e5"+
		"\u0006\u0011\uffff\uffff\u0000\u01e0\u01e1\u0005\n\u0000\u0000\u01e1\u01e2"+
		"\u0003\"\u0011\u0000\u01e2\u01e3\u0005\u000b\u0000\u0000\u01e3\u01e4\u0006"+
		"\u0011\uffff\uffff\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01f4\u0006\u0011\uffff\uffff\u0000\u01e8"+
		"\u01e9\u0005\u0006\u0000\u0000\u01e9\u01ea\u0003\"\u0011\u0000\u01ea\u01eb"+
		"\u0005\u0007\u0000\u0000\u01eb\u01ec\u0006\u0011\uffff\uffff\u0000\u01ec"+
		"\u01f4\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003\u001e\u000f\u0000\u01ee"+
		"\u01ef\u0006\u0011\uffff\uffff\u0000\u01ef\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0003 \u0010\u0000\u01f1\u01f2\u0006\u0011\uffff\uffff\u0000"+
		"\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01cb\u0001\u0000\u0000\u0000"+
		"\u01f3\u01d9\u0001\u0000\u0000\u0000\u01f3\u01de\u0001\u0000\u0000\u0000"+
		"\u01f3\u01e8\u0001\u0000\u0000\u0000\u01f3\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f0\u0001\u0000\u0000\u0000\u01f4\u0250\u0001\u0000\u0000\u0000"+
		"\u01f5\u01fc\n\f\u0000\u0000\u01f6\u01f7\u0005\u000e\u0000\u0000\u01f7"+
		"\u01fd\u0006\u0011\uffff\uffff\u0000\u01f8\u01f9\u0005\u000f\u0000\u0000"+
		"\u01f9\u01fd\u0006\u0011\uffff\uffff\u0000\u01fa\u01fb\u0005\u0010\u0000"+
		"\u0000\u01fb\u01fd\u0006\u0011\uffff\uffff\u0000\u01fc\u01f6\u0001\u0000"+
		"\u0000\u0000\u01fc\u01f8\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0003\"\u0011"+
		"\r\u01ff\u0200\u0006\u0011\uffff\uffff\u0000\u0200\u024f\u0001\u0000\u0000"+
		"\u0000\u0201\u0206\n\u000b\u0000\u0000\u0202\u0203\u0005\f\u0000\u0000"+
		"\u0203\u0207\u0006\u0011\uffff\uffff\u0000\u0204\u0205\u0005\r\u0000\u0000"+
		"\u0205\u0207\u0006\u0011\uffff\uffff\u0000\u0206\u0202\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0003\"\u0011\f\u0209\u020a\u0006\u0011\uffff\uffff"+
		"\u0000\u020a\u024f\u0001\u0000\u0000\u0000\u020b\u0210\n\n\u0000\u0000"+
		"\u020c\u020d\u0005\u0017\u0000\u0000\u020d\u0211\u0006\u0011\uffff\uffff"+
		"\u0000\u020e\u020f\u0005\u0018\u0000\u0000\u020f\u0211\u0006\u0011\uffff"+
		"\uffff\u0000\u0210\u020c\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0003\"\u0011"+
		"\u000b\u0213\u0214\u0006\u0011\uffff\uffff\u0000\u0214\u024f\u0001\u0000"+
		"\u0000\u0000\u0215\u021a\n\t\u0000\u0000\u0216\u0217\u0005\u001a\u0000"+
		"\u0000\u0217\u021b\u0006\u0011\uffff\uffff\u0000\u0218\u0219\u0005\u001b"+
		"\u0000\u0000\u0219\u021b\u0006\u0011\uffff\uffff\u0000\u021a\u0216\u0001"+
		"\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021c\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0003\"\u0011\n\u021d\u021e\u0006\u0011"+
		"\uffff\uffff\u0000\u021e\u024f\u0001\u0000\u0000\u0000\u021f\u0224\n\b"+
		"\u0000\u0000\u0220\u0221\u0005\u001c\u0000\u0000\u0221\u0225\u0006\u0011"+
		"\uffff\uffff\u0000\u0222\u0223\u0005\u001d\u0000\u0000\u0223\u0225\u0006"+
		"\u0011\uffff\uffff\u0000\u0224\u0220\u0001\u0000\u0000\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227"+
		"\u0003\"\u0011\t\u0227\u0228\u0006\u0011\uffff\uffff\u0000\u0228\u024f"+
		"\u0001\u0000\u0000\u0000\u0229\u0230\n\u0007\u0000\u0000\u022a\u022b\u0005"+
		"\u0014\u0000\u0000\u022b\u0231\u0006\u0011\uffff\uffff\u0000\u022c\u022d"+
		"\u0005\u0015\u0000\u0000\u022d\u0231\u0006\u0011\uffff\uffff\u0000\u022e"+
		"\u022f\u0005\u0016\u0000\u0000\u022f\u0231\u0006\u0011\uffff\uffff\u0000"+
		"\u0230\u022a\u0001\u0000\u0000\u0000\u0230\u022c\u0001\u0000\u0000\u0000"+
		"\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0003\"\u0011\b\u0233\u0234\u0006\u0011\uffff\uffff\u0000"+
		"\u0234\u024f\u0001\u0000\u0000\u0000\u0235\u0236\n\u0006\u0000\u0000\u0236"+
		"\u0237\u0005\u0011\u0000\u0000\u0237\u0238\u0006\u0011\uffff\uffff\u0000"+
		"\u0238\u0239\u0003\"\u0011\u0007\u0239\u023a\u0006\u0011\uffff\uffff\u0000"+
		"\u023a\u024f\u0001\u0000\u0000\u0000\u023b\u023c\n\u0005\u0000\u0000\u023c"+
		"\u023d\u0005\u0012\u0000\u0000\u023d\u023e\u0006\u0011\uffff\uffff\u0000"+
		"\u023e\u023f\u0003\"\u0011\u0006\u023f\u0240\u0006\u0011\uffff\uffff\u0000"+
		"\u0240\u024f\u0001\u0000\u0000\u0000\u0241\u0242\n\u000f\u0000\u0000\u0242"+
		"\u0243\u0005\u0005\u0000\u0000\u0243\u0244\u0003.\u0017\u0000\u0244\u0245"+
		"\u0006\u0011\uffff\uffff\u0000\u0245\u024f\u0001\u0000\u0000\u0000\u0246"+
		"\u024b\n\u000e\u0000\u0000\u0247\u0248\u0005\u001e\u0000\u0000\u0248\u024c"+
		"\u0006\u0011\uffff\uffff\u0000\u0249\u024a\u0005\u001f\u0000\u0000\u024a"+
		"\u024c\u0006\u0011\uffff\uffff\u0000\u024b\u0247\u0001\u0000\u0000\u0000"+
		"\u024b\u0249\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000"+
		"\u024d\u024f\u0006\u0011\uffff\uffff\u0000\u024e\u01f5\u0001\u0000\u0000"+
		"\u0000\u024e\u0201\u0001\u0000\u0000\u0000\u024e\u020b\u0001\u0000\u0000"+
		"\u0000\u024e\u0215\u0001\u0000\u0000\u0000\u024e\u021f\u0001\u0000\u0000"+
		"\u0000\u024e\u0229\u0001\u0000\u0000\u0000\u024e\u0235\u0001\u0000\u0000"+
		"\u0000\u024e\u023b\u0001\u0000\u0000\u0000\u024e\u0241\u0001\u0000\u0000"+
		"\u0000\u024e\u0246\u0001\u0000\u0000\u0000\u024f\u0252\u0001\u0000\u0000"+
		"\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000"+
		"\u0000\u0251#\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0005Q\u0000\u0000\u0254\u0255\u0006\u0012\uffff\uffff\u0000"+
		"\u0255\u0263\u0006\u0012\uffff\uffff\u0000\u0256\u0257\u0005R\u0000\u0000"+
		"\u0257\u0258\u0006\u0012\uffff\uffff\u0000\u0258\u0263\u0006\u0012\uffff"+
		"\uffff\u0000\u0259\u025a\u0005S\u0000\u0000\u025a\u025b\u0006\u0012\uffff"+
		"\uffff\u0000\u025b\u0263\u0006\u0012\uffff\uffff\u0000\u025c\u025d\u0005"+
		":\u0000\u0000\u025d\u025e\u0006\u0012\uffff\uffff\u0000\u025e\u0263\u0006"+
		"\u0012\uffff\uffff\u0000\u025f\u0260\u00059\u0000\u0000\u0260\u0261\u0006"+
		"\u0012\uffff\uffff\u0000\u0261\u0263\u0006\u0012\uffff\uffff\u0000\u0262"+
		"\u0253\u0001\u0000\u0000\u0000\u0262\u0256\u0001\u0000\u0000\u0000\u0262"+
		"\u0259\u0001\u0000\u0000\u0000\u0262\u025c\u0001\u0000\u0000\u0000\u0262"+
		"\u025f\u0001\u0000\u0000\u0000\u0263%\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u00053\u0000\u0000\u0265\u0266\u0006\u0013\uffff\uffff\u0000\u0266\u0277"+
		"\u0006\u0013\uffff\uffff\u0000\u0267\u0268\u00054\u0000\u0000\u0268\u0269"+
		"\u0006\u0013\uffff\uffff\u0000\u0269\u0277\u0006\u0013\uffff\uffff\u0000"+
		"\u026a\u026b\u00058\u0000\u0000\u026b\u026c\u0006\u0013\uffff\uffff\u0000"+
		"\u026c\u0277\u0006\u0013\uffff\uffff\u0000\u026d\u026e\u00056\u0000\u0000"+
		"\u026e\u026f\u0006\u0013\uffff\uffff\u0000\u026f\u0277\u0006\u0013\uffff"+
		"\uffff\u0000\u0270\u0271\u00055\u0000\u0000\u0271\u0272\u0006\u0013\uffff"+
		"\uffff\u0000\u0272\u0277\u0006\u0013\uffff\uffff\u0000\u0273\u0274\u0005"+
		"7\u0000\u0000\u0274\u0275\u0006\u0013\uffff\uffff\u0000\u0275\u0277\u0006"+
		"\u0013\uffff\uffff\u0000\u0276\u0264\u0001\u0000\u0000\u0000\u0276\u0267"+
		"\u0001\u0000\u0000\u0000\u0276\u026a\u0001\u0000\u0000\u0000\u0276\u026d"+
		"\u0001\u0000\u0000\u0000\u0276\u0270\u0001\u0000\u0000\u0000\u0276\u0273"+
		"\u0001\u0000\u0000\u0000\u0277\'\u0001\u0000\u0000\u0000\u0278\u0279\u0005"+
		"G\u0000\u0000\u0279\u027a\u0006\u0014\uffff\uffff\u0000\u027a\u0285\u0006"+
		"\u0014\uffff\uffff\u0000\u027b\u027c\u0005F\u0000\u0000\u027c\u027d\u0006"+
		"\u0014\uffff\uffff\u0000\u027d\u0285\u0006\u0014\uffff\uffff\u0000\u027e"+
		"\u027f\u0005H\u0000\u0000\u027f\u0280\u0006\u0014\uffff\uffff\u0000\u0280"+
		"\u0285\u0006\u0014\uffff\uffff\u0000\u0281\u0282\u0005I\u0000\u0000\u0282"+
		"\u0283\u0006\u0014\uffff\uffff\u0000\u0283\u0285\u0006\u0014\uffff\uffff"+
		"\u0000\u0284\u0278\u0001\u0000\u0000\u0000\u0284\u027b\u0001\u0000\u0000"+
		"\u0000\u0284\u027e\u0001\u0000\u0000\u0000\u0284\u0281\u0001\u0000\u0000"+
		"\u0000\u0285)\u0001\u0000\u0000\u0000\u0286\u0287\u0003&\u0013\u0000\u0287"+
		"\u0288\u0006\u0015\uffff\uffff\u0000\u0288\u028d\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0003(\u0014\u0000\u028a\u028b\u0006\u0015\uffff\uffff\u0000"+
		"\u028b\u028d\u0001\u0000\u0000\u0000\u028c\u0286\u0001\u0000\u0000\u0000"+
		"\u028c\u0289\u0001\u0000\u0000\u0000\u028d+\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0005J\u0000\u0000\u028f\u029b\u0006\u0016\uffff\uffff\u0000\u0290"+
		"\u0291\u0005M\u0000\u0000\u0291\u029b\u0006\u0016\uffff\uffff\u0000\u0292"+
		"\u0293\u0005N\u0000\u0000\u0293\u029b\u0006\u0016\uffff\uffff\u0000\u0294"+
		"\u0295\u0005K\u0000\u0000\u0295\u029b\u0006\u0016\uffff\uffff\u0000\u0296"+
		"\u0297\u0005L\u0000\u0000\u0297\u029b\u0006\u0016\uffff\uffff\u0000\u0298"+
		"\u0299\u0005O\u0000\u0000\u0299\u029b\u0006\u0016\uffff\uffff\u0000\u029a"+
		"\u028e\u0001\u0000\u0000\u0000\u029a\u0290\u0001\u0000\u0000\u0000\u029a"+
		"\u0292\u0001\u0000\u0000\u0000\u029a\u0294\u0001\u0000\u0000\u0000\u029a"+
		"\u0296\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029b"+
		"-\u0001\u0000\u0000\u0000\u029c\u029d\u0005;\u0000\u0000\u029d\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u029e\u029f\u0005<\u0000\u0000\u029f\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02a0\u02a1\u0005=\u0000\u0000\u02a1\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02a2\u02a3\u0005>\u0000\u0000\u02a3\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02a4\u02a5\u0005?\u0000\u0000\u02a5\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02a6\u02a7\u0005@\u0000\u0000\u02a7\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02a8\u02a9\u0005A\u0000\u0000\u02a9\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02aa\u02ab\u0005B\u0000\u0000\u02ab\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02ac\u02ad\u0005C\u0000\u0000\u02ad\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02ae\u02af\u0005D\u0000\u0000\u02af\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02b0\u02b1\u0005E\u0000\u0000\u02b1\u02b3\u0006"+
		"\u0017\uffff\uffff\u0000\u02b2\u029c\u0001\u0000\u0000\u0000\u02b2\u029e"+
		"\u0001\u0000\u0000\u0000\u02b2\u02a0\u0001\u0000\u0000\u0000\u02b2\u02a2"+
		"\u0001\u0000\u0000\u0000\u02b2\u02a4\u0001\u0000\u0000\u0000\u02b2\u02a6"+
		"\u0001\u0000\u0000\u0000\u02b2\u02a8\u0001\u0000\u0000\u0000\u02b2\u02aa"+
		"\u0001\u0000\u0000\u0000\u02b2\u02ac\u0001\u0000\u0000\u0000\u02b2\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b3/\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0005D\u0000\u0000\u02b5\u02b9\u0006\u0018"+
		"\uffff\uffff\u0000\u02b6\u02b7\u0005E\u0000\u0000\u02b7\u02b9\u0006\u0018"+
		"\uffff\uffff\u0000\u02b8\u02b4\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b91\u0001\u0000\u0000\u0000\u02ba\u02bb\u0007\u0000"+
		"\u0000\u0000\u02bb3\u0001\u0000\u0000\u0000>ACktz\u0089\u0092\u0099\u009c"+
		"\u00a1\u00a9\u00b0\u00b8\u00cd\u00d4\u00da\u00eb\u00f0\u00fb\u0100\u0102"+
		"\u010f\u0118\u011f\u012b\u0133\u013a\u0146\u014e\u0155\u0164\u016b\u0174"+
		"\u017b\u017d\u018c\u0193\u019f\u01a8\u01ab\u01b6\u01c4\u01c7\u01d9\u01e5"+
		"\u01f3\u01fc\u0206\u0210\u021a\u0224\u0230\u024b\u024e\u0250\u0262\u0276"+
		"\u0284\u028c\u029a\u02b2\u02b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}