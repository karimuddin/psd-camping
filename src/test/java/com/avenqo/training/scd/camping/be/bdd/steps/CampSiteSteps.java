package com.avenqo.training.scd.camping.be.bdd.steps;

import static org.junit.Assert.fail;

import java.util.Date;

import com.avenqo.training.scd.camping.be.bdd.utilities.DateUtility;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Customer;
import com.avenqo.training.scd.camping.be.operations.BookingCreator;
import com.avenqo.training.scd.camping.be.operations.OperationFailedException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampSiteSteps {

	@Given("the reservation service is initialized")
	public void the_reservation_service_is_initialized() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I request a list of site items")
	public void i_request_a_list_of_site_items() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("each site item contains a Category")
	public void each_site_item_contains_a_category() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("each site item contains a category description")
	public void each_site_item_contains_a_category_description() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
