import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ndizera on 11/24/16.
 */
public class testInterpreter {
    @Before
    /*
    public void setUp(){
        PersonLocation personLocation = testPersonLocation.createPersonLocation(0, 0);
        Map.setPersonLocation(personLocation);
    }
    */

    @After
    public void tearDown(){
        Map.reset();
    }

    @Test
    public void testAddDangerousZone(){
        String command = "add naturaldisaster naturaldisaster 4 5 10";
        Interpreter.interpret(command);

        Assert.assertEquals(Map.getLocations().size(), 1);
        System.out.println(Map.getMap());

    }


}
