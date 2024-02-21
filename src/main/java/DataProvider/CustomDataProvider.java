package DataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	
	@DataProvider(name = "LoginDetails")
	public Object[][] getData(){
		Object[][] arr =ExcelReader.getDataFromSheet("Sheet1");
		
		return arr;
		
	}

}
