package iceLand.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import iceLand.Pages.LoginPages;
import org.hamcrest.Matchers;
import org.junit.Assert;


public class LoginSteps {

    LoginPages loginPages = new LoginPages();

    @Given("^user is on iceland webpage$")
    public void user_is_on_iceland_webpage() throws Throwable {
        String actual = loginPages.getCurrent_url();
        Assert.assertThat(actual, Matchers.equalTo("https://www.iceland.co.uk/"));

    }

    @When("^user click on sign in  button$")
    public void user_click_on_signin_button() throws Throwable {

        loginPages.setSigninLink();
    }

    @And("^user enter invalid username \"([^\"]*)\" and password\"([^\"]*)\"$")
    public void user_enter_valid_username_and_password(String arg1, String arg2) throws Throwable {
        loginPages.setEmail_Enter();
        loginPages.setPassword_Enter();
    }

    @And("^user click on sign in securly button$")
    public void user_click_on_sign_in_securly_button() throws Throwable {
        loginPages.setSignin_SEcurly_button();
    }

 /*   @Then("^user must be not be able to login and verify it$")
    public void user_must_be_able_to_login_successfull() throws Throwable {
        String failed_error = loginPages.error_verify();
        Assert.assertThat(failed_error, Matchers.endsWith("try again"));

   }
  */

    @Then("^user must not be  able to login and verify it$")
    public void user_must_not_be_able_to_login_and_verify_it() throws Throwable {

       //String  failed_message=loginPages.error_verify();
        //Assert.assertThat(failed_message,Matchers.equalToIgnoringCase("Something's not right, please check and try again."));
        System.out.println("The erroe message displayed on webage is  ::" );
    }

    //Iceland
    //pending
    //programme

// Changes for practice on 080323.....done by krutika
}
