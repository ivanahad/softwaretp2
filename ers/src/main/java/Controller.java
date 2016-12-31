package be.ucl.ingi.lingi2252;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by ndizera on 11/26/16.
 */
public class Controller {
    public static String getSafetyInstructions() {
        HashMap<String, LinkedList<EntityWithLocation>> locations = Map.getLocations();
        String result = NaturalDisaster.giveSafetyInstructions() + "\n";
        if(locations.containsKey(Earthquake.EARTHQUAKE) && locations.get(Earthquake.EARTHQUAKE).size()>0)
            result += Earthquake.giveSafetyInstructions() + "\n";
        if(locations.containsKey(Flood.FLOOD) && locations.get(Flood.FLOOD).size()>0)
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
