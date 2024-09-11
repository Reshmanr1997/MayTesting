package SeleniumTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
	
	@Test
	public void test()
	{
		String actual=driver.getTitle();
		System.out.println(actual);
		String exp="Flipkart";
		if(actual.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void test1()
	{
		String str=driver.getPageSource();
		if(str.contains("Login"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@After
	public void browserclose()
	{
		driver.close();
	}

}
