package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;

public class Fbtest extends Baseclass{
	@Test
	public void verifyLoginWithValidCred()
	{
		Fbpage p1=new Fbpage(driver);
		
		// Reading the data from excel file by the specified path
		
		String xl="D:\\datas.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutil.getCellValue(xl,Sheet,i,0);
			System.out.println("username------"+UserName);
			String Pwd=Excelutil.getCellValue(xl,Sheet,i,1);
			System.out.println("password-----"+Pwd);
			p1.setvalues(UserName, Pwd);
			p1.login();
		}
	}

}
