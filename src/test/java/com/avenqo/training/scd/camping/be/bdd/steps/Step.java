package com.avenqo.training.scd.camping.be.bdd.steps;

import java.util.Date;

import com.avenqo.training.scd.camping.be.bdd.utilities.DateUtility;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Customer;
import com.avenqo.training.scd.camping.be.operations.BookingRequestCreator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {

	// ---- Test Data ----
	private static Customer currentCustomer = null;
	
	
	// ---- Steps ----
	
	@Given("a defined customer with firstname={string} and lastname={string}")
	public void givenCustomer(String firstName, String lastName) {
		currentCustomer = new Customer();
		currentCustomer.setFirstName(firstName);
		currentCustomer.setLastName(lastName);
	}

	@When("the current customer sends a booking request for site {siteId} for tomorrow plus {int} weeks")
	public void someStep(String siteId, Integer numWeeks) {
		BookingRequestCreator bookingRequestCreator = new BookingRequestCreator();
		
		Date date = new Date();
		bookingRequestCreator.create (currentCustomer, SiteDao.getInstance().getSite(siteId), 
				DateUtility.incrementDays(date, 1), 
				DateUtility.incrementDays(date, 1 + (numWeeks * 7)));
	}

	@Then("the Maker waits for a Breaker to join")
	public void otherStep() {
		// execute other step
	}

}
