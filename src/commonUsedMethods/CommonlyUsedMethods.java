package commonUsedMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods {

	
		// TODO Auto-generated method stub
		public static void takeScreenshot(WebDriver driver,String filename ) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest= new File("D:\\Screenshots\\sc\\"+filename+".png");
			FileHandler.copy(src, dest);
		}
		
		
		public static void scrollIntoView(WebDriver driver, WebElement element)
		{		
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",element );
		}
		
		
		public static void implicitWait(WebDriver driver, int time)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}
		
		public static String readDataFromExcel (int row, int cell) throws EncryptedDocumentException, IOException,FileNotFoundException
		{
			FileInputStream myFile= new FileInputStream("D:\\Screenshots\\TestingSheet.xlsx");
			Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
			String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
			return value;
			
			
		}
		

	

}
