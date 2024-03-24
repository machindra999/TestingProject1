package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickUsingAC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickButoon = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Thread.sleep(1000);
		
		Actions act= new Actions(driver);
//		act.moveToElement(rightClickButoon).perform();
//		act.contextClick().perform();
//		act.moveToElement(rightClickButoon).click().build().perform();
		
//		
//		Thread.sleep(2000);
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.moveToElement(doubleClickButton).doubleClick().build().perform();

	}

}
