package commonUsedMethods;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Testing {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String data = CommonlyUsedMethods.readDataFromExcel(1, 1);
		System.out.println(data);
	}

}
