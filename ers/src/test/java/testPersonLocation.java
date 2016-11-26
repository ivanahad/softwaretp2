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
        SafePlace location1 = createLocation(1, 1);
        SafePlace location2 = createLocation(4, 5);
        SafePlace location3 = createLocation(-4, -9);

        LinkedList<SafePlace> locations = new LinkedList<SafePlace>();
        locations.add(location1);
        locations.add(location2);
        locations.add(location3);

        PersonLocation personLocation = createPersonLocation(0,0);

        assertEquals(personLocation.nearestLocations(locations), location1);

        personLocation = createPersonLocation(-3, -5);
        assertEquals(personLocation.nearestLocations(locations), location3);

    }

    public static SafePlace createLocation(int x, int y){
        return new SafePlace(x, y, 0);
    }

    public static PersonLocation createPersonLocation(int x, int y){
        Person person = createPerson();
        return new PersonLocation(person, x, y);
    }

    public static Person createPerson(){
        return new Person("Person", "0458964231");
    }
}
