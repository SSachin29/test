package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class youtubesearch {
	WebDriver driver;

	@Given("Chrome browser will be loaded")
	public void chrome_browser_will_be_loaded() {
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("Open youtube and search {string}")
	public void open_youtube_and_search(String song) {
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys(song + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
	}
	@When("play the song with full screen and volume")
	public void play_the_song_with_full_screen_and_volume() {
		WebElement skip = driver.findElement(By.xpath("//*[@id=\"skip-button:2\"]/div"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(skip));
		skip.click();
		//driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[2]/button[8]")).click();
	}
	@Then("song will play will full volume and takeScreenshot")
	public void song_will_play_will_full_volume_and_take_screenshot() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(15000);
		driver.quit();
	}

}
