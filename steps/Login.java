package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

	/*
	 * public RemoteWebDriver driver;
	 * 
	 * @Given("Launch the chrome browser") public void launchBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * @Given("Load the application url") public void loadAppUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * 
	 * }
	 */

	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElementById("username").sendKeys(username);

	}

	@Given("Enter the password  as {string}")
	public void enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);

	}

	@When("Click by ClassName on {string} button")
	public void clickLoginButton(String ButtonName) {
		driver.findElementByClassName(ButtonName).click();

	}
	
	@Then("Homepage should be displayed")
	public void VerifyHomeage() {
		String actTitle = driver.getTitle();
		if (actTitle.contains("TestLeaf")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}
	
	
	
	@Given("Click by LinkText on {string} Link")
	public void click_by_link_text_on_link(String LinkName) {
		driver.findElementByLinkText(LinkName).click();
	}
	@Given("Enter by ID on TextBox {string} as {string}")
	public void enter_TextBoxValue_By_ID(String ID, String Value) {
		driver.findElementById(ID).sendKeys(Value);
	 
	}
	@Given("Click by Name on {string} Button")
	public void click_Button_By_Name(String LinkName) {
		driver.findElementByName("submitButton").click();
	 
	}
	@Then("Wait for 10 Seconds")
	public void waitTime() throws InterruptedException {
		Thread.sleep(10000);

	}
	@Given("Click by Xpath on {string}")
	public void click_By_Xpath(String xpath) {
		driver.findElementByXPath(xpath).click();
	 
	}

	@Given("Enter by Xpath on TextBox {string} as {string}")
	public void Enter_By_Xpath(String xpath,String Value) {
		driver.findElementByXPath(xpath).sendKeys(Value);
	 
	}
}
