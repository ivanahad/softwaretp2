import static org.junit.Assert.*;

import be.ucl.ingi.lingi2252.Location;
import org.junit.Test;

public class testLocation {
	
	
	@Test
	public void distanceLocationsWithoutRadius(){
		Location location = new Location(0, 0);
		Location otherLocation = new Location(4, 3);

		assertEquals(location.distanceLocations(otherLocation), 5.0, 0.001);	
	}

	@Test
	public void distanceLocationsWithRadius(){
		Location location = new Location(0, 0, 1);
		Location otherLocation = new Location(3, 4, 1);

		assertEquals(location.distanceLocations(otherLocation), 3.0, 0.001);
	}

	@Test
	public void testEqualsTrue(){
		Location location1 = new Location(0, 0, 2);
		Location location2 = new Location(0, 0, 2);

		assertTrue(location1.equals(location2));
	}

	@Test
	public void testEqualsFalse(){
		Location location1 = new Location(0, 0, 2);
		Location location2 = new Location(1, 0, 2);

		assertFalse(location1.equals(location2));
	}
}
