import be.ucl.ingi.lingi2252.Controller;
import be.ucl.ingi.lingi2252.NaturalDisaster;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ndizera on 11/26/16.
 */
public class testController {
    @Test
    public void testGetSafetyInstructions(){
        String actual = Controller.getSafetyInstructions();
        String expected = NaturalDisaster.giveSafetyInstructions() + "\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPath(){
        String actual = Controller.getShortestPathToSafety();
        Assert.assertNull(actual);
    }

    @Test
    public void testGetMap(){
        String actual = Controller.getMap();
        Assert.assertNotNull(actual);

    }
}
