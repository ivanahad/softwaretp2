import java.util.*;

/*
 * Represents a list of contacts of a person and that he might modify.
 */
public class Contacts {
	
	public HashMap<String,Person> listContacts;
	
	public Contacts(HashMap<String,Person> Contacts){
		listContacts = new HashMap<String,Person>();
	}
	
	/*
	 * Adds a contact entry with its name as the index
	 */
	public void addContact(Person person){
		String key = person.name;
		
		listContacts.put(key, person);
	}
	
	public void removeContact(Person person) {
		listContacts.remove(person.name);
	}
	
	/*
	 * returns a Person object according of a name 
	 */
	public Person findContact(String name) {
		return listContacts.get(name);	
	}
}
