package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static browser.openBrowser.driver;

public class basket {
    public static void cartOption(){
        WebElement cartButton = driver.findElement(By.xpath("//button[@class='button-link navigation-menu-link basket-toggle']"));
        cartButton.click();
    }
    public static void checkOut(){

    }
    public static void cancelButton(){
        WebElement cancelButton = driver.findElement(By.xpath("//button[@class='basket-item-remove button button-border button-border-gray button-small']"));
        cancelButton.click();
    }
    public static void clearCart(){
        WebElement clear = driver.findElement(By.xpath("//button[@class='basket-clear button button-border button-border-gray button-small']"));
        clear.click();
    }
    public static  void closeCart (){
        WebElement close = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
        close.click();
    }
}
