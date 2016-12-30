package be.ucl.ingi.lingi2252;

/**
 * Created by Ivan on 24/11/16.
 */
public class NDFactory extends AbstractFactory{

    @Override
    public NaturalDisaster getNaturalDisaster(String type, Object... args) {
        if(type == null){
            return null;
        }

        int x = (Integer) args[0];
        int y = (Integer) args[1];
        double radius = (Double) args[2];
        double magnitude = 3.0;
        if(args.length == 4)
            magnitude = (Double) args[3];

        if(type.equalsIgnoreCase("earthquake")){
            return new Earthquake(x, y, radius, magnitude);
        } else if(type.equalsIgnoreCase("flood")){
            return new Flood(x, y, radius);
        } else if(type.equalsIgnoreCase("naturaldisaster")){
            return new NaturalDisaster(x, y, radius);
        }
        else{
            return null;
        }
    }

    @Override
    public SafePlace getSafePlace(String type, Object... args) {
        return null;
    }

    @Override
    public EntityWithLocation getObject(String type, Object... args) {
        return getNaturalDisaster(type, args);
    }
}
