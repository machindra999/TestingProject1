package searchBoxOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSearchOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?authuser=3");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> searchResult=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		for(WebElement li:searchResult)
		{
			
			System.out.println(li.getText());
		}
		
		String expectedResult="honda activa";
		for(WebElement sr1:searchResult)
		{
			String actResult = sr1.getText();
			if(actResult.equals(expectedResult))
			{
				sr1.click();
				break;
			}
			
		}
		
	}

}
