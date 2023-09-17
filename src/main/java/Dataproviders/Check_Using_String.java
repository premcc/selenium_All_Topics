package Dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Check_Using_String {
	
	@DataProvider
	public String[] supplier()
	{
		String arr[]=new String[6];
		
		arr[0]="Earth";arr[1]="jupitor";arr[2]="mars";arr[3]="satrun";arr[4]="neptune";
		arr[5]="venus";
		return arr;
	}
	
	@Test(dataProvider = "supplier")
	public void useDataprovider(String s)
	{
		System.out.println(s);
	}

}
