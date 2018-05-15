package ast.statementsAndExpressions;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.statements.Statement;
import visitors.Visitor;

public class PostArithmetic extends AbstractExpression implements Statement{

	public Expression expression;
	public String operator;
	private boolean assignsValue;
	
	public PostArithmetic(int line, int column, Expression expression, String operator) {
		super(line, column);
		this.expression = expression;
		this.operator = operator;
	}

	@Override
	public String toString() {
		return expression + operator;
	}

	@Override
	public void setAssignsValue(boolean assignsValue) {
		this.assignsValue = assignsValue;
	}

	@Override
	public boolean getAssignsValue() {
		return this.assignsValue;
	}
	
	// Visitor
	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	} 
	
}
