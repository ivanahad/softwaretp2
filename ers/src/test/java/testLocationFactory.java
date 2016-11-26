/**
 * Created by Ivan & Eddy
 */

import jdk.nashorn.internal.objects.NativeUint8Array;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testLocationFactory {

    @Test
    public void testGetFlood(){
        Flood expected = new Flood(1, 1, 0);
        Flood actual = (Flood) LocationFactory.getLocation("flood", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEarthQuake(){
        Earthquake expected = new Earthquake(1, 1, 0);
        Earthquake actual = (Earthquake) LocationFactory.getLocation("earthquake", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSafePlace(){
        SafePlace expected = new SafePlace(1, 1, 0);
        SafePlace actual = (SafePlace) LocationFactory.getLocation("safe_place", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetNaturalDisaster(){
        NaturalDisaster expected = new NaturalDisaster(1, 1, 0);
        NaturalDisaster actual = (NaturalDisaster) LocationFactory.getLocation("natural_disaster", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetLocation(){
        Location expected = new Location(1, 1, 0);
        Location actual = LocationFactory.getLocation("location", 1, 1, 0);

        assertEquals(expected, actual);
    }


}
