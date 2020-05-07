package PoiProgram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Demo {

	private static Object Xssfcell;

	public static void main(String[] args) throws IOException {
		//-----------------------------Path of sheet-----------------------
		String filepath =System.getProperty("user.dir")+"\\src\\PoiProgram\\Demo.xlsx";
		
		//-----------------------read the data from file-------------------
		FileInputStream fis = new FileInputStream(filepath);
		
		//get the sheet name
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("sheet1");
		
		//-------------------read data from row and cell-------------------
		
		XSSFRow r= (XSSFRow) sh.getRow(0);
		int row = sh.getPhysicalNumberOfRows();
		XSSFCell c = r.getCell(1);
		
		// ---------------------total num of rows -------------------------
		System.out.println("total number of rows " + sh.getPhysicalNumberOfRows());
		System.out.println("count cell number " + r.getPhysicalNumberOfCells());
		
		//-------------------read all the data from sheet-----------------
		for(int i=0;i<row;i++) {
			XSSFRow r1 = (XSSFRow) sh.getRow(i);
			int cell1= r1.getPhysicalNumberOfCells();
		for(int j=0;j<cell1;j++) {
			XSSFCell cell11 =r1.getCell(j);
			System.out.print(cell11.getStringCellValue() + "  ");
		}
		System.out.println();
		}
		
		// ------------------------- read cell data ---------------------
		System.out.println(c.getStringCellValue());
		//count total row 
		int lastRow = sh.getLastRowNum();
		int firstRow = sh.getFirstRowNum();
		int count = lastRow- firstRow;
		System.out.println("index of last row " + count);		
	}

}