package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multipletabhandling {
	
	ChromeDriver cd;
	@BeforeTest
	public void beftest()
	{
		cd=new ChromeDriver();
		
	}
	@BeforeMethod
	public void befmethod()
	{
		cd.get("https://demo.guru99.com/popup.php");
	}

	@Test
	public void test()
	{
		
		
		String parentwindow=cd.getWindowHandle();
		
		cd.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allwindowhandler=cd.getWindowHandles();
		
		for(String handle:allwindowhandler)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				
			
			cd.switchTo().window(handle);
			cd.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("ghehh@hn");
			cd.close();
			}
			cd.switchTo().window(parentwindow);
		}
		
	}
}
