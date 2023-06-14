package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebookxmlparametres {
	
ChromeDriver cd;
	
	@BeforeTest
	public void starts()
	{
		cd=new ChromeDriver();
	}
	
	@BeforeMethod
	public void start1s()
	{
		cd.get("https://www.instagram.com/");
	}
	
@Parameters({"userid","password"})
@Test
public void test(String un,String psswrd)
{	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	cd.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")).sendKeys(un);
	cd.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input")).sendKeys(psswrd);
}
}
