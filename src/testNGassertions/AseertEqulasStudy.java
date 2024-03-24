package testNGassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AseertEqulasStudy {
  @Test
  public void equalsAssert() {
	  
	  String a= "Pune";
	  String b= "Mumbai";
	  String c= "Pune";
	  int d=20;
	  int e=20;
	  int f=30;
	  
	//  Assert.assertEquals(a, b,"Test case failed a is not equals b");
//	  Assert.assertNotEquals(a,b, "Test case passed a not equals to b");
//	  Assert.assertEquals(d, e,"Test case failed a is not equals b");
	  Assert.assertNotEquals(d,e, "Test case failed d equals to f");
  }
}
