import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ndizera on 10/25/16.
 */

import static org.junit.Assert.assertEquals;

public class testPersonLocation {
    @Test
    public void testNearestLocations(){
        Location location1 = createLocation(1, 1);
        Location location2 = createLocation(4, 5);
        Location location3 = createLocation(-4, -9);

        LinkedList<Location> locations = new LinkedList<Location>();
        locations.add(location1);
        locations.add(location2);
        locations.add(location3);

        PersonLocation personLocation = createPersonLocation(0,0);

        assertEquals(personLocation.nearestLocations(locations), location1);

        personLocation = createPersonLocation(-3, -5);
        assertEquals(personLocation.nearestLocations(locations), location3);

    }

    public static Location createLocation(int x, int y){
        return new Location(x, y);
    }

    public static PersonLocation createPersonLocation(int x, int y){
        Person person = createPerson();
        return new PersonLocation(person, x, y);
    }

    public static Person createPerson(){
        return new Person("Person", "0458964231");
    }
}
