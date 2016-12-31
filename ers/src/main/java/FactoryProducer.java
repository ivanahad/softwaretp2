package be.ucl.ingi.lingi2252;

/**
 * Created by ndizera on 28/12/2016.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase(NaturalDisaster.NATURAL_DISASTER)){
            return new NDFactory();

        }else if(choice.equalsIgnoreCase(SafePlace.SAFEPLACE)){
            return new SafePlaceFactory();
        }
        return null;
    }
}
