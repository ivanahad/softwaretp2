package ers;

import java.io.*;
import java.util.*;

// Note : Inspired by Crunchify.com's properties file explanation

public class GetConfigProperties {
	String result = "";
	InputStream inputStream;
 
	public String getPropValues() throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			String naturalDisaster = prop.getProperty("naturalDisaster");
			String typeInstruc = prop.getProperty("typeInstruc");
			String informLocation = prop.getProperty("informLocation");
			String language = prop.getProperty("Language");
 
			result = "Config List = " + naturalDisaster + ", " + typeInstruc + ", " + informLocation + ", " + language;
			System.out.println(result + "\nProgram Ran on " + time);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}
