package be.ucl.ingi.lingi2252;

/**
 * Created by ndizera on 11/26/16.
 */
public class Controller {
    public static String getSafetyInstructions() {
        //TODO
        String result = NaturalDisaster.giveSafetyInstructions() + "\n";
            result += Earthquake.giveSafetyInstructions() + "\n";
            result += Flood.giveSafetyInstructions();
        return result;

    }

    public static String getShortestPathToSafety() {
        SafePlace safePlace = ProxyMap.getNearestPlace();
        if (safePlace == null)
            return null;
        return Path.givePathInstructions(User.getUserLocation(), safePlace.getLocation());
    }

    public static String getMap() {
            return ProxyMap.getMap();
    }

    public static String processCommand(String command) {
        Interpreter.interpret(command);
        return "Ok";
    }


}
