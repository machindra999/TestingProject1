package excelReaderStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream myFile= new FileInputStream("D:\\Screenshots\\TestingSheet.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
//		Row myRow = mySheet.getRow(2);
//		Cell myCell = myRow.getCell(0);
//		CellType myDataType = myCell.getCellType();
//		System.out.println(myDataType);
		int totalNoOfRows=mySheet.getLastRowNum();
		System.out.println(totalNoOfRows);
		
		System.out.println("===================");
		short totalNoOfCells=mySheet.getRow(2).getLastCellNum();
		System.out.println(totalNoOfCells);
		
		
		
		for(int i=0;i<=totalNoOfRows;i++)
		{
			for (int j=0;j<=totalNoOfCells-1;j++)
			{
				CellType myCellType = mySheet.getRow(i).getCell(j).getCellType();
				if(myCellType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+ " ");
				}
				else if(myCellType==CellType.NUMERIC)
				{
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+ " ");
				}
				else if(myCellType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+ " ");
				}
				else
				{
					System.out.println(" ");
				}
			}
			System.out.println();
			System.out.println("===============================");
		}

	}

}
