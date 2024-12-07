package swiggy_TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class RegistorOnSwiggy {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");		
	}
	@Test
	public void validateRegistration()
	{
		
	}

}
