package javaselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumjava {

	public static void main(String[] args) {
		

		
		ChromeDriver cd=new ChromeDriver();									//for chrome browser
		cd.get("https://www.google.com");									//to get the website title
		String actualtitle=cd.getTitle();
		System.out.println("actual title is "+actualtitle);
		String expectedtitle="Google";
		System.out.println("expected title is "+expectedtitle);
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
