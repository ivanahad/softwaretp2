package be.ucl.ingi.lingi2252;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
/**
 * Created by Ivan & Eddy
 * This class allows the user to change the language used by the software. The user can choose between English and French.
 */
public class Language {
	private String currentLanguage;
	private String[] supportedLanguages;
	private String filePrefixes;
	private ResourceBundle messages;

	//make the constructor private so that this class cannot be instantiated
	private Language(){
		currentLanguage = "en";
		supportedLanguages = new String[]{"en", "fr"};
		filePrefixes = "MessageBundle";
		messages = ResourceBundle.getBundle(filePrefixes, new Locale("en", "US"));
	}


	public static void switchLanguage(String newLanguage){
		if (onlyInstance.isSupported(newLanguage)){
			onlyInstance.currentLanguage = newLanguage;
			onlyInstance.updateResourceBundle(newLanguage);
		}
	}

	private void updateResourceBundle(String language){
		switch(language){
			case "en":
				messages = ResourceBundle.getBundle(filePrefixes, new Locale("en", "US"));
				break;
			case "fr":
				messages = ResourceBundle.getBundle(filePrefixes, new Locale("fr", "FR"));
				break;
			default:
				break;
		}
	}

	private boolean isSupported(String language){
		for(String lang : supportedLanguages){
			if(Objects.equals(lang, language))
				return true;
		}
		return false;
	}

	//get the only existing instance of the object
	public static Language getInstance(){
		return onlyInstance;
	}

	//Get the only instance of the object
	private static Language onlyInstance = new Language();

	//returns the current language set
	public static String getCurrentLanguage(){
		return onlyInstance.currentLanguage;
	}


	//
	public static String getString(String key){
		return onlyInstance.messages.getString(key);
	}

}
