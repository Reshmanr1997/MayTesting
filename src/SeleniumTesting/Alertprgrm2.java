package SeleniumTesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm2 {
	ChromeDriver driver;
	
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		//driver.switchTo().alert().accept();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("I am a JS Alert"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		//first approach to handle prompt alert
		driver.switchTo().alert().sendKeys("abcd");
		driver.switchTo().alert().accept();
		
		//second approach
	/*	Alert b=driver.switchTo().alert();
		b.sendKeys("abcd");
		b.accept();        */
		
	}

}
