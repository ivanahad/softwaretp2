package ers;

import static org.junit.Assert.*;

import org.junit.Test;

public class testNaturalDisaster {
	
	@Test
	public void testIsInDisaster(){
		Coordinate coordinate = new Coordinate(1,1);
		Location location = new Location(coordinate);
		
		Coordinate coordinateDisaster = new Coordinate(0,0);
		Location disasterLocation = new Location(coordinateDisaster);
		NaturalDisaster disaster = new NaturalDisaster(disasterLocation, 0.5);
		
		assertFalse(disaster.isInDisaster(location));
		
		Coordinate coordinateDisaster2 = new Coordinate(0,0);
		Location disasterLocation2 = new Location(coordinateDisaster2);
		NaturalDisaster disaster2 = new NaturalDisaster(disasterLocation2, 2);
		
		assertTrue(disaster2.isInDisaster(location));
	}
}
