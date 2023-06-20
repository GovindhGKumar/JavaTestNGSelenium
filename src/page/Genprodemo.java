package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javaselenium.Webelementscount;



public class Genprodemo {
	
ChromeDriver cd;
	
	By usernamecolumn=By.xpath("//*[@id=\"user-name\"]");
	By pswrdcolumn=By.xpath("//*[@id=\"password\"]");
	By loginbutton=By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input");
	By filterdropdown=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	By filterlowhigh=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]");
	By addcartonesie=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	By addcartbikelight=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	By addcartBoltTshirt=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	By addcartTshirtRed=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	By addcartbackpack=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By addcartjacket=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
	By cartbutton=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By checkoutbutton=By.xpath("//*[@id=\"checkout\"]");
	By firstname=By.xpath("//*[@id=\"first-name\"]");
	By lastname=By.xpath("//*[@id=\"last-name\"]");
	By Zip=By.xpath("//*[@id=\"postal-code\"]");
	By continuebutton=By.xpath("//*[@id=\"continue\"]");
	By finishbutton=By.xpath("//*[@id=\"finish\"]");
	By backhome=By.xpath("//*[@id=\"back-to-products\"]");
	By hamburger=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");
	
	
	public Genprodemo(ChromeDriver cd)
	{
		this.cd=cd;
	}
	
	public void setvaluesdemo(String username,String pswrd)
	{
		cd.findElement(usernamecolumn).sendKeys(username);
		cd.findElement(pswrdcolumn).sendKeys(pswrd);
		cd.findElement(loginbutton).click();
		cd.navigate().refresh();
		
		String s=cd.getCurrentUrl();
		String t="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(s, t);
		System.out.println("The URL is correct");
		
		
		
		
	}
	
	public void filter()
	{
		
		Select s=new Select(cd.findElement(filterdropdown));
		s.selectByValue("lohi");
		
		
	}
	
	public void addtocart()
	{
		List<WebElement>addcart=cd.findElements(By.xpath("//*[@class=\"btn btn_primary btn_small btn_inventory\"]"));
		for(WebElement cart:addcart)
		{
			cart.click();
		}
		
	}
	public void cartclick()
	{
		cd.findElement(cartbutton).click();
	}
	
	public void cartremove()
	{
		List<WebElement>l=cd.findElements(By.xpath("//*[@id=\"cart_contents_container\"]"));
		for(WebElement w:l)
		{
			String u=w.getText();
			if(u.contains("$9.99"))
			{
				cd.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
				
			}
			if(u.contains("$7.99"))
					{
					cd.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
					}
			System.out.println("The items below $15 are removed");
			
			}
		}
	public void checkoutbutton()
	{
		cd.findElement(checkoutbutton).click();
	}
	public void userdetails()
	{
		cd.findElement(firstname).sendKeys("Govindh");
		cd.findElement(lastname).sendKeys("G Kumar");
		cd.findElement(Zip).sendKeys("689121");
	}
	
	public void continuebutton()
	{
		cd.findElement(continuebutton).click();
	}
	public void finishbtn()
	{
		cd.findElement(finishbutton).click();
	}
	public void homebtn()
	{
		cd.findElement(backhome).click();
	}
	public void hamburger()
	{
		cd.findElement(hamburger).click();
	}
	public void logoutbtn()
	{
		cd.findElement(logout).click();
	}
}
