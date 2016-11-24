import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

/*
 * This class allows the user to change the language used by the software. The user can choose between English and French.
 */
public class Language {
	private static String currentLanguage = "en";
	private static String[] supportedLanguages = {"en", "fr"};
	private static String filePrefixes = "MessageBundle";
	private static ResourceBundle messages = ResourceBundle.getBundle(filePrefixes, new Locale("en", "US"));


	public static void switchLanguage(String newLanguage){
		if (isSupported(newLanguage))
			currentLanguage = newLanguage;
			updateResourceBundle(newLanguage);
	}

	private static void updateResourceBundle(String language){
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

	private static boolean isSupported(String language){
		for(String lang : supportedLanguages){
			if(lang == language)
				return true;
		}
		return false;
	}

	public static String getCurrentLanguage(){
		return currentLanguage;
	}

	public static String getString(String key){
		return messages.getString(key);
	}
}
