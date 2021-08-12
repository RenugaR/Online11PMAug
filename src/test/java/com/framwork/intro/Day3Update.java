package com.framwork.intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day3Update {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\OnlineFrameWorkMay9AM\\Input\\TestData.xlsx");

		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String stringCellValue = c.getStringCellValue();
		System.out.println(stringCellValue);
		if (stringCellValue.equalsIgnoreCase("java")) {
			c.setCellValue("Selenium");
		}
		System.out.println(c);
		System.out.println("Update done");
		// To save the file
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
	}
}
