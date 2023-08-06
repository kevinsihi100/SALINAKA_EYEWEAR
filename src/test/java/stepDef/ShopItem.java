package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SIGN_IN;
import pages.basket;
import pages.orderSummary;

public class ShopItem {

    @Then("click on Shop")
    public void click_on_shop() throws InterruptedException {
        pages.shopItem.shop();
    }
    @Then("select some random Item from the eye-ware list")
    public void select_some_random_item_from_the_eye_ware_list() throws InterruptedException {
        pages.shopItem.selectItem();
    }
    @Then("select the eye-ware size")
    public void select_the_eye_ware_size() throws InterruptedException {
        pages.shopItem.selectSize();
    }
    @Then("select the eye-ware color")
    public void select_the_eye_ware_color() {
        pages.shopItem.selectColor();
    }
    @Then("click on add to basket option")
    public void click_on_add_to_basket_option() throws InterruptedException {
        pages.shopItem.addToBasket();
    }
    @Then("go to my basket option")
    public void go_to_my_basket_option() {
        basket.cartOption();
    }
    @Then("click on check out button")
    public void click_on_check_out_button() throws InterruptedException {
        basket.checkOut();
    }
    @Then("click on next step")
    public void click_on_next_step() {
        orderSummary.nextStep();
    }
    @And("user need login to continue shopping")
    public void userNeedLoginToContinueShopping() throws InterruptedException {
        SIGN_IN.signInButton();
        SIGN_IN.signIn();
    }
    @Then("Enter the shopping details")
    public void enter_the_shopping_details() {

    }
    @Then("click on next")
    public void click_on_next() {

    }
    @Then("click on payment method")
    public void click_on_payment_method() {

    }
    @Then("click on confirm Button")
    public void click_on_confirm_button() {

    }


}
