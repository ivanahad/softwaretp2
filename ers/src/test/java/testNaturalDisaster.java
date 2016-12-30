import static org.junit.Assert.*;

import be.ucl.ingi.lingi2252.Location;
import be.ucl.ingi.lingi2252.NaturalDisaster;
import org.junit.Test;

public class testNaturalDisaster {
	
	@Test
	public void testIsInDisaster(){
		Location location = new Location(1, 1);

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
		return new NaturalDisaster(x, y, radius);
	}

}
