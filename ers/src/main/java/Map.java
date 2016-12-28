import java.util.LinkedList;
import java.util.List;

public class Map {
    private static Map onlyInstance = new Map();
    private LinkedList<Object> locations;

    private Map(){
        this.locations = new LinkedList<>();
    }

    public static void add(Object object){
        onlyInstance.locations.add(object);
    }

    public static void remove(Object object){
        onlyInstance.locations.remove(object);
    }

    public static void update(Object object, Object newObject){
        if( onlyInstance.locations.contains(object)){
            remove(object);
            add(newObject);
        }
    }


    public static LinkedList<Object> getLocations(){
        return onlyInstance.locations;
    }


    public static String getMap(){
        return onlyInstance.toString();
    }

    public String toString(){
        return personLocationToString() + locationsToString();
    }

    public String locationsToString(){
        String result = Language.getString("locations") + " :\n";
        for(Object location : locations){
            result += "\t - " + location.toString() + "\n";
        }
        return result;
    }

    public String personLocationToString(){
        if(User.getInstance() == null)
            return "";
        return Language.getString("your_position") + ":  " +  User.getInstance().toString() + "\n";
    }

    public static void reset(){
        onlyInstance = new Map();
    }

    public static SafePlace nearestSafePlace(){
        List<SafePlace> safePlaces = new LinkedList<>();
        for(Object o : getLocations()){
            if (o.getClass() == SafePlace.class)
                safePlaces.add((SafePlace) o);
        }

        double minDistance = Double.MAX_VALUE;
        SafePlace nearestSafePlace = null;
        for (SafePlace safeplace : safePlaces){
            double distance = User.getLocation().distanceLocations(safeplace.location);
            if (distance < minDistance){
                minDistance = distance;
                nearestSafePlace = safeplace;
            }
        }
        return nearestSafePlace;
    }
}
