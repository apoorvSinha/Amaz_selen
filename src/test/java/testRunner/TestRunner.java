package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "C:\\Users\\apoorv\\eclipse-workspace\\Amazing\\Features\\login.feature",
		glue = {"StepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)

public class TestRunner{
	
	
}
