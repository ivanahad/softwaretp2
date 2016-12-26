/**
 * Created by ndizera on 11/27/16.
 */
public class Expressions {

    public static boolean isAddExpression(String command){
        Expression expression = new TerminalExpression("add");
        return expression.interpret(command);
    }


}
