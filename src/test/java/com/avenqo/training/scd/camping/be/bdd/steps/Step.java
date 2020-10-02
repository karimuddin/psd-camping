package com.avenqo.training.scd.camping.be.bdd.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step {

	@Given("the game is setup")
	public void setup() {
		// execute step
	}

	@When("the Maker starts a game")
	public void someStep() {
		// execute step
	}

	@Then("the Maker waits for a Breaker to join")
	public void otherStep() {
		// execute other step
	}

}
