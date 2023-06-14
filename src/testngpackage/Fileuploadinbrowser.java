package testngpackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadinbrowser {

	ChromeDriver cd;
	
	@BeforeTest
	public void before()
	{
		cd=new ChromeDriver();
	}
	
	@BeforeMethod
	public void before1()
	{
		cd.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@Test
	public void test() throws Exception
	{
		
		cd.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[4]/a")).click();
		
		fileUpload("C:\\Users\\ASUS\\Desktop\\Software Testing\\Govindh Notes 3.docx");
	}
	
	public void fileUpload(String p) throws Exception 
	{
		StringSelection strselection=new StringSelection(p);										//used to select,copy and store the path of the file to be uploaded.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		
		Robot rob=new Robot();																		// used to paste the stored path of the file to be uploaded and press enter.
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
}
