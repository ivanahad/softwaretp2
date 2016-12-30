package be.ucl.ingi.lingi2252;

/**
 * Created by ndizera on 28/12/2016.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("naturaldisaster")){
            return new NDFactory();

        }else if(choice.equalsIgnoreCase("safeplace")){
            return new SafePlaceFactory();
        }
        return null;
    }
}
