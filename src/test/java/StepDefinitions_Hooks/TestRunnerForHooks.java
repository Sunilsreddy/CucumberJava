package StepDefinitions_Hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/HooksDemo/HooksDemo.feature", glue= {"StepDefinitions_Hooks"},
monochrome=true,
 plugin = {"pretty", "html:target/HtmlReports", "json:target/reports/report.json", "junit:target/reports/report.xml"}
)

public class TestRunnerForHooks {

}
