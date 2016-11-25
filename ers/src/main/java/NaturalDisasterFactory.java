/**
 * Created by Ivan on 24/11/16.
 */
public class NaturalDisasterFactory {

    //use getShape method to get object of type shape
    /*
    public NaturalDisaster getDisaster(String disasterType, Location location){
        if(disasterType == null){
            return null;
        }
        if(disasterType.equalsIgnoreCase("naturaldisaster")){
            return new NaturalDisaster(location);

        } else if(disasterType.equalsIgnoreCase("flood")){
            return new Flood(location);

        } else if(disasterType.equalsIgnoreCase("earthquake")){
            return new Earthquake(location);
        }
        return null;
    }
    */
    public NaturalDisaster getDisaster(String disasterType, Location location){
        if(disasterType == null){
            return null;
        }
        if(disasterType.equalsIgnoreCase("earthquake")){
            return new Earthquake(location);
        } else if(disasterType.equalsIgnoreCase("flood")){
            return new Flood(location);

        } else if(disasterType.equalsIgnoreCase("naturaldisaster")){
        return new NaturalDisaster(location);
        }
        return null;
    }

    public NaturalDisaster getDisaster(String disasterType, int x, int y, double radius){
        Location location = new Location(x, y, radius);
        return getDisaster(disasterType, location);
    }
}
