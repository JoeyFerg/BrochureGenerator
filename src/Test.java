import org.antlr.v4.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("test.txt");
        ActionsLexer lexer = new ActionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ActionsParser parser = new ActionsParser(tokens);

        parser.start();
    }
}