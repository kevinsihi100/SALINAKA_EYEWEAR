package stepDef;

import io.cucumber.java.en.Then;
import pages.Featured;

public class featured {
    @Then("click on Featured option")
    public void click_on_featured_option() throws InterruptedException {
        Featured.featureOption();
    }

    @Then("select random Item from the eye-ware list")
    public void selectRandomItemFromTheEyeWareList() throws InterruptedException {
        Featured.selectFeatureItem();
    }
    @Then("product on basket List")
    public void product_on_basket_list() {
        System.out.println("Product On Basket :");
    }
    @Then("remove from basket List")
    public void remove_from_basket_list() throws InterruptedException {
        Featured.removeItemFormBasket();
    }

}
