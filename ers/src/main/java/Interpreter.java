/**
 * Created by ndizera on 11/24/16.
 */
public class Interpreter {

    public static void interpret(String command){
        if(getIsAddLocationExpression().interpret(command)){
            addLocationToMap(getLocationTypeFromCommand(command), getLocationFromCommand(command));
        } else if (getIsRemoveLocationExpression().interpret(command)){

            removeLocationFromMap(getLocationTypeFromCommand(command), getLocationFromCommand(command));
        }

    }

    private static Location getLocationFromCommand(String command){
        String arguments[] = command.split(" ");
        String type = arguments[0];
        int x = Integer.parseInt(arguments[2]);
        int y = Integer.parseInt(arguments[3]);
        int radius = Integer.parseInt(arguments[4]);
        return LocationFactory.getLocation(type, x, y, radius);
    }

    private static String getLocationTypeFromCommand(String command){
        String arguments[] = command.split(" ");
        return arguments[0];
    }

    private static void addLocationToMap(String locationType, Location location){
        switch (locationType){
            case "safe_place":
                Map.addSafePlace((SafePlace) location);
                break;
            default:
                Map.addNaturalDisaster((NaturalDisaster) location);
                break;
        }
    }

    private static void removeLocationFromMap(String locationType, Location location){
        switch (locationType){
            case "safe_place":
                Map.removeSafePlace((SafePlace) location);
                break;
            default:
                Map.removeNaturalDisaster((NaturalDisaster) location);
                break;
        }
    }

    private static Expression getIsAddLocationExpression(){
        return new AndExpression(getIsLocation(), getIsAddExpression());
    }

    private static Expression getIsRemoveLocationExpression(){
        return new AndExpression(getIsLocation(), getIsRemoveExpression());
    }

    private static Expression getIsLocation(){
        return new OrExpression(getIsNaturalDisasterExpression(), getIsSafePlaceExpression());
    }

    private static Expression getIsNaturalDisasterExpression(){
        Expression naturalDisaster = new TerminalExpression("natural_disaster");
        Expression flood = new TerminalExpression("flood");
        Expression earthquake = new TerminalExpression("earthquake");
        return new OrExpression(new Expression[]{naturalDisaster, flood, earthquake});
    }

    private static Expression getIsSafePlaceExpression(){
        Expression safeplace = new TerminalExpression("safe_place");
        return safeplace;
    }

    private static Expression getIsAddExpression(){
        Expression add = new TerminalExpression("add");
        return add;
    }

    private static Expression getIsRemoveExpression(){
        Expression remove = new TerminalExpression("remove");
        return remove;
    }

    private static Expression getIsSetExpression(){
        Expression set = new TerminalExpression("set");
        return set;
    }
}
