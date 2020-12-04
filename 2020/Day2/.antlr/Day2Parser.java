// Generated from /Users/etiennecosta/Desktop/AOC/Day2/Day2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Day2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMBER=3, WS=4, WORD=5;
	public static final int
		RULE_passwords = 0, RULE_password = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"passwords", "password"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "WS", "WORD"
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
	public String getGrammarFileName() { return "Day2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Day2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PasswordsContext extends ParserRuleContext {
		public List <Integer> resultOut;
		public List<PasswordContext> password() {
			return getRuleContexts(PasswordContext.class);
		}
		public PasswordContext password(int i) {
			return getRuleContext(PasswordContext.class,i);
		}
		public PasswordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwords; }
	}

	public final PasswordsContext passwords() throws RecognitionException {
		PasswordsContext _localctx = new PasswordsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_passwords);

		                ((PasswordsContext)_localctx).resultOut =  new ArrayList<>();
		                 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			password(_localctx.resultOut);
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(5);
				password(_localctx.resultOut);
				}
				}
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                     
			                                                                int result=_localctx.resultOut.stream().mapToInt(Integer::intValue).sum();
			                                                                 System.out.println("Valid Passwords: "+result);
			                                                          
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

	public static class PasswordContext extends ParserRuleContext {
		public List <Integer> resultIn;
		public Token n1;
		public Token n2;
		public Token key;
		public Token pass;
		public List<TerminalNode> NUMBER() { return getTokens(Day2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Day2Parser.NUMBER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(Day2Parser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(Day2Parser.WORD, i);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PasswordContext(ParserRuleContext parent, int invokingState, List <Integer> resultIn) {
			super(parent, invokingState);
			this.resultIn = resultIn;
		}
		@Override public int getRuleIndex() { return RULE_password; }
	}

	public final PasswordContext password(List <Integer> resultIn) throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState(), resultIn);
		enterRule(_localctx, 2, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			((PasswordContext)_localctx).n1 = match(NUMBER);
			setState(14);
			match(T__0);
			setState(15);
			((PasswordContext)_localctx).n2 = match(NUMBER);
			setState(16);
			((PasswordContext)_localctx).key = match(WORD);
			setState(17);
			match(T__1);
			setState(18);
			((PasswordContext)_localctx).pass = match(WORD);

			                                            int count=0;
			                                            int lowerBound= (((PasswordContext)_localctx).n1!=null?Integer.valueOf(((PasswordContext)_localctx).n1.getText()):0);
			                                            int upperBound= (((PasswordContext)_localctx).n2!=null?Integer.valueOf(((PasswordContext)_localctx).n2.getText()):0);
			                                            char key = (((PasswordContext)_localctx).key!=null?((PasswordContext)_localctx).key.getText():null).charAt(0);
			                                            String p = (((PasswordContext)_localctx).pass!=null?((PasswordContext)_localctx).pass.getText():null);

			                                            for(char c : p.toCharArray())
			                                                if(c==key)
			                                                    count++;

			                                            if(lowerBound<=count && count<=upperBound)
			                                                _localctx.resultIn.add(1);                        
			                                    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\30\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\7\2\t\n\2\f\2\16\2\f\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\2\2\4\2\4\2\2\2\26\2\6\3\2\2\2\4\17\3\2\2\2\6\n\5\4\3\2\7"+
		"\t\5\4\3\2\b\7\3\2\2\2\t\f\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\r\3\2\2"+
		"\2\f\n\3\2\2\2\r\16\b\2\1\2\16\3\3\2\2\2\17\20\7\5\2\2\20\21\7\3\2\2\21"+
		"\22\7\5\2\2\22\23\7\7\2\2\23\24\7\4\2\2\24\25\7\7\2\2\25\26\b\3\1\2\26"+
		"\5\3\2\2\2\3\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}