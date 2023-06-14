package javaselenium;


import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Takescreenshot {
	
	ChromeDriver cd;
	
	@Before
	public void start()
	{
		cd=new ChromeDriver();
		cd.get("file:///C:/Users/ASUS/Desktop/Software%20Testing/.html");
		
	}


	@Test
	public void Screenshot() throws Exception
	{
		File s=((TakesScreenshot)cd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("E://screenshot.png"));
		
		WebElement ss= cd.findElement(By.xpath("//input[@name='first name']"));
		File s1= ss.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s1, new File("./Screenshot/error.png"));
		
		 
		
	}

}
