package ers;

import java.util.*;
public class Contacts {
	
	public HashMap<String,Person> listContacts;
	
	public Contacts(HashMap<String,Person> Contacts){
		listContacts = new HashMap<String,Person>();
	}
	
	public void addContact(Person person){
		String key = person.name;
		
		listContacts.put(key, person);
	}
	
	public void removeContact(Person person) {
		listContacts.remove(person.name);
	}
	
	public Person findContact(String name) {
		return listContacts.get(name);	
	}
}
