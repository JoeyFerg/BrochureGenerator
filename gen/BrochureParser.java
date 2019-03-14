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
		T__9=10, T__10=11, TITLE=12, HEADER=13, FOOTER=14, BODY=15, ITEM=16, IMAGE=17, 
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
			null, "'columns'", "':'", "'width'", "'height'", "'='", "'{'", "'}'", 
			"'DATE'", "'TIME'", "'TAG'", "'URL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
		public List<TerminalNode> WS() { return getTokens(BrochureParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BrochureParser.WS, i);
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(31);
				match(WS);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(T__1);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(38);
				match(WS);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(DIGIT);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(45);
				match(WS);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__2);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(52);
				match(WS);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__1);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(59);
				match(WS);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==TWODIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(66);
				match(WS);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__3);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(73);
				match(WS);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(T__1);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(80);
				match(WS);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==TWODIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(87);
				match(WS);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			columns();
			setState(94);
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
			setState(96);
			column();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(97);
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
			setState(100);
			match(DIGIT);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				match(T__4);
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TITLE) | (1L << HEADER) | (1L << FOOTER) | (1L << BODY) | (1L << ITEM) | (1L << IMAGE))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TITLE:
					{
					setState(106);
					titles();
					}
					break;
				case HEADER:
					{
					setState(107);
					headers();
					}
					break;
				case FOOTER:
					{
					setState(108);
					footers();
					}
					break;
				case BODY:
					{
					setState(109);
					bodys();
					}
					break;
				case ITEM:
					{
					setState(110);
					items();
					}
					break;
				case IMAGE:
					{
					setState(111);
					images();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(116);
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
			setState(117);
			title();
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(118);
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
			setState(121);
			header();
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(122);
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
			setState(125);
			footer();
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(126);
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
			setState(129);
			body();
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(130);
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
			setState(133);
			item();
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(134);
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
			setState(137);
			image();
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(138);
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
		enterRule(_localctx, 18, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(TITLE);
			setState(142);
			match(T__5);
			setState(143);
			match(TEXT);
			setState(144);
			match(T__6);
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
		enterRule(_localctx, 20, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(HEADER);
			setState(147);
			match(T__5);
			setState(148);
			match(TEXT);
			setState(149);
			match(T__6);
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
		enterRule(_localctx, 22, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(FOOTER);
			setState(152);
			match(T__5);
			setState(153);
			match(TEXT);
			setState(154);
			match(T__6);
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
		enterRule(_localctx, 24, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(BODY);
			setState(157);
			match(T__5);
			setState(158);
			match(TEXT);
			setState(159);
			match(T__6);
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
		public TerminalNode TEXT() { return getToken(BrochureParser.TEXT, 0); }
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
			setState(161);
			match(ITEM);
			setState(162);
			match(T__5);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(163);
				match(T__7);
				setState(164);
				match(T__1);
				setState(165);
				match(DATE);
				}
			}

			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(168);
				match(T__8);
				setState(169);
				match(T__1);
				setState(170);
				match(TIME);
				}
			}

			setState(173);
			match(TEXT);
			setState(174);
			match(T__6);
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
			setState(176);
			match(IMAGE);
			setState(177);
			match(T__5);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(178);
				match(T__9);
				setState(179);
				match(T__1);
				setState(180);
				match(TEXT);
				}
			}

			{
			setState(183);
			match(T__10);
			setState(184);
			match(T__1);
			setState(185);
			match(URL);
			}
			setState(187);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f\2\16"+
		"\2\64\13\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\7\2?\n\2\f\2\16\2B"+
		"\13\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2"+
		"\3\2\3\2\7\2T\n\2\f\2\16\2W\13\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\5\3e\n\3\3\4\3\4\6\4i\n\4\r\4\16\4j\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4s\n\4\f\4\16\4v\13\4\3\5\3\5\5\5z\n\5\3\6\3\6\5\6~\n\6\3\7\3\7"+
		"\5\7\u0082\n\7\3\b\3\b\5\b\u0086\n\b\3\t\3\t\5\t\u008a\n\t\3\n\3\n\5\n"+
		"\u008e\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00a9\n"+
		"\17\3\17\3\17\3\17\5\17\u00ae\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00b8\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\31\32\2\u00ca\2 \3\2\2\2\4b"+
		"\3\2\2\2\6f\3\2\2\2\bw\3\2\2\2\n{\3\2\2\2\f\177\3\2\2\2\16\u0083\3\2\2"+
		"\2\20\u0087\3\2\2\2\22\u008b\3\2\2\2\24\u008f\3\2\2\2\26\u0094\3\2\2\2"+
		"\30\u0099\3\2\2\2\32\u009e\3\2\2\2\34\u00a3\3\2\2\2\36\u00b2\3\2\2\2 "+
		"$\7\3\2\2!#\7\34\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2"+
		"\2\2&$\3\2\2\2\'+\7\4\2\2(*\7\34\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,.\3\2\2\2-+\3\2\2\2.\62\7\31\2\2/\61\7\34\2\2\60/\3\2\2\2\61\64"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\659\7"+
		"\5\2\2\668\7\34\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3"+
		"\2\2\2;9\3\2\2\2<@\7\4\2\2=?\7\34\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A"+
		"\3\2\2\2AC\3\2\2\2B@\3\2\2\2CG\t\2\2\2DF\7\34\2\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\7\6\2\2KM\7\34\2\2LK\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QU\7\4\2\2RT\7\34"+
		"\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X\\\t"+
		"\2\2\2Y[\7\34\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2"+
		"^\\\3\2\2\2_`\5\4\3\2`a\7\2\2\3a\3\3\2\2\2bd\5\6\4\2ce\5\4\3\2dc\3\2\2"+
		"\2de\3\2\2\2e\5\3\2\2\2fh\7\31\2\2gi\7\7\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2kt\3\2\2\2ls\5\b\5\2ms\5\n\6\2ns\5\f\7\2os\5\16\b\2ps\5"+
		"\20\t\2qs\5\22\n\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2r"+
		"q\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\7\3\2\2\2vt\3\2\2\2wy\5\24\13"+
		"\2xz\5\b\5\2yx\3\2\2\2yz\3\2\2\2z\t\3\2\2\2{}\5\26\f\2|~\5\n\6\2}|\3\2"+
		"\2\2}~\3\2\2\2~\13\3\2\2\2\177\u0081\5\30\r\2\u0080\u0082\5\f\7\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\r\3\2\2\2\u0083\u0085\5\32\16"+
		"\2\u0084\u0086\5\16\b\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\17\3\2\2\2\u0087\u0089\5\34\17\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\21\3\2\2\2\u008b\u008d\5\36\20\2\u008c"+
		"\u008e\5\22\n\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\23\3\2\2"+
		"\2\u008f\u0090\7\16\2\2\u0090\u0091\7\b\2\2\u0091\u0092\7\30\2\2\u0092"+
		"\u0093\7\t\2\2\u0093\25\3\2\2\2\u0094\u0095\7\17\2\2\u0095\u0096\7\b\2"+
		"\2\u0096\u0097\7\30\2\2\u0097\u0098\7\t\2\2\u0098\27\3\2\2\2\u0099\u009a"+
		"\7\20\2\2\u009a\u009b\7\b\2\2\u009b\u009c\7\30\2\2\u009c\u009d\7\t\2\2"+
		"\u009d\31\3\2\2\2\u009e\u009f\7\21\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1"+
		"\7\30\2\2\u00a1\u00a2\7\t\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4"+
		"\u00a8\7\b\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a9\7\24"+
		"\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa"+
		"\u00ab\7\13\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ae\7\26\2\2\u00ad\u00aa\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\30\2\2\u00b0"+
		"\u00b1\7\t\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\23\2\2\u00b3\u00b7\7\b\2"+
		"\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b8\7\30\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\r"+
		"\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\7\t\2\2\u00be\37\3\2\2\2\30$+\629@GNU\\djrty}\u0081\u0085\u0089"+
		"\u008d\u00a8\u00ad\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}