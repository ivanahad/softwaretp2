import java.util.LinkedList;

/**
 * Created by ndizera on 23/11/2016.
 */
public class Map {
    private static Map onlyInstance = new Map();
    private LinkedList<NaturalDisaster> naturalDisasters;
    private LinkedList<SafePlace> safePlaces;
    private PersonLocation personLocation;

    private Map(){
        this.personLocation = null;
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
        if(personLocation == null)
            return "";
        return Language.getString("your_position") + personLocation.toString() + "\n";
    }

    public static void addNaturalDisaster(NaturalDisaster naturalDisaster){
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

    public static PersonLocation getPersonLocation() {
        return onlyInstance.personLocation;
    }

    public static void setPersonLocation(PersonLocation personLocation) {
        onlyInstance.personLocation = personLocation;
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
