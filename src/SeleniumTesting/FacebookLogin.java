package SeleniumTesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abs123");
		driver.findElement(By.id("pass")).sendKeys("hdhdh");
		driver.findElement(By.name("login")).click();
	}

}
