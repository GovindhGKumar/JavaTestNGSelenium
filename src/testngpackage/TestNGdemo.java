package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	ChromeDriver cd;
	
	@BeforeTest
	public void start()
	{
		cd=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlload()
	{
		cd.get("https://www.rediff.com");
		
	}
	
	@Test(priority=1)										//firstly checks the method with priority.
	public void title()
	{
		boolean b =cd.findElement(By.xpath("/html/body/div[2]/div/div[1]/span")).isDisplayed();
		if(b)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is absent");
		}
		
	}
	
	@Test(priority=2)
	public void clicks()
	{
		WebElement w=cd.findElement(By.xpath("//*[@id='signin_info']/a[2]"));
		String st=w.getText();
		String st1="Create Account";
	
		if(st.equals(st1))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
		
		@AfterTest
		public void slow()
		{
			cd.quit();
		}
	
	}



