package sizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Point defaultPosition= driver.manage().window().getPosition();
		
		System.out.println(defaultPosition);
		
		Thread.sleep(1000);
		Point p= new Point(280,-100);
	    driver.manage().window().setPosition(p);
		
	}

}
