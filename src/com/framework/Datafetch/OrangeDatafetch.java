package com.framework.Datafetch;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OrangeDatafetch {
	public String dataFetch(String sheetName,int row,int Cell) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Documents\\selenium\\sudheer.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		DataFormatter format=new DataFormatter();
		return (format.formatCellValue(book.getSheet(sheetName).getRow(row).getCell(Cell)));
	}
}
