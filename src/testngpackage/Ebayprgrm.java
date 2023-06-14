package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebayprgrm {
	
	ChromeDriver cd;
	
	@BeforeTest
	public void start()
	{
		cd=new ChromeDriver();
	}
	
	@BeforeMethod
	public void start1()
	{
	cd.get("https://www.ebay.com/");	
	}
	
	@Test
	public void tests()
	{
		
		//cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));          //Implicit wait is given
		WebDriverWait wait=new WebDriverWait(cd,Duration.ofSeconds(20));			//Explicit wait obj declaration
		WebElement w= cd.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
		Actions a=new Actions(cd);
		a.moveToElement(w).perform();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a")));		//Explicit wait syntax
		cd.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();
	
	
		
		
	}	
		
		
		
	}

