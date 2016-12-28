/**
 * Created by ndizera on 28/12/2016.
 */
public class SafePlaceFactory extends AbstractFactory {
    @Override
    NaturalDisaster getNaturalDisaster(String type, Object... args) {
        return null;
    }

    @Override
    SafePlace getSafePlace(String type, Object ...args){
        if(type == null){
            return null;
        }
        int x = (Integer) args[0];
        int y = (Integer) args[1];
        double radius = (Integer) args[2];

        if(type.equalsIgnoreCase("safeplacee")){
            return new SafePlace(x, y, radius);
        }
        else{
            return null;
        }
    }
}
