package stepDef;

import io.cucumber.java.en.Then;
import pages.SIGN_IN;
import screenShot.screenshot;

public class signIn {
    @Then("Click on SignIn")
    public void click_on_sign_in() throws InterruptedException {
        SIGN_IN.signInButton();

    }

    @Then("click on signIn button")
    public void click_on_sign_in_button() throws Exception {
        SIGN_IN.signIn();
        screenshot.takeSnapShot(".\\screenshot\\signIn.jpg");
    }
}
