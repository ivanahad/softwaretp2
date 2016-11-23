package ers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class testLanguage {
	@Test
	public void testSwitchLanguage(){
		String langFr = "fr";
		Language.switchLanguage(langFr);
		assertEquals(Language.getCurrentLanguage(), langFr);

		String unsupportedLanguage = "unsupported";
		Language.switchLanguage(unsupportedLanguage);
		assertNotSame(Language.getCurrentLanguage(), unsupportedLanguage);
	}

	@Test
	public void testUpdateRessourceBundle(){
		Language.switchLanguage("en");
		assertEquals(Language.getString("language"), "english");

		Language.switchLanguage("fr");
		assertEquals(Language.getString("language"), "français");
	}
}
