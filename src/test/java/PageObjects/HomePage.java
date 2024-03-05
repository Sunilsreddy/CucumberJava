package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;

	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement new_Customer;
	
	@FindBy(name="addr")
	WebElement address;
	
	
	public HomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void newCustomer()
	{
		new_Customer.click();
		ldriver.navigate().to("https://demo.guru99.com/v4/manager/addcustomerpage.php");
		
	}
	
	public void address()
	{
		address.sendKeys("Tested successfully");
		
	}
	
	
}
