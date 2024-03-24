package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement bookTable = driver.findElement(By.name("BookTable"));
		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		for(WebElement th:tableHeaders)
		{
			System.out.print(th.getText()+"  ");
		}
		System.out.println();
		System.out.println("============================================");
		
		WebElement particularElement=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[3]"));
		System.out.println(particularElement.getText());
		
		//columns print
		List<WebElement> columnsData = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[3]"));
		for(WebElement cd:columnsData)
		{
			System.out.println(cd.getText());
		}
		System.out.println("=================================================");
		
		Thread.sleep(1000);
		
		//by index position		
		for(int i=2;i<=7;i++)
		{
			WebElement tableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td"));
			WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(1000));
			w.until(ExpectedConditions.visibilityOf(tableData));
			System.out.println(tableData.getText());
		}
		

	}

}
