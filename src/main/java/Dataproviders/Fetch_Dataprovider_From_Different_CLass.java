package Dataproviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class Fetch_Dataprovider_From_Different_CLass {
	
	@DataProvider(name="GetExcelData")
	public Map<String, Integer> supplier() throws Throwable
	{
		File f=new File("C:\\Users\\heman\\OneDrive\\Documents\\ExcelDataForDataprovider.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		int totalRows = book.getSheet("Sheet1").getPhysicalNumberOfRows();
		int totalCells=book.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();;
		System.out.println("totalRows "+totalRows);
		System.out.println("totalCells "+totalCells);
		DataFormatter df=new DataFormatter();
		
		Map<String,Integer> map=new LinkedHashMap<String, Integer>();
		for(int i=1;i<totalRows;i++)
		{
			
			for(int j=0;j<totalCells;j++)
			{
				String cellVale=df.formatCellValue(book.getSheet("Sheet1").getRow(i).getCell(j));
				System.out.println(cellVale);
				
				map.put(cellVale, j);
				
				
				
			}
			
		}
		
		return map;
		
	}
}
