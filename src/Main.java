import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lexer lex = new MicroLexer(CharStreams.fromFileName(args[0]));

    }
}
