package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Pages.LogInpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn_Steps {

	// LogInpage lp;
	WebDriver driver;
	LogInpage lp;

	@Before
	public void Browser_setup() {
		System.out.println("---------------We started browser setup------------");
		
	}

	@After
	public void TearDown() {
		System.out.println("--------------------We are in Teardown step-------------");
		driver.quit();
	}

	@Given("User on LogIn page of webside")
	public void user_on_home_page_of_webside() throws InterruptedException {
		// WebDriver driver= new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(5000);

	}

	@When("user enters Username and Password ")
	public void user_enters_username_and_password() {
		//LogInpage lp = new LogInpage(driver);
		//lp.Enter_username_password();

	}

	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() {

		//lp.click_Submit();

	}

	@Then("User will be on HomePage")
	public void user_will_be_on_home_page() {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "practicetestautomation.com/logged-in-successfully/";
		Assert.assertEquals(actualURL, expectedURL);

	}

}
