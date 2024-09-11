package SeleniumTesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class ValuePassPrgrm {
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Anu");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("P R");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Kanemppilly");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("anu123@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7498524160");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		WebElement skill=driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select ob=new Select(skill);
		ob.selectByValue("SQL");
	//	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
	//	driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("India");
	//	WebElement country=driver.findElement(By.xpath("/html/body/span/span/span[2]"));
	//	Select ob1=new Select(country);
	//	ob1.;
		WebElement year=driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select y=new Select(year);
		y.selectByIndex(5);
		WebElement month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select m=new Select(month);
		m.selectByValue("April");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select d=new Select(day);
		d.selectByVisibleText("6");
		driver.findElement(By.id("firstpassword")).sendKeys("abc123");
		driver.findElement(By.id("secondpassword")).sendKeys("abc123");
		
	}

}
