package dropdown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonUsedMethods.CommonlyUsedMethods;

public class QaDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		CommonlyUsedMethods.implicitWait(driver, 2);
		WebElement wb=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		wb.click();
//		Select sel= new Select(wb);
//		sel.selectByVisibleText("Group 1, option 2");
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		CommonlyUsedMethods.takeScreenshot(driver, "fb");
		CommonlyUsedMethods.scrollIntoView(driver, wb);
//		System.out.println(sel.getFirstSelectedOption().getText());		
	}

}
