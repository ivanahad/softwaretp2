package ers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testLanguage {
	@Test
	public void testChooseLanguage(){
		
		//a modifier
		Language language1 = new Language("French");
		
		Language language2 = new Language("French");
		language2.chooseLanguage(Language.LanguageID.English);
		System.out.println(language1.getLanguage());
		System.out.println(language2.getLanguage());
		assertEquals(language1, language2);
	}
}
