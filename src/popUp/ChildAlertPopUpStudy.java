package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildAlertPopUpStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		String mainPageID=driver.getWindowHandle();
		
		Set<String>allPageIDs=driver.getWindowHandles();
		Iterator<String>it=allPageIDs.iterator();
		
		String mainPageId=it.next();
		String child1ID=it.next();
		
		driver.switchTo().window(child1ID);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Good Evening");
		
		driver.switchTo().window(mainPageId);
		driver.findElement(By.name("NewTab")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
