package ers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testLanguage {
	@Test
	public void testChooseLanguage(){
		
		Language language1 = new Language(Language.LanguageID.French);
		language1.chooseLanguage(Language.LanguageID.English);
		assertEquals(language1.getLanguage(), Language.LanguageID.English);
	}
}
