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

    public static Expression getIsSetCenterExpression(){
        return new AndExpression(new Expression[]{getIsLocation(), getIsSetExpression(), getCenterExpression()});
    }

    public static Expression getIsSetRadiusExpression(){
        return new AndExpression(new Expression[]{getIsLocation(), getIsSetExpression(), getRadiusExpression()});
    }

    public static Expression getIsSetScaleExpression(){
        return new AndExpression(new Expression[]{containsEarthquake(), getIsSetExpression(), getScaleExpression()});
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

    public static Expression getCenterExpression(){
        Expression center = new TerminalExpression("center");
        return center;
    }

    public static Expression getRadiusExpression(){
        Expression radius = new TerminalExpression("radius");
        return radius;
    }

    public static Expression getScaleExpression(){
        Expression scale = new TerminalExpression("scale");
        return scale;
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
