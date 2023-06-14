package testngpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffavailability {

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

@Test(priority=1)
public void check1()
{
	
	WebElement we=cd.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr/td"));
	String s1= we.getText();
	System.out.println(s1);
}

@Test(priority=2)
public void check()

{

WebElement w=cd.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]"));
String s=w.getAttribute("value");
if(s.equals("Check availability"))
{
	System.out.println("Check availability is the text on the button");
}
else
{
	System.out.println("Check availability is not present");
}
	
	
	
}
}
