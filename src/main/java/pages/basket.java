package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.openBrowser.driver;

public class basket {

    @FindBy(xpath = "//button[@class='basket-item-remove button button-border button-border-gray button-small']")
    static WebElement cancelButton;
    @FindBy(xpath = "//button[@class='basket-clear button button-border button-border-gray button-small']")
    static WebElement clear;

    @FindBy(xpath = "//span[contains(text(),'Close')]")
    static WebElement close;
    public static void cartOption(){
        WebElement cartButton = driver.findElement(By.xpath("//button[@class='button-link navigation-menu-link basket-toggle']"));
        cartButton.click();
    }
    public static void checkOut() throws InterruptedException {
       Thread.sleep(2000);
        WebElement checkOut =driver.findElement(By.xpath("//button[contains(text(),'Check Out')]"));
        checkOut.click();
    }
    public static void cancelButton(){
        cancelButton.click();
    }
    public static void clearCart(){
        clear.click();
    }
    public static  void closeCart (){
        close.click();
    }
}
