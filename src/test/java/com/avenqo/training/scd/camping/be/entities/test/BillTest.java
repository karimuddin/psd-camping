package com.avenqo.training.scd.camping.be.entities.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.avenqo.training.scd.camping.be.entities.Bill;
import com.avenqo.training.scd.camping.be.entities.Company;
import com.avenqo.training.scd.camping.be.entities.Customer;

public class BillTest {
	
	@Test
	void checkID()  {
		String parameter = "1234";
		Bill bill = new Bill();
		bill.setId(parameter);	
		assertEquals(parameter, bill.getId());
	}
	
	@Test
	void checkCompany()  {
		Company company = new Company ("address", "taxnum");
		Bill bill = new Bill();
		bill.setCompany(company);
		assertEquals(company, bill.getCompany());
	}
	
	
	
	@Test
	void checkCustomer()  {
		Customer company = new Customer ("Last", "First", "e@mail.de", "123");
		Bill bill = new Bill();
		bill.setCustomer(company);
		assertEquals(company, bill.getCustomer());
	}
	
}
