
package testNG_XMLuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
  @Test
  public void facebook() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://en-gb.facebook.com/");
  }
}
