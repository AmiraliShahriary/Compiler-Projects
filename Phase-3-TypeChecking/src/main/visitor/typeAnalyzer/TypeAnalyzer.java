package main.visitor.typeAnalyzer;

import java.util.ArrayList;
import main.ast.node.statement.ForStmt;
import main.compileError.CompileError;
import main.symbolTable.SymbolTable;
import  main.ast.node.statement.ForStmt;
import main.compileError.name.NotBool;
import main.ast.type.Type;
import main.ast.type.notype;
import  main.ast.type.primitiveType.BoolType;
import  main.visitor.typeAnalyzer.ExpressionTypeChecker;

public class TypeAnalyzer {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    public Void visit(ForStmt forStmt) {
        ForStmt.addInit().accept(expressionTypeChecker);
        for (var stmt : ForStmt.getBody()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        Type tl = forStmt.getCondition().accept(expressionTypeChecker);
        if (!(tl instanceof BoolType) && !(tl instanceof notype)) {
            typeErrors.add(new NotBool(forStmt.getLine()));

            return null;
        }
    }
}


