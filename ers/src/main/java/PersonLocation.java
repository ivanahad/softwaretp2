import java.util.List;


/**
 * Created by Ivan & Eddy
 * This class represents the current Location of a person. It extends the Location class
 */
public class PersonLocation extends Location{
	public Person person;

	public PersonLocation(Person person, int x, int y, double radius){
		super(x, y, radius);
		this.person = person;
	}

	public PersonLocation(Person person, int x, int y){
		this(person, x, y, 0);
	}

	public SafePlace nearestLocations(List<SafePlace> locations){
		double minDistance = Double.MAX_VALUE;
        SafePlace nearestLocation = null;
        for (SafePlace location : locations){
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
