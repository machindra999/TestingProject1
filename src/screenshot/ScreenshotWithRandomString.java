package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotWithRandomString {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(1000);
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		RandomString r= new RandomString();
		r.make(3);
		File dest= new File("D:\\Screenshots\\sc\\sc"+r+".png");
		FileHandler.copy(Source, dest);
		driver.close();
		
		

	}

}
