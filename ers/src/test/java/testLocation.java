import static org.junit.Assert.*;

import org.junit.Test;

public class testLocation {
	
	
	@Test
	public void distanceLocationsWithoutRadius(){
		Coordinate coordinate = new Coordinate(0,0);
		Location location = new Location(coordinate);
		
		Coordinate coordinateOther = new Coordinate(3,4);
		Location otherLocation = new Location(coordinateOther);
		assertEquals(location.distanceLocations(otherLocation), 5.0, 0.001);	
	}

	@Test
	public void distanceLocationsWithRadius(){
		Coordinate coordinate = new Coordinate(0,0);
		Location location = new Location(coordinate, 1);

		Coordinate coordinateOther = new Coordinate(3,4);
		Location otherLocation = new Location(coordinateOther, 1);
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
