package ers;

import java.util.Objects;

/*
 * This class allows the user to change the language used by the software. The user can choose between English and French.
 */
public class Language {
	private static LanguageID language;
	
	public Language(LanguageID language){
		this.language=language;
	}
	
	public void chooseLanguage(LanguageID lang) {
		switch(lang) {
		case English : language=LanguageID.English; 
		break;
		case French : language=LanguageID.French; 
		break;
		default : language=LanguageID.English; 
		break;
		}
	}
	
	public enum LanguageID {
		English, French
	}
	
	public LanguageID getLanguage() {
		return language;
	}
}
