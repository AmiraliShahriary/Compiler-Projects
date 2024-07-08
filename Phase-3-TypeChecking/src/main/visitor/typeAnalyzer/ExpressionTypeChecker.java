package main.visitor.typeAnalyzer;

import java.util.ArrayList;
import main.ast.type.Type;
import main.ast.type.notype;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.FloatType;
import main.ast.type.primitiveType.IntType;
import main.visitor.Visitor;
import main.ast.node.expression.BinaryExpression;
import main.ast.node.expression.operators.BinaryOperator;
import main.compileError.CompileError;
import main.compileError.name.UnsupportedOperand;
import main.ast.node.expression.operators.BinaryOperator;
import main.ast.node.expression.operators.UnaryOperator;
public class ExpressionTypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors;
    public Type visit(BinaryExpression binaryExpression) {

        Type tl = binaryExpression.getLeft().accept(this);
        Type tr = binaryExpression.getRight().accept(this);
        BinaryOperator operator = binaryExpression.getBinaryOperator();

        if (tl instanceof notype && tr instanceof notype) {
            return new notype();
        }

        switch (operator) {
            case PLUS, MINUS, MULT, DIV, MOD -> {
                if (tl instanceof IntType && tr instanceof IntType) {
                    return new IntType();
                }
                if (tl instanceof FloatType && tr instanceof FloatType) {
                    return new FloatType();
                }
                if ((tl instanceof notype && (tr instanceof IntType || tr instanceof FloatType)) ||
                        (tr instanceof notype && (tl instanceof IntType || tl instanceof FloatType))) {
                    return new notype();
                }
            }

        }

        typeErrors.add(new UnsupportedOperand(binaryExpression.getLine(), operator.name()));
        return new notype();
    }
}

