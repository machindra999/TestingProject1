
package testNGassertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void f() {
	  String a= "pune";
	  String b= "mumbai";
	  String c= "pune";
	  
	  SoftAssert s= new SoftAssert();
	  s.assertEquals(a, b,"a is not equal to b test case failed");
	  
	  s.assertNotEquals(a, c,"a is equal to b test case failed");
	  
	  s.assertEquals(a, c,"a is not equal to b test case failed");
	  
	  s.assertAll();
  }
}
