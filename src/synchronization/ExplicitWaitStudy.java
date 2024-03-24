package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(5000));
		WebElement mobileNumberData = driver.findElement(By.id("mobileNumber"));
		mobileNumberData.sendKeys("8388888888");
		w.until(ExpectedConditions.elementToBeClickable(getOtpButton));
		getOtpButton.click();

	}

}
