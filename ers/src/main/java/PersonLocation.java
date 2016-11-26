import java.util.List;


/**
 * Created by Ivan & Eddy
 * This class represents the current Location of a person. It extends the Location class
 */
public class PersonLocation extends Location{
	public Person person;
	
	public PersonLocation(Person person, Coordinate coordinate){
		super(coordinate);
		this.person = person;
	}

	public PersonLocation(Person person, Coordinate coordinate, double radius){
		super(coordinate, radius);
		this.person = person;
	}

	public Location nearestLocations(List<Location> locations){
		double minDistance = Double.MAX_VALUE;
        Location nearestLocation = null;
        for (Location location : locations){
            double distance = this.distanceLocations(location);
            if (distance < minDistance){
                minDistance = distance;
                nearestLocation = location;
            }
        }
		return nearestLocation;
	}

	@Override
	public String toString(){
		return super.toString() + " - " + person.toString();
	}

}
