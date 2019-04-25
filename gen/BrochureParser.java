// Generated from C:/Users/bshelor24/Documents/Taylor 2018-19/project/Project/src\Brochure.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, O=7, C=8, TITLE=9, HEADER=10, 
		FOOTER=11, BODY=12, ITEM=13, IMAGE=14, DATE=15, SEP=16, TIME=17, URL=18, 
		TEXT=19, DIGIT=20, TWODIGIT=21, FOURDIGIT=22, WS=23;
	public static final int
		RULE_start = 0, RULE_page1 = 1, RULE_page2 = 2, RULE_column = 3, RULE_titles = 4, 
		RULE_headers = 5, RULE_footers = 6, RULE_bodys = 7, RULE_items = 8, RULE_images = 9, 
		RULE_title = 10, RULE_header = 11, RULE_footer = 12, RULE_body = 13, RULE_item = 14, 
		RULE_image = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "page1", "page2", "column", "titles", "headers", "footers", 
			"bodys", "items", "images", "title", "header", "footer", "body", "item", 
			"image"
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
		public Page1Context page1() {
			return getRuleContext(Page1Context.class,0);
		}
		public Page2Context page2() {
			return getRuleContext(Page2Context.class,0);
		}
		public TerminalNode EOF() { return getToken(BrochureParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			page1();
			setState(33);
			page2();
			setState(34);
			match(EOF);
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

	public static class Page1Context extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public Page1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterPage1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitPage1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitPage1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Page1Context page1() throws RecognitionException {
		Page1Context _localctx = new Page1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_page1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			column();
			setState(37);
			column();
			setState(38);
			column();
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

	public static class Page2Context extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public Page2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterPage2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitPage2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitPage2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Page2Context page2() throws RecognitionException {
		Page2Context _localctx = new Page2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_page2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			column();
			setState(41);
			column();
			setState(42);
			column();
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
		public TerminalNode DIGIT() { return getToken(BrochureParser.DIGIT, 0); }
		public List<TitlesContext> titles() {
			return getRuleContexts(TitlesContext.class);
		}
		public TitlesContext titles(int i) {
			return getRuleContext(TitlesContext.class,i);
		}
		public List<HeadersContext> headers() {
			return getRuleContexts(HeadersContext.class);
		}
		public HeadersContext headers(int i) {
			return getRuleContext(HeadersContext.class,i);
		}
		public List<FootersContext> footers() {
			return getRuleContexts(FootersContext.class);
		}
		public FootersContext footers(int i) {
			return getRuleContext(FootersContext.class,i);
		}
		public List<BodysContext> bodys() {
			return getRuleContexts(BodysContext.class);
		}
		public BodysContext bodys(int i) {
			return getRuleContext(BodysContext.class,i);
		}
		public List<ItemsContext> items() {
			return getRuleContexts(ItemsContext.class);
		}
		public ItemsContext items(int i) {
			return getRuleContext(ItemsContext.class,i);
		}
		public List<ImagesContext> images() {
			return getRuleContexts(ImagesContext.class);
		}
		public ImagesContext images(int i) {
			return getRuleContext(ImagesContext.class,i);
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
		enterRule(_localctx, 6, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(DIGIT);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(T__0);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TITLE) | (1L << HEADER) | (1L << FOOTER) | (1L << BODY) | (1L << ITEM) | (1L << IMAGE))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TITLE:
					{
					setState(50);
					titles();
					}
					break;
				case HEADER:
					{
					setState(51);
					headers();
					}
					break;
				case FOOTER:
					{
					setState(52);
					footers();
					}
					break;
				case BODY:
					{
					setState(53);
					bodys();
					}
					break;
				case ITEM:
					{
					setState(54);
					items();
					}
					break;
				case IMAGE:
					{
					setState(55);
					images();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TitlesContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TitlesContext titles() {
			return getRuleContext(TitlesContext.class,0);
		}
		public TitlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterTitles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitTitles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitTitles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitlesContext titles() throws RecognitionException {
		TitlesContext _localctx = new TitlesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_titles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			title();
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(62);
				titles();
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

	public static class HeadersContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public HeadersContext headers() {
			return getRuleContext(HeadersContext.class,0);
		}
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitHeaders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitHeaders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_headers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			header();
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(66);
				headers();
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

	public static class FootersContext extends ParserRuleContext {
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public FootersContext footers() {
			return getRuleContext(FootersContext.class,0);
		}
		public FootersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterFooters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitFooters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitFooters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FootersContext footers() throws RecognitionException {
		FootersContext _localctx = new FootersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_footers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			footer();
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(70);
				footers();
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

	public static class BodysContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodysContext bodys() {
			return getRuleContext(BodysContext.class,0);
		}
		public BodysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterBodys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitBodys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitBodys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodysContext bodys() throws RecognitionException {
		BodysContext _localctx = new BodysContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bodys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			body();
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(74);
				bodys();
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

	public static class ItemsContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			item();
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(78);
				items();
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

	public static class ImagesContext extends ParserRuleContext {
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ImagesContext images() {
			return getRuleContext(ImagesContext.class,0);
		}
		public ImagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_images; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterImages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitImages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitImages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagesContext images() throws RecognitionException {
		ImagesContext _localctx = new ImagesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_images);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			image();
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(82);
				images();
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(BrochureParser.TITLE, 0); }
		public TerminalNode O() { return getToken(BrochureParser.O, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public TerminalNode C() { return getToken(BrochureParser.C, 0); }
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
		enterRule(_localctx, 20, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(TITLE);
			setState(86);
			match(O);
			setState(87);
			match(TEXT);
			setState(88);
			match(C);
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
		public TerminalNode O() { return getToken(BrochureParser.O, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public TerminalNode C() { return getToken(BrochureParser.C, 0); }
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
		enterRule(_localctx, 22, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(HEADER);
			setState(91);
			match(O);
			setState(92);
			match(TEXT);
			setState(93);
			match(C);
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
		public TerminalNode O() { return getToken(BrochureParser.O, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public TerminalNode C() { return getToken(BrochureParser.C, 0); }
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
		enterRule(_localctx, 24, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(FOOTER);
			setState(96);
			match(O);
			setState(97);
			match(TEXT);
			setState(98);
			match(C);
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
		public TerminalNode O() { return getToken(BrochureParser.O, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public TerminalNode C() { return getToken(BrochureParser.C, 0); }
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
		enterRule(_localctx, 26, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(BODY);
			setState(101);
			match(O);
			setState(102);
			match(TEXT);
			setState(103);
			match(C);
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
		public TerminalNode O() { return getToken(BrochureParser.O, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
		public TerminalNode C() { return getToken(BrochureParser.C, 0); }
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
		enterRule(_localctx, 28, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ITEM);
			setState(106);
			match(O);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(107);
				match(T__1);
				setState(108);
				match(T__2);
				setState(109);
				match(DATE);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(112);
				match(T__3);
				setState(113);
				match(T__2);
				setState(114);
				match(TIME);
				}
			}

			setState(117);
			match(TEXT);
			setState(118);
			match(C);
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
		public TerminalNode O() { return getToken(BrochureParser.O, 0); }
		public TerminalNode C() { return getToken(BrochureParser.C, 0); }
		public TerminalNode URL() { return getToken(BrochureParser.URL, 0); }
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
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
		enterRule(_localctx, 30, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IMAGE);
			setState(121);
			match(O);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(122);
				match(T__4);
				setState(123);
				match(T__2);
				setState(124);
				match(TEXT);
				}
			}

			{
			setState(127);
			match(T__5);
			setState(128);
			match(T__2);
			setState(129);
			match(URL);
			}
			setState(131);
			match(C);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\6\5\61\n\5\r\5\16\5\62"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\5\6B\n\6\3\7"+
		"\3\7\5\7F\n\7\3\b\3\b\5\bJ\n\b\3\t\3\t\5\tN\n\t\3\n\3\n\5\nR\n\n\3\13"+
		"\3\13\5\13V\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20q\n\20"+
		"\3\20\3\20\3\20\5\20v\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0080\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\2\2\u0087\2\"\3\2\2\2\4&\3\2\2\2\6*\3\2\2\2\b"+
		".\3\2\2\2\n?\3\2\2\2\fC\3\2\2\2\16G\3\2\2\2\20K\3\2\2\2\22O\3\2\2\2\24"+
		"S\3\2\2\2\26W\3\2\2\2\30\\\3\2\2\2\32a\3\2\2\2\34f\3\2\2\2\36k\3\2\2\2"+
		" z\3\2\2\2\"#\5\4\3\2#$\5\6\4\2$%\7\2\2\3%\3\3\2\2\2&\'\5\b\5\2\'(\5\b"+
		"\5\2()\5\b\5\2)\5\3\2\2\2*+\5\b\5\2+,\5\b\5\2,-\5\b\5\2-\7\3\2\2\2.\60"+
		"\7\26\2\2/\61\7\3\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63<\3\2\2\2\64;\5\n\6\2\65;\5\f\7\2\66;\5\16\b\2\67;\5\20\t\28"+
		";\5\22\n\29;\5\24\13\2:\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2"+
		":8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2"+
		"\2?A\5\26\f\2@B\5\n\6\2A@\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CE\5\30\r\2DF\5"+
		"\f\7\2ED\3\2\2\2EF\3\2\2\2F\r\3\2\2\2GI\5\32\16\2HJ\5\16\b\2IH\3\2\2\2"+
		"IJ\3\2\2\2J\17\3\2\2\2KM\5\34\17\2LN\5\20\t\2ML\3\2\2\2MN\3\2\2\2N\21"+
		"\3\2\2\2OQ\5\36\20\2PR\5\22\n\2QP\3\2\2\2QR\3\2\2\2R\23\3\2\2\2SU\5 \21"+
		"\2TV\5\24\13\2UT\3\2\2\2UV\3\2\2\2V\25\3\2\2\2WX\7\13\2\2XY\7\t\2\2YZ"+
		"\7\25\2\2Z[\7\n\2\2[\27\3\2\2\2\\]\7\f\2\2]^\7\t\2\2^_\7\25\2\2_`\7\n"+
		"\2\2`\31\3\2\2\2ab\7\r\2\2bc\7\t\2\2cd\7\25\2\2de\7\n\2\2e\33\3\2\2\2"+
		"fg\7\16\2\2gh\7\t\2\2hi\7\25\2\2ij\7\n\2\2j\35\3\2\2\2kl\7\17\2\2lp\7"+
		"\t\2\2mn\7\4\2\2no\7\5\2\2oq\7\21\2\2pm\3\2\2\2pq\3\2\2\2qu\3\2\2\2rs"+
		"\7\6\2\2st\7\5\2\2tv\7\23\2\2ur\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\25\2\2"+
		"xy\7\n\2\2y\37\3\2\2\2z{\7\20\2\2{\177\7\t\2\2|}\7\7\2\2}~\7\5\2\2~\u0080"+
		"\7\25\2\2\177|\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\b\2\2\u0082\u0083\7\5\2\2\u0083\u0084\7\24\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\7\n\2\2\u0086!\3\2\2\2\16\62:<AEIMQUpu\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}