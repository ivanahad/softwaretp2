/**
 * Created by ndizera on 23/11/2016.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class testMap {
    private Map map;

    @Before
    public void setUp(){
        PersonLocation personLocation = testPersonLocation.createPersonLocation(0, 0);
        map = new Map(personLocation);
    }

    @After
    public void tearDown(){
        map = null;
    }

    @Test
    public void testaddRemoveNaturalDisaster(){
        LinkedList<NaturalDisaster> naturalDisasters = map.getNaturalDisasters();

        NaturalDisaster naturalDisaster1 = testNaturalDisaster.createNaturalDisaster(0, 0, 2);
        NaturalDisaster naturalDisaster2 = testNaturalDisaster.createNaturalDisaster(1, 5, 2);

        map.addNaturalDisaster(naturalDisaster1);
        map.addNaturalDisaster(naturalDisaster2);
        assertTrue(naturalDisasters.contains(naturalDisaster1));
        assertTrue(naturalDisasters.contains(naturalDisaster2));

        NaturalDisaster naturalDisasterToRemove = testNaturalDisaster.createNaturalDisaster(0, 0, 2);

        map.removeNaturalDisaster(naturalDisasterToRemove);
        assertFalse(naturalDisasters.contains(naturalDisaster1));

    }

    @Test
    public void testaddRemoveSafePlace(){
        LinkedList<SafePlace> safePlaces = map.getSafePlaces();

        SafePlace safePlace1 = testSafePlace.createSafePlace(0, 0, 5, "Safe place");
        SafePlace safePlace2 = testSafePlace.createSafePlace(1, 8, 5, "Safe place");

        map.addSafePlace(safePlace1);
        map.addSafePlace(safePlace2);
        assertTrue(safePlaces.contains(safePlace1));
        assertTrue(safePlaces.contains(safePlace2));

        SafePlace safePlaceToRemove = testSafePlace.createSafePlace(0, 0, 5, "Safe place");

        map.removeSafePlace(safePlaceToRemove);
        assertFalse(safePlaces.contains(safePlace1));


    }

}