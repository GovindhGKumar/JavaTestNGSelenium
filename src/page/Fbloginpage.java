package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbloginpage {
	
ChromeDriver cd;

By fbemail= By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input");
By fbpassword=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input");
By Loginbutton=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");

public Fbloginpage(ChromeDriver cd)			//constructor....name should be same as class name
{
	this.cd=cd;
}

public void setvalues(String email,String pswrd) {
	cd.findElement(fbemail).sendKeys(email);
	cd.findElement(fbpassword).sendKeys(pswrd);
	}
 
public void login()
{
	cd.findElement(Loginbutton).click();
}
}
