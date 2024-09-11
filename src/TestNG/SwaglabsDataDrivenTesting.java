package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwaglabsDataDrivenTesting {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.saucedemo.com/v1/");;
	}

	@Test
	public void test1() throws Exception
	{
		File f=new File("D:\\Swaglabs.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook (fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
				{
					String username=sh.getRow(i).getCell(0).getStringCellValue();
					System.out.println("username="+username);
					String pswrd=sh.getRow(i).getCell(1).getStringCellValue();
					System.out.println("password="+pswrd);
					
					driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
					driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
					driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswrd);
					
					driver.findElement(By.id("login-button")).click();
				}
		
		String actual=driver.getTitle();
		String exp="Swag Labs";
		if(actual.equals(exp))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login invalid");
		}
	}
	
	
}
