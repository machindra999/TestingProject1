package testNGassertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class NormalValidation {
  @Test
  public void facebook() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://en-gb.facebook.com/");
	  
	  driver.findElement(By.partialLinkText("Create new account")).click();
	  Thread.sleep(1000);
	  boolean femaleRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	  
	//  Assert.assertTrue(femaleRadioButton, "Test case failed radio button not selected");
	  Assert.assertFalse(femaleRadioButton,"Test case passed radio button not selected");
	  
  }
}
