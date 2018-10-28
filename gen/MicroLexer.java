// Generated from /home/lwg/course/loc/Micro.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, KEYWORD=38, 
		OPERATOR=39, IDENTIFIER=40, INTLITERAL=41, FLOATLITERAL=42, STRINGLITERAL=43, 
		COMMENT=44, WHITESPACE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "KEYWORD", "OPERATOR", "IDENTIFIER", 
		"INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "';'", "'FLOAT'", 
		"'INT'", "'VOID'", "','", "'FUNCTION'", "'('", "')'", "'READ'", "'WRITE'", 
		"'RETURN'", "'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", "'ELSE'", "'TRUE'", 
		"'FALSE'", "'<'", "'>'", "'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'", 
		"'CONTINUE'", "'BREAK'", "'FOR'", "'ENDFOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "KEYWORD", "OPERATOR", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT", "WHITESPACE"
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


	    int commentBlockCount = 0;


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
		case 43:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			{ System.out.println("Found a comment ... currnet = " + (++commentBlockCount)); }
			break;
		case 1:
			 System.out.println("Found a comment ... currnet = " + (++commentBlockCount)); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0174\n\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\5(\u0180\n(\3)\3)\7)\u0184\n)\f)\16)\u0187\13)\3*\6*\u018a"+
		"\n*\r*\16*\u018b\3+\7+\u018f\n+\f+\16+\u0192\13+\3+\3+\6+\u0196\n+\r+"+
		"\16+\u0197\3,\3,\7,\u019c\n,\f,\16,\u019f\13,\3,\3,\3-\3-\3-\3-\7-\u01a7"+
		"\n-\f-\16-\u01aa\13-\3-\3-\3-\3-\3-\7-\u01b1\n-\f-\16-\u01b4\13-\3-\3"+
		"-\3-\7-\u01b9\n-\f-\16-\u01bc\13-\5-\u01be\n-\3.\6.\u01c1\n.\r.\16.\u01c2"+
		"\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\n\6\2,-//\61\61??\6"+
		"\2*+..=>@@\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2$$\4\2\f\f\17\17\5\2\13\f"+
		"\17\17\"\"\2\u01ea\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2"+
		"\5e\3\2\2\2\7k\3\2\2\2\to\3\2\2\2\13v\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21"+
		"\u0081\3\2\2\2\23\u0085\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2\2\31\u0095"+
		"\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009e\3\2\2\2!\u00a4\3\2"+
		"\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2+\u00b3"+
		"\3\2\2\2-\u00b6\3\2\2\2/\u00bc\3\2\2\2\61\u00c1\3\2\2\2\63\u00c6\3\2\2"+
		"\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d5"+
		"\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C\u00e1\3\2\2\2E\u00ea\3\2\2\2G"+
		"\u00f3\3\2\2\2I\u00f9\3\2\2\2K\u00fd\3\2\2\2M\u0173\3\2\2\2O\u017f\3\2"+
		"\2\2Q\u0181\3\2\2\2S\u0189\3\2\2\2U\u0190\3\2\2\2W\u0199\3\2\2\2Y\u01bd"+
		"\3\2\2\2[\u01c0\3\2\2\2]^\7R\2\2^_\7T\2\2_`\7Q\2\2`a\7I\2\2ab\7T\2\2b"+
		"c\7C\2\2cd\7O\2\2d\4\3\2\2\2ef\7D\2\2fg\7G\2\2gh\7I\2\2hi\7K\2\2ij\7P"+
		"\2\2j\6\3\2\2\2kl\7G\2\2lm\7P\2\2mn\7F\2\2n\b\3\2\2\2op\7U\2\2pq\7V\2"+
		"\2qr\7T\2\2rs\7K\2\2st\7P\2\2tu\7I\2\2u\n\3\2\2\2vw\7<\2\2wx\7?\2\2x\f"+
		"\3\2\2\2yz\7=\2\2z\16\3\2\2\2{|\7H\2\2|}\7N\2\2}~\7Q\2\2~\177\7C\2\2\177"+
		"\u0080\7V\2\2\u0080\20\3\2\2\2\u0081\u0082\7K\2\2\u0082\u0083\7P\2\2\u0083"+
		"\u0084\7V\2\2\u0084\22\3\2\2\2\u0085\u0086\7X\2\2\u0086\u0087\7Q\2\2\u0087"+
		"\u0088\7K\2\2\u0088\u0089\7F\2\2\u0089\24\3\2\2\2\u008a\u008b\7.\2\2\u008b"+
		"\26\3\2\2\2\u008c\u008d\7H\2\2\u008d\u008e\7W\2\2\u008e\u008f\7P\2\2\u008f"+
		"\u0090\7E\2\2\u0090\u0091\7V\2\2\u0091\u0092\7K\2\2\u0092\u0093\7Q\2\2"+
		"\u0093\u0094\7P\2\2\u0094\30\3\2\2\2\u0095\u0096\7*\2\2\u0096\32\3\2\2"+
		"\2\u0097\u0098\7+\2\2\u0098\34\3\2\2\2\u0099\u009a\7T\2\2\u009a\u009b"+
		"\7G\2\2\u009b\u009c\7C\2\2\u009c\u009d\7F\2\2\u009d\36\3\2\2\2\u009e\u009f"+
		"\7Y\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1\7K\2\2\u00a1\u00a2\7V\2\2\u00a2"+
		"\u00a3\7G\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7T\2\2\u00a5\u00a6\7G\2\2\u00a6"+
		"\u00a7\7V\2\2\u00a7\u00a8\7W\2\2\u00a8\u00a9\7T\2\2\u00a9\u00aa\7P\2\2"+
		"\u00aa\"\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7/\2\2"+
		"\u00ae&\3\2\2\2\u00af\u00b0\7,\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7\61\2\2"+
		"\u00b2*\3\2\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5\7H\2\2\u00b5,\3\2\2\2\u00b6"+
		"\u00b7\7G\2\2\u00b7\u00b8\7P\2\2\u00b8\u00b9\7F\2\2\u00b9\u00ba\7K\2\2"+
		"\u00ba\u00bb\7H\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7G\2\2\u00bd\u00be\7N\2"+
		"\2\u00be\u00bf\7U\2\2\u00bf\u00c0\7G\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\7V\2\2\u00c2\u00c3\7T\2\2\u00c3\u00c4\7W\2\2\u00c4\u00c5\7G\2\2\u00c5"+
		"\62\3\2\2\2\u00c6\u00c7\7H\2\2\u00c7\u00c8\7C\2\2\u00c8\u00c9\7N\2\2\u00c9"+
		"\u00ca\7U\2\2\u00ca\u00cb\7G\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd"+
		"\66\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1"+
		":\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d4\7?\2\2\u00d4<\3\2\2\2\u00d5\u00d6"+
		"\7>\2\2\u00d6\u00d7\7?\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da"+
		"\7?\2\2\u00da@\3\2\2\2\u00db\u00dc\7Y\2\2\u00dc\u00dd\7J\2\2\u00dd\u00de"+
		"\7K\2\2\u00de\u00df\7N\2\2\u00df\u00e0\7G\2\2\u00e0B\3\2\2\2\u00e1\u00e2"+
		"\7G\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\7Y\2\2\u00e5"+
		"\u00e6\7J\2\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7N\2\2\u00e8\u00e9\7G\2\2"+
		"\u00e9D\3\2\2\2\u00ea\u00eb\7E\2\2\u00eb\u00ec\7Q\2\2\u00ec\u00ed\7P\2"+
		"\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7K\2\2\u00ef\u00f0\7P\2\2\u00f0\u00f1"+
		"\7W\2\2\u00f1\u00f2\7G\2\2\u00f2F\3\2\2\2\u00f3\u00f4\7D\2\2\u00f4\u00f5"+
		"\7T\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7C\2\2\u00f7\u00f8\7M\2\2\u00f8"+
		"H\3\2\2\2\u00f9\u00fa\7H\2\2\u00fa\u00fb\7Q\2\2\u00fb\u00fc\7T\2\2\u00fc"+
		"J\3\2\2\2\u00fd\u00fe\7G\2\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7F\2\2\u0100"+
		"\u0101\7H\2\2\u0101\u0102\7Q\2\2\u0102\u0103\7T\2\2\u0103L\3\2\2\2\u0104"+
		"\u0105\7R\2\2\u0105\u0106\7T\2\2\u0106\u0107\7Q\2\2\u0107\u0108\7I\2\2"+
		"\u0108\u0109\7T\2\2\u0109\u010a\7C\2\2\u010a\u0174\7O\2\2\u010b\u010c"+
		"\7D\2\2\u010c\u010d\7G\2\2\u010d\u010e\7I\2\2\u010e\u010f\7K\2\2\u010f"+
		"\u0174\7P\2\2\u0110\u0111\7G\2\2\u0111\u0112\7P\2\2\u0112\u0174\7F\2\2"+
		"\u0113\u0114\7H\2\2\u0114\u0115\7W\2\2\u0115\u0116\7P\2\2\u0116\u0117"+
		"\7E\2\2\u0117\u0118\7V\2\2\u0118\u0119\7K\2\2\u0119\u011a\7Q\2\2\u011a"+
		"\u0174\7P\2\2\u011b\u011c\7T\2\2\u011c\u011d\7G\2\2\u011d\u011e\7C\2\2"+
		"\u011e\u0174\7F\2\2\u011f\u0120\7Y\2\2\u0120\u0121\7T\2\2\u0121\u0122"+
		"\7K\2\2\u0122\u0123\7V\2\2\u0123\u0174\7G\2\2\u0124\u0125\7K\2\2\u0125"+
		"\u0174\7H\2\2\u0126\u0127\7G\2\2\u0127\u0128\7N\2\2\u0128\u0129\7U\2\2"+
		"\u0129\u0174\7G\2\2\u012a\u012b\7G\2\2\u012b\u012c\7P\2\2\u012c\u012d"+
		"\7F\2\2\u012d\u012e\7K\2\2\u012e\u0174\7H\2\2\u012f\u0130\7Y\2\2\u0130"+
		"\u0131\7J\2\2\u0131\u0132\7K\2\2\u0132\u0133\7N\2\2\u0133\u0174\7G\2\2"+
		"\u0134\u0135\7G\2\2\u0135\u0136\7P\2\2\u0136\u0137\7F\2\2\u0137\u0138"+
		"\7Y\2\2\u0138\u0139\7J\2\2\u0139\u013a\7K\2\2\u013a\u013b\7N\2\2\u013b"+
		"\u0174\7G\2\2\u013c\u013d\7T\2\2\u013d\u013e\7G\2\2\u013e\u013f\7V\2\2"+
		"\u013f\u0140\7W\2\2\u0140\u0141\7T\2\2\u0141\u0174\7P\2\2\u0142\u0143"+
		"\7K\2\2\u0143\u0144\7P\2\2\u0144\u0174\7V\2\2\u0145\u0146\7X\2\2\u0146"+
		"\u0147\7Q\2\2\u0147\u0148\7K\2\2\u0148\u0174\7F\2\2\u0149\u014a\7U\2\2"+
		"\u014a\u014b\7V\2\2\u014b\u014c\7T\2\2\u014c\u014d\7K\2\2\u014d\u014e"+
		"\7P\2\2\u014e\u0174\7I\2\2\u014f\u0150\7H\2\2\u0150\u0151\7N\2\2\u0151"+
		"\u0152\7Q\2\2\u0152\u0153\7C\2\2\u0153\u0174\7V\2\2\u0154\u0155\7V\2\2"+
		"\u0155\u0156\7T\2\2\u0156\u0157\7W\2\2\u0157\u0174\7G\2\2\u0158\u0159"+
		"\7H\2\2\u0159\u015a\7C\2\2\u015a\u015b\7N\2\2\u015b\u015c\7U\2\2\u015c"+
		"\u0174\7G\2\2\u015d\u015e\7H\2\2\u015e\u015f\7Q\2\2\u015f\u0174\7T\2\2"+
		"\u0160\u0161\7G\2\2\u0161\u0162\7P\2\2\u0162\u0163\7F\2\2\u0163\u0164"+
		"\7H\2\2\u0164\u0165\7Q\2\2\u0165\u0174\7T\2\2\u0166\u0167\7E\2\2\u0167"+
		"\u0168\7Q\2\2\u0168\u0169\7P\2\2\u0169\u016a\7V\2\2\u016a\u016b\7K\2\2"+
		"\u016b\u016c\7P\2\2\u016c\u016d\7W\2\2\u016d\u0174\7G\2\2\u016e\u016f"+
		"\7D\2\2\u016f\u0170\7T\2\2\u0170\u0171\7G\2\2\u0171\u0172\7C\2\2\u0172"+
		"\u0174\7M\2\2\u0173\u0104\3\2\2\2\u0173\u010b\3\2\2\2\u0173\u0110\3\2"+
		"\2\2\u0173\u0113\3\2\2\2\u0173\u011b\3\2\2\2\u0173\u011f\3\2\2\2\u0173"+
		"\u0124\3\2\2\2\u0173\u0126\3\2\2\2\u0173\u012a\3\2\2\2\u0173\u012f\3\2"+
		"\2\2\u0173\u0134\3\2\2\2\u0173\u013c\3\2\2\2\u0173\u0142\3\2\2\2\u0173"+
		"\u0145\3\2\2\2\u0173\u0149\3\2\2\2\u0173\u014f\3\2\2\2\u0173\u0154\3\2"+
		"\2\2\u0173\u0158\3\2\2\2\u0173\u015d\3\2\2\2\u0173\u0160\3\2\2\2\u0173"+
		"\u0166\3\2\2\2\u0173\u016e\3\2\2\2\u0174N\3\2\2\2\u0175\u0176\7<\2\2\u0176"+
		"\u0180\7?\2\2\u0177\u0180\t\2\2\2\u0178\u0179\7#\2\2\u0179\u0180\7?\2"+
		"\2\u017a\u0180\t\3\2\2\u017b\u017c\7>\2\2\u017c\u0180\7?\2\2\u017d\u017e"+
		"\7@\2\2\u017e\u0180\7?\2\2\u017f\u0175\3\2\2\2\u017f\u0177\3\2\2\2\u017f"+
		"\u0178\3\2\2\2\u017f\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u0180P\3\2\2\2\u0181\u0185\t\4\2\2\u0182\u0184\t\5\2\2\u0183\u0182"+
		"\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"R\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\t\6\2\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cT\3"+
		"\2\2\2\u018d\u018f\t\6\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0193\u0195\7\60\2\2\u0194\u0196\t\6\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198V\3\2\2\2"+
		"\u0199\u019d\7$\2\2\u019a\u019c\n\7\2\2\u019b\u019a\3\2\2\2\u019c\u019f"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u01a0\u01a1\7$\2\2\u01a1X\3\2\2\2\u01a2\u01a3\7/\2\2\u01a3"+
		"\u01a4\7/\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a7\n\b\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01be\b-\2\2\u01ac\u01ad\7\61"+
		"\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01b2\3\2\2\2\u01af\u01b1\n\b\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01be\b-\3\2\u01b6"+
		"\u01ba\7%\2\2\u01b7\u01b9\n\b\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01a2\3\2\2\2\u01bd\u01ac\3\2\2\2\u01bd\u01b6\3\2"+
		"\2\2\u01beZ\3\2\2\2\u01bf\u01c1\t\t\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\b.\4\2\u01c5\\\3\2\2\2\17\2\u0173\u017f\u0185\u018b\u0190\u0197"+
		"\u019d\u01a8\u01b2\u01ba\u01bd\u01c2\5\3-\2\3-\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}