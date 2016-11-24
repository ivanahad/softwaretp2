import jdk.nashorn.internal.runtime.regexp.joni.Config;

import java.io.*;
import java.util.*;

// Note : Inspired by Crunchify.com's properties file explanation

/**
 * Created by Ivan & Eddy
 */
public class ConfigProperty {

    private Properties prop;
    private InputStream input;

    private ConfigProperty(){
        prop = new Properties();
        input = null;
    }

    //creates the only instance of the object
    private static ConfigProperty onlyInstance = new ConfigProperty();

    //get the only existing instance of the object
    public static ConfigProperty getInstance(){
        return onlyInstance;
    }

    public static void initializeConfiguration(){
        initializeConfiguration("config.properties");
    }

    public static void initializeConfiguration(String filename){
        try {
            ClassLoader classLoader = ConfigProperty.class.getClassLoader();
            onlyInstance.input = new FileInputStream(classLoader.getResource(filename).getFile());
            onlyInstance.prop.load(onlyInstance.input);

        } catch (IOException | NullPointerException ex) {
            ex.printStackTrace();
        } finally {
            if (onlyInstance.input != null) {
                try {
                    onlyInstance.input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getPropValue(String key){
        return onlyInstance.prop.getProperty(key);
    }

}
