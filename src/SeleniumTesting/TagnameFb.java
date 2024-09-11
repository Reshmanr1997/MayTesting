package SeleniumTesting;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameFb {
	ChromeDriver driver;
	
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(WebElement d:li)
		{
			String link=d.getAttribute("href");
			String text=d.getText();
			System.out.println(link+"-------"+text);
		}
	}

}
