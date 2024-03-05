package StepDefinitions_Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemo {
	public static WebDriver driver;
	
	@Before
	public void browserSetup() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.print("I am inside browser setup");
		
	}
	
	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.print("I am inside teardown setup");
	}
	
	@BeforeStep
	public void beforeSteps()
	{
		System.out.print("I am inside before steps method");
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.print("I am inside after steps method");
	}
	
	/*
	//----------Below is the Conditional Hooks example method------------
	@After(value="@smoke", order=1)
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.print("I am inside teardown setup");
	}
	*/
	
	/*
	 // ------------Below is the example to set order in Hooks execution------------
	  @Before(order=0)
	  public void testA()
	  {
	  }
	  
	  
	  @Before(order=1)
	  public void testB()
	  {
	  }
	 */
	
	
	@Given("user is on signin page")
	public void user_is_on_signin_page() {
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    
	}

}
