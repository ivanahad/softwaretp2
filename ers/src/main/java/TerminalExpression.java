/**
 * Created by ndizera on 11/26/16.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context){
        if(context==null)
            return false;
        return context.contains(data);
    }
}