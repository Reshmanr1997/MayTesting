package SeleniumTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTitlePagesource {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test()
	{
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		String exp="Google";
		if(acttitle.equals(exp))
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
		if(str.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		}
	@After
	public void browserclose()
	{
		driver.close();
	}

}
