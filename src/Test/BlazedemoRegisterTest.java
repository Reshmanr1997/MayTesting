package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BlazedemoRegister;

public class BlazedemoRegisterTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void registertest()
	{
		BlazedemoRegister ob=new BlazedemoRegister(driver);
		ob.setvalues("Anu", "CTS", "abcd@gmail.com", "abc@123", "abc@123");
		ob.register();
	}

}
