// Generated from C:/Users/joeyf/Documents/College/18-19 Senior/S 19/COS 382/Project/src\Brochure.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrochureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrochureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BrochureParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(BrochureParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(BrochureParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(BrochureParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(BrochureParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(BrochureParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(BrochureParser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(BrochureParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(BrochureParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrochureParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(BrochureParser.ImageContext ctx);
}