package windowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MltipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='MNC'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Remote'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Marketing']")).click();
		Thread.sleep(2000);
		
		Set<String>allWindowID=driver.getWindowHandles();
		
		ArrayList<String>arr=new ArrayList<>(allWindowID);
		
		for(int i=0;i<arr.size();i++)
		{
			driver.switchTo().window(arr.get(i));
			System.out.println(driver.getTitle());
		}

	}

}
