package testngpackage;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Groupingmethods
	{
		
	
		
		ChromeDriver cd;
		
		@BeforeTest(alwaysRun=true)
		public void start()
		{
			cd=new ChromeDriver();
			
		}
		@BeforeMethod(alwaysRun=true)
		public void urlload()
		{
			cd.get("https://www.facebook.com");
			
		}
		
		@Test(groups= {"sanity"})
		public void title()
		{
			boolean b =cd.findElement(By.xpath("//*[@id='content']/div/div/div/div/div/img")).isDisplayed();
			if(b)
			{
				System.out.println("Logo is present");
			}
			else
			{
				System.out.println("Logo is absent");
			}
			
		}
		
		@Test(groups= {"smoke"})
		
		public void clicks()
		{
			WebElement w=cd.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/h2"));
			String st=w.getText();
			System.out.println(st);

		
			
			
		
			
		}
		
			@Test(groups= {"smoke","sanity"})
			public void texts()
			{
				WebElement we=cd.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
				String sw=we.getText();
				
				System.out.println(sw);
			}
		
	
		
			
			@AfterTest
			public void slow()
			{
				cd.quit();
			}
		

}
