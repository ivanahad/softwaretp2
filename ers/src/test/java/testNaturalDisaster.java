import static org.junit.Assert.*;

import org.junit.Test;

public class testNaturalDisaster {
	
	@Test
	public void testIsInDisaster(){
		Coordinate coordinate = new Coordinate(1,1);
		Location location = new Location(coordinate);

		NaturalDisaster disaster = createNaturalDisaster(0, 0, 0.5);
		assertFalse(disaster.isInDisaster(location));

		NaturalDisaster disaster2 = createNaturalDisaster(0, 0, 2);
		assertTrue(disaster2.isInDisaster(location));
	}

	@Test
	public void testEqualTrue(){
		NaturalDisaster naturalDisaster1 = createNaturalDisaster(0, 0, 5);
		NaturalDisaster naturalDisaster2 = createNaturalDisaster(0 ,0 , 5);
		assertTrue(naturalDisaster1.equals(naturalDisaster2));
	}

	@Test
	public void testEqualFalse(){
		NaturalDisaster naturalDisaster1 = createNaturalDisaster(0, 1, 5);
		NaturalDisaster naturalDisaster2 = createNaturalDisaster(0 ,0 , 5);
		assertFalse(naturalDisaster1.equals(naturalDisaster2));
	}

	public static NaturalDisaster createNaturalDisaster(int x, int y, double radius){
		Coordinate coordinateDisaster = new Coordinate(x,y);
		Location disasterLocation = new Location(coordinateDisaster, radius);
		return new NaturalDisaster(disasterLocation);
	}

}
