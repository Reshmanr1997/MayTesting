package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MousehoverProgram {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void test1()
	{
		//implicit wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mouse=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		
	}

}
