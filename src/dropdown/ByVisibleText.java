package dropdown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import commonUsedMethods.CommonlyUsedMethods;

public class ByVisibleText {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		WebElement dropdown=driver.findElement(By.id("cars"));
//		//System.out.println(dropdown.getText());
//		Select s= new Select(dropdown);
//		System.out.println(s.isMultiple());
//		s.selectByVisibleText("9");
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.id("day"));
		
		Select sel= new Select(date);
		sel.selectByVisibleText("9");
		System.out.println(sel.getFirstSelectedOption().getText()); 
		CommonlyUsedMethods.takeScreenshot(driver, "FB");
		Thread.sleep(500);
		driver.close();
		
		
		
		
		
		
		

	}

}
