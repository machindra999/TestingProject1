package chromeOptionsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.google.com/webhp?authuser=3");
		System.out.println(driver.getTitle());
		

	}

}
