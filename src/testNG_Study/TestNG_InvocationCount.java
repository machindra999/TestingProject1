package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_InvocationCount {
	  @BeforeMethod
	  public void myBeforeMethod()
	  {
		  Reporter.log("This is before method", true);
	  }
	//  @BeforeMethod
	//  public void myBeforeMethod2()
	//  {
//		  Reporter.log("This is before method2", true);
	//  }
	  @Test(priority=2)
	  public void e() {
		  Reporter.log("This is test e method",true);
		  
	  }
	  
	  
	  @Test(invocationCount=3,groups = "Regression")  
	  public void f() {
		  Reporter.log("This is test f method",true);
	  }
	  
	  @Test(priority=-2)
	  public void z() {
		  Reporter.log("This is test z method",true);
	  }
	  
	  @AfterMethod
	  public void myAfterMethod()
	  {
		  Reporter.log("This is after method", true);
	  }
	  
	  @BeforeClass
	  public void beforeClass(){
		  
		  Reporter.log("Before class method", true);
		  
	  }
	  @AfterClass
	  public void afterClass() {
		  Reporter.log("After class method",true);
	  }
}
