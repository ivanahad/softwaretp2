package ers;

import java.io.*;
import java.util.*;

// Note : Inspired by Crunchify.com's properties file explanation

public class ConfigProperty {


    Properties prop = new Properties();
    InputStream input = null;

    public String getPropValues() throws IOException {

        String letUserChooseLanguage = null;
        String informLocalisation;
        String giveInstruction;
        String guideUserToNearestSafePlace;
        String guideUserToSafePlace;
        String informFriendsAboutSafety;
        String defaultLanguage;

        String result = null;
        try {

            //input = new FileInputStream("./ers/src/main/java/ers/config.properties");
            input = new FileInputStream("/Users/Ivan/Desktop/softwaretp2/ers/src/main/java/ers/config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            letUserChooseLanguage = prop.getProperty("letUserChooseLanguage");
            informLocalisation = prop.getProperty("informLocalisation");
            giveInstruction = prop.getProperty("giveInstruction");
            guideUserToNearestSafePlace = prop.getProperty("guideUserToNearestSafePlace");
            guideUserToSafePlace = prop.getProperty("guideUserToSafePlace");
            informFriendsAboutSafety = prop.getProperty("informFriendsAboutSafety");
            defaultLanguage = prop.getProperty("defaultLanguage");

            result = "The list of properties is :\n" +
                    "letUserChooseLanguage : " + letUserChooseLanguage + ",\n" +
                    "informLocalisation : " + informLocalisation + ",\n" +
                    "giveInstruction : " + giveInstruction + ",\n" +
                    "guideUserToNearestSafePlace : " + guideUserToNearestSafePlace + ",\n" +
                    "guideUserToSafePlace : " + guideUserToSafePlace + ",\n" +
                    "informFriendsAboutSafety : " + informFriendsAboutSafety + ",\n" +
                    "defaultLanguage : " + defaultLanguage;

        } catch (IOException ex) {
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
        System.out.println(result);
        return letUserChooseLanguage;
    }

    public String getOnePropValue(String chosen) throws IOException {
        String result=null;
        try {

            input = new FileInputStream("./ers/src/main/java/ers/config.properties");
            //input = new FileInputStream("/Users/Ivan/Desktop/softwaretp2/ers/src/main/java/ers/config.properties");
            // load a properties file
            prop.load(input);

            // get the property value and print it out

            result = prop.getProperty(chosen);

        } catch (IOException ex) {
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
        System.out.println(result);
        return result;
    }

    /*
    public static void updateConfig(String file){
        Properties config = new Properties();
        OutputStream output = null;
        try {

            output = new FileOutputStream(file);

            // set the properties value
            config.setProperty("letUserChooseLanguage", "ok");
            config.setProperty("informLocalisation", "ok");
            config.setProperty("giveInstruction", "ok");
            config.setProperty("guideUserToNearestSafePlace", "ok");
            config.setProperty("guideUserToSafePlace", "ok");
            config.setProperty("informFriendsAboutSafety", "ok");
            config.setProperty("defaultLanguage", "ok");

                // save properties to project root folder
            config.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        //System.out.println("Config Property Successfully Updated...");
    }
    */

}
