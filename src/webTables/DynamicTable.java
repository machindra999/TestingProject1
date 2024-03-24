package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		int noOfColumns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		int noOfRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		for(int i=1;i<=noOfColumns;i++)
		{
			 WebElement headers = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th["+i+"]"));
			 System.out.print(headers.getText()+ "  ");
		}
		System.out.println();
		System.out.println("===========================");
		
		for(int j=1;j<=noOfRows;j++)
		{
			for(int h=1;h<=noOfColumns;h++)
			{
				WebElement headers = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+j+"]/td["+h+"]"));
				System.out.print(headers.getText()+ "  ");

		}
			
			System.out.println();
			System.out.println("============================");
		}
		System.out.println();
		System.out.println("============================");

	}

}
