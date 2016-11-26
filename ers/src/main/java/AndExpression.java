/**
 * Created by ndizera on 11/26/16.
 */
public class AndExpression implements Expression{
    private Expression[] expressions;

    public AndExpression(Expression[] expressions) {
        this.expressions = expressions;
    }

    public AndExpression(Expression expr1, Expression expr2){
        expressions= new Expression[]{expr1, expr2};
    }

    @Override
    public boolean interpret(String context) {
        for(Expression expr : expressions){
            if (!expr.interpret(context))
                return false;
        }
        return true;
    }
}
