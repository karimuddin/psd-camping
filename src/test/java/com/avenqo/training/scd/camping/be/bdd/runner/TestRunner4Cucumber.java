package com.avenqo.training.scd.camping.be.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/reports/cucumber-results.html", "json:target/reports/cucumber-results.json", "message:target/reports/cucumber-results.ndjson" }, 
	features = {"src/test/resources/Features/attd/" },
	glue = {"com.avenqo.training.scd.camping.be.bdd.steps"}
)
public class TestRunner4Cucumber {

}
