package ers;

import java.util.*;
import java.io.*;

public class UpdateConfigProperties {
	String naturalDisaster;
	String typeOfInstruction;
	String informLocationType;
	String language;
	
	public UpdateConfigProperties(String disaster, String typeInstruc, String informLocationType, String language) {
		 
		this.naturalDisaster = disaster;
		this.typeOfInstruction = typeInstruc;
		this.informLocationType = informLocationType;
		this.language = language;
 
		Properties config = new Properties();
		OutputStream output = null;
		try {

			output = new FileOutputStream("/Users/Ivan/Desktop/softwaretp2/ers/src/main/resources/config.properties");

			// set the properties value
			config.setProperty("naturalDisaster", this.naturalDisaster);
			config.setProperty("typeInstruc", this.typeOfInstruction);
			config.setProperty("informLocationType", this.informLocationType);
			config.setProperty("language", this.language);

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
		
}
