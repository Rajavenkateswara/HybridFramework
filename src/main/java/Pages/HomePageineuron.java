package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageineuron {
	
	public WebDriver driver;
	
	By signOut = By.xpath("//button[text() = 'Sign out']");
	
	By Welcomemsg = By.xpath("//h4");
	
	public HomePageineuron(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSignOut() {
		driver.findElement(signOut).click();
	}
	
	public String getWecomeMsg() {
		return driver.findElement(Welcomemsg).getText();
	}

}
