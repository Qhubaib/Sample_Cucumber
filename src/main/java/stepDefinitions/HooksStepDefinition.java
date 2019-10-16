package stepDefinitions;

import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/*
 * The Hooks concept is --> we have two annotations @Before @After --> Let say we have common functionality
 * 		for all the scenarios we have in .feature file (Like Login to same application and close the browser at the end --> tearDown()
 * 		same as @BeforeTest @AfterTest in TestNG 
 *  Let say we have two @Before & two @After Annotations exist in hooks
 *  	we can define the order also --> Like --> @Before(order=1) and so on;  ====> These two annotations can be considered as global.
 *  Note: in @Before -> It is following as per the ordering(It is accepting even Negative values also -- first it is executing lowest order then so on)
 *  	  in @After -> it is following Reverse Ordering (Means first it is executing highest order number then it will execute lowest order and so on)
 *  Hooks Tagging:
 *  	Hooks Tagging is a process where we can execute the scenarios to a specific one only
 *  	Let say we have 4 scenarios --> we already declare the global annotations
 *  	But apart from that i want execute second & third scenarios we "hooks tagging" process
 *  	So what we do is --> @Before("@Second","Third") --> These hooks tagging will execute as 
 *  	@BeforeMethod & @AfterMethod in TestNG --> These Annotations can be considered as Local Specific to some scenarios only
 *  Note: This is same as tags Functionality in Test Runner Class
 *  
 */
public class HooksStepDefinition {
	
	@Before(order=-1)
	public void Perform_Login()
	{
		System.out.println("Enter username");
		System.out.println("Enter Password");
		System.out.println("click on login button");
	}
	
	@After(order=1)
	public void close_browser()
	{
		System.out.println("Close browser");
	}
	
	@Before(order=1)
	public void order_test()
	{
		System.out.println("this is second @Befor");
	}
	@After(order=2)
	public void close_browser_order_test()
	{
		System.out.println("this is second @After");
	}
	
	@Given("^Enter into gmail Application$")
	public void enter_into_gmail_Application() throws Throwable {
	    System.out.println("Enter into gmail -> 1");
	}
	
	@Before({"@Second,~@First"})
	public void hook_tagging_test()
	{
		System.out.println("hook tagging test");
	}
	

	@When("^Click on gmail Compose Button$")
	public void click_on_gmail_Compose_Button() throws Throwable {
		System.out.println("compose button");
	}

	@Then("^Perform compose validation$")
	public void perform_compose_validation() throws Throwable {
		System.out.println("validation of compose button");
	}
	
	@Given("^Enter into gmail Application 2$")
	public void enter_into_gmail_Application2() throws Throwable {
	    System.out.println("Enter into gmail -> 2");
	}

	@When("^Click on gmail Inbox Link$")
	public void click_on_gmail_Inbox_Link() throws Throwable {
		System.out.println("click inbox link");
	}

	@Then("^Perform Inbox Link validation$")
	public void perform_Inbox_Link_validation() throws Throwable {
	    System.out.println("validation of inbox functionality");
	}
	
	@Given("^Enter into gmail Application 3$")
	public void enter_into_gmail_Application3() throws Throwable {
	    System.out.println("Enter into gmail -> 3");
	}

	@When("^Enter the data as \"([^\"]*)\" in search text box$")
	public void enter_the_data_as_in_search_text_box(String name) throws Throwable {
	    System.out.println("Enter name: "+name);
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
	    System.out.println("Click on Search");
	}

}
