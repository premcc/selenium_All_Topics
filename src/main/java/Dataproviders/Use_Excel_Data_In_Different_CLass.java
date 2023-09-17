package Dataproviders;

import java.util.Map;

import org.testng.annotations.Test;

public class Use_Excel_Data_In_Different_CLass {
	
	
	@Test(dataProvider ="GetExcelData" ,dataProviderClass = Fetch_Dataprovider_From_Different_CLass.class)
	public void getDataFromExcel(Map<String, Integer> map)
	{
		System.out.println(map.keySet());
	}

}
