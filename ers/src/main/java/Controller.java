/**
 * Created by ndizera on 11/26/16.
 */
public class Controller {
    public static String getSafetyInstructions() {
        return NaturalDisaster.giveSafetyInstructions() + "\n" + Earthquake.giveSafetyInstructions() + "\n" +
                Flood.giveSafetyInstructions();
    }

    public static String getShortestPathToSafety() {
        return null;
    }

    public static String getMap() {
        return null;
    }
}
