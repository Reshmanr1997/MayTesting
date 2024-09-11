package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FbLoginPage;

public class FbLoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlload() 
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void testlogin()
	{
		FbLoginPage ob=new FbLoginPage(driver);
		ob.setvalues("abc@gmail.com", "abcd");
		ob.login();
	}

}
