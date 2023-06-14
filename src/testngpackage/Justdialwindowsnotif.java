package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Justdialwindowsnotif {

	ChromeDriver cd;
	
	@BeforeTest
	public void beftest()
	{
		ChromeOptions op=new ChromeOptions();						//to close the window tab
		op.addArguments("--disable-notifications"); 
		cd=new ChromeDriver(op);
		cd.get("https://www.justdial.com/");
		cd.manage().window().maximize();
	
	}
	
	@Test
	public void test()
	{
		cd.findElement(By.xpath("//*[@id=\"main-auto\"]")).click();
		cd.findElement(By.xpath("//*[@id=\"main-auto\"]")).sendKeys("ROTWEILER",Keys.ENTER);
	}

}
