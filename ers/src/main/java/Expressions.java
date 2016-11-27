/**
 * Created by ndizera on 11/27/16.
 */
public class Expressions {

    static Expression getIsAddLocationExpression(){
        return new AndExpression(getIsLocation(), getIsAddExpression());
    }

    static Expression getIsRemoveLocationExpression(){
        return new AndExpression(getIsLocation(), getIsRemoveExpression());
    }

    public static Expression getIsLocation(){
        return new OrExpression(getIsNaturalDisasterExpression(), getIsSafePlaceExpression());
    }

    public static Expression getIsNaturalDisasterExpression(){
        Expression naturalDisaster = new TerminalExpression("natural_disaster");
        Expression flood = new TerminalExpression("flood");
        Expression earthquake = new TerminalExpression("earthquake");
        return new OrExpression(new Expression[]{naturalDisaster, flood, earthquake});
    }

    public static Expression getIsSafePlaceExpression(){
        Expression safeplace = new TerminalExpression("safe_place");
        return safeplace;
    }

    public static Expression getIsAddExpression(){
        Expression add = new TerminalExpression("add");
        return add;
    }

    public static Expression getIsRemoveExpression(){
        Expression remove = new TerminalExpression("remove");
        return remove;
    }

    public static Expression getIsSetExpression(){
        Expression set = new TerminalExpression("set");
        return set;
    }

    static Expression containsEarthquake(){
        return new TerminalExpression("earthquake");
    }

    static Expression containsFlood(){
        return new TerminalExpression("flood");
    }

    static Expression containsDefault(){
        return new TerminalExpression("default");
    }

    static Expression getHasLanguageEnabled(){
        return new TerminalExpression("language");
    }

    static Expression getYesExpression(){
        return new TerminalExpression("yes");
    }
}
