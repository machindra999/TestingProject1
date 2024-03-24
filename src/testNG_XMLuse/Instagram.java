package testNG_XMLuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instagram {
  @Test
  public void insta() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.instagram.com/");
  }
}
