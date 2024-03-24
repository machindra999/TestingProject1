package synchronization;




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.naukri.com/nlogin/login?URL=//www.naukri.com/mnjuser/profile");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
	}

}
