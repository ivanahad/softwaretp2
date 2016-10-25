package ers;

import java.util.List;

public class PersonLocation extends Location{
	public Person person;
	
	public PersonLocation(Person person, Coordinate coordinate){
		super(coordinate);
		this.person = person;
	}

	public Location nearestLocations(List<Location> locations){
		double minDistance = Double.MAX_VALUE;
        Location nearestLocation = null;
        for (Location location : locations){
            double distance = this.distanceLocation(location);
            if (distance < minDistance){
                minDistance = distance;
                nearestLocation = location;
            }
        }
		return nearestLocation;
	}
}
