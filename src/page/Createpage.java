package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createpage {
	
ChromeDriver cd;

By createbutton=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/a");
By getstartedbutton=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");

public Createpage(ChromeDriver cd)
{
	this.cd=cd;
}

public void click()
{
 cd.findElement(createbutton).click();
 
}
public void click1()
{
	
 cd.findElement(getstartedbutton).click();
}

}
