package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Excelutils;
import page.Genprodemo;



public class Genprodemotest {
ChromeDriver cd;
	
	
	@BeforeTest
	public void beftest()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		cd=new ChromeDriver(op);
		cd.manage().window().maximize();
		
	}
	@BeforeMethod
	public void befmethod()
	{
		cd.get("https://www.saucedemo.com/");
	}
	
	
	@Test
	public void test1() 
	{
		Genprodemo gd=new Genprodemo(cd);
		String xl="C:\\Users\\ASUS\\Desktop\\Demo userid,pswrd.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelutils.getRowCount(xl, sheet);
		
		
		
		for(int i=1;i<=rowcount;i++)
		{
			String username=Excelutils.GetcellValue(xl, sheet, i, 0);
			System.out.println("username---- "+username);
			String pswd=Excelutils.GetcellValue(xl, sheet, i, 1);
			System.out.println("password--- "+pswd);
			
			
			gd.setvaluesdemo(username, pswd);
			gd.filter();
			gd.addtocart();
			gd.cartclick();
			gd.cartremove();
			gd.checkoutbutton();
			gd.firstname();
			gd.lastname();
			gd.pin();
			gd.continuebutton();
			gd.finishbtn();
			gd.homebtn();
			gd.hamburger();
			gd.logoutbtn();
			
		
			
			
	}

	}
}

