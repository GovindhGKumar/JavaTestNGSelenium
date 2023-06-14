package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	
	ChromeDriver cd;
	
	@BeforeTest
	public void start()
	{
	cd=new ChromeDriver();	
	}
	
	@BeforeMethod
	public void start1()
	{
	cd.get("https://demoqa.com/droppable/");
	
	}
	
	@Test
	public void test()
	{
		
	WebElement w=cd.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[1]"));
	WebElement we=cd.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]"));
	Actions a=new Actions(cd);
	a.dragAndDrop(w, we);
	a.perform();
	WebElement wem=cd.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/p"));
	String s=wem.getText();
	if(s.equals("Dropped!"))
	{
		System.out.println("Dropped! text is present");
	}
	else
	{
		System.out.println("Dropped! text is absent");
	}
	}
	

}
