// Generated from C:/Users/joeyf/Documents/College/18-19 Senior/S 19/COS 382/Project/src\Brochure.g4 by ANTLR 4.7.2
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00e1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\5\tT\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\fv\n\f\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0084\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n"+
		"\17\3\20\3\20\5\20\u0092\n\20\3\20\3\20\3\20\5\20\u0097\n\20\3\20\3\20"+
		"\3\20\5\20\u009c\n\20\3\21\3\21\3\22\3\22\5\22\u00a2\n\22\3\22\3\22\3"+
		"\22\7\22\u00a7\n\22\f\22\16\22\u00aa\13\22\3\22\3\22\3\22\3\22\5\22\u00b0"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00c1\n\23\3\23\7\23\u00c4\n\23\f\23\16\23\u00c7\13\23"+
		"\3\23\3\23\3\24\3\24\7\24\u00cd\n\24\f\24\16\24\u00d0\13\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\4\u00c5\u00ce\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\4\2]]"+
		"}}\4\2__\177\177\4\2\f\f\"\"\3\2\62;\5\2\13\f\17\17\"\"\2\u00f3\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61"+
		"\3\2\2\2\5\63\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13?\3\2\2\2\rC\3\2\2\2\17"+
		"M\3\2\2\2\21S\3\2\2\2\23[\3\2\2\2\25h\3\2\2\2\27u\3\2\2\2\31|\3\2\2\2"+
		"\33\u0083\3\2\2\2\35\u008d\3\2\2\2\37\u0091\3\2\2\2!\u009d\3\2\2\2#\u00a1"+
		"\3\2\2\2%\u00c0\3\2\2\2\'\u00ca\3\2\2\2)\u00d3\3\2\2\2+\u00d5\3\2\2\2"+
		"-\u00d8\3\2\2\2/\u00dd\3\2\2\2\61\62\7?\2\2\62\4\3\2\2\2\63\64\7F\2\2"+
		"\64\65\7c\2\2\65\66\7v\2\2\66\67\7g\2\2\67\6\3\2\2\289\7<\2\29\b\3\2\2"+
		"\2:;\7V\2\2;<\7k\2\2<=\7o\2\2=>\7g\2\2>\n\3\2\2\2?@\7V\2\2@A\7c\2\2AB"+
		"\7i\2\2B\f\3\2\2\2CD\7W\2\2DE\7T\2\2EF\7N\2\2F\16\3\2\2\2GN\t\2\2\2HI"+
		"\7d\2\2IJ\7g\2\2JK\7i\2\2KL\7k\2\2LN\7p\2\2MG\3\2\2\2MH\3\2\2\2N\20\3"+
		"\2\2\2OT\t\3\2\2PQ\7g\2\2QR\7p\2\2RT\7f\2\2SO\3\2\2\2SP\3\2\2\2T\22\3"+
		"\2\2\2U\\\7V\2\2VW\7V\2\2WX\7k\2\2XY\7v\2\2YZ\7n\2\2Z\\\7g\2\2[U\3\2\2"+
		"\2[V\3\2\2\2\\\24\3\2\2\2]i\7J\2\2^_\7J\2\2_`\7g\2\2`a\7c\2\2ab\7f\2\2"+
		"bc\7g\2\2ci\7t\2\2de\7J\2\2ef\7g\2\2fg\7c\2\2gi\7f\2\2h]\3\2\2\2h^\3\2"+
		"\2\2hd\3\2\2\2i\26\3\2\2\2jv\7H\2\2kl\7H\2\2lm\7q\2\2mn\7q\2\2no\7v\2"+
		"\2op\7g\2\2pv\7t\2\2qr\7H\2\2rs\7q\2\2st\7q\2\2tv\7v\2\2uj\3\2\2\2uk\3"+
		"\2\2\2uq\3\2\2\2v\30\3\2\2\2w}\7D\2\2xy\7D\2\2yz\7q\2\2z{\7f\2\2{}\7{"+
		"\2\2|w\3\2\2\2|x\3\2\2\2}\32\3\2\2\2~\u0084\7K\2\2\177\u0080\7K\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7g\2\2\u0082\u0084\7o\2\2\u0083~\3\2\2\2\u0083"+
		"\177\3\2\2\2\u0084\34\3\2\2\2\u0085\u0086\7K\2\2\u0086\u0087\7O\2\2\u0087"+
		"\u008e\7I\2\2\u0088\u0089\7K\2\2\u0089\u008a\7o\2\2\u008a\u008b\7c\2\2"+
		"\u008b\u008c\7i\2\2\u008c\u008e\7g\2\2\u008d\u0085\3\2\2\2\u008d\u0088"+
		"\3\2\2\2\u008e\36\3\2\2\2\u008f\u0092\5)\25\2\u0090\u0092\5+\26\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\5!"+
		"\21\2\u0094\u0097\5)\25\2\u0095\u0097\5+\26\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\5!\21\2\u0099\u009c\5+"+
		"\26\2\u009a\u009c\5-\27\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		" \3\2\2\2\u009d\u009e\4/\61\2\u009e\"\3\2\2\2\u009f\u00a2\5)\25\2\u00a0"+
		"\u00a2\5+\26\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\7<\2\2\u00a4\u00a8\5+\26\2\u00a5\u00a7\5/\30\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00af\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7C\2\2\u00ac"+
		"\u00b0\7O\2\2\u00ad\u00ae\7R\2\2\u00ae\u00b0\7O\2\2\u00af\u00ab\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7"+
		"v\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7<\2\2\u00b6\u00b7"+
		"\7\61\2\2\u00b7\u00c1\7\61\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7<\2\2"+
		"\u00be\u00bf\7\61\2\2\u00bf\u00c1\7\61\2\2\u00c0\u00b1\3\2\2\2\u00c0\u00b8"+
		"\3\2\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9&\3\2\2\2\u00ca"+
		"\u00ce\7$\2\2\u00cb\u00cd\13\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2(\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4"+
		"*\3\2\2\2\u00d5\u00d6\t\5\2\2\u00d6\u00d7\t\5\2\2\u00d7,\3\2\2\2\u00d8"+
		"\u00d9\t\5\2\2\u00d9\u00da\t\5\2\2\u00da\u00db\t\5\2\2\u00db\u00dc\t\5"+
		"\2\2\u00dc.\3\2\2\2\u00dd\u00de\t\6\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\b\30\2\2\u00e0\60\3\2\2\2\24\2MS[hu|\u0083\u008d\u0091\u0096\u009b\u00a1"+
		"\u00a8\u00af\u00c0\u00c5\u00ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}