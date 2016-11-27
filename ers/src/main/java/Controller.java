/**
 * Created by ndizera on 11/26/16.
 */
public class Controller {
    public static String getSafetyInstructions() {
        String result = NaturalDisaster.giveSafetyInstructions() + "\n";
        if(Expressions.containsEarthquake().interpret(getEmergencyTypesOption()))
            result += Earthquake.giveSafetyInstructions() + "\n";
        if(Expressions.containsFlood().interpret(getEmergencyTypesOption()))
            result += Flood.giveSafetyInstructions();
        return result;
    }

    public static String getShortestPathToSafety() {
        if(!Expressions.containsDefault().interpret(getGuidingUserEnabled())){
            SafePlace nearestLocation =  Map.getPersonLocation().nearestLocations((Map.getSafePlaces()));
            if(nearestLocation != null){
                Path path = new Path(Map.getPersonLocation(), nearestLocation);
                return path.givePathInstructions();
            }
        }
        return null;
    }

    public static String getMap() {
        if(!Expressions.containsDefault().interpret(getInformLocalisationsOption()))
            return Map.getMap();
        return null;
    }

    public static String processCommand(String command) {
        if(!(Expressions.containsFlood().interpret(command) && Expressions.containsFlood().interpret(getEmergencyTypesOption())))
            return "Denied";
        if(!(Expressions.containsEarthquake().interpret(command) && Expressions.containsEarthquake().interpret(getEmergencyTypesOption())))
            return "Denied";
        if(!(Expressions.getHasLanguageEnabled().interpret(command) && Expressions.getYesExpression().interpret(getSetLanguageOption())))
            return "Denied";
        Interpreter.interpret(command);
        return "Ok";
    }

    private static String getGuidingUserEnabled(){
        return ConfigProperty.getPropValue("guidingUser");

    }

    private static String getEmergencyTypesOption() {
        return ConfigProperty.getPropValue("emergencyType");
    }

    private static String getInformLocalisationsOption() {
        return ConfigProperty.getPropValue("informLocalisation");
    }

    private static String getSetLanguageOption(){
        return ConfigProperty.getPropValue("letUserChooseLanguage");
    }

}
