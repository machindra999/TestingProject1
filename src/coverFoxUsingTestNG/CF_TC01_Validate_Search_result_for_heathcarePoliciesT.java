package coverFoxUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CF_TC01_Validate_Search_result_for_heathcarePoliciesT {
	WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealth_planPage healthPlan;
	CoverFoxAddressDetails addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxHealthPlanResult result;
	
	@BeforeClass
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		home= new CoverFoxHomePage(driver);
		healthPlan= new CoverFoxHealth_planPage(driver);
		addressDetails= new CoverFoxAddressDetails(driver);
		memberDetails= new CoverFoxMemberDetailsPage(driver);
		result= new CoverFoxHealthPlanResult(driver);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("Launching browser", true);
	}
	
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException {
		home.clickOnGetStartedButton();
		healthPlan.clickOnnextButtonOnHealthPlan();
		Thread.sleep(1000);
		memberDetails.clickOnageBox("33");
		memberDetails.clickOnnextButtonOnMemberDetailsPage();
		addressDetails.fillPinCodeField("412301");
		addressDetails.fillmobileField("8379878988");
		addressDetails.clickOnContinueutton();
		memberDetails.clickOnnextButtonOnMemberDetailsPage();
		
	}
	
	
	@Test
  public void validateTestPlans() throws InterruptedException {
		Thread.sleep(5000);
		int textResult = result.availableResultFromText();
		int bannerResult =result.availableNumberFromBanner();
	    Assert.assertEquals(textResult, bannerResult,"Test result is not matching with banner result");
	    Reporter.log("Test case passed!!!", true);
  }
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
}
