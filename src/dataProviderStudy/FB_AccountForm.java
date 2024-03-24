package dataProviderStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_AccountForm {
  @Test(dataProvider = "FB_regression",dataProviderClass = FB_Dataprovider.class)
  public void fbFormSubmit(String firstName, String lastName, String mobNumber) throws InterruptedException {
	  
	  WebDriver driver= new ChromeDriver();
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
