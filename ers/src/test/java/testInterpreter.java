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

    }

    @Test
    public void testRemoveDangerousZone(){
        NaturalDisaster naturalDisaster = new NaturalDisaster(4, 5, 10);

        String command = "natural_disaster remove 4 5 10";
        Interpreter.interpret(command);
    }

    @Test
    public void addSafePlace(){
        String command = "safe_place add 4 5 10";
        Interpreter.interpret(command);


    }

    @Test
    public void testRemoveSafePlace(){
        SafePlace safePlace = new SafePlace(4, 5, 10);

        String command = "safe_place remove 4 5 10";
        Interpreter.interpret(command);

    }

    @Test
    public void testSwitchLanguage(){
        String command = "language set fr";
        Interpreter.interpret(command);
        Assert.assertEquals(Language.getCurrentLanguage(), "fr");
        Language.switchLanguage("en");
    }

    @Test
    public void testSetEarthQuakeMagnitude(){
        String command = "earthquake set 4 5 10 15 scale";
        Interpreter.interpret(command);

    }

    @Test
    public void testSetLocationCenter(){
        String command = "safe_place set 4 5 10 new 8 9 10";
        Interpreter.interpret(command);


    }

    @Test
    public void testSetLocationRadius(){
        String command = "safe_place set 4 5 10 new 4 5 15";
        Interpreter.interpret(command);


    }
}
