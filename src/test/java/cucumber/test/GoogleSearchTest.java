package cucumber.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class GoogleSearchTest {

	WebDriver driver = null;

	@Given("^Open Google Website$")
	public void gotoGoogle() {
		System.setProperty("webdriver.chrome.driver", "D:\\IBaseDev\\Applications\\eFare_Automation\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
	}

	@When("^Enter search keyword$")
	public void enterSearchKeyword() {
		driver.findElement(By.name("q")).sendKeys("Omniwyse Technologies");

	}

	@Then("^Submit the search keyword$")
	public void submit() throws InterruptedException {
		driver.findElement(By.name("q")).submit();
		TimeUnit.SECONDS.sleep(5);
	}

	@And("^Quit the browser$")
	public void quit() {
		driver.quit();
	}
}

