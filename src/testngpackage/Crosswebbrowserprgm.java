package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crosswebbrowserprgm {
	
WebDriver cd;
@Parameters("browser")
@BeforeTest
public void before(String browser)
{
	
	if(browser.equalsIgnoreCase("Chrometest"))
			{
				cd=new ChromeDriver();
			}
	else if(browser.equalsIgnoreCase("firefoxtest"))
	{
		cd=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edgetest"))
	{
		cd=new EdgeDriver();
	}
	
}
	@Test
	public void test1()
	{
		cd.get("https://www.facebook.com/");
	}

}
