package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browser.openBrowser.driver;

public class socialMediaAccount {

    public static void facebook(){
        WebElement facebook = driver.findElement(By.xpath("//button[@class='button auth-provider-button provider-facebook']"));
        facebook.click();
    }
    public static void google(){
        WebElement google = driver.findElement(By.xpath("//button[@class='button auth-provider-button provider-google']"));
        google.click();
    }
    public static void gitHub(){
        WebElement github = driver.findElement(By.xpath("//button[@class='button auth-provider-button provider-github']"));
        github.click();
    }
}
