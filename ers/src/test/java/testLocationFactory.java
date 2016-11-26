/**
 * Created by Ivan & Eddy
 */

import jdk.nashorn.internal.objects.NativeUint8Array;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testLocationFactory {

    LocationFactory factory;

    @Before
    public void setUp(){
        factory = new LocationFactory();
    }

    @After
    public void tearDown(){
        factory = null;
    }

    @Test
    public void testGetFlood(){
        Flood expected = new Flood(1, 1, 0);
        Flood actual = (Flood) factory.getLocation("flood", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEarthQuake(){
        Earthquake expected = new Earthquake(1, 1, 0);
        Earthquake actual = (Earthquake) factory.getLocation("earthquake", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSafePlace(){
        SafePlace expected = new SafePlace(1, 1, 0);
        SafePlace actual = (SafePlace) factory.getLocation("safeplace", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetNaturalDisaster(){
        NaturalDisaster expected = new NaturalDisaster(1, 1, 0);
        NaturalDisaster actual = (NaturalDisaster) factory.getLocation("naturaldisaster", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetLocation(){
        Location expected = new Location(1, 1, 0);
        Location actual = factory.getLocation("location", 1, 1, 0);

        assertEquals(expected, actual);
    }


}
