package coverFoxTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetails;
import coverFoxPOM.CoverFoxHealthPlanResult;
import coverFoxPOM.CoverFoxHealth_planPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxUtil.Utility;


@Listeners(coverFoxListner.ListnerClass.class)
public class CF_TC01_Validate_Search_result_for_heathcarePoliciesT extends Base {
	
	CoverFoxHomePage home;
	CoverFoxHealth_planPage healthPlan;
	CoverFoxAddressDetails addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxHealthPlanResult result;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		launchCoverFoxBrowser();
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
	public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException {
		home.clickOnGetStartedButton();
		healthPlan.clickOnnextButtonOnHealthPlan();
		Thread.sleep(1000);
		memberDetails.clickOnageBox(Utility.readDataFromPropertiesFile("age"));
		memberDetails.clickOnnextButtonOnMemberDetailsPage();
		addressDetails.fillPinCodeField(Utility.readDataFromPropertiesFile("pincode"));
		addressDetails.fillmobileField(Utility.readDataFromPropertiesFile("mobileNumber"));
		addressDetails.clickOnContinueutton();
		
		
	}
	
	
	@Test
	public void validateTestPlans() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int textResult = result.availableResultFromText();
		int bannerResult =result.availableNumberFromBanner();
	    Assert.assertEquals(textResult, bannerResult,"Test result is not matching with banner result");
	    Reporter.log("Test case passed!!!", true);
	    Utility.takeScreenshot(driver, "coverfox");
  }
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
}
