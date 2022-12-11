package com.framework.utils;

import java.io.IOException;

import javax.sound.midi.SysexMessage;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	public static Object[][] readExcelData(String excelfileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+excelfileName+".xlsx");

		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count " + rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count" + colCount);
		Object[][] data = new String[rowCount][colCount];
		for (int i = 1; i <rowCount+1; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell eachCell = eachRow.getCell(j);
				String value = eachCell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}

		}
		book.close();
		return data;
	}
}