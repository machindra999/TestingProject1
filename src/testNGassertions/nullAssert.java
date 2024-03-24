package testNGassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class nullAssert {
  @Test
  public void f() {
	  
	  String a= null;
	  String b="Pune";
	  
//	  Assert.assertNull(a,"Test case failed value is notnull");
//	  Assert.assertNull(b,"Test case failed value is notnull");
//	  Assert.assertNotNull(b,"Test case failed value is null");
	  Assert.assertNotNull(a,"Test case failed value is null");
  }
}
