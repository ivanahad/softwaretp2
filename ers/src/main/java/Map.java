import java.util.LinkedList;

/**
 * Created by ndizera & Ivan
 */
public class Map {
    private static Map onlyInstance = new Map();
    private LinkedList<NaturalDisaster> naturalDisasters;
    private LinkedList<SafePlace> safePlaces;

    private Map(){
        this.naturalDisasters = new LinkedList<>();
        this.safePlaces = new LinkedList<>();
    }

    public String toString(){
        return personLocationToString() + naturalDisastersToString() + safePlacesToString();
    }

    public String naturalDisastersToString(){
        if (naturalDisasters.isEmpty())
            return "";
        String result = Language.getString("natural_disasters_locations") + " :\n";
        for(NaturalDisaster naturalDisaster : naturalDisasters){
            result += "\t - " + naturalDisaster.toString() + "\n";
        }
        return result;
    }

    public String safePlacesToString(){
        if (safePlaces.isEmpty())
            return "";
        String result = Language.getString("safe_places_locations") + " :\n";
        for(SafePlace safePlace : safePlaces){
            result += "\t - " +safePlace.toString() + "\n";
        }
        return result;
    }

    public String personLocationToString(){
        if(User.getInstance() == null)
            return "";
        return Language.getString("your_position") + ":  " +  User.getInstance().toString() + "\n";
    }

    public static void addNaturalDisaster(NaturalDisaster naturalDisaster){
        onlyInstance.naturalDisasters.remove(naturalDisaster);
        onlyInstance.naturalDisasters.add(naturalDisaster);
    }

    public static void removeNaturalDisaster(NaturalDisaster naturalDisaster){
        onlyInstance.naturalDisasters.remove(naturalDisaster);
    }

    public static void addSafePlace(SafePlace safePlace){
        onlyInstance.safePlaces.add(safePlace);
    }

    public static void removeSafePlace(SafePlace safePlace){
        onlyInstance.safePlaces.remove(safePlace);
    }

    public static Location getPersonLocation() {
        return User.getLocation();
    }

    public static void setUserLocation(Location userLocation) {
        User.modifLocation(userLocation);
    }

    public static LinkedList<NaturalDisaster> getNaturalDisasters() {
        return onlyInstance.naturalDisasters;
    }

    public static LinkedList<SafePlace> getSafePlaces() {
        return onlyInstance.safePlaces;
    }

    public static String getMap(){
        return onlyInstance.toString();
    }

    public static void reset(){
        onlyInstance = new Map();
    }
}
