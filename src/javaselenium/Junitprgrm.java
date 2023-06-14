package javaselenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgrm {
	ChromeDriver cd;

	@Before
	public void Setup()
	{
		cd=new ChromeDriver();
		cd.get("https://www.audi.com");
		
		}
	
	@org.junit.Test
	public void Test()
	{
		String s=cd.getTitle();
		
		System.out.println(s);
	}
	
	@After
	public void stoping()
	{
		cd.quit();
		
	}
	
}
