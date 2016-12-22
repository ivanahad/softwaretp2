/**
 * Created by Ivan on 24/11/16.
 */
public class NDFactory {

    public static NaturalDisaster getND(String disasterType, int x, int y, double radius){
        if(disasterType == null){
            return null;
        }
        if(disasterType.equalsIgnoreCase("earthquake")){
            return new Earthquake(x, y, radius);
        } else if(disasterType.equalsIgnoreCase("flood")){
            return new Flood(x, y, radius);
        } else if(disasterType.equalsIgnoreCase("natural_disaster")){
            return new NaturalDisaster(x, y, radius);
        }
        else{
            return null;
        }
    }

    public static NaturalDisaster getND(String disasterType, int x, int y){
        return getND(disasterType, x, y, 0);
    }
}
