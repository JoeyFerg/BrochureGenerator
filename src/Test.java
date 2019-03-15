import org.antlr.v4.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("inputs/test.txt");
        BrochureLexer lexer = new BrochureLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrochureParser parser = new BrochureParser(tokens);

        parser.start();
    }
}

