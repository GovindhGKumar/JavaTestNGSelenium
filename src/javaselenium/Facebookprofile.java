package javaselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookprofile {
	
	ChromeDriver cd;
	
	@Before
	public void fbsetup()
	{
		cd=new ChromeDriver();
		cd.get("https://www.facebook.com");
		
	}
	
	@Test
	public void fbtest()
	{
		
		cd.findElement(By.name("email")).sendKeys("ghyht@gmail.com");
		cd.findElement(By.name("pass")).sendKeys("hnjgd");
		cd.findElement(By.name("login")).click();
	}
	
	
	

}
