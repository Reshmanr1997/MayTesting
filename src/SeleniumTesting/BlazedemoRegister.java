package SeleniumTesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazedemoRegister {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("name")).sendKeys("Anu");
		driver.findElement(By.id("company")).sendKeys("tcs");
		driver.findElement(By.id("email")).sendKeys("sehdh7345");
		driver.findElement(By.id("password")).sendKeys("rwndw43553");
		driver.findElement(By.id("password-confirm")).sendKeys("rwndw43553");
		
	}


}
