package ers;

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
        Path path = createPath(location1, location2);

        assertEquals(path.givePathInstructions(), "Go in direction of N");

        location1 = createLocation(1, 4);
        location2 = createLocation(6, 5);
        path = createPath(location1, location2);

        assertEquals(path.givePathInstructions(), "Go in direction of NE");

        location1 = createLocation(1, 4);
        path = createPath(location1, location1);

        assertEquals(path.givePathInstructions(), "You've arrived");

    }

    public Path createPath(Location location1, Location location2){

        return new Path(location1, location2);
    }

    public static Location createLocation(int x, int y){
        Coordinate coordinate = new Coordinate(x,y);
        return new Location(coordinate);
    }
}
