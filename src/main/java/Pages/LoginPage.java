package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Utility;

public class LoginPage {
	
	   WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By Emai = By.xpath("//input[@id = 'email1']");
	By PassWord = By.xpath("//input[@id = 'password1']");
	
	By signupButton = By.xpath("//button[text() = 'Sign in']");
	
	By practicePage = By.xpath("//a[text() = 'Practise']");
	
	public void LoginToApplication(String userName, String passWord) {
		
		driver.findElement(Emai).sendKeys(userName);
		driver.findElement(PassWord).sendKeys(passWord);
		driver.findElement(signupButton).click();
		
		Utility.waitForSeconds(5);
	}
	
	public void Wait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		wait.until(ExpectedConditions.elementToBeClickable(practicePage));
	}
	
	public boolean isCourseModuleDisplay() {
		return driver.findElement(practicePage).isDisplayed() ;
	}
	
	

}
