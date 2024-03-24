package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement month=driver.findElement(By.id("year"));
		month.click();
		Select sel= new Select(month);
		sel.selectByValue("1997");
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println("===============");
		List<WebElement> ab = sel.getOptions();
		for(WebElement drop:ab)
		{
			System.out.println(drop.getText());
		}
		
		System.out.println(sel.isMultiple());
		
		

	}

}
