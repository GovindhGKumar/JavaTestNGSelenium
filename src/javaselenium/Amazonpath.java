package javaselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpath {
	
	ChromeDriver cd;
	
	@Before
	public void start1()
	{
		cd=new ChromeDriver();
		cd.get("https://www.amazon.in");
	}
	
	@Test
	public void test1()
	{
	
	cd.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
	cd.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[2]")).click();
	cd.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	cd.findElement(By.xpath("//input[@name='email']")).sendKeys("gbdnsj@gmail.com",Keys.ENTER);
	cd.navigate().back();
	cd.navigate().back();
	cd.findElement(By.xpath("//div[@id='nav-xshop']/a[8]")).click();
	cd.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	
	}
	@After
	public void ends()
	{
		cd.quit();
	}

}
