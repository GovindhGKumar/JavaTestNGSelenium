package testngpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extentreportmaking {
	ChromeDriver cd;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;

		
		 @BeforeTest
		 public void beftest()
		 {
			 cd=new ChromeDriver();
			 reporter=new ExtentHtmlReporter("./Report/myreport1.html");
			 reporter.config().setDocumentTitle("Automationreport");
			 reporter.config().setReportName("Functionaltest");
			 reporter.config().setTheme(Theme.DARK);
			 extent=new ExtentReports();
			 extent.attachReporter(reporter);
			 extent.setSystemInfo("hostname", "localhost");
			 extent.setSystemInfo("OS","Windows");
			 extent.setSystemInfo("Testername", "abc");
			 extent.setSystemInfo("Browser","Chrome");
			 
			}
		 
		 @BeforeMethod
		 public void befmethod()
		 {
			cd.get(baseurl); 
		 }
		 
		 @Test
		 public void test()
		 {
			 test=extent.createTest("FB titletest");
			 String exp="Facebook helps you connect and share with the people in your life.";
			 WebElement we=cd.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/h2"));
			 String s1=we.getText();
			 Assert.assertEquals(exp, s1);
			 
		 }
		 
		 @Test
		 public void test1()
		 {
			 test=extent.createTest("logoname");
			 WebElement w=cd.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
			 String s=w.getText();
			 Assert.assertEquals(s, "Log in");
		 }
		 
		 @AfterTest
		 public void after()
		 {
			 extent.flush();
		 }
		 
		 @AfterMethod
		 public void browserclose(ITestResult result)
		 {
			 if(result.getStatus()==ITestResult.FAILURE)
			 {
				 test.log(Status.FAIL, "Test case failed is "+result.getName());
			 }
			 else if(result.getStatus()==ITestResult.SKIP)
			 {
				 test.log(Status.SKIP, "Test case skipped is "+result.getName());
			 }
			 else if(result.getStatus()==ITestResult.SUCCESS)
			 {
				 test.log(Status.PASS, "The case passed is "+result.getName());
			 }
			 
		 }
		
		 
		
}


