package ers;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class testContacts {

	@Test
	public void testFindContact(){
		HashMap<String,Person> listContacts = new HashMap<String, Person>();
		Contacts contacts = new Contacts(listContacts);
		
		Person alfred = new Person("Alfred", "0422");
		contacts.addContact(alfred);
		Person agnese = new Person("Agnese", "0433");
		contacts.addContact(agnese);
		Person eddy = new Person("Eddy", "0444");
		contacts.addContact(eddy);
		assertEquals(agnese, contacts.findContact("Agnese"));
		assertEquals(eddy, contacts.findContact("Agnese"));
		assertEquals(agnese, contacts.findContact("Alfred"));
		
	}
	
	
}
