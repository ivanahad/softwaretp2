/**
 * Created by Ivan on 24/11/16.
 */
public class NDFactory {

    public static NaturalDisaster getND(String disasterType, Object ...args){
        if(disasterType == null){
            return null;
        }

        int x = (Integer) args[0];
        int y = (Integer) args[1];
        double radius = (Integer) args[2];
        double magnitude = 3.0;
        if(args.length == 4)
            magnitude = (Double) args[3];

        if(disasterType.equalsIgnoreCase("earthquake")){
            return new Earthquake(x, y, radius, magnitude);
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
