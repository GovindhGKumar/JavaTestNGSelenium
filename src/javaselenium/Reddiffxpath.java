package javaselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiffxpath {
	
	ChromeDriver cd;
	
	@Before
	public void Start()
	{
	cd=new ChromeDriver();
	cd.get("https://www.rediff.com");
	}

	@Test
	public void test()
	{
		cd.findElement(By.xpath("//div[@class='cell alignR toprlinks']/p/a[2]")).click();
	   Boolean b=  cd.findElement(By.xpath("//input[@value='m']")).isSelected();
	   
	   if(b)
	   {
		   System.out.println("Male radio button is selected by default");
	   }
	   else
	   {
		   System.out.println("Female radio button is selected by default");
	   }
	}
}

