package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmailidpassword {
	
	ChromeDriver cd;
	
	@BeforeTest
	public void start()
	{
		cd=new ChromeDriver();
	}
	
	@BeforeMethod
	public void start1()
	{
		cd.get("https://www.facebook.com");
	}

	@Test
	public void test()
	{	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		cd.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("vkmij");
		cd.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("hnmjk8",Keys.ENTER);
		String exp="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1NDQ0NjkxLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		String actual=cd.getCurrentUrl();
		if(exp.equals(actual))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}
	
}
