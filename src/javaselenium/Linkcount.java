package javaselenium;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	

	ChromeDriver cd;
																								 //to display link name and link details of a webpage
	@Before
	public void start1()
	{
		cd=new ChromeDriver();
		cd.get("https://www.google.com");
	}
	
	@Test
	public void Test()
	{
		List<WebElement>links=cd.findElements(By.tagName("a"));	
		System.out.println("The number of links are "+ links.size());																							//("a")= contains the links 
																								 //for each loop
		for(WebElement link:links)																 //link = a reference name
		{
			System.out.println(link.getText()+ " - " + link.getAttribute("href"));				 //"href"- attribute that contains the links in inspect page
		}																						 //to get the links= getattributes("href")
	}																							 //to get the link names= gettext()
	@After
	public void stop()
	{
		cd.quit();
	}
}
