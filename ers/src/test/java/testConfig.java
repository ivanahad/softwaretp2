/**
 * Created by Ivan on 23/11/16.
 */

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class testConfig {


    @Test
    public void testGetConfig() throws IOException {
        ConfigProperty properties = new ConfigProperty();

        String current = properties.getOnePropValue("letUserChooseLanguage");
        String rightAnswer = "no";

        assertEquals(rightAnswer, current);
    }
}
