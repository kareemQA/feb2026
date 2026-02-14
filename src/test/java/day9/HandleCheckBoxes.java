package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1) select specific check box
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2) select all the check boxes
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type='checkbox']"));
		
		//for loop
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		//enhanced for loop
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		*/
		
		//Select last 3 check boxes
		//total no of checkboxes - how many checkboxes want to select - starting index.
		
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		//select first 3 check boxes
		
	/*	for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		*/
		
		// unselect checkboxes if they are selected
		
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
			
		}
		
		
		
		
		
		
		
	}

}
