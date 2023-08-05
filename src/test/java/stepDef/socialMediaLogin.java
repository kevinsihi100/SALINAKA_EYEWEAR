package stepDef;

import io.cucumber.java.en.Then;
import pages.socialMediaAccount;

public class socialMediaLogin {

    @Then("click on continue with facebook")
    public void click_on_continue_with_facebook() {
        socialMediaAccount.facebook();
    }
    @Then("click on continue with google")
    public void click_on_continue_with_google() {
        socialMediaAccount.google();
    }
    @Then("click on continue with GitHub")
    public void click_on_continue_with_git_hub() {
        socialMediaAccount.gitHub();
    }
}
