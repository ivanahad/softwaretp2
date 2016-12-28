import java.util.LinkedList;

/**
 * Created by ndizera & Ivan
 */
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

    public static Location getPersonLocation() {
        return User.getLocation();
    }

    public static void setUserLocation(Location userLocation) {
        User.modifLocation(userLocation);
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
}
