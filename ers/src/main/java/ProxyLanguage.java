package be.ucl.ingi.lingi2252;

/**
 * Created by ndizera on 30/12/2016.
 */
public class ProxyLanguage {

    public static void switchLanguage(String newLanguage){
        if(ConfigProperty.canChangeLanguage())
            Language.switchLanguage(newLanguage);
    }
}
