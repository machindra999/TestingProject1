package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement bookTable = driver.findElement(By.name("BookTable"));
		int noOfColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		int noOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("================");
		for(int i=1;i<=noOfRows;i++)		
		{
			for(int j=1;j<=noOfColumns;j++)
			{
				if(i==1)
				{
					 WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
					 System.out.print(data.getText()+"  ");					 
				}
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
					System.out.print(data.getText()+"  ");					
				}

			}
			System.out.println();
			System.out.println("================");
		}

	}

}
