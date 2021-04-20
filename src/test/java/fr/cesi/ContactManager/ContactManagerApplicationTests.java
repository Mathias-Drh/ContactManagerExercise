package fr.cesi.ContactManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContactManagerApplicationTests {
	private Client client1 = new Client("Dupont","Matt","0690000010");
	private Client client2 = new Client("","","");
	private Client client3 = new Client(null,null,null);
	
	@Test
	void contactManagerNomNull() {
		assertNotNull(client1.getNom());
		assertNotNull(client2.getNom());
		assertNotNull(client3.getNom());
	}

	@Test
	void contactManagerNomEmpty() {
		assertNotEquals("", client1.getNom());
		assertNotEquals("", client2.getNom());
	}

	@Test
	void contactManagerPrenomNull() {
		assertNotNull(client1.getPrenom());
	}

	@Test
	void contactManagerPrenomEmpty() {
		assertNotEquals("", client1.getPrenom());
	}

	@Test
	void contactManagerTelephoneNull() {
		assertNotNull(client1.getTel());
	}

	@Test
	void contactManagerTelephoneEmpty() {
		assertNotEquals("", client1.getTel());
	}
}
