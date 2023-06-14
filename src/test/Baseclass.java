package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	ChromeDriver cd;
	
	@BeforeMethod
		public void beftest()
		{
			cd=new ChromeDriver();
			cd.get("https://www.facebook.com/");
			
		}

}
