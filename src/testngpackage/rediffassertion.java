package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediffassertion {
	
	ChromeDriver cd;
	
	@BeforeTest
	public void before()
	{
		cd=new ChromeDriver();
	}
	
	@BeforeMethod
	public void before1()
	{
		cd.get("https://www.rediff.com/");
	}
@Test
public void test()
{
	WebElement w=cd.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[2]"));
	String s=w.getText();
	String expected="Create Account";
	Assert.assertEquals(s, expected);			//assertion declaration
	System.out.println("passed");
	
}
}
