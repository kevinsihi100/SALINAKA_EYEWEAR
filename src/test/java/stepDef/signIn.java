package stepDef;

import io.cucumber.java.en.Then;
import pages.SIGN_IN;

public class signIn {
    @Then("Click on SignIn")
    public void click_on_sign_in() {
        SIGN_IN.signInButton();
    }

    @Then("click on signIn button")
    public void click_on_sign_in_button() {
        SIGN_IN.signIn();
    }
}
