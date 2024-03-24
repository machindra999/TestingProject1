package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Grouping_TestNG {
 
  @Test(groups= "regression")
  public void myBeforeMethod()
  {
	  Reporter.log("This is before method", true);
  }
  
  @Test(groups= "regression")
  public void e() {
	  Reporter.log("This is test e method",true);
	  
  }
  @Test(groups= "regression")
  public void f() {
	  Reporter.log("This is test f method",true);
  }
  @Test(groups= "regression")
  public void myAfterMethod()
  {
	  Reporter.log("This is after method", true);
  }
  
  @Test(groups={"regression","sanity"})
  public void beforeClass(){
	  
	  Reporter.log("Before class method", true);
	  
  }
  @Test(groups= "sanity")
  public void afterClass() {
	  Reporter.log("After class method",true);
  }
  @Test(groups= "regression")
  public void beforeSuit() {
	  Reporter.log("Before suite method",true);
  }
  
  @Test(groups= "sanity")
  public void afterSuit() {
	  Reporter.log("after suite method",true);
  }
}