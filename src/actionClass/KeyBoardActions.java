package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		WebElement dobDay = driver.findElement(By.id("day"));
		Actions act= new Actions(driver);
		
		act.click(dobDay);
		
		act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		act.keyDown(firstname,Keys.SHIFT).sendKeys("machindra").build().perform();
		
		
		
	}

}
