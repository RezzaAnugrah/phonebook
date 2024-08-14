package com.msig.phonebook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhonebookApplicationTests {

	@Autowired
	PhoneBookController phoneBookController;
	
	@Test
	void contextLoads() {
		System.out.println("Testing");
	}

	@Test
	void addPhoneBook() {
		Phonebook phonebook = new Phonebook();
		phonebook.setName("Rezza");
		phonebook.setPhoneNo("081250470845");
		phonebook.setEmail("rezza@example.com");
		phoneBookController.addContact(phonebook);
	}

}
