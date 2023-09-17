package Dataproviders;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBook_Login_With_Different_Set_Of_Data {
	
	@DataProvider(name = "data")
    public static Object[][] returnExcelSheetData()
        throws Throwable
        {
    
    FileInputStream fis = new FileInputStream("C:\\\\Users\\\\heman\\\\OneDrive\\\\Documents\\\\facebook\\Facebookdata.xlsx");
    XSSFWorkbook book=new XSSFWorkbook(fis);
    Sheet sheet = book.getSheet("Sheet1"); //sheet name

    int ROWS = sheet.getPhysicalNumberOfRows() - 1; //if headers are present - use -1
    int COLS = sheet.getRow(0).getPhysicalNumberOfCells(); //read all columns
    DataFormatter df=new DataFormatter();
    Object[][] dataset = new Object[ROWS][COLS];
    for (int r = 1; r < ROWS; r++) {
        for (int j = 0; j < COLS; j++) {
          
           String cellValue=df.formatCellValue( sheet.getRow(r).getCell(j));
           
           dataset[r][j]=cellValue;
        }
    }
    book.close();
    fis.close();
    return dataset;

}
	@Test(dataProvider = "data")
	public void getData(String username,String password)
	{
		System.out.println("username is :"+username+" and password is :"+password);
	}
}



