package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazedemoLogin {
	WebDriver driver;
	
	By blazeemail=By.id("email");
	By blazepassword=By.id("password");
	By blazelogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public BlazedemoLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(blazeemail).sendKeys(email);
		driver.findElement(blazepassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(blazelogin).click();
	}

}
