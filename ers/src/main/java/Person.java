import java.util.Objects;

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
