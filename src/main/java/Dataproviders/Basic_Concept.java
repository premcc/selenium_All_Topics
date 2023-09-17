package Dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic_Concept {
	
	
	@DataProvider(name = "data")
	public Object[][] supplier()
	{
		
		Object arr[][]=new Object[2][2];
		
		arr[0][0]="Kill Bill";arr[0][1]="djanago unchained";
		arr[1][0]="inglorius basterds";arr[1][1]="reservoiur dogs";
		return arr;
	}
	
	@Test(dataProvider = "data")
	public void fetchFromDataprovider(String data,String data2)
	{
		System.out.println(data);
		System.out.println(data2);
	}

}
