package javaselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementscount {
	
	ChromeDriver cd;
	
	@Before
	public void start()
	{
		cd=new ChromeDriver();
		cd.get("https://www.bmw.in/en/index.html");
	}
	
	@Test
	public void test() throws Exception
	{	
		WebElement w=cd.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/h3"));
		String s= w.getText();
		
		if(s.equals("THE NEW BMW Z4 M40i"))
		{
			System.out.println("The text test is passed");
		}
		else
		{
			System.out.println("The text test is failed");
		}
		System.out.println("The text is "+s);
	
		
		List<WebElement>links=cd.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String ss=link.getAttribute("href");
			verify(ss);
			
		}
	}
	
	public void verify(String ss) throws Exception
	{
	URL u=new URL(ss);
	HttpURLConnection hc= (HttpURLConnection)u.openConnection();
	hc.connect();
	
	if(hc.getResponseCode()==200)
	{
		System.out.println("The response code is 200 is "+ss);
	}
	else if(hc.getResponseCode()==400)
	{
		System.out.println("The response code is 400 is "+ss);
	}
	}
}




