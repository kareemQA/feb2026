package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(frame);
		
		//WebElement frame1=driver.findElement(By.xpath("//h5[normalize-space()='iFrame Demo']"));
		
		//driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
		
		
		
		
		
		
		
		
	}

}
