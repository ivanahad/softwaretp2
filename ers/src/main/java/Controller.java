/**
 * Created by ndizera on 11/26/16.
 */
public class Controller {
    public static String getSafetyInstructions() {
        String result = NaturalDisaster.giveSafetyInstructions() + "\n";
        if(getHasEarthquakeEnabled().interpret(getEmergencyTypesEnabled()))
            result += Earthquake.giveSafetyInstructions() + "\n";
        if(getHasFloodEnabled().interpret(getEmergencyTypesEnabled()))
            result += Flood.giveSafetyInstructions();
        return result;
    }

    public static String getShortestPathToSafety() {
        if(!getHasGuidingUserEnabled().interpret(getGuidingUserEnabled())){
            SafePlace nearestLocation =  Map.getPersonLocation().nearestLocations((Map.getSafePlaces()));
            if(nearestLocation != null){
                Path path = new Path(Map.getPersonLocation(), nearestLocation);
                return path.givePathInstructions();
            }
        }
        return null;
    }

    public static String getMap() {
        if(!getHasInformLocationsEnbaled().interpret(getInformLocalisationsEnbaled()))
            return Map.getMap();
        return null;
    }

    private static String getGuidingUserEnabled(){
        return ConfigProperty.getPropValue("guidingUser");

    }

    private static String getEmergencyTypesEnabled() {
        return ConfigProperty.getPropValue("emergencyType");
    }

    private static String getInformLocalisationsEnbaled() {
        return ConfigProperty.getPropValue("informLocalisation");
    }

    private static Expression getHasEarthquakeEnabled(){
        return new TerminalExpression("earthquake");
    }

    private static Expression getHasFloodEnabled(){
        return new TerminalExpression("flood");
    }

    private static Expression getHasGuidingUserEnabled(){
        return new TerminalExpression("default");
    }

    private static Expression getHasInformLocationsEnbaled(){
        return new TerminalExpression("default");
    }


}
