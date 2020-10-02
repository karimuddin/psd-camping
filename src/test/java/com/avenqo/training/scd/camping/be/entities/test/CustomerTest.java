package com.avenqo.training.scd.camping.be.entities.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.avenqo.training.scd.camping.be.entities.Customer;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;

public class CustomerTest {

	@Test
	void invalidEMail() {
		// set up user
		Throwable exception = assertThrows(InvalidDataException.class, () -> new Customer().setEMail("23"));
		assertEquals("EMail-Format is invalid for [23].", exception.getMessage());
	}

	@Test
	void validEMail() throws InvalidDataException {
		String mail = "sombody@nowhere.us";
		Customer c = new Customer();
		c.setEMail(mail);
		
		assertEquals(mail, c.getEMail());
	}
	
	@Test
	void checkFirstName()  {
		String parameter = "Alfred";
		Customer c = new Customer();
		c.setFirstName(parameter);
		
		assertEquals(parameter, c.getFirstName());
	}
	
	
	@Test
	void checkLastName()  {
		String parameter = "Schmittchen";
		Customer c = new Customer();
		c.setLastName(parameter);
		
		assertEquals(parameter, c.getLastName());
	}
	
	@Test
	void checkPhone() {
		String parameter = "98765";
		Customer c = new Customer();
		c.setPhone(parameter);
		
		assertEquals(parameter, c.getPhone());
	}
}
