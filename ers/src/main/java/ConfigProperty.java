package be.ucl.ingi.lingi2252;

import java.io.*;
import java.util.*;

// Note : Inspired by Crunchify.com's properties file explanation
public class ConfigProperty {

    private static ConfigProperty onlyInstance = new ConfigProperty();


    public static String[] getEmergenciesType(){
        return onlyInstance.getPropValue("emergencyType").split(",");
    }

    public static boolean canChangeLanguage(){
        return onlyInstance.getPropValue("letUserChooseLanguage").equals("yes");
    }

    public static boolean canInformLocalisation(){
        return onlyInstance.getPropValue("informLocalisation").equals("yes");
    }

    public static boolean canGuideUser(){
        return onlyInstance.getPropValue("guidingUser").equals("yes");
    }

    private Properties prop;

    private ConfigProperty(){
        prop = new Properties();
        initializeConfiguration();
    }

    public  String getPropValue(String key){
        return prop.getProperty(key);
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
