package com.framwork.intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2ReadContinu {

	public static void main(String[] args) throws IOException {
		// Sce3:How to print particular row value
		// 1.To find the file loc
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\OnlineFrameWorkMay9AM\\Input\\TestData.xlsx");
		// Read the valye
		FileInputStream fi = new FileInputStream(f);
		// Type of Workbook
		Workbook w = new XSSFWorkbook(fi);
		// Get Sheet name
		Sheet s = w.getSheet("Sheet1");
		// Get Row valye
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		int cellType = c.getCellType();
		// if cell type is 1-->String
		// cell type is 0-->Date or Number
		System.out.println("Celltype is " + cellType);
		System.out.println("Cell value is " + c);
		// getStringCellValue,getDateCellValue,getNumericCellValue
		if (cellType == 1) {
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				System.out.println(dateCellValue);
				SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
				String format = sim.format(dateCellValue);
				System.out.println(format);
			} else {
				double numericCellValue = c.getNumericCellValue();//9.548909E33
				System.out.println(numericCellValue);
				// TypeCasting-->converting one datatype into another dataType
				long l = (long) numericCellValue;//986523221
				// To convert into String
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
		}
	}
}
