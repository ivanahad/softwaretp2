/**
 * Created by Ivan & Eddy
 */

import be.ucl.ingi.lingi2252.Earthquake;
import be.ucl.ingi.lingi2252.Flood;
import be.ucl.ingi.lingi2252.NDFactory;
import be.ucl.ingi.lingi2252.NaturalDisaster;
import jdk.nashorn.internal.objects.NativeUint8Array;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testNDFactory {


    @Test
    public void testGetFlood(){
        NDFactory factory = new NDFactory();
        Flood expected = new Flood(1, 1, 0);
        Flood actual = (Flood) factory.getNaturalDisaster("flood", 1, 1, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEarthquake(){
        NDFactory factory = new NDFactory();
        Earthquake expected = new Earthquake(1, 1, 0);
        Earthquake actual = (Earthquake) factory.getNaturalDisaster("earthquake", 1, 1, 0);

        assertEquals(expected, actual);
    }


    @Test
    public void testGetNaturalDisaster(){
        NDFactory factory = new NDFactory();
        NaturalDisaster expected = new NaturalDisaster(1, 1, 0);
        NaturalDisaster actual = (NaturalDisaster) factory.getNaturalDisaster("natural_disaster", 1, 1, 0);

        assertEquals(expected, actual);
    }
}
