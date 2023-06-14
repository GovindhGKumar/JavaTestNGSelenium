package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javaselenium.Webelementscount;

public class Rediffcopypaste {
	
	
ChromeDriver cd;
	
	@BeforeTest
	public void go()
	{
		cd=new ChromeDriver();
	}
	
@BeforeMethod
public void start1()
{

	cd.get("http://register.rediff.com/register/register.php?FormName=user_details");

}

@Test
public void copy()
{
	WebElement w= cd.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
	WebElement we=cd.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]"));
	w.sendKeys("hello");
	Actions a =new Actions(cd);
	a.keyDown(w,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	a.keyDown(w,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	a.keyDown(we,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	a.perform();
}

}
