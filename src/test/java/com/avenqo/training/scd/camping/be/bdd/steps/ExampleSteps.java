package com.avenqo.training.scd.camping.be.bdd.steps;

import static org.junit.Assert.fail;

import java.util.Date;

import com.avenqo.training.scd.camping.be.bdd.utilities.DateUtility;
import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.Customer;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.entities.Site;
import com.avenqo.training.scd.camping.be.operations.BookingCreator;
import com.avenqo.training.scd.camping.be.operations.OperationFailedException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {

	// ---- Test Data ----
	private static Customer currentCustomer = null;

	// ---- Steps ----

	@Given("a defined customer with firstname={string} and lastname={string}")
	public void givenCustomer(String firstName, String lastName) {
		currentCustomer = new Customer();
		currentCustomer.setFirstName(firstName);
		currentCustomer.setLastName(lastName);
	}

	@When("the current customer sends a booking request for site {string} for tomorrow plus {int} weeks")
	public void someStep(String siteId, Integer numWeeks) throws OperationFailedException, InvalidDataException, DaoConsistencyException {
		Date date = new Date();
		SiteDao siteDao = new SiteDao();
		siteDao.createSite(new Site("1", Category.Chalet));
		BookingCreator.create(currentCustomer, siteDao.getSite(siteId),
				DateUtility.incrementDays(date, 1), DateUtility.incrementDays(date, 1 + (numWeeks * 7)));
	}

	@Then("the Maker waits for a Breaker to join")
	public void otherStep() {
		fail("Not implemented yet");
	}

}
