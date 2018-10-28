import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lexer lex;
        try {
            lex = new MicroLexer(CharStreams.fromFileName(args[0]));
            for (Token token : lex.getAllTokens()) {
                System.out.println("Comment Type: " + lex.getVocabulary().getDisplayName(token.getType()));
                System.out.println("Value: " + token.getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
