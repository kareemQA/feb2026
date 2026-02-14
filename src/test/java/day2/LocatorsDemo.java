package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		//name locator
		driver.findElement(By.name("search")).sendKeys("mac");
		
		//id locator
		Boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
		
		System.out.println(logoDisplayStatus);
		
		
		

	}

}
