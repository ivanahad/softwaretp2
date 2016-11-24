import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class testContacts {

	@Test
	public void testFindContact(){
		//HashMap<String,Person> listContacts = new HashMap<String, Person>();
		//Contacts contacts = new Contacts(listContacts);
		Contacts contacts = Contacts.getInstance();
		
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
		//HashMap<String,Person> listContacts1 = new HashMap<String, Person>();
		//Contacts contacts1 = new Contacts(listContacts1);

		Contacts contacts1 = Contacts.getInstance();
		
		Person agnese = new Person("Agnese", "0433");
		Person eddy = new Person("Eddy", "0444");
		Person alfred = new Person("Alfred", "0422");
		Person ilias = new Person("Ilias", "0411");

		contacts1.addContact(alfred);
		contacts1.addContact(agnese);
		contacts1.addContact(eddy);
		contacts1.addContact(ilias);

		contacts1.removeContact(ilias);
		assertFalse(contacts1.listContacts.containsKey(ilias));
	}

	
	
}
