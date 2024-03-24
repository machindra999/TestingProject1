package iFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("cri");
		Thread.sleep(2000);
		List<WebElement> searchResult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		
		for(WebElement r:searchResult)
		{
			System.out.println(r.getText());
		}
		System.out.println("================================");
		
		String expectedResult= "cricket live score";
		
		for (WebElement cl:searchResult)
		{
			String actualResult = cl.getText();
			if(actualResult.equals(expectedResult)) 
			{
				cl.click();
				break;
			}

		}
		Thread.sleep(2000);
		
		
	}

}
