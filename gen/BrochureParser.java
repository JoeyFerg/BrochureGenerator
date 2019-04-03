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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		O=10, C=11, TITLE=12, HEADER=13, FOOTER=14, BODY=15, ITEM=16, IMAGE=17, 
		DATE=18, SEP=19, TIME=20, URL=21, TEXT=22, DIGIT=23, TWODIGIT=24, FOURDIGIT=25, 
		WS=26;
	public static final int
		RULE_start = 0, RULE_columns = 1, RULE_column = 2, RULE_titles = 3, RULE_headers = 4, 
		RULE_footers = 5, RULE_bodys = 6, RULE_items = 7, RULE_images = 8, RULE_title = 9, 
		RULE_header = 10, RULE_footer = 11, RULE_body = 12, RULE_item = 13, RULE_image = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "columns", "column", "titles", "headers", "footers", "bodys", 
			"items", "images", "title", "header", "footer", "body", "item", "image"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Columns'", "':'", "'Width'", "'Height'", "'='", "'Date'", "'Time'", 
			"'Tag'", "'URL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "O", "C", 
			"TITLE", "HEADER", "FOOTER", "BODY", "ITEM", "IMAGE", "DATE", "SEP", 
			"TIME", "URL", "TEXT", "DIGIT", "TWODIGIT", "FOURDIGIT", "WS"
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
		public List<TerminalNode> DIGIT() { return getTokens(BrochureParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(BrochureParser.DIGIT, i);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BrochureParser.EOF, 0); }
		public List<TerminalNode> TWODIGIT() { return getTokens(BrochureParser.TWODIGIT); }
		public TerminalNode TWODIGIT(int i) {
			return getToken(BrochureParser.TWODIGIT, i);
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
			setState(30);
			match(T__0);
			setState(31);
			match(T__1);
			setState(32);
			match(DIGIT);
			setState(33);
			match(T__2);
			setState(34);
			match(T__1);
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==TWODIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			match(T__3);
			setState(37);
			match(T__1);
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==TWODIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(39);
			columns();
			setState(40);
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

	public static class ColumnsContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrochureListener ) ((BrochureListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrochureVisitor ) return ((BrochureVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			column();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(43);
				columns();
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
		enterRule(_localctx, 4, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DIGIT);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				match(T__4);
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TITLE) | (1L << HEADER) | (1L << FOOTER) | (1L << BODY) | (1L << ITEM) | (1L << IMAGE))) != 0)) {
				{
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TITLE:
					{
					setState(52);
					titles();
					}
					break;
				case HEADER:
					{
					setState(53);
					headers();
					}
					break;
				case FOOTER:
					{
					setState(54);
					footers();
					}
					break;
				case BODY:
					{
					setState(55);
					bodys();
					}
					break;
				case ITEM:
					{
					setState(56);
					items();
					}
					break;
				case IMAGE:
					{
					setState(57);
					images();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
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
		enterRule(_localctx, 6, RULE_titles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			title();
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(64);
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
		enterRule(_localctx, 8, RULE_headers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			header();
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(68);
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
		enterRule(_localctx, 10, RULE_footers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			footer();
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(72);
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
		enterRule(_localctx, 12, RULE_bodys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			body();
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(76);
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
		enterRule(_localctx, 14, RULE_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			item();
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(80);
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
		enterRule(_localctx, 16, RULE_images);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			image();
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(84);
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
		enterRule(_localctx, 18, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TITLE);
			setState(88);
			match(O);
			setState(89);
			match(TEXT);
			setState(90);
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
		enterRule(_localctx, 20, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(HEADER);
			setState(93);
			match(O);
			setState(94);
			match(TEXT);
			setState(95);
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
		enterRule(_localctx, 22, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(FOOTER);
			setState(98);
			match(O);
			setState(99);
			match(TEXT);
			setState(100);
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
		enterRule(_localctx, 24, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(BODY);
			setState(103);
			match(O);
			setState(104);
			match(TEXT);
			setState(105);
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
		enterRule(_localctx, 26, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ITEM);
			setState(108);
			match(O);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(109);
				match(T__5);
				setState(110);
				match(T__1);
				setState(111);
				match(DATE);
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(114);
				match(T__6);
				setState(115);
				match(T__1);
				setState(116);
				match(TIME);
				}
			}

			setState(119);
			match(TEXT);
			setState(120);
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
		enterRule(_localctx, 28, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IMAGE);
			setState(123);
			match(O);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(124);
				match(T__7);
				setState(125);
				match(T__1);
				setState(126);
				match(TEXT);
				}
			}

			{
			setState(129);
			match(T__8);
			setState(130);
			match(T__1);
			setState(131);
			match(URL);
			}
			setState(133);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3/\n\3\3\4\3\4\6\4\63\n\4\r\4"+
		"\16\4\64\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\5\5D"+
		"\n\5\3\6\3\6\5\6H\n\6\3\7\3\7\5\7L\n\7\3\b\3\b\5\bP\n\b\3\t\3\t\5\tT\n"+
		"\t\3\n\3\n\5\nX\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"s\n\17\3\17\3\17\3\17\5\17x\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0082\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\31\32\2\u008b\2 \3\2\2\2\4,\3"+
		"\2\2\2\6\60\3\2\2\2\bA\3\2\2\2\nE\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20Q\3"+
		"\2\2\2\22U\3\2\2\2\24Y\3\2\2\2\26^\3\2\2\2\30c\3\2\2\2\32h\3\2\2\2\34"+
		"m\3\2\2\2\36|\3\2\2\2 !\7\3\2\2!\"\7\4\2\2\"#\7\31\2\2#$\7\5\2\2$%\7\4"+
		"\2\2%&\t\2\2\2&\'\7\6\2\2\'(\7\4\2\2()\t\2\2\2)*\5\4\3\2*+\7\2\2\3+\3"+
		"\3\2\2\2,.\5\6\4\2-/\5\4\3\2.-\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60\62\7\31"+
		"\2\2\61\63\7\7\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65>\3\2\2\2\66=\5\b\5\2\67=\5\n\6\28=\5\f\7\29=\5\16\b\2:=\5\20\t"+
		"\2;=\5\22\n\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;"+
		"\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2\2\2AC\5\24\13"+
		"\2BD\5\b\5\2CB\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EG\5\26\f\2FH\5\n\6\2GF\3\2"+
		"\2\2GH\3\2\2\2H\13\3\2\2\2IK\5\30\r\2JL\5\f\7\2KJ\3\2\2\2KL\3\2\2\2L\r"+
		"\3\2\2\2MO\5\32\16\2NP\5\16\b\2ON\3\2\2\2OP\3\2\2\2P\17\3\2\2\2QS\5\34"+
		"\17\2RT\5\20\t\2SR\3\2\2\2ST\3\2\2\2T\21\3\2\2\2UW\5\36\20\2VX\5\22\n"+
		"\2WV\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YZ\7\16\2\2Z[\7\f\2\2[\\\7\30\2\2\\"+
		"]\7\r\2\2]\25\3\2\2\2^_\7\17\2\2_`\7\f\2\2`a\7\30\2\2ab\7\r\2\2b\27\3"+
		"\2\2\2cd\7\20\2\2de\7\f\2\2ef\7\30\2\2fg\7\r\2\2g\31\3\2\2\2hi\7\21\2"+
		"\2ij\7\f\2\2jk\7\30\2\2kl\7\r\2\2l\33\3\2\2\2mn\7\22\2\2nr\7\f\2\2op\7"+
		"\b\2\2pq\7\4\2\2qs\7\24\2\2ro\3\2\2\2rs\3\2\2\2sw\3\2\2\2tu\7\t\2\2uv"+
		"\7\4\2\2vx\7\26\2\2wt\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\30\2\2z{\7\r\2\2"+
		"{\35\3\2\2\2|}\7\23\2\2}\u0081\7\f\2\2~\177\7\n\2\2\177\u0080\7\4\2\2"+
		"\u0080\u0082\7\30\2\2\u0081~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\7\4\2\2\u0085\u0086\7\27\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\7\r\2\2\u0088\37\3\2\2\2\17.\64<>CGKOSWrw\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}