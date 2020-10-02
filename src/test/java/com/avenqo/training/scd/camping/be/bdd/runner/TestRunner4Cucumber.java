package com.avenqo.training.scd.camping.be.bdd.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/results.html", "message:target/results.ndjson" })
public class TestRunner4Cucumber {

}
