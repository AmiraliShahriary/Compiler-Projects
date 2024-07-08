package main.ast.node.expression.values;

import main.visitor.IVisitor;

public class TradeValue extends Value {
    private String constant;

    public TradeValue(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
