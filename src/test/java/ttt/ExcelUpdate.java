package ttt;

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

public class ExcelUpdate {
	public static void main(String[] args) throws IOException {
		File loc  = new File("C:\\Users\\Suresh Kumar\\eclipse-workspace\\Sample1\\Testcase\\sample1.xlsx");
		FileInputStream st = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet("Suresh");
		Row r = s.getRow(5);
		Cell c = r.getCell(6);
		String s1 = c.getStringCellValue();
		if (s1.equals("Suresh")) {
			c.setCellValue("Kumar");
		}
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);
		System.out.println("Successfully done");
		
	}
}
