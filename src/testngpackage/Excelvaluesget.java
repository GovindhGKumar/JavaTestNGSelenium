package testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excelvaluesget {
	
	
	
	@Test
	public void excel() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\ASUS\\Desktop\\Software Testing\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);			//Workbook details
		XSSFSheet sh=wb.getSheet("Sheet1"); 			//sheet details
		int rows= sh.getLastRowNum();
		
		for(int i=1;i<=rows;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String psswrd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username ="+username+"  password ="+psswrd);
		}
		
		
	}
	}
