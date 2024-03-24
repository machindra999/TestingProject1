package chromeOptionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--headless");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement day=driver.findElement(By.id("day"));
		day.click();
		Select sel = new Select(day);
		sel.selectByIndex(8);
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println("====================");

	}

}
