// Generated from C:/Users/joeyf/Documents/College/18-19 Senior/S 19/COS 382/Project/src\Brochure.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrochureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TITLE=9, 
		HEADER=10, FOOTER=11, SECTION=12, BODY=13, ITEM=14, DATE=15, SEP=16, TIME=17, 
		CONTENT=18, IMAGE=19, TAG=20, URL=21, COLS=22, COLNUM=23, NUM=24, DIGIT=25, 
		TEXT=26, WS=27;
	public static final int
		RULE_start = 0, RULE_column = 1, RULE_title = 2, RULE_section = 3, RULE_header = 4, 
		RULE_footer = 5, RULE_body = 6, RULE_item = 7, RULE_image = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "column", "title", "section", "header", "footer", "body", "item", 
			"image"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'columns'", "':'", "'width'", "'in'", "'height'", "'='", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TITLE", "HEADER", 
			"FOOTER", "SECTION", "BODY", "ITEM", "DATE", "SEP", "TIME", "CONTENT", 
			"IMAGE", "TAG", "URL", "COLS", "COLNUM", "NUM", "DIGIT", "TEXT", "WS"
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
	public String getGrammarFileName() { return "Brochure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrochureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode COLS() { return getToken(BrochureParser.COLS, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public List<TerminalNode> NUM() { return getTokens(BrochureParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(BrochureParser.NUM, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(T__1);
			setState(20);
			match(COLS);
			setState(21);
			column();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(22);
				match(T__2);
				setState(23);
				match(T__1);
				setState(24);
				match(NUM);
				setState(25);
				match(T__3);
				setState(26);
				match(T__4);
				setState(27);
				match(T__1);
				setState(28);
				match(NUM);
				setState(29);
				match(T__3);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLNUM() { return getToken(BrochureParser.COLNUM, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_column);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(COLNUM);
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33);
					match(T__5);
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TITLE) {
					{
					setState(38);
					title();
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECTION) {
					{
					setState(41);
					section();
					}
				}

				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HEADER) {
					{
					setState(44);
					header();
					}
				}

				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOOTER) {
					{
					setState(47);
					footer();
					}
				}

				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BODY) {
					{
					setState(50);
					body();
					}
				}

				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ITEM) {
					{
					setState(53);
					item();
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMAGE) {
					{
					setState(56);
					image();
					}
				}

				}
				break;
			case EOF:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(BrochureParser.TITLE, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TITLE);
			setState(63);
			match(T__6);
			setState(64);
			match(TEXT);
			setState(65);
			match(T__7);
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

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(BrochureParser.SECTION, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(SECTION);
			setState(68);
			match(T__6);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE) {
				{
				setState(69);
				title();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(72);
				header();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOOTER) {
				{
				setState(75);
				footer();
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY) {
				{
				setState(78);
				body();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ITEM) {
				{
				setState(81);
				item();
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMAGE) {
				{
				setState(84);
				image();
				}
			}

			setState(87);
			match(T__7);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(BrochureParser.HEADER, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(HEADER);
			setState(90);
			match(T__6);
			setState(91);
			match(TEXT);
			setState(92);
			match(T__7);
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

	public static class FooterContext extends ParserRuleContext {
		public TerminalNode FOOTER() { return getToken(BrochureParser.FOOTER, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FOOTER);
			setState(95);
			match(T__6);
			setState(96);
			match(TEXT);
			setState(97);
			match(T__7);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(BrochureParser.BODY, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(BODY);
			setState(100);
			match(T__6);
			setState(101);
			match(TEXT);
			setState(102);
			match(T__7);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(BrochureParser.ITEM, 0); }
		public TerminalNode CONTENT() { return getToken(BrochureParser.CONTENT, 0); }
		public TerminalNode DATE() { return getToken(BrochureParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(BrochureParser.TIME, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ITEM);
			setState(105);
			match(T__6);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATE) {
				{
				setState(106);
				match(DATE);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIME) {
				{
				setState(109);
				match(TIME);
				}
			}

			setState(112);
			match(CONTENT);
			setState(113);
			match(T__7);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(BrochureParser.IMAGE, 0); }
		public TerminalNode URL() { return getToken(BrochureParser.URL, 0); }
		public TerminalNode TAG() { return getToken(BrochureParser.TAG, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IMAGE);
			setState(116);
			match(T__6);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG) {
				{
				setState(117);
				match(TAG);
				}
			}

			{
			setState(120);
			match(URL);
			}
			setState(121);
			match(T__7);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35~\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\6\3%\n\3\r\3\16"+
		"\3&\3\3\5\3*\n\3\3\3\5\3-\n\3\3\3\5\3\60\n\3\3\3\5\3\63\n\3\3\3\5\3\66"+
		"\n\3\3\3\5\39\n\3\3\3\5\3<\n\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\5\5I\n\5\3\5\5\5L\n\5\3\5\5\5O\n\5\3\5\5\5R\n\5\3\5\5\5U\n\5\3"+
		"\5\5\5X\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\tn\n\t\3\t\5\tq\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5"+
		"\ny\n\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\u0087\2\24\3"+
		"\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bE\3\2\2\2\n[\3\2\2\2\f`\3\2\2\2\16e\3\2"+
		"\2\2\20j\3\2\2\2\22u\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\27\7\30\2"+
		"\2\27 \5\4\3\2\30\31\7\5\2\2\31\32\7\4\2\2\32\33\7\32\2\2\33\34\7\6\2"+
		"\2\34\35\7\7\2\2\35\36\7\4\2\2\36\37\7\32\2\2\37!\7\6\2\2 \30\3\2\2\2"+
		" !\3\2\2\2!\3\3\2\2\2\"$\7\31\2\2#%\7\b\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\')\3\2\2\2(*\5\6\4\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5"+
		"\b\5\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\n\6\2/.\3\2\2\2/\60\3\2\2\2"+
		"\60\62\3\2\2\2\61\63\5\f\7\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2"+
		"\64\66\5\16\b\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\20\t\28"+
		"\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\22\n\2;:\3\2\2\2;<\3\2\2\2<?\3\2\2"+
		"\2=?\3\2\2\2>\"\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@A\7\13\2\2AB\7\t\2\2BC\7"+
		"\34\2\2CD\7\n\2\2D\7\3\2\2\2EF\7\16\2\2FH\7\t\2\2GI\5\6\4\2HG\3\2\2\2"+
		"HI\3\2\2\2IK\3\2\2\2JL\5\n\6\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\5\f\7\2"+
		"NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\16\b\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2"+
		"\2SU\5\20\t\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5\22\n\2WV\3\2\2\2WX\3\2"+
		"\2\2XY\3\2\2\2YZ\7\n\2\2Z\t\3\2\2\2[\\\7\f\2\2\\]\7\t\2\2]^\7\34\2\2^"+
		"_\7\n\2\2_\13\3\2\2\2`a\7\r\2\2ab\7\t\2\2bc\7\34\2\2cd\7\n\2\2d\r\3\2"+
		"\2\2ef\7\17\2\2fg\7\t\2\2gh\7\34\2\2hi\7\n\2\2i\17\3\2\2\2jk\7\20\2\2"+
		"km\7\t\2\2ln\7\21\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\7\23\2\2po\3\2\2"+
		"\2pq\3\2\2\2qr\3\2\2\2rs\7\24\2\2st\7\n\2\2t\21\3\2\2\2uv\7\25\2\2vx\7"+
		"\t\2\2wy\7\26\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\27\2\2{|\7\n\2\2|"+
		"\23\3\2\2\2\25 &),/\62\658;>HKNQTWmpx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}