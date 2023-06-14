package javaselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertboxprgm {
	
	ChromeDriver cd;
	
	@Before
	public void start()
	{
		cd=new ChromeDriver();
		cd.get("file:///C:/Users/ASUS/Desktop/Software%20Testing/.html");
		
	}
	
	@Test
	public void test()
	{
		cd.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=cd.switchTo().alert();									//Alert handling
		String s=a.getText();
		System.out.println("The alert text is - "+s);
		if(s.equals("Hello! Iam an alert box!!"))
				{
		System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		cd.findElement(By.xpath("//input[@name='first name']")).sendKeys("Govindh");
		cd.findElement(By.xpath("//input[@name='last name']")).sendKeys("G Kumar");
		cd.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
