package coverFoxProject;

import org.openqa.selenium.chrome.ChromeDriver;

import commonUsedMethods.CommonlyUsedMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class CF_TC01_Validate_Search_result_for_heathcarePolicies {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
//		FileInputStream myFile= new FileInputStream("D:\\Screenshots\\TestingSheet.xlsx");
//		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("CoverFoxDataSheet");
//		String ageData = mySheet.getRow(1).getCell(0).getStringCellValue();
//		String pincodeData = mySheet.getRow(1).getCell(1).getStringCellValue();
//		String mobNumberData = mySheet.getRow(1).getCell(2).getStringCellValue();
		
		
		String ageData = CoverFoxCommonlyUsedMethods.readDataFromExcel("CoverFoxDataSheet", 0, 0);
		String pincodeData = CoverFoxCommonlyUsedMethods.readDataFromExcel("CoverFoxDataSheet", 0, 1);
		String mobNumberData=CoverFoxCommonlyUsedMethods.readDataFromExcel("CoverFoxDataSheet", 0, 2);
				
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFoxHomePage login= new CoverFoxHomePage(driver);
		Thread.sleep(1000);
		login.clickOnGetStartedButton();
		
		CoverFoxHealth_planPage plan= new CoverFoxHealth_planPage(driver);
		plan.clickOnnextButtonOnHealthPlan();
		
		CoverFoxMemberDetailsPage details= new CoverFoxMemberDetailsPage(driver);
		details.clickOnageBox(ageData);
		details.clickOnnextButtonOnMemberDetailsPage();
		
		CoverFoxAddressDetails address= new CoverFoxAddressDetails(driver);
		address.fillPinCodeField(pincodeData);
		address.fillmobileField(mobNumberData);
		address.clickOnContinueutton();
		
		CoverFoxHealthPlanResult planResults=  new CoverFoxHealthPlanResult(driver);
		Thread.sleep(5000);
		planResults.validateSearchResult(driver);
		
		driver.close();
		
		

	}

}
