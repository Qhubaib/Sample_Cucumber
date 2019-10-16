package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	ChromeOptions options;
	

	@Given("^User is able to Launch the browser$")
	public void user_is_able_to_Launch_the_browser()
	{
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "G:\\SQ AHMED\\DriverForWebdriver\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@Then("^User Enters the facebook URL$")
	public void user_Enters_the_facebook_URL()
	{
	    driver.navigate().to("https://facebook.com");
	}

	/* --> This Regular Expression is used with Examples Keyword
	 * @And("^User Enters the Username as \"(.*)\" and Password as \"(.*)\"$")
	 * public void user_Enters_the_Username_and_Password(String uname,String pass) {
	 * driver.findElement(By.name("email")).sendKeys(uname);
	 * driver.findElement(By.name("pass")).sendKeys(pass); }
	 */
	
	//This Method is using with Data Table
	/*
	 * @Then("^User Enters the Username and Password$") public void
	 * user_Enters_the_Username_and_Password(DataTable data) { List<List<String>>
	 * list = data.raw();
	 * driver.findElement(By.name("email")).sendKeys(list.get(0).get(0));
	 * driver.findElement(By.name("pass")).sendKeys(list.get(0).get(1)); }
	 */
	
	//Parameterization by using MAP Concept
	@Then("^User Enters the Username and Password$")
	public void user_Enters_the_Username_and_Password(DataTable credentials)
	{
	    for(Map<String,String> data : credentials.asMaps(String.class, String.class))
	    {
	    	driver.findElement(By.name("email")).sendKeys(data.get("Username"));
	   	    driver.findElement(By.name("pass")).sendKeys(data.get("Password"));
	    }
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button()
	{
	    driver.findElement(By.xpath("//input[@type='submit'] | //button[@name='login']")).click();
	}

	@Then("^Validate the user in facebook homepage$")
	public void validate_the_user_in_facebook_homepage()
	{		
		String expected="Syed Qhubaib Ahmed";
	    String actual=driver.findElement(By.xpath("(//span[@class='imgWrap'])[1]//following::div[1]")).getText();
	    Assert.assertEquals(expected, actual);
	    driver.quit();
	}
	
	@Given("^Verify the Page Title$")
	public void verify_the_Page_Title()
	{
		driver.switchTo().alert().dismiss();
		String expected = "(71)Facebook";
	    String actual=driver.getTitle();
	    Assert.assertEquals(expected, actual);
	}

	@Then("^Click on UserNavigation Label$")
	public void click_on_UserNavigation_Label()
	{
		driver.findElement(By.id("userNavigationLabel")).click();
	}

	@Then("^Click on Logout$")
	public void click_on_Logout()
	{
	    WebElement logout=driver.findElement(By.cssSelector("#js_1b > div > div > ul > li._54ni.navSubmenu._6398._64kz.__MenuItem > a"));
	    System.out.println(logout.getText());
	    Actions action = new Actions(driver);
	    action.moveToElement(logout).click();
	    //JavascriptExecutor js = (JavascriptExecutor)driver;
	    //js.executeScript("argument[0].click()", logout);
	    driver.quit();
	}

}
