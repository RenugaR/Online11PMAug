package com.framwork.intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day1Read {

	public static void main(String[] args) throws IOException {
		// 1.To find the file loc
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\OnlineFrameWorkMay9AM\\Input\\TestData.xlsx");
		// To read the values
		FileInputStream fi = new FileInputStream(f);
		// Typeof Workbook-->XSSFWorkbook
		Workbook w = new XSSFWorkbook(fi);
		// SheetName
		Sheet s = w.getSheet("Sheet1");
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println("No of Rows are " + physicalNumberOfRows);//2
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row r = s.getRow(i);//0
			int physicalNumberOfCells = r.getPhysicalNumberOfCells();
			System.out.println("Cells are "+physicalNumberOfCells);//2
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
		}

	}
}
