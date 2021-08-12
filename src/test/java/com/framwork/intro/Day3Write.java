package com.framwork.intro;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day3Write {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\ADMIN\\eclipse-workspace\\OnlineFrameWorkMay9AM\\Input\\TestDataWrite.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Data");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Java");
		System.out.println(c);
		FileOutputStream fo = new FileOutputStream(loc);
		w.write(fo);

		System.out.println("Write done");

	}
}
