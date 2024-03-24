package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement drop = driver.findElement(By.id("cars"));
		
		Select sel= new Select(drop);
		List<WebElement>allOptions=sel.getOptions();
		for(WebElement all:allOptions)
		{
			System.out.println(all.getText());
		}
		System.out.println(sel.isMultiple());
		
		System.out.println(allOptions.size());
		
		System.out.println("=========================");
		sel.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		sel.selectByValue("opel");
		Thread.sleep(1000);
		sel.selectByIndex(3);
		
		System.out.println("=========================");
		System.out.println(sel.getFirstSelectedOption().getText());
		List<WebElement>selectedOptions=sel.getAllSelectedOptions();
		Iterator<WebElement>it=selectedOptions.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText() );
		}
		
		
	}

}
