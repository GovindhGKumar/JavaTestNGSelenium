package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demogurufilechoose {
	
ChromeDriver cd;
	
	@BeforeTest
	public void before()
	{
		cd=new ChromeDriver();
	}
@BeforeMethod
public void before1()
{
	cd.get("https://demo.guru99.com/test/upload/");
}
@Test
public void start()
{
	cd.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).sendKeys("C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot (1).png");
	cd.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[1]/button")).click();
}
}
