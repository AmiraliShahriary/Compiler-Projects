// Generated from C:/Users/RouterLab/Desktop/Curricular Files/PLC/UTL-Phase1/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UTLParser}.
 */
public interface UTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UTLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UTLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UTLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UTLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(UTLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(UTLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(UTLParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(UTLParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(UTLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(UTLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UTLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UTLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#printCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintCall(UTLParser.PrintCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#printCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintCall(UTLParser.PrintCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(UTLParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(UTLParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(UTLParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(UTLParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(UTLParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(UTLParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(UTLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(UTLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(UTLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(UTLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(UTLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(UTLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(UTLParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(UTLParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#scheduleStatement}.
	 * @param ctx the parse tree
	 */
	void enterScheduleStatement(UTLParser.ScheduleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#scheduleStatement}.
	 * @param ctx the parse tree
	 */
	void exitScheduleStatement(UTLParser.ScheduleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#tradeCombination}.
	 * @param ctx the parse tree
	 */
	void enterTradeCombination(UTLParser.TradeCombinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#tradeCombination}.
	 * @param ctx the parse tree
	 */
	void exitTradeCombination(UTLParser.TradeCombinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#controlBlock}.
	 * @param ctx the parse tree
	 */
	void enterControlBlock(UTLParser.ControlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#controlBlock}.
	 * @param ctx the parse tree
	 */
	void exitControlBlock(UTLParser.ControlBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(UTLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(UTLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#throwExceptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowExceptionStatement(UTLParser.ThrowExceptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#throwExceptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowExceptionStatement(UTLParser.ThrowExceptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(UTLParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(UTLParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#initBlock}.
	 * @param ctx the parse tree
	 */
	void enterInitBlock(UTLParser.InitBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#initBlock}.
	 * @param ctx the parse tree
	 */
	void exitInitBlock(UTLParser.InitBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#startBlock}.
	 * @param ctx the parse tree
	 */
	void enterStartBlock(UTLParser.StartBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#startBlock}.
	 * @param ctx the parse tree
	 */
	void exitStartBlock(UTLParser.StartBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(UTLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(UTLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(UTLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(UTLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UTLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UTLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(UTLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(UTLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(UTLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(UTLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(UTLParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(UTLParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#espetialFunction}.
	 * @param ctx the parse tree
	 */
	void enterEspetialFunction(UTLParser.EspetialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#espetialFunction}.
	 * @param ctx the parse tree
	 */
	void exitEspetialFunction(UTLParser.EspetialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#espetialVariable}.
	 * @param ctx the parse tree
	 */
	void enterEspetialVariable(UTLParser.EspetialVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#espetialVariable}.
	 * @param ctx the parse tree
	 */
	void exitEspetialVariable(UTLParser.EspetialVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(UTLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(UTLParser.AssignContext ctx);
}