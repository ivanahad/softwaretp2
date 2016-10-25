package ers;

public class PersonLocation extends Location{
	public Person person;
	
	public PersonLocation(Person person, Coordinate coordinate){
		super(coordinate);
		this.person = person;
	}
	
	
}
