/**
 * Created by Ivan on 24/11/16.
 */
public class NDFactory extends AbstractFactory{

    @Override
    NaturalDisaster getNaturalDisaster(String type, Object... args) {
        if(type == null){
            return null;
        }

        int x = (Integer) args[0];
        int y = (Integer) args[1];
        double radius = (Integer) args[2];
        double magnitude = 3.0;
        if(args.length == 4)
            magnitude = (Double) args[3];

        if(type.equalsIgnoreCase("earthquake")){
            return new Earthquake(x, y, radius, magnitude);
        } else if(type.equalsIgnoreCase("flood")){
            return new Flood(x, y, radius);
        } else if(type.equalsIgnoreCase("natural_disaster")){
            return new NaturalDisaster(x, y, radius);
        }
        else{
            return null;
        }
    }

    @Override
    SafePlace getSafePlace(String type, Object... args) {
        return null;
    }
}
