package dataProviderStudy;

import org.testng.annotations.DataProvider;


public class FB_Dataprovider {
  @DataProvider(name="FB_regression")
  public static String[] []fbDataSet() {
	  
	  String data[][]= {{"machindra","kale","7030901965"},{"abc","xyz","8888888888"},{"pqr","lkf","9999999999"}};
	  return data;
  }
}
