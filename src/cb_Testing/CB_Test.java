package cb_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB_Test {
  @Parameters("browserName")
  @Test
  public void fbXML_Data(String browserName,String firstName,String lastName,String mobNumber) throws InterruptedException {
	  WebDriver driver = null;
	  if(browserName.equals("chrome")) {
	   driver= new ChromeDriver();
	  }
	  else if(browserName.equals("firefox")) {
		  driver= new FirefoxDriver();
	  }
	  
	  
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://en-gb.facebook.com/");
	  driver.findElement(By.partialLinkText("Create new account")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("firstname")).sendKeys(firstName);
	  driver.findElement(By.name("lastname")).sendKeys(lastName);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobNumber);
	  Thread.sleep(1500);
	  driver.close();
}
}