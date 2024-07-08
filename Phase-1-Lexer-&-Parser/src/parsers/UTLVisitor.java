// Generated from C:/Users/RouterLab/Desktop/Curricular Files/PLC/UTL-Phase1/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(UTLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UTLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(UTLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(UTLParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(UTLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(UTLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#printCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCall(UTLParser.PrintCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(UTLParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(UTLParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(UTLParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(UTLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(UTLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(UTLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(UTLParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#scheduleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleStatement(UTLParser.ScheduleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#tradeCombination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTradeCombination(UTLParser.TradeCombinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#controlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlBlock(UTLParser.ControlBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(UTLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#throwExceptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExceptionStatement(UTLParser.ThrowExceptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(UTLParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#initBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitBlock(UTLParser.InitBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#startBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartBlock(UTLParser.StartBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(UTLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(UTLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UTLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(UTLParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(UTLParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexType(UTLParser.ComplexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#espetialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspetialFunction(UTLParser.EspetialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#espetialVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspetialVariable(UTLParser.EspetialVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(UTLParser.AssignContext ctx);
}