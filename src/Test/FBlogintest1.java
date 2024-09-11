package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FBlogin;

public class FBlogintest1 {
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
		FBlogin ob=new FBlogin(driver);
		ob.setvalues("abc@gmail.com", "abcd");
		ob.login();
	}

}
