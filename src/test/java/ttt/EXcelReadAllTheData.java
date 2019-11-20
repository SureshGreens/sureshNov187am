package ttt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray;

public class EXcelReadAllTheData {
public static void main(String[] args) throws IOException {
	File loc  = new File("C:\\Users\\Suresh Kumar\\Desktop\\sample.xlsx");
	FileInputStream st = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(st);
	Sheet s  = w.getSheet("Sheet1");
	for (int i = 0; i < s.getPhysicalNumberOfRows();i++) {
		Row r = s.getRow(i);
				for (int j = 0; j< r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
					System.out.println(c);
					
				}
		
		}
	}
}
