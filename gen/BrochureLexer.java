// Generated from C:/Users/joeyf/Documents/College/18-19 Senior/S 19/COS 382/BrochureGenerator/src\Brochure.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrochureLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, O=7, C=8, TITLE=9, HEADER=10, 
		FOOTER=11, BODY=12, ITEM=13, IMAGE=14, DATE=15, SEP=16, TIME=17, URL=18, 
		TEXT=19, DIGIT=20, TWODIGIT=21, FOURDIGIT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "O", "C", "TITLE", "HEADER", 
			"FOOTER", "BODY", "ITEM", "IMAGE", "DATE", "SEP", "TIME", "URL", "TEXT", 
			"DIGIT", "TWODIGIT", "FOURDIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'Date'", "':'", "'Time'", "'Tag'", "'URL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "O", "C", "TITLE", "HEADER", 
			"FOOTER", "BODY", "ITEM", "IMAGE", "DATE", "SEP", "TIME", "URL", "TEXT", 
			"DIGIT", "TWODIGIT", "FOURDIGIT", "WS"
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


	public BrochureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Brochure.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nR\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13_\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3\r\5\rs\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16z\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0084\n\17\3\20\3\20\5\20\u0088\n\20\3\20\3\20\3\20\5\20"+
		"\u008d\n\20\3\20\3\20\3\20\5\20\u0092\n\20\3\21\3\21\3\22\3\22\5\22\u0098"+
		"\n\22\3\22\3\22\3\22\7\22\u009d\n\22\f\22\16\22\u00a0\13\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00a6\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b7\n\23\3\23\7\23\u00ba\n\23\f"+
		"\23\16\23\u00bd\13\23\3\23\3\23\3\24\3\24\7\24\u00c3\n\24\f\24\16\24\u00c6"+
		"\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\4\u00bb\u00c4\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\7\4\2]]}}\4\2__\177\177\4\2\f\f\"\"\3\2\62;\5\2\13\f\17\17\""+
		"\"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13?\3\2\2"+
		"\2\rC\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23Q\3\2\2\2\25^\3\2\2\2\27k\3\2"+
		"\2\2\31r\3\2\2\2\33y\3\2\2\2\35\u0083\3\2\2\2\37\u0087\3\2\2\2!\u0093"+
		"\3\2\2\2#\u0097\3\2\2\2%\u00b6\3\2\2\2\'\u00c0\3\2\2\2)\u00c9\3\2\2\2"+
		"+\u00cb\3\2\2\2-\u00ce\3\2\2\2/\u00d3\3\2\2\2\61\62\7?\2\2\62\4\3\2\2"+
		"\2\63\64\7F\2\2\64\65\7c\2\2\65\66\7v\2\2\66\67\7g\2\2\67\6\3\2\2\289"+
		"\7<\2\29\b\3\2\2\2:;\7V\2\2;<\7k\2\2<=\7o\2\2=>\7g\2\2>\n\3\2\2\2?@\7"+
		"V\2\2@A\7c\2\2AB\7i\2\2B\f\3\2\2\2CD\7W\2\2DE\7T\2\2EF\7N\2\2F\16\3\2"+
		"\2\2GH\t\2\2\2H\20\3\2\2\2IJ\t\3\2\2J\22\3\2\2\2KR\7V\2\2LM\7V\2\2MN\7"+
		"k\2\2NO\7v\2\2OP\7n\2\2PR\7g\2\2QK\3\2\2\2QL\3\2\2\2R\24\3\2\2\2S_\7J"+
		"\2\2TU\7J\2\2UV\7g\2\2VW\7c\2\2WX\7f\2\2XY\7g\2\2Y_\7t\2\2Z[\7J\2\2[\\"+
		"\7g\2\2\\]\7c\2\2]_\7f\2\2^S\3\2\2\2^T\3\2\2\2^Z\3\2\2\2_\26\3\2\2\2`"+
		"l\7H\2\2ab\7H\2\2bc\7q\2\2cd\7q\2\2de\7v\2\2ef\7g\2\2fl\7t\2\2gh\7H\2"+
		"\2hi\7q\2\2ij\7q\2\2jl\7v\2\2k`\3\2\2\2ka\3\2\2\2kg\3\2\2\2l\30\3\2\2"+
		"\2ms\7D\2\2no\7D\2\2op\7q\2\2pq\7f\2\2qs\7{\2\2rm\3\2\2\2rn\3\2\2\2s\32"+
		"\3\2\2\2tz\7K\2\2uv\7K\2\2vw\7v\2\2wx\7g\2\2xz\7o\2\2yt\3\2\2\2yu\3\2"+
		"\2\2z\34\3\2\2\2{|\7K\2\2|}\7O\2\2}\u0084\7I\2\2~\177\7K\2\2\177\u0080"+
		"\7o\2\2\u0080\u0081\7c\2\2\u0081\u0082\7i\2\2\u0082\u0084\7g\2\2\u0083"+
		"{\3\2\2\2\u0083~\3\2\2\2\u0084\36\3\2\2\2\u0085\u0088\5)\25\2\u0086\u0088"+
		"\5+\26\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008c\5!\21\2\u008a\u008d\5)\25\2\u008b\u008d\5+\26\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\5!\21\2\u008f"+
		"\u0092\5+\26\2\u0090\u0092\5-\27\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2"+
		"\2\2\u0092 \3\2\2\2\u0093\u0094\4/\61\2\u0094\"\3\2\2\2\u0095\u0098\5"+
		")\25\2\u0096\u0098\5+\26\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\7<\2\2\u009a\u009e\5+\26\2\u009b\u009d\5/\30"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a5\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7C\2\2\u00a2"+
		"\u00a6\7O\2\2\u00a3\u00a4\7R\2\2\u00a4\u00a6\7O\2\2\u00a5\u00a1\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7"+
		"v\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7<\2\2\u00ac\u00ad"+
		"\7\61\2\2\u00ad\u00b7\7\61\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7<\2\2"+
		"\u00b4\u00b5\7\61\2\2\u00b5\u00b7\7\61\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00ae"+
		"\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf&\3\2\2\2\u00c0"+
		"\u00c4\7$\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8(\3\2\2\2\u00c9\u00ca\t\5\2\2\u00ca"+
		"*\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc\u00cd\t\5\2\2\u00cd,\3\2\2\2\u00ce"+
		"\u00cf\t\5\2\2\u00cf\u00d0\t\5\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00d2\t\5"+
		"\2\2\u00d2.\3\2\2\2\u00d3\u00d4\t\6\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\b\30\2\2\u00d6\60\3\2\2\2\22\2Q^kry\u0083\u0087\u008c\u0091\u0097\u009e"+
		"\u00a5\u00b6\u00bb\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}