package day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		//getTitle - returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single Browser window.
		System.out.println(driver.getWindowHandle()); //26488408DF8E59FE86E67D2613A84A81
													  //46C3B840D7A5AEF8B21E48F8139118C9
		
		//getWindowHandles()-returns ID's of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will opens new browser window
		
		Set<String> windowIds=driver.getWindowHandles();
		
		System.out.println(windowIds);
		
		
		
		

	}

}
