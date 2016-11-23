package ers;

import static org.junit.Assert.*;

import org.junit.Test;

public class testNaturalDisaster {
	
	@Test
	public void testIsInDisaster(){
		Coordinate coordinate = new Coordinate(1,1);
		Location location = new Location(coordinate);
		
		Coordinate coordinateDisaster = new Coordinate(0,0);
		Location disasterLocation = new Location(coordinateDisaster, 0.5);
		NaturalDisaster disaster = new NaturalDisaster(disasterLocation);
		
		assertFalse(disaster.isInDisaster(location));
		
		Coordinate coordinateDisaster2 = new Coordinate(0,0);
		Location disasterLocation2 = new Location(coordinateDisaster2, 2);
		NaturalDisaster disaster2 = new NaturalDisaster(disasterLocation2);
		
		assertTrue(disaster2.isInDisaster(location));
	}
}
