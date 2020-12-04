// Generated from /Users/etiennecosta/Desktop/AOC/Day3/Part2/Day3.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Day3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MAP=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "MAP"
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


	public Day3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Day3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\4\23\b\1\4\2\t\2"+
		"\4\3\t\3\3\2\6\2\t\n\2\r\2\16\2\n\3\2\3\2\3\3\6\3\20\n\3\r\3\16\3\21\2"+
		"\2\4\3\3\5\4\3\2\4\5\2\13\f\17\17\"\"\4\2%%\60\60\2\24\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\3\b\3\2\2\2\5\17\3\2\2\2\7\t\t\2\2\2\b\7\3\2\2\2\t\n\3\2\2\2"+
		"\n\b\3\2\2\2\n\13\3\2\2\2\13\f\3\2\2\2\f\r\b\2\2\2\r\4\3\2\2\2\16\20\t"+
		"\3\2\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\6\3"+
		"\2\2\2\5\2\n\21\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}