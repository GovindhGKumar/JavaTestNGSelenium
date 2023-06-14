package javaselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
	
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
		String ps=cd.getPageSource();
		
		if(ps.contains("Gmail"))
		{
			System.out.println("Gmail is present");
		}
		else
		{
			System.out.println("Gmail is not present");
		}
	}

}
