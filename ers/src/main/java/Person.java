import java.util.Objects;

/**
 * Created by Ivan & Eddy
 * This class represents a "Person" object, defined as a name and a number
 */
public class Person {
	public String name;
	public String number;
	
	public Person(String name, String number) {
		this.name=  name;
		this.number = number;
	}

	@Override
	public boolean equals(Object o) {
		if(this==o){
			return true;
		}
		if(o==null){
			return false;
		}
		if(getClass()!=o.getClass()){
			return false;
		}
		Person person = (Person) o;
		
		return Objects.equals(name, person.name) && Objects.equals(number, person.number);
	}
}
