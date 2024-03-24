package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(1000);
		String mainWindowID = driver.getWindowHandle();
		
		Set<String> allWindowID = driver.getWindowHandles();
		
		Iterator<String> it = allWindowID.iterator();
		String mainWindowId=it.next();
		String child1WindowId=it.next();
		
		driver.switchTo().window(child1WindowId);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("the7-search")).sendKeys("QA");
		Thread.sleep(1000);
		
		
		

	}

}
