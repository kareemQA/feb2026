package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
  Test Case
  ---------
  1)Launch browser(Chrome)
  2)Open URL https://demo.opencart.com/
  3)Validate title should be "Your Store"
  4)Close browser
 
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
	//	1)Launch browser(Chrome)
		
	    //ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new EdgeDriver();
		
	//  2)Open URL https://demo.opencart.com/	
		
		driver.get("https://www.facebook.com/");
		
	//	3)Validate title should be "Facebook – log in or sign up"	
		
		String actual_title=driver.getTitle();
		
		if(actual_title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	// 4)Close browser
		
		//driver.close();
		//driver.quit();
		
		
	}
}
