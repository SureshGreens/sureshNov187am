package ttt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Suresh Kumar\\eclipse-workspace\\Sample1\\Testcase\\sample.xlsx");
		FileInputStream st=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(st);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);
	}

}
