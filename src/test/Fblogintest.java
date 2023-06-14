package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Excelutils;
import page.Fbloginpage;

public class Fblogintest {

	ChromeDriver cd;
	
@BeforeMethod
	public void beftest()
	{
		cd=new ChromeDriver();
		cd.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void test()
	{
		Fbloginpage fb=new Fbloginpage(cd);
		
		String xl="C:\\Users\\ASUS\\Desktop\\Software Testing\\Book1.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelutils.getRowCount(xl, sheet);
		
		for(int i=1;i<=rowcount;i++)
		{
			String username=Excelutils.GetcellValue(xl, sheet, i, 0);
			System.out.println("username---- "+username);
			String pswd=Excelutils.GetcellValue(xl, sheet, i, 1);
			System.out.println("password--- "+pswd);
			fb.setvalues(username, pswd);
			fb.login();
		}
		
	}
}
