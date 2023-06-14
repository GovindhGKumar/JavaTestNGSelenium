package testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Gurualertbox {
	
	ChromeDriver cd;
	
	@BeforeTest
	public void start()
	{
		cd=new ChromeDriver();
		
		
	}
	
	@BeforeMethod
public void start1()
{
		cd.get("https://demo.guru99.com/test/simple_context_menu.html");
}
	@Test(priority=2)
	public void test()
	{
	
	WebElement we=cd.findElement(By.xpath("/html/body/span"));
	Actions a=new Actions(cd);
	a.contextClick(we);
	a.perform();
	cd.findElement(By.xpath("/html/body/ul/li[2]")).click();
	Alert a1=cd.switchTo().alert();
	String s1=a1.getText();
	a1.accept();
	System.out.println(s1);
	}
	@Test(priority=1)
	public void test1()
	{
		
	
	WebElement w=cd.findElement(By.xpath("/html/body/button"));
	Actions a1=new Actions(cd);
	a1.doubleClick(w);
	a1.perform();
	Alert a2=cd.switchTo().alert();
	String s=a2.getText();
	a2.accept();
	System.out.println(s);
	
	}
			
	}

