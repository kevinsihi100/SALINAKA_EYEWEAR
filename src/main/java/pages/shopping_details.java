package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browser.openBrowser.driver;

public class shopping_details {

    public static void address(){
        WebElement shipping_address = driver.findElement(By.xpath("//input[@id='address']"));
        shipping_address.sendKeys("216 Barking Road East Ham E6 3BB");
    }
    public static void mobileNumber(){

    }

    public static void clickOnNextStep(){

    }

}
