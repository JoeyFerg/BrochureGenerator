import org.antlr.v4.runtime.*;

public class BrochureGenerator {
    public static void main(String[] args) throws Exception {
        String inputFile = args[0];
        String HTMLFile = args[1];

        CharStream input = CharStreams.fromFileName(inputFile);
        BrochureLexer lexer = new BrochureLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrochureBaseListener listener = new BrochureBaseListener(HTMLFile);
        BrochureParser parser = new BrochureParser(tokens);

        parser.addParseListener(listener);
        parser.start();
    }
}

