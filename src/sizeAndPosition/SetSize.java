package sizeAndPosition;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Dimension defaultSize= driver.manage().window().getSize();
		System.out.println(defaultSize);
		
		Dimension d= new Dimension(800,500);
		driver.manage().window().setSize(d);

	}

}
