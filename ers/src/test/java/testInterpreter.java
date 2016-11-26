import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ndizera on 11/24/16.
 */
public class testInterpreter {
    @Before
    public void setUp(){
        PersonLocation personLocation = testPersonLocation.createPersonLocation(0, 0);
        Map.setPersonLocation(personLocation);
    }

    @After
    public void tearDown(){
        Map.reset();
    }

    @Test
    public void testAddDangerousZone(){
        String command = "dangerous_zone add 4 5 10";
        Interpreter.interpret(command);
        Assert.assertEquals(Map.getNaturalDisasters().size(), 1);

        NaturalDisaster naturalDisaster = new NaturalDisaster(4, 5, 10);
        Assert.assertEquals(Map.getNaturalDisasters().getFirst(), naturalDisaster);
    }

    @Test
    public void testRemoveDangerousZone(){
        NaturalDisaster naturalDisaster = new NaturalDisaster(4, 5, 10);
        Map.addNaturalDisaster(naturalDisaster);

        String command = "dangerous_zone remove 4 5 10";
        Interpreter.interpret(command);
        Assert.assertEquals(Map.getNaturalDisasters().size(), 0);
    }

    @Test
    public void addSafePlace(){
        String command = "safe_place add 4 5 10";
        Interpreter.interpret(command);
        Assert.assertEquals(Map.getSafePlaces().size(), 1);

        SafePlace safePlace = new SafePlace(4, 5, 10);
        Assert.assertEquals(Map.getSafePlaces().getFirst(), safePlace);
    }

    @Test
    public void testRemoveSafePlace(){
        SafePlace safePlace = new SafePlace(4, 5, 10);
        Map.addSafePlace(safePlace);

        String command = "safe_place remove 4 5 10";
        Interpreter.interpret(command);
        Assert.assertEquals(Map.getSafePlaces().size(), 0);
    }
}
