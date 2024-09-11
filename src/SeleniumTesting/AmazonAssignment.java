package SeleniumTesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {
	ChromeDriver driver;
	
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd123");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		}

}
