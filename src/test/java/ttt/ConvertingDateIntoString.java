package ttt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.formula.functions.DateFunc;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertingDateIntoString {

	public static void main(String[] args) throws IOException {
		File loc  = new File("C:\\Users\\Suresh Kumar\\eclipse-workspace\\Sample1\\Testcase\\sample.xlsx");
		FileInputStream st = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(st);
		Sheet s  = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
					for (int j = 0; j< r.getPhysicalNumberOfCells(); j++) {
						Cell c = r.getCell(j);
						int type = c.getCellType();
						if(type ==1)
						{
							String stringcellvalue = c.getStringCellValue();
							System.out.println(stringcellvalue);
						}
						
						else if(type==0) {
							if(DateUtil.isCellDateFormatted(c)) {
								java.util.Date dateCellValue = c.getDateCellValue();
								
				//converting date into cell
						SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yyyy");	
						String f = sim.format(dateCellValue);
						System.out.println(f);
							}
							else {				
								//numeric cell value
								double numericCellValue = c.getNumericCellValue();
								//converting double into long
								long l = (long)numericCellValue;
								//converting long into string
								String V = String.valueOf(l);
								System.out.println(V);				
	 }					
	}
   }
  }
 }
}
