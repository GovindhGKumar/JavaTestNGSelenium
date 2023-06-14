package javaselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fcarbookxpath {
	ChromeDriver cd;
	
	@Before
	public void fbstart()
	{
		cd=new ChromeDriver();
		cd.get("https://www.facebook.com");
		
	}
	@Test
	public void fbtest()
	{
		cd.findElement(By.xpath("//input[@name='email']")).sendKeys("bndhju@fmail.com");
		cd.findElement(By.xpath("//input[@name='pass']")).sendKeys("khngy", Keys.ENTER);
		
		
	}

}
