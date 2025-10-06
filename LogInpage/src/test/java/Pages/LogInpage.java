package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInpage {

	WebDriver driver;
	By username = By.xpath("//*[@id=\"username\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By submit_button = By.id("submit");

	public LogInpage(WebDriver driver) {
		this.driver = driver;

	}

	public void Enter_username_password() {
		driver.findElement(username).sendKeys("student");
		driver.findElement(password).sendKeys("Password123");
	}

	public void click_Submit() {
		driver.findElement(submit_button).click();

	}

}
