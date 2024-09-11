package SeleniumTesting;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValuePass {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select ob=new Select(day);
		ob.selectByValue("05");
		List<WebElement> li = ob.getOptions();
		System.out.println(li.size());
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select ob1=new Select(month);
		ob1.selectByIndex(9);
		List<WebElement> li1 = ob1.getOptions();
		System.out.println(li1.size());
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select ob2=new Select(year);
		ob2.selectByVisibleText("2010");
		List<WebElement> li2 = ob2.getOptions();
		System.out.println(li2.size());
		
	}

}
