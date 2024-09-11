package SeleniumTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageSource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String str=driver.getPageSource();
		if(str.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
