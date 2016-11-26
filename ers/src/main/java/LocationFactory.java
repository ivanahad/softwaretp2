/**
 * Created by Ivan on 24/11/16.
 */
public class LocationFactory {

    public Location getLocation(String locationType, int x, int y, double radius){
        if(locationType == null){
            return null;
        }
        if(locationType.equalsIgnoreCase("earthquake")){
            return new Earthquake(x, y, radius);
        } else if(locationType.equalsIgnoreCase("flood")){
            return new Flood(x, y, radius);
        } else if(locationType.equalsIgnoreCase("naturaldisaster")){
            return new NaturalDisaster(x, y, radius);
        } else if(locationType.equalsIgnoreCase("safeplace")){
            return new SafePlace(x, y, radius);
        } else {
            return new Location(x, y, radius);
        }
    }

    public Location getLocation(String disasterType, int x, int y){
        return getLocation(disasterType, x, y, 0);
    }
}
