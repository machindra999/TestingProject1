package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_DependsOnMEthod {
  @Test
  public void f() {
	  
	  Reporter.log("This is test f method",true);
  }
  
  @Test(enabled = false)
  public void a() {
	  Reporter.log("This is a method",true);
  }
  
  @Test(dependsOnMethods = "d")
  public void b() {
	  Reporter.log("This is test b method", true);
  }
  @Test
  public void d() {
	  Reporter.log("This is test d method", true);
}
}