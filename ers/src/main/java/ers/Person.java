package ers;

import java.util.Objects;

public class Person {
	public String name;
	public String contact;
	
	public Person(String name, String contact) {
		this.name=  name;
		this.contact = contact;
	}
	
	public void contact() {
		
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
		
		return Objects.equals(name, person.name) && Objects.equals(contact, person.contact);
	}
}
