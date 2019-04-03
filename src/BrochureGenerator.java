import org.antlr.v4.runtime.*;

public class BrochureGenerator {
    public static void main(String[] args) throws Exception {
        String textFileIn  = args[0];
        String CSSFileIn   = args[1];
        String HTMLFileOut = args[2];

        CharStream input = CharStreams.fromFileName(textFileIn);
        BrochureLexer lexer = new BrochureLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrochureBaseListener listener = new BrochureBaseListener(HTMLFileOut, CSSFileIn);
        BrochureParser parser = new BrochureParser(tokens);

        parser.addParseListener(listener);
        parser.start();
    }
}

