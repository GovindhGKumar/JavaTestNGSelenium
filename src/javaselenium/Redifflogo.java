package javaselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	
	ChromeDriver cd;
	
@Before
public void start1()
{
cd=new ChromeDriver();
cd.get("https://www.rediff.com");
}

@Test
public void test()
{
	cd.findElement(By.xpath("//div[@class='cell alignR toprlinks']/p/a[2]")).click();			
	Boolean logo=cd.findElement(By.xpath("//div[@id='wrapper']/table/tbody/tr/td/img")).isDisplayed();		//boolean is provided since isDisplayed function returns True or False as output.
																											//if(logo)
	if(logo==true)																									//if yes executes first case or execute next case.
	{
		System.out.print("The logo is present");
	}
	else
	{
		System.out.println("The logo is not present");
	}
	
}

}
