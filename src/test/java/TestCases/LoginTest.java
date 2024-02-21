package TestCases;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import DataProvider.CustomDataProvider;
import Pages.HomePageineuron;
import Pages.LoginPage;




public class LoginTest extends BaseClass{

	@Test(dataProvider = "LoginDetails", dataProviderClass = CustomDataProvider.class)
	public void loginToApplication(String userName, String pass) {
		System.out.println("Login application");
		LoginPage log = new LoginPage(driver);
		log.LoginToApplication(userName,pass );
		
		Assert.assertTrue(log.isCourseModuleDisplay(), "Test1 passed");
		HomePageineuron home = new HomePageineuron(driver);
		home.clickOnSignOut();
		Assert.assertTrue(log.isCourseModuleDisplay());
		}
	
	

}
