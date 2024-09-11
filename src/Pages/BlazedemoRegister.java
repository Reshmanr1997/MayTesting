package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazedemoRegister {
	WebDriver driver;
	
	By blazename=By.id("name");
	By blazecompany=By.id("company");
	By blazeemail=By.id("email");
	By blazepassword=By.id("password");
	By blazeconfirm=By.id("password-confirm");
	By blazeregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public BlazedemoRegister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpswrd)
	{
		driver.findElement(blazename).sendKeys(name);
		driver.findElement(blazecompany).sendKeys(company);
		driver.findElement(blazeemail).sendKeys(email);
		driver.findElement(blazepassword).sendKeys(password);
		driver.findElement(blazeconfirm).sendKeys(confirmpswrd);
	}
	
	public void register()
	{
		driver.findElement(blazeregister).click();
	}

}
