/**
 * Created by ndizera on 11/26/16.
 */
public class Controller {
    public static String getSafetyInstructions() {
        //TODO controller delegates permission
        String result = NaturalDisaster.giveSafetyInstructions() + "\n";
            result += Earthquake.giveSafetyInstructions() + "\n";
            result += Flood.giveSafetyInstructions();
        return result;

    }

    public static String getShortestPathToSafety() {

        return null;
    }

    public static String getMap() {
            return Map.getMap();
    }

    public static String processCommand(String command) {
        Interpreter.interpret(command);
        return "Ok";
    }


}
