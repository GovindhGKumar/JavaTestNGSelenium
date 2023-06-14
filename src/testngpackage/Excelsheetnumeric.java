package testngpackage;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excelsheetnumeric {
	
	ChromeDriver cd;
	@BeforeTest
	public void before()
	{
		cd=new ChromeDriver();
	}
	
	@BeforeMethod
	public void before1()
	{
		cd.get("https://www.facebook.com/");
	}
	
	@Test
	public void excel() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\ASUS\\Desktop\\Software Testing\\Book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);			//Workbook details
		XSSFSheet sh=wb.getSheet("Sheet1"); 			//sheet details
		int rows= sh.getLastRowNum();
		
		for(int i=1;i<=rows;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String s =sh.getRow(i).getCell(1).getStringCellValue();			//getnumericvalue is always stored as double.
			
																				//double stores number with .0 value
			//System.out.println("username ="+username+"  password ="+psswrd);
																				//so typecast to integer.
			cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));						
			cd.findElement(By.name("email")).clear();
			cd.findElement(By.name("email")).sendKeys(username);
			cd.findElement(By.name("pass")).clear();
			cd.findElement(By.name("pass")).sendKeys(s,Keys.ENTER);
			
			
			
			
		
		
			
		}
		
		
	}

}
