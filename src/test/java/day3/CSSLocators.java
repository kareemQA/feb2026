package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		//tag id
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Tshirts");
		
		//tag class
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Tshirts");
		
		//tag attribute
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Tshirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Tshirts");
		
		//tag class attribute
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("shirts");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
