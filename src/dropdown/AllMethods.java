package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement day=driver.findElement(By.id("day"));
		day.click();
		Select sel = new Select(day);
		sel.selectByIndex(8);
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println("====================");
		
		
		WebElement month=driver.findElement(By.id("month"));
		month.click();
		Select montH= new Select(month);
		montH.selectByVisibleText("Sep");
		System.out.println(montH.getFirstSelectedOption().getText());
		System.out.println("====================");
		
		WebElement year=driver.findElement(By.id("year"));
		year.click();
		Select yeaR= new Select(year);
		yeaR.selectByValue("1997");
		System.out.println(yeaR.getFirstSelectedOption().getText());
		System.out.println("====================");
		
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println(montH.getFirstSelectedOption().getText());
		System.out.println(yeaR.getFirstSelectedOption().getText());
		System.out.println("====================");
		
		List<WebElement> allOptions = montH.getOptions();
		for(WebElement op:allOptions)
		{
			System.out.println(op.getText());
		}
		System.out.println("====================");
		
		driver.quit();
		
		
		
		

	}

}
