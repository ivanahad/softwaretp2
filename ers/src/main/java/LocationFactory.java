/**
 * Created by Ivan on 24/11/16.
 */
public class LocationFactory {

    public static Location getLocation(String locationType, int x, int y, double radius){
        if(locationType == null){
            return null;
        }
        if(locationType.equalsIgnoreCase("earthquake")){
            return new Earthquake(x, y, radius);
        } else if(locationType.equalsIgnoreCase("flood")){
            return new Flood(x, y, radius);
        } else if(locationType.equalsIgnoreCase("natural_disaster")){
            return new NaturalDisaster(x, y, radius);
        } else if(locationType.equalsIgnoreCase("safe_place")){
            return new SafePlace(x, y, radius);
        } else {
            return new Location(x, y, radius);
        }
    }

    public static Location getLocation(String locationType, int x, int y){
        return getLocation(locationType, x, y, 0);
    }
}
