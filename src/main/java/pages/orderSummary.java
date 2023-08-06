package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browser.openBrowser.driver;

public class orderSummary {
    public static void nextStep(){
        WebElement next = driver.findElement(By.xpath("//button[@class='button']"));
        next.click();
    }
    public static void continueShop(){
        WebElement continue_shop = driver.findElement(By.xpath("//button[@class='button button-muted']"));
        continue_shop.click();
    }
}
