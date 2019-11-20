package ttt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelopen {
public static void main(String[] args) throws IOException {
	File loc  = new File("C:\\Users\\Suresh Kumar\\Desktop\\sample1.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet S = w.createSheet("Suresh");
	Row r= S.createRow(5);
	Cell c = r.createCell(6);
	c.setCellValue("Suresh");
	FileOutputStream o  = new FileOutputStream(loc);
	w.write(o);
	System.out.println("wrote succesfully");
	
}
}    
