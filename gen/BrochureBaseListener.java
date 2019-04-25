// Generated from C:/Users/bshelor24/Documents/Taylor 2018-19/project/Project/src\Brochure.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link BrochureListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class BrochureBaseListener implements BrochureListener {

	private BufferedWriter HTMLWriter;
	private String CSSFile;

	// Will have to be sorted by date and time for each column, then reset
	private ArrayList<String> eventList;


	public BrochureBaseListener(String HTMLPath, String CSSPath) {
		FileWriter fileWriter = getFileWriter(HTMLPath);
		if (fileWriter != null) {
			HTMLWriter = new BufferedWriter(fileWriter);
		}

		CSSFile = CSSPath;

		eventList = new ArrayList<>();
	}

	private FileWriter getFileWriter(String path) {
		try {
			return new FileWriter(path);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override public void enterStart(BrochureParser.StartContext ctx) {
		try {
			HTMLWriter.write("<!DOCTYPE html>\n");
			HTMLWriter.write("<html>\n");
			HTMLWriter.write("\t<head>\n");
			HTMLWriter.write("\t\t<title>\n");
			HTMLWriter.write("\t\t\tExample\n");
			HTMLWriter.write("\t\t</title>\n");
			HTMLWriter.write("\t\t<meta charset=\"utf-8\">\n");
			HTMLWriter.write(String.format("\t\t<link rel='stylesheet' href='%s'>\n", CSSFile));
			HTMLWriter.write("\t\t<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>\n");
			HTMLWriter.write("\t</head>\n\n");
			HTMLWriter.write("\t<body>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitStart(BrochureParser.StartContext ctx) {
		try {
			HTMLWriter.write("\t</body>\n");
			HTMLWriter.write("</html>\n");

			HTMLWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterPage1(BrochureParser.Page1Context ctx) {
		try {
			HTMLWriter.write("\t\t<div class='page' id='page1'>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitPage1(BrochureParser.Page1Context ctx) {
		try {
			HTMLWriter.write("\t\t</div>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterPage2(BrochureParser.Page2Context ctx) {
		try {
			HTMLWriter.write("\t\t<br>\n");
			HTMLWriter.write("\t\t<div class='page' id='page2'>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitPage2(BrochureParser.Page2Context ctx) {
		try {
			HTMLWriter.write("\t\t</div>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterColumn(BrochureParser.ColumnContext ctx) {
		try {
			HTMLWriter.write("\t\t\t<div class='column'>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitColumn(BrochureParser.ColumnContext ctx) {
		try {
			HTMLWriter.write("\t\t\t</div>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterTitle(BrochureParser.TitleContext ctx) {
		try {
			HTMLWriter.write("\t\t\t\t<h1>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitTitle(BrochureParser.TitleContext ctx) {
		try {
			String title = ctx.TEXT().getText();
			title = title.replace("\"", "");
			HTMLWriter.write("\t\t\t\t\t" + title + "\n");
			HTMLWriter.write("\t\t\t\t</h1>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterHeader(BrochureParser.HeaderContext ctx) {
		try {
			HTMLWriter.write("\t\t\t\t<h2>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitHeader(BrochureParser.HeaderContext ctx) {
		try {
			String header = ctx.TEXT().getText();
			header = header.replace("\"", "");
			HTMLWriter.write("\t\t\t\t\t" + header + "\n");
			HTMLWriter.write("\t\t\t\t</h2>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterFooter(BrochureParser.FooterContext ctx) {
		try {
			HTMLWriter.write("\t\t\t\t<footer>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitFooter(BrochureParser.FooterContext ctx) {
		try {
			String footer = ctx.TEXT().getText();
			footer = footer.replace("\"", "");
			HTMLWriter.write("\t\t\t\t\t" + footer + "\n");
			HTMLWriter.write("\t\t\t\t</footer>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterBody(BrochureParser.BodyContext ctx) {
		try {
			HTMLWriter.write("\t\t\t\t<div class='body'>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitBody(BrochureParser.BodyContext ctx) {
		try {
			String body = ctx.TEXT().getText();
			body = body.replace("\"", "");
			HTMLWriter.write("\t\t\t\t\t" + body + "\n");
			HTMLWriter.write("\t\t\t\t</div>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterItem(BrochureParser.ItemContext ctx) {
		try {
			HTMLWriter.write("\t\t\t\t<div class='item'>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitItem(BrochureParser.ItemContext ctx) {
		try {
			HTMLWriter.write("\t\t\t\t\t<p class='date'>\n");
			String date = ctx.DATE().getText();
			date = date.replace("\"", "");
			HTMLWriter.write("\t\t\t\t\t\t" + "Date: " + date + "\n");
			HTMLWriter.write("\t\t\t\t\t</p>\n");

			HTMLWriter.write("\t\t\t\t\t<p class='time'>\n");
			String time = ctx.TIME().getText();
			time = time.replace("\"", "");
			HTMLWriter.write("\t\t\t\t\t\t" + "Time: " + time + "\n");
			HTMLWriter.write("\t\t\t\t\t</p>\n");

			HTMLWriter.write("\t\t\t\t\t<p class='text'>\n");
			String text = ctx.TEXT().getText();
			text = text.replace("\"", "");
			HTMLWriter.write("\t\t\t\t\t\t" + text + "\n");
			HTMLWriter.write("\t\t\t\t\t</p>\n");

			HTMLWriter.write("\t\t\t\t</div>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterImage(BrochureParser.ImageContext ctx) {
		try {
			HTMLWriter.write("\t\t\t\t<div class='img'>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void exitImage(BrochureParser.ImageContext ctx) {
		try {
			String text = ctx.TEXT().getText();
			text = text.replace("\"", "");
			String url = ctx.URL().getText();
			url = url.replace("\"", "");

			HTMLWriter.write("\t\t\t\t\t<img src='" + url + "' alt='" + text + "'>\n");
			HTMLWriter.write("\t\t\t\t\t<p class='caption'>\n");
			HTMLWriter.write("\t\t\t\t\t\t" + text + "\n");
			HTMLWriter.write("\t\t\t\t\t</p>\n");
			HTMLWriter.write("\t\t\t\t</div>\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterTitles(BrochureParser.TitlesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTitles(BrochureParser.TitlesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHeaders(BrochureParser.HeadersContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHeaders(BrochureParser.HeadersContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFooters(BrochureParser.FootersContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFooters(BrochureParser.FootersContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBodys(BrochureParser.BodysContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBodys(BrochureParser.BodysContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterItems(BrochureParser.ItemsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitItems(BrochureParser.ItemsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterImages(BrochureParser.ImagesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImages(BrochureParser.ImagesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}