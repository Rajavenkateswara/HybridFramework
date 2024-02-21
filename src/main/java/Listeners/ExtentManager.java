package Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Helper.Utility;

public class ExtentManager {
	
	public static ExtentReports extent ;
	
	public static ExtentReports getIntance() 
	{
		
		if(extent == null) {
			extent = createInstance();
			return extent;
		}
		else
		{
			return extent;
		}
		
	}
	
	
	public static ExtentReports createInstance() {
		
		ExtentReports extent = new ExtentReports();
		
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/Reports/Automation_"+Utility.getCurrentTime()+".html" );
		spark.config().setDocumentTitle("Sprint1");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("AutomationScript");
		
		extent.attachReporter(spark);
		
		return extent;
		
		
	}
	
	
	
	

}
