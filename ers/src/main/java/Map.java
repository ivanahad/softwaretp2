package be.ucl.ingi.lingi2252;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Map {
    private static Map onlyInstance = new Map();
    private HashMap<String, LinkedList<EntityWithLocation>> locationsByType;

    private Map(){
        this.locationsByType = new HashMap<>();
    }


    public static void add(String category, EntityWithLocation object){
        if (!onlyInstance.locationsByType.containsKey(category)){
            onlyInstance.locationsByType.put(category, new LinkedList<>());
        }
        onlyInstance.locationsByType.get(category).add(object);
    }

    public static void remove(String category, EntityWithLocation object){
        onlyInstance.locationsByType.get(category).remove(object);
    }


    public static void update(String category, EntityWithLocation object, EntityWithLocation newObject){
        if(onlyInstance.locationsByType.get(category).contains(object)){
            remove(category, object);
            add(category, newObject);
        }
    }


    public static HashMap<String, LinkedList<EntityWithLocation>> getLocations(){
        return onlyInstance.locationsByType;
    }


    public static String getMap(){
        return onlyInstance.toString();
    }

    public String toString(){
        return personLocationToString() + locationsToString();
    }

    public String locationsToString(){
        Set<String> keys = onlyInstance.locationsByType.keySet();
        String result = "";
        for(String key : keys){
            result = key + " :\n";
            for(EntityWithLocation location : onlyInstance.locationsByType.get(key)){
                result += "\t - " + location.toString() + "\n";
            }
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
        if(!getLocations().containsKey(SafePlace.SAFEPLACE))
            return null;
        List<SafePlace> safePlaces = new LinkedList<>();
        for(Object o : getLocations().get(SafePlace.SAFEPLACE)){
            if (o.getClass() == SafePlace.class)
                safePlaces.add((SafePlace) o);
        }

        double minDistance = Double.MAX_VALUE;
        SafePlace nearestSafePlace = null;
        for (SafePlace safeplace : safePlaces){
            double distance = User.getUserLocation().distanceLocations(safeplace.location);
            if (distance < minDistance){
                minDistance = distance;
                nearestSafePlace = safeplace;
            }
        }
        return nearestSafePlace;
    }
}
