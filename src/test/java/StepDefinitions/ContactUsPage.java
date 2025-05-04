package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsPage {
	
	@Given("user is on contact us page")
	public void user_is_on_contact_us_page() {
		
	}

	@When("user enter <Name>,<Email>,<Subject>,<Message>")
	public void user_enter_name_email_subject_message() {
	   
	}

	@When("click on contact us CTA")
	public void click_on_contact_us_cta() {
	    
	}

	@When("click ok on the alert")
	public void click_ok_on_the_alert() {
	    
	}

	@Then("User should see success message {string}")
	public void user_should_see_success_message(String string, io.cucumber.datatable.DataTable dataTable) {
	    
	}

}
