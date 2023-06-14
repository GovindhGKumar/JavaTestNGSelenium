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



public class Brokenlinkcodes {
	
	ChromeDriver cd;
	 //to display link name and link details of a webpage
@Before
public void start1()
{
cd=new ChromeDriver();
cd.get("https://www.google.com");
}

@Test
public void Test() throws Exception
{
List<WebElement>links=cd.findElements(By.tagName("a"));	
System.out.println("The number of links are "+ links.size());																							//("a")= contains the links 
	 //for each loop
for(WebElement link:links)																 //link = a reference name
{
String l= link.getAttribute("href");
Verify(l);																						 //"href"- attribute that contains the links in inspect page
}		


}

public void Verify(String l) throws Exception
{
	URL u=new URL(l);
	HttpURLConnection ur=(HttpURLConnection)u.openConnection();
	ur.connect();


if(ur.getResponseCode()==200)
{
	System.out.println("The response code is 200 --"+l);
}
else if(ur.getResponseCode()==400)
{
	System.out.print("The response code is  400 --"+l);
}
}
}