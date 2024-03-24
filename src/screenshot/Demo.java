package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://discord.com/login?redirect_to=%2Fchannels%2F%40me");
		Thread.sleep(1000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		RandomString rs= new RandomString();
		rs.make(2);
		
		File dest= new File("D:\\Screenshots\\sc\\myScreenshot"+rs+".png");
		
		FileHandler.copy(source, dest);
	}

}
