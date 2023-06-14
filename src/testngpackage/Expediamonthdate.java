package testngpackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expediamonthdate {
	
	ChromeDriver cd;
	@BeforeTest
	public void beftest()
	{
		cd=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void befmethod()
	{
	cd.get("https://www.expedia.co.in/");
	}
	@Test
	public void test()
	{
		cd.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[2]/div/div/div[1]/div/div/button[1]")).click();
		while(true)
		{
			WebElement w= cd.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
			String s=w.getText();
			
			if(s.equals("August 2023"))
			{
				System.out.println(s);
				break;
			}
			else
			{
				cd.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
				
			}
		}
		
			List<WebElement>datelist=cd.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
			
			for(WebElement date:datelist)
			{
				String dates=date.getAttribute("data-day");
				System.out.println(dates);
				if(dates.equals("25"))
				{
					date.click();
					System.out.println("Date is selected");
				}
			}
	}
}



	

