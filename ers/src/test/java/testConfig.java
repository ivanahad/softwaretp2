/**
 * Created by Ivan on 23/11/16.
 */

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class testConfig {


    @Test
    public void testGetPropertyValue() throws IOException {
        ConfigProperty.initializeConfiguration("config.properties");

        assertEquals(ConfigProperty.getPropValue("letUserChooseLanguage"), "no");
        assertEquals(ConfigProperty.getPropValue("guideUserToSafePlace"), "textual");
        assertNull(ConfigProperty.getPropValue("invalidKey"));
    }
}
