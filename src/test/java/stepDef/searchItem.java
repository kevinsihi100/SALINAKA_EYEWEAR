package stepDef;

import io.cucumber.java.en.Then;
import pages.basket;
import pages.shopItem;

public class searchItem {

    @Then("click on Shop")
    public void click_on_shop() {
        shopItem.shop();
    }
    @Then("select some random Item from the eye-ware list")
    public void select_some_random_item_from_the_eye_ware_list() throws InterruptedException {
        shopItem.selectItem();
    }
    @Then("select the eye-ware size")
    public void select_the_eye_ware_size() throws InterruptedException {
        shopItem.selectSize();
    }
    @Then("select the eye-ware color")
    public void select_the_eye_ware_color() {
        shopItem.selectColor();
    }
    @Then("click on add to basket option")
    public void click_on_add_to_basket_option() {
        shopItem.addToBasket();
    }
    @Then("go to my basket option")
    public void go_to_my_basket_option() {
        basket.cartOption();
    }
    @Then("click on check out button")
    public void click_on_check_out_button() {

    }
    @Then("click on next step")
    public void click_on_next_step() {

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
