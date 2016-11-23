package ers;

/**
 * Created by ndizera on 23/11/2016.
 */
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
public class testCoordinate {
    @Test
    public void testEqualsTrue(){
        Coordinate coordinate1 = new Coordinate(5, 4);
        Coordinate coordinate2 = new Coordinate(5, 4);
        assertTrue(coordinate1.equals(coordinate2));
    }

    @Test
    public void testEqualsFalse(){
        Coordinate coordinate1 = new Coordinate(5, 4);
        Coordinate coordinate2 = new Coordinate(4, 4);
        assertFalse(coordinate1.equals(coordinate2));
    }
}
