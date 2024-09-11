package SeleniumTesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {
	ChromeDriver driver;
	
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/Reshma/Alert.html");
	}
		@Test
		public void test()
		{
			driver.findElement(By.xpath("/html/body/input[1]")).click();
			//driver.switchTo().alert().accept();
			Alert a=driver.switchTo().alert();
			String text= a.getText();
			
			if(text.equals("Hello I am"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			a.accept();
			driver.findElement(By.name("firstname")).sendKeys("abcd");
			driver.findElement(By.name("lastname")).sendKeys("123");
	}

}
