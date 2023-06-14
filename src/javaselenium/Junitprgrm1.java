package javaselenium;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgrm1 {
	
ChromeDriver cd;

@Before
public void method()
{
cd=new ChromeDriver();
cd.get("https:/www.google.com");

}
@org.junit.Test
public void Test()
{
	cd.findElement(By.name("q")).sendKeys("Rohit Sharma",Keys.ENTER);
	//driver.findelement(By.name("btnK")).click();
}

}
