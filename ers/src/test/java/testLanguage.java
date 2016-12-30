import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import be.ucl.ingi.lingi2252.Language;
import org.junit.After;
import org.junit.Test;

public class testLanguage {
	@After
	public void tearDown(){
		Language.switchLanguage("en");
	}

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
		assertEquals(Language.getString("language"), "francais");
	}
}
