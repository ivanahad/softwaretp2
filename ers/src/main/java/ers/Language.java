package ers;

import java.util.Objects;

public class Language {
	private static String language;
	
	public Language(String language){
		this.language=language;
	}
	
	public void chooseLanguage(LanguageID lang) {
		switch(lang) {
		case English : language="English"; 
		break;
		case French : language="French"; 
		break;
		default : language="English"; 
		break;
		}
	}
	
	public enum LanguageID {
		English, French
	}
	
	public String getLanguage() {
		return language;
	}
}
