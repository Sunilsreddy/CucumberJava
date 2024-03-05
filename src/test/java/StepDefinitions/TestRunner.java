package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\SignIn.feature", glue= {"StepDefinitions"},
monochrome=true,
 plugin = {
		   //"pretty", "html:target/HtmlReports", 
		   //"json:target/reports/report.json", 
		   //"junit:target/reports/report.xml",
		   "me.jvt.cucumber.report.PrettyReports:target/cucumber"
		   
}
)

public class TestRunner {

}
