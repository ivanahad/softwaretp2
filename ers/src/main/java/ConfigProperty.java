import java.io.*;
import java.util.*;

// Note : Inspired by Crunchify.com's properties file explanation

public class ConfigProperty {

    private static Properties prop = new Properties();
    private static InputStream input = null;


    public static void initializeConfiguration(){
        initializeConfiguration("config.properties");
    }

    public static void initializeConfiguration(String filename){
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

    public static String getPropValue(String key){
        return prop.getProperty(key);
    }

}
