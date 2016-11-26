/**
 * Created by Ivan & Eddy
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testFactory {

    @Test
    public void testGetDisaster() {
        NaturalDisasterFactory factory = new NaturalDisasterFactory();

        Location location = new Location(1, 1, 2.0);

        Flood floodtest = new Flood(location);
        NaturalDisaster naturaltest = new NaturalDisaster(location);
        Earthquake testEarthquake = new Earthquake(location);

        Flood factoryflood = (Flood) factory.getDisaster("flood", location);
        Earthquake factoryearthquake = (Earthquake) factory.getDisaster("earthquake", location);
        NaturalDisaster factorynd = factory.getDisaster("naturaldisaster", location);

        assertEquals(floodtest, factoryflood);
        assertEquals(testEarthquake, factoryearthquake);
        assertEquals(naturaltest, factorynd);
    }


}
