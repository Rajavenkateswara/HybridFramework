package Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	
	public static String getScreenShot(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		
		return base64;
	}
	
	
	public static String getCurrentTime() {
		String date = new SimpleDateFormat("HH_mm_ss").format(new Date());
		
		return date;
	
	}
	
	
	public static void waitForSeconds(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
