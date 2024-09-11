package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BlazedemoLogin;

public class BlazedemoLoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://blazedemo.com/login");
	}
	
	@Test
	public void logintest()
	{
		BlazedemoLogin ob=new BlazedemoLogin(driver);
		ob.setvalues("wert@gmail.com", "sfgkj");
		ob.login();
	}

}
