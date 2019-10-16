package stepDefinitions;

import cucumber.api.java.en.Given;

public class TagsConceptStepDefinition {
	
	@Given("^User is able to Open the browser$")
	public void user_is_able_to_Open_the_browser() throws Throwable {
	    System.out.println("Open Browser");
	}

	@Given("^User is able to Enter the URL$")
	public void user_is_able_to_Enter_the_URL() throws Throwable {
	    System.out.println("Enter URL");
	}

	@Given("^User is able to Enter the Username$")
	public void user_is_able_to_Enter_the_Username() throws Throwable {
	    System.out.println("Enter Username");
	}

	@Given("^User is able to Enter the password$")
	public void user_is_able_to_Enter_the_password() throws Throwable {
	    System.out.println("Enter Password");
	}

	@Given("^User is able to click on the Login Button$")
	public void user_is_able_to_click_on_the_Login_Button() throws Throwable {
	    System.out.println("Click login button");
	}

	@Given("^User is able to Enter int the homepage of gmail$")
	public void user_is_able_to_Enter_int_the_homepage_of_gmail() throws Throwable {
	    System.out.println("enter in homepage");
	}

	@Given("^Validate the correct user in gmail home page$")
	public void validate_the_correct_user_in_gmail_home_page() throws Throwable {
	    System.out.println("validate user");
	}

	@Given("^Validate the inbox in gmail$")
	public void validate_the_inbox_in_gmail() throws Throwable {
	    System.out.println("validate inbox");
	}

	@Given("^Validation Compose button in gmail$")
	public void validation_Compose_button_in_gmail() throws Throwable {
	    System.out.println("validate compose");
	}

	@Given("^Do the the draft operation in gmail and validate it$")
	public void do_the_the_draft_operation_in_gmail_and_validate_it() throws Throwable {
	    System.out.println("perform draft operation");
	}

	@Given("^Validate the inbox functionality$")
	public void validate_the_inbox_functionality() throws Throwable {
	    System.out.println("validate inbox functionality");
	}

	@Given("^Perform sent gmail operation & validate it$")
	public void perform_sent_gmail_operation_validate_it() throws Throwable {
	    System.out.println("Sent gmail operation");
	}

	@Given("^Verify user able to edit the profile$")
	public void verify_user_able_to_edit_the_profile() throws Throwable {
	    System.out.println("Edit profile");
	}

	@Given("^Click on Signout link$")
	public void click_on_Signout_link() throws Throwable {
	    System.out.println("Sign out");
	}

	@Given("^we are able to close the browser$")
	public void we_are_able_to_close_the_browser() throws Throwable {
	    System.out.println("Close the browser");
	}


}
