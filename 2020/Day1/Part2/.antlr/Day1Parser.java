// Generated from /Users/etiennecosta/Desktop/AOC/Day1/Part2/Day1.g4 by ANTLR 4.8

  import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Day1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, WS=2;
	public static final int
		RULE_day1 = 0, RULE_digit = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"day1", "digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Day1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Day1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Day1Context extends ParserRuleContext {
		public List <Integer> arrayOut;
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Day1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day1; }
	}

	public final Day1Context day1() throws RecognitionException {
		Day1Context _localctx = new Day1Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_day1);

		          ((Day1Context)_localctx).arrayOut =  new ArrayList<>();
		         
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			digit(_localctx.arrayOut);
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(5);
				digit(_localctx.arrayOut);
				}
				}
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                                    
			                                    int size = _localctx.arrayOut.size();
			                                    int result=0;
			                                    for(int i= 0 ; i<size;i++){
			                                        int x = _localctx.arrayOut.get(i);
			                                        for(int j = i+1 ; j <size; j++){
			                                            int y = _localctx.arrayOut.get(j);
			                                                for (int k =j+1;k<size;k++)      
			                                                if(x+y+_localctx.arrayOut.get(k) == 2020){
			                                                    result = x * y * _localctx.arrayOut.get(k);
			                                                    System.out.println("X: " +x+ " + Y: "+y+ " + Z: "+_localctx.arrayOut.get(k) + " = 2020" );
			                                                    System.out.println("X: " +x+ " * Y: "+y+ " * Z: "+_localctx.arrayOut.get(k) + " = "+result );
			                                            }
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

	public static class DigitContext extends ParserRuleContext {
		public List <Integer> arrayIn;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(Day1Parser.NUMBER, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DigitContext(ParserRuleContext parent, int invokingState, List <Integer> arrayIn) {
			super(parent, invokingState);
			this.arrayIn = arrayIn;
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	}

	public final DigitContext digit(List <Integer> arrayIn) throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState(), arrayIn);
		enterRule(_localctx, 2, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			((DigitContext)_localctx).NUMBER = match(NUMBER);

			                _localctx.arrayIn.add((((DigitContext)_localctx).NUMBER!=null?Integer.valueOf(((DigitContext)_localctx).NUMBER.getText()):0));
			           
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4\23\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\7\2\t\n\2\f\2\16\2\f\13\2\3\2\3\2\3\3\3\3\3\3\3\3\2\2\4\2"+
		"\4\2\2\2\21\2\6\3\2\2\2\4\17\3\2\2\2\6\n\5\4\3\2\7\t\5\4\3\2\b\7\3\2\2"+
		"\2\t\f\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\r\3\2\2\2\f\n\3\2\2\2\r\16"+
		"\b\2\1\2\16\3\3\2\2\2\17\20\7\3\2\2\20\21\b\3\1\2\21\5\3\2\2\2\3\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}