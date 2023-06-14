package test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Expedia;

public class Expediatest {
	
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
	Expedia ex=new Expedia(cd);
	ex.flightclick();
	ex.leavingbuttonclick();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	ex.leavingplace("Brussels");
	
	ex.toplace();
	ex.toplacenametyp("NewYork");
	
	ex.travelleropt();
	
	ex.economy();
	
	ex.date();
	ex.done2button();
	
}

}
