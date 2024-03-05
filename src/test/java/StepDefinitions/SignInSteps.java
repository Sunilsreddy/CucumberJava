 package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.SignIn_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInSteps {
	public static WebDriver driver;
	SignIn_Page signin;
	HomePage homepage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(300);
		driver.get("https://demo.guru99.com/v4/");
		
	    
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		signin = new SignIn_Page(driver);
		
		signin.enterUsername(username);
		signin.enterPassword(password);
		Thread.sleep(400);
	   
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		signin.clickOnButton();
		Thread.sleep(300);
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		homepage = new HomePage(driver);
		
		homepage.newCustomer();
		homepage.address();
		Thread.sleep(300);
		driver.close();
	    
	}


}

