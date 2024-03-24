package coverFoxProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoverFoxHealthPlanResult {
	
	@FindBy(xpath = "(//div[@class='filter-sec'])[3]//div[@class='fc-filter-val']") private WebElement brandFilter;
	
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement result;
	
	@FindBy(id = "plans-list")private List<WebElement> totalResult;
	
	public CoverFoxHealthPlanResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  validateSearchResult(WebDriver driver) throws InterruptedException
	{	
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(result));
		String searchResult = result.getText();
		System.out.println(searchResult);
		String arr[] = searchResult.split(" ");
		String searchResultString= arr[0];
		
		int searchResultInt = Integer.parseInt(searchResultString);
		System.out.println("Total number of matching result :" +searchResultInt);
		
		Thread.sleep(1000);
		int totalResultCount = totalResult.size();
		System.out.println("Total number of matching result :"+totalResultCount);
		
		if(searchResultInt==totalResultCount)
		{
			System.out.println("Plans number matching with plans count");
		}
		else
		{
			System.out.println("Plans number not matching with plans count");
		}
	}
	
	

}
