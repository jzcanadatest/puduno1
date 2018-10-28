// Generated from Micro.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroParser}.
 */
public interface MicroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MicroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MicroParser.ProgramContext ctx);
}