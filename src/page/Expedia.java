package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Expedia {
	
	ChromeDriver cd;
	
	By flightbutton=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/ul/li[2]/a/span");
	By leaviingfrombuttonclick=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div/div/div[1]/button");
	By leavingplacetype=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/section/div/div[1]/div/input");
	By leavingplaceselect=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/section/div/div[2]/div/ul/li[1]/div/button");
	By goingtoplacebuttonclick=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/button");
	By goingtoplacetype=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/section/div/div[1]/div/input");
	By goingtoplacenameselect=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/section/div/div[2]/div/ul/li[1]/div/button");
	By travellerbutton=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/ul/div[2]/div[1]/div/div/div/button");
	By travellercount=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span");
	By childcount=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span");
	By childage=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/ul/div[2]/div[1]/div/div/div/div/div/div/div[2]/section/div[1]/div[3]/div/div/select");
	By donebutton=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button");
	By economybutton=By.xpath("//*[@id=\"preferred-class-input-trigger\"]");
	By firstclassbutton=By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]/span");
	By todate=By.xpath("//*[@id=\"d1-btn\"]");
	By nextarrow=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]");
	By monthname=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2");
	By dates=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button");
	By done2button=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button");
	
	public Expedia(ChromeDriver cd)
	{
		this.cd=cd;
	}
	
	public void flightclick()
	{
		cd.findElement(flightbutton).click();
	}
	public void leavingbuttonclick()
	{
		cd.findElement(leaviingfrombuttonclick).click();
	}
	public void  leavingplace(String t)
	
	{
		cd.findElement(leavingplacetype).sendKeys(t,Keys.ENTER);
	}
	
	public void toplace()
	{
		cd.findElement(goingtoplacebuttonclick).click();
	}
	public void toplacenametyp(String t1)
	{
		cd.findElement(goingtoplacetype).sendKeys(t1,Keys.ENTER);
		
	}

	public void travelleropt()
	{
		cd.findElement(travellerbutton).click();
		cd.findElement(travellercount).click();
		
		cd.findElement(childcount).click();
		WebElement w=cd.findElement(childage);
		
		Select s1=new Select(w);
		s1.selectByValue("3");
		cd.findElement(donebutton).click();
		
		}
	public void economy()
	{
		cd.findElement(economybutton).click();
		cd.findElement(firstclassbutton).click();
		
		}
	
	public void date()
	{
		cd.findElement(todate).click();
		while(true)
		{
			WebElement w1= cd.findElement(monthname);
			String s=w1.getText();
			
			if(s.equals("September 2023"))
			{
				System.out.println(s);
				break;
			}
			else
			{
				cd.findElement(nextarrow).click();
				
			}
		}
		
			List<WebElement>datelist=cd.findElements(dates);
			
			for(WebElement date:datelist)
			{
				String dates=date.getAttribute("data-day");
				
				if(dates.equals("25"))
				{
					date.click();
					System.out.println("Date is selected");
	
				}
			}
	}
	public void done2button()
	{
		cd.findElement(done2button).click();
	}
	
	
}


