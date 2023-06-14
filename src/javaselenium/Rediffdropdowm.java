package javaselenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdowm {
	
	ChromeDriver cd;
	
	@Before
	public void start1()
	{
	cd=new ChromeDriver();
	cd.get("https://www.rediff.com");
	}

	@Test
	public void test()
	{
		cd.findElement(By.xpath("//div[@class='cell alignR toprlinks']/p/a[2]")).click();
	   Select s=new Select( cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));		//select class for dropdown
	   s.selectByValue("10");																						//select by values//visibletext//index
	   Select v=new Select(cd.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")));
	   v.selectByVisibleText("MAY");
	   Select r=new Select(cd.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")));
	   r.selectByValue("1997");
	    
	   List<WebElement>links=s.getOptions();
	   System.out.println("count of day is - "+links.size());
	   
	   List<WebElement>links1=v.getOptions();
	   System.out.println("count of month is - "+links1.size());
	   
	   List<WebElement>links2=s.getOptions();
	   System.out.println("count of Year is - "+links2.size());
	}
	

}
