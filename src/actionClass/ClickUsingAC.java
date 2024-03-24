package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingAC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		
		Actions act= new Actions(driver);
		
		Thread.sleep(1000);
		//act.moveToElement(loginButton).click().build().perform();
//		act.moveToElement(loginButton).perform();
//		Thread.sleep(1000);
//		act.click().perform();
		act.click(loginButton).perform();

	}

}
