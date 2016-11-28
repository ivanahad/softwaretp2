import java.io.*;
import java.util.*;

// Note : Inspired by Crunchify.com's properties file explanation

/**
 * Created by Ivan & Eddy
 */
public class ConfigProperty {

    //creates the only instance of the object
    private static ConfigProperty onlyInstance = new ConfigProperty();

    //get the only existing instance of the object
    public static ConfigProperty getInstance(){
        return onlyInstance;
    }

    public static String getPropValue(String key){
        return onlyInstance.prop.getProperty(key);
    }


    private Properties prop;

    private ConfigProperty(){
        prop = new Properties();
        initializeConfiguration();
    }


    private void initializeConfiguration(){
        initializeConfiguration("config.properties");
    }

    private void initializeConfiguration(String filename){
        InputStream input = null;
        try {
            ClassLoader classLoader = ConfigProperty.class.getClassLoader();
            input = new FileInputStream(classLoader.getResource(filename).getFile());
            prop.load(input);

        } catch (IOException | NullPointerException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
