/**
 * Created by Ivan & Eddy
 */

import jdk.nashorn.internal.objects.NativeUint8Array;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testNDFactory {

    @Test
    public void testGetFlood(){
        Flood expected = new Flood(1, 1, 0);
        Flood actual = (Flood) NDFactory.getND("flood", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEarthquake(){
        Earthquake expected = new Earthquake(1, 1, 0);
        Earthquake actual = (Earthquake) NDFactory.getND("earthquake", 1, 1, 0);

        assertEquals(expected, actual);
    }


    @Test
    public void testGetNaturalDisaster(){
        NaturalDisaster expected = new NaturalDisaster(1, 1, 0);
        NaturalDisaster actual = (NaturalDisaster) NDFactory.getND("natural_disaster", 1, 1, 0);

        assertEquals(expected, actual);
    }
}
