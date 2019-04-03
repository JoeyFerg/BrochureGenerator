// Generated from C:/Users/joeyf/Documents/College/18-19 Senior/S 19/COS 382/Project/src\Brochure.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BrochureBaseListener implements BrochureListener {

		private BufferedWriter HTMLWriter;

		private ArrayList<String> eventList;

		public BrochureBaseListener(String HTMLPath) {
			FileWriter fileWriter = getFileWriter(HTMLPath);
			if (fileWriter != null) {
				HTMLWriter = new BufferedWriter(fileWriter);
			}

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
				HTMLWriter.write("<head>\n");
				HTMLWriter.write("<meta charset=\"utf-8\">\n");
				HTMLWriter.write("<link rel='stylesheet' href='' \n");
				HTMLWriter.write("</head>\n");
				HTMLWriter.write("<body>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitStart(BrochureParser.StartContext ctx) {
			try {
				HTMLWriter.write("</body>\n");
				HTMLWriter.write("</html>\n");

				HTMLWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterPage(BrochureParser.PageContext ctx) {
			try {
				// front or back
				HTMLWriter.write("<div id=''>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitPage(BrochureParser.PageContext ctx) {
			try {
				HTMLWriter.write("</div>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterColumn(BrochureParser.ColumnContext ctx) {
			try {
				// System.out.println(ctx.getText());
				// TODO: Figure out how to parse id based on input
				// left middle right
				HTMLWriter.write("<div id=''>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitColumn(BrochureParser.ColumnContext ctx) {
			try {
				HTMLWriter.write("</div>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterTitle(BrochureParser.TitleContext ctx) {
			try {
				HTMLWriter.write("<h1>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitTitle(BrochureParser.TitleContext ctx) {
			try {
				HTMLWriter.write("</h1>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterHeader(BrochureParser.HeaderContext ctx) {
			try {
				HTMLWriter.write("<h2>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitHeader(BrochureParser.HeaderContext ctx) {
			try {
				HTMLWriter.write("</h2>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterFooter(BrochureParser.FooterContext ctx) {
			try {
				HTMLWriter.write("<footer>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitFooter(BrochureParser.FooterContext ctx) {
			try {
				HTMLWriter.write("</footer>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterBody(BrochureParser.BodyContext ctx) {
			try {
				HTMLWriter.write("<div class='body'>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitBody(BrochureParser.BodyContext ctx) {
			try {
				HTMLWriter.write("</div>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterItem(BrochureParser.ItemContext ctx) {
			try {
				HTMLWriter.write("<div>\n");
				HTMLWriter.write("<p class='date'></p>\n");
				HTMLWriter.write("<p class='time'></p>\n");
				HTMLWriter.write("<p class='text'></p>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitItem(BrochureParser.ItemContext ctx) {
			try {
				HTMLWriter.write("</div>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterImage(BrochureParser.ImageContext ctx) {
			try {
				HTMLWriter.write("<div>\n");
				HTMLWriter.write("<img src='' class='img'></img>\n");
				HTMLWriter.write("<p></p>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void exitImage(BrochureParser.ImageContext ctx) {
			try {
				HTMLWriter.write("</div>\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override public void enterTitles(BrochureParser.TitlesContext ctx) { }
		@Override public void exitTitles(BrochureParser.TitlesContext ctx) { }
		@Override public void enterHeaders(BrochureParser.HeadersContext ctx) { }
		@Override public void exitHeaders(BrochureParser.HeadersContext ctx) { }
		@Override public void enterFooters(BrochureParser.FootersContext ctx) { }
		@Override public void exitFooters(BrochureParser.FootersContext ctx) { }
		@Override public void enterBodys(BrochureParser.BodysContext ctx) { }
		@Override public void exitBodys(BrochureParser.BodysContext ctx) { }
		@Override public void enterItems(BrochureParser.ItemsContext ctx) { }
		@Override public void exitItems(BrochureParser.ItemsContext ctx) { }
		@Override public void enterImages(BrochureParser.ImagesContext ctx) { }
		@Override public void exitImages(BrochureParser.ImagesContext ctx) { }
		@Override public void enterEveryRule(ParserRuleContext ctx) { }
		@Override public void exitEveryRule(ParserRuleContext ctx) { }
		@Override public void visitTerminal(TerminalNode node) { }
		@Override public void visitErrorNode(ErrorNode node) { }
	}