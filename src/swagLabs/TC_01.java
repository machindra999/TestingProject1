package swagLabs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	
		// TODO Auto-generated method stub
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SwagLabs_LoginPage login= new SwagLabs_LoginPage(driver);
		
		login.enterUserName();
		login.enterPassword();
		login.submitButton();
		
	}
		
		
		
		

	

}
