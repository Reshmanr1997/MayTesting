package SeleniumTesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogonButtonVerify {
	ChromeDriver driver;
	
	@Before 
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		//first method
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean l=logo.isDisplayed();
		if(l==true)
		{
			System.out.println("The logo is present");
		}
		else
		{
			System.out.println("The logo is not present");
		}
		//second method
		Boolean checkbox=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(checkbox)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		Boolean radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radiobutton)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
}


