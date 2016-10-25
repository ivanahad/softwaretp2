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
		assertEquals(eddy, contacts.findContact("Eddy"));
	}
	
	@Test
	public void testRemoveContact(){
		HashMap<String,Person> listContacts1 = new HashMap<String, Person>();
		Contacts contacts1 = new Contacts(listContacts1);
		
		Person agnese = new Person("Agnese", "0433");
		Person eddy = new Person("Eddy", "0444");
		Person alfred = new Person("Alfred", "0422");
		Person ilias = new Person("Ilias", "0411");
		contacts1.addContact(alfred);
		contacts1.addContact(agnese);
		contacts1.addContact(eddy);
		
		HashMap<String,Person> listContacts2 = new HashMap<String, Person>();
		Contacts contacts2 = new Contacts(listContacts2);
		contacts2.addContact(alfred);
		contacts2.addContact(agnese);
		contacts2.addContact(eddy);
		contacts2.addContact(ilias);
		
		contacts2.removeContact(ilias);
		assertEquals(contacts1.listContacts, contacts2.listContacts);
	}
	
	
}
