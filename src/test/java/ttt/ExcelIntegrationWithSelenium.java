package ttt;

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

public class ExcelIntegrationWithSelenium {
public static String getData(int rowNo, int cellNo) throws IOException {
	String value = null;
	File loc = new File("C:\\Users\\Suresh Kumar\\eclipse-workspace\\Sample1\\Testcase\\sample.xlsx");
	FileInputStream st = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(st);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(rowNo);
	Cell c = r.getCell(cellNo);
	int type = c.getCellType();
	if(type==1) {
		value = c.getStringCellValue();
				
	}
	else if(type==0){
		if(DateUtil.isCellDateFormatted(c)) {
		Date datecellvalue = c.getDateCellValue();	
	
		SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-YYYY");
		value = sim.format(datecellvalue);
		
		
		}
		
		else {
			double numericCellValue= c.getNumericCellValue();
			long l = (long)numericCellValue;
			value = String.valueOf(l);
			
		}
		
	}
	return value;
	}
	
	
}

