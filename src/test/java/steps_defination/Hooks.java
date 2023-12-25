package steps_defination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" , tags = "@smoke @regression" , glue = "steps_defination", plugin = { "pretty",
"html:Target/reports.html" })

public class Hooks {

}
