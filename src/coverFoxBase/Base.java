package coverFoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static protected WebDriver driver;
	public void launchCoverFoxBrowser()
	{
		driver = new ChromeDriver();
		
	}
	
	public void closeCoverfox() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
