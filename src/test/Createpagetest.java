package test;


import org.testng.annotations.Test;

import page.Createpage;

public class Createpagetest extends Baseclass  {
	
	
	@Test
	public void test()
	{
		Createpage c=new Createpage(cd);
		c.click();
		c.click1();
		
	}
	

}
