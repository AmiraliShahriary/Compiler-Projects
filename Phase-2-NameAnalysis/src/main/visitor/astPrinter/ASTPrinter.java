package main.visitor.astPrinter;

import main.ast.node.Program;
import main.ast.node.declaration.FunctionDeclaration;
import main.ast.node.declaration.OnInitDeclaration;
import main.ast.node.declaration.OnStartDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.node.statement.Statement;
import main.ast.node.statement.AssignStmt;
import main.ast.node.statement.ContinueBreakStmt;
import main.ast.node.statement.ReturnStmt;
import main.ast.node.statement.IfElseStmt;
import main.ast.node.statement.WhileStmt;
import main.ast.node.statement.ForStmt;
import main.ast.node.statement.TryCatchStmt;
import main.ast.node.statement.ThrowStmt;
import main.ast.node.statement.ExpressionStmt;
import main.visitor.Visitor;

public class ASTPrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line:" + line + ":" + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (VarDeclaration varDeclaration : program.getVars())
            varDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration : program.getFunctions())
            functionDeclaration.accept(this);
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    //TODO: implement other visit methods *************************************************

//    @Override
//    public Void visit(Statement statement) {
//        if (statement instanceof VarDeclaration) {
//            ((VarDeclaration) statement).accept(this);
//        } else if (statement instanceof FunctionDeclaration) {
//            ((FunctionDeclaration) statement).accept(this);
//        } else if (statement instanceof AssignStmt) {
//            ((AssignStmt) statement).accept(this);
//        } else if (statement instanceof ContinueBreakStmt) {
//            ((ContinueBreakStmt) statement).accept(this);
//        } else if (statement instanceof ReturnStmt) {
//            ((ReturnStmt) statement).accept(this);
//        } else if (statement instanceof IfElseStmt) {
//            ((IfElseStmt) statement).accept(this);
//        } else if (statement instanceof WhileStmt) {
//            ((WhileStmt) statement).accept(this);
//        } else if (statement instanceof ForStmt) {
//            ((ForStmt) statement).accept(this);
//        } else if (statement instanceof TryCatchStmt) {
//            ((TryCatchStmt) statement).accept(this);
//        } else if (statement instanceof ThrowStmt) {
//            ((ThrowStmt) statement).accept(this);
//        } else if (statement instanceof ExpressionStmt) {
//            ((ExpressionStmt) statement).accept(this);
//        }
//        // Add more conditions for other statement types as needed
//
//        return null;
//    }

    @Override public Void visit(OnInitDeclaration onInitDeclaration) { //ok
        messagePrinter(onInitDeclaration.getLine(), onInitDeclaration.toString());
        for (Statement statement : onInitDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override public Void visit(OnStartDeclaration onStartDeclaration) { //ok
        messagePrinter(onStartDeclaration.getLine(), onStartDeclaration.toString());
        for (Statement statement : onStartDeclaration.getBody())
            statement.accept(this);
        return null;
    }


    @Override
    public Void visit(VarDeclaration varDeclaration) {
        messagePrinter(varDeclaration.getLine(), varDeclaration.toString());
        if (varDeclaration.getIdentifier() != null)
            varDeclaration.getIdentifier().accept(this);

        return null;
    }



    @Override
    public Void visit(FunctionDeclaration funcDeclaration) { //ok
        messagePrinter(funcDeclaration.getLine(), funcDeclaration.toString());
        for (VarDeclaration varDeclaration : funcDeclaration.getArgs())
            varDeclaration.accept(this);
        for (Statement statement : funcDeclaration.getBody())
            statement.accept(this);
        return null;
    }


    @Override public Void visit(AssignStmt assignStatement) { //ok
        messagePrinter(assignStatement.getLine(), assignStatement.toString());
        if (assignStatement.getLValue() != null) // based on pasha's code
            assignStatement.getLValue().accept(this);

        if (assignStatement.getRValue() != null) // based on pasha's code
            assignStatement.getRValue().accept(this);

        return null;
    }

    @Override public Void visit(ContinueBreakStmt continueBreakStatement) {
        messagePrinter(continueBreakStatement.getLine(), continueBreakStatement.toString());
        return null;
    }

    @Override public Void visit(ReturnStmt returnStatement) { //ok
        messagePrinter(returnStatement.getLine(), returnStatement.toString());
        if (returnStatement.getReturnedExpr() != null)
            returnStatement.getReturnedExpr().accept(this);
        return null;
    }

    @Override public Void visit(IfElseStmt ifStatement) {
        messagePrinter(ifStatement.getLine(), ifStatement.toString());
        ifStatement.getCondition().accept(this);
        for (Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for (Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        return null;
    }

    @Override public Void visit(WhileStmt whileStatement) {
        messagePrinter(whileStatement.getLine(), whileStatement.toString());
        whileStatement.getCondition().accept(this);
        for (Statement statement : whileStatement.getBody())
            statement.accept(this);
        return null;
    }

    @Override public Void visit(ForStmt forStatement) { // ?????????????????????????????????????????????????
        messagePrinter(forStatement.getLine(), forStatement.toString());
        for (Statement statement : forStatement.getInit())
            statement.accept(this);
        forStatement.getCondition().accept(this);
        for (Statement statement : forStatement.getUpdate())
            statement.accept(this);
        for (Statement statement : forStatement.getBody())
            statement.accept(this);
        return null;
    }

    @Override public Void visit(TryCatchStmt tryCatchStatement) {
        messagePrinter(tryCatchStatement.getLine(), tryCatchStatement.toString());
        for (Statement statement : tryCatchStatement.getThenBody())
            statement.accept(this);
        for (Statement statement : tryCatchStatement.getElseBody())
            statement.accept(this);
        return null;
    }

    @Override public Void visit(ThrowStmt throwStatement) {
        messagePrinter(throwStatement.getLine(), throwStatement.toString());
        throwStatement.getReturnedExpr().accept(this);
        return null;
    }






}

