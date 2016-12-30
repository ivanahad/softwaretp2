import be.ucl.ingi.lingi2252.Location;
import be.ucl.ingi.lingi2252.Path;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by ndizera on 10/25/16.
 */
public class testPath {
    @Test
    public void testgivePathInstructions(){
        Location location1 = createLocation(0, 0);
        Location location2 = createLocation(0, 5);

        assertEquals(Path.givePathInstructions(location1, location2), "Go in direction of N");

        location1 = createLocation(1, 4);
        location2 = createLocation(6, 5);

        assertEquals(Path.givePathInstructions(location1, location2), "Go in direction of NE");

        location1 = createLocation(1, 4);

        assertEquals(Path.givePathInstructions(location1, location1), "You've reached the destination!");

    }


    public static Location createLocation(int x, int y){
        return new Location(x, y);
    }
}
