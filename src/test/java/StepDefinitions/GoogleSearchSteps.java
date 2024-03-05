/*

package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearchSteps {
	
	public static WebDriver driver;
	
	
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(300);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com");
		
	    	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automatino Step by Step");
	    
	}

	@And("hits enter")
	public void hits_enter() {
		// driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("Online Courses");
		driver.close();
		
		
	    
	}

}

*/