package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonmultiplewindow {
	ChromeDriver cd;
	
	@BeforeTest
	public void beftest()
	{
		cd=new ChromeDriver();
		
	}
	@BeforeMethod
	public void befmethod()
	{
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
		
		String parentwindow=cd.getWindowHandle();
		
		cd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		cd.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		
		Set<String>allwindowhandler=cd.getWindowHandles();
		
		for(String handle:allwindowhandler)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				
			
			cd.switchTo().window(handle);
			cd.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			Thread.sleep(3000);
			cd.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
			cd.close();
			}
			cd.switchTo().window(parentwindow);
		}
		
	}

}
