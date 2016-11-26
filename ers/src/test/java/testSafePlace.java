/**
 * Created by ndizera on 23/11/2016.
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class testSafePlace {

    @Test
    public void testEqualsTrue(){
        SafePlace safePlace1 = createSafePlace(0 ,0, 5, "A safe Place");
        SafePlace safePlace2 = createSafePlace(0 ,0, 5, "A safe Place");
        assertTrue(safePlace1.equals(safePlace2));
    }

    @Test
    public void testEqualsFalse(){
        SafePlace safePlace1 = createSafePlace(0 ,0, 5, "A safe Place");
        SafePlace safePlace2 = createSafePlace(0 ,0, 5, "Not so safe");
        assertFalse(safePlace1.equals(safePlace2));
    }

    public static SafePlace createSafePlace(int x, int y, double radius, String description){
        return new SafePlace(x, y, radius, description);
    }
}
