// Generated from Micro.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TEXT=2, COMMENT=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "TEXT", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TEXT", "COMMENT"
	};
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


	    int commentCount = 0;
	    int lineCnt = 0;


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			{ System.out.println("Found a comment ... currnet = " + (++commentCount)); }
			break;
		case 1:
			{ System.out.println("Found a comment ... currnet = " + (++commentCount)); }
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5E\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\3\6\3\22\n\3\r\3\16"+
		"\3\23\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\7\3\36\n\3\f\3\16\3!\13"+
		"\3\3\3\7\3$\n\3\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\4\7\4?\n\4"+
		"\f\4\16\4B\13\4\5\4D\n\4\2\2\5\3\3\5\4\7\5\3\2\5\5\2\13\f\17\17\"\"\5"+
		"\2\62;C\\c|\4\2\f\f\17\17\2N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\n\3"+
		"\2\2\2\5\21\3\2\2\2\7C\3\2\2\2\t\13\t\2\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f"+
		"\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\16\17\b\2\2\2\17\4\3\2\2\2\20\22\t"+
		"\3\2\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\31\3"+
		"\2\2\2\25\26\7<\2\2\26\30\7?\2\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36\7?\2\2\35\34\3\2"+
		"\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\7"+
		"@\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\6\3\2\2\2\'%\3\2\2\2"+
		"()\7/\2\2)*\7/\2\2*.\3\2\2\2+-\n\4\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61D\b\4\3\2\62\63\7\61\2\2\63\64\7"+
		"\61\2\2\648\3\2\2\2\65\67\n\4\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;D\b\4\4\2<@\7%\2\2=?\n\4\2\2>=\3\2\2"+
		"\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C(\3\2\2\2C\62\3\2"+
		"\2\2C<\3\2\2\2D\b\3\2\2\2\f\2\f\23\31\37%.8@C\5\b\2\2\3\4\2\3\4\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}