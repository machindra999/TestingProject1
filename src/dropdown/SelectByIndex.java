package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		WebElement month=driver.findElement(By.id("month"));
		month.click();
		Select sel= new Select(month);
		sel.selectByIndex(8);
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println(sel.isMultiple());
		
		driver.close();
	
		
		

	}

}
