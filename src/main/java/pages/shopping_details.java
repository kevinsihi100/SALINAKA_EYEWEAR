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
        WebElement number = driver.findElement(By.xpath("//input[@class='input-form d-block form-control']"));
        number.sendKeys("7305475445");
    }

    public static void clickOnNextStep(){
        WebElement nextstep = driver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[1]/div[2]/form[1]/div[3]/button[2]"));
        nextstep.click();
    }

    public static void paypal(){
        WebElement paypal = driver.findElement(By.xpath("//button[@class='button']"));
        paypal.click();
    }

}
