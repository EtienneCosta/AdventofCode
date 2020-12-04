// Generated from /Users/etiennecosta/Desktop/AOC/Day3/Part2/Day3.g4 by ANTLR 4.8

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
public class Day3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MAP=2;
	public static final int
		RULE_lines = 0, RULE_line = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"lines", "line"
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
			null, "WS", "MAP"
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
	public String getGrammarFileName() { return "Day3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    int getNumberofTrees(int level,int position,List <String> map,int right,int down){
	        int trees=0;

	        if(down%2==0){
	        int size = map.size()-1;
	        while(level!=size) {
	                position+=right;
	                level+=down;
	                 if( map.get(level).charAt(position)=='#')
	                     trees++;
	                }
	        }

	        else{

	        int size = map.size()-2;
	        int mapSize = map.size();

	        while(size>=0 ){
	                position+=right;
	                level+=down;

	                 if( map.get(level).charAt(position)=='#')
	                     trees++;

	                 size--;
	                            }
	        }
	            return trees;
	    }

	public Day3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LinesContext extends ParserRuleContext {
		public List <String> mapOut;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lines);

		                ((LinesContext)_localctx).mapOut =  new ArrayList<>();
		            
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			line(_localctx.mapOut);
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP) {
				{
				{
				setState(5);
				line(_localctx.mapOut);
				}
				}
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}


			                                        int slope1 = getNumberofTrees(0,0,_localctx.mapOut,1,1); 
			                                        int slope2 = getNumberofTrees(0,0,_localctx.mapOut,3,1);                                     
			                                        int slope3 = getNumberofTrees(0,0,_localctx.mapOut,5,1); 
			                                        int slope4 = getNumberofTrees(0,0,_localctx.mapOut,7,1); 
			                                        int slope5 = getNumberofTrees(0,0,_localctx.mapOut,1,2); 
			                                        
			                                    System.out.println("Result : "+slope1*slope2*slope3*slope4*slope5);

			                                    
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

	public static class LineContext extends ParserRuleContext {
		public List <String> mapIn;
		public Token MAP;
		public TerminalNode MAP() { return getToken(Day3Parser.MAP, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LineContext(ParserRuleContext parent, int invokingState, List <String> mapIn) {
			super(parent, invokingState);
			this.mapIn = mapIn;
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line(List <String> mapIn) throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState(), mapIn);
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			((LineContext)_localctx).MAP = match(MAP);


			                            String s = (((LineContext)_localctx).MAP!=null?((LineContext)_localctx).MAP.getText():null);

			                            for(int i=0;i<7;i++)
			                                s = s.concat(s);
			                            
			                            _localctx.mapIn.add(s);
			                            
			                                
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
		"\b\2\1\2\16\3\3\2\2\2\17\20\7\4\2\2\20\21\b\3\1\2\21\5\3\2\2\2\3\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}