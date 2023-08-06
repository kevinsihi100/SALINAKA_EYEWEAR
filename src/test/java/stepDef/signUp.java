package stepDef;

import browser.openBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.signup;
import screenShot.screenshot;

public class signUp {
    @Given("open the Browser")
    public void open_the_browser() {
        openBrowser.open();
    }
    @Then("Enter the URL {string}")
    public void enter_the_url(String URL) throws Exception {
        openBrowser.URL(URL);
        Thread.sleep(2000);
        screenshot.takeSnapShot(".\\screenshot\\homepage.jpg");
    }
    @Then("Click on SignUp")
    public void click_on_sign_up() throws Exception {
        signup.Signup_button();
    }
    @Then("Enter Full Name {string}")
    public void enter_full_name(String FullName) {
        signup.FullName(FullName);
    }
    @Then("Enter Email-ID {string}")
    public void enter_email_id(String EmailID) {
        signup.EmailId(EmailID);
    }
    @Then("Enter PassWord {string}")
    public void enter_pass_word(String Password) throws Exception {
        signup.PassWord(Password);
        Thread.sleep(2000);
        screenshot.takeSnapShot(".\\screenshot\\signup.jpg");
    }
    @Then("click on signUP button")
    public void click_on_sign_up_button() {
        signup.signUPButton();
    }
    @And("Close the Browser")
    public void close_the_browser() {
        openBrowser.close();
    }
}
