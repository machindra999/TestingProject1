package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		System.out.println("================START=================");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println("=================");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@id='head'])[1]")).click();
		System.out.println("================END=================");
		
		

	}

}
