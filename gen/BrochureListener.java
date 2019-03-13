// Generated from C:/Users/joeyf/Documents/College/18-19 Senior/S 19/COS 382/Project/src\Brochure.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrochureParser}.
 */
public interface BrochureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrochureParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(BrochureParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(BrochureParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(BrochureParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(BrochureParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(BrochureParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(BrochureParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(BrochureParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(BrochureParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(BrochureParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(BrochureParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFooter(BrochureParser.FooterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFooter(BrochureParser.FooterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(BrochureParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(BrochureParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(BrochureParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(BrochureParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrochureParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(BrochureParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrochureParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(BrochureParser.ImageContext ctx);
}