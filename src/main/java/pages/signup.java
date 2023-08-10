package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.openBrowser.driver;

public class signup {
    //signUP button for new customer
    public static void Signup_button() {
        WebElement signup_button = driver.findElement(By.xpath("//a[@class='button button-small']"));
        signup_button.click();
        System.out.println(driver.getTitle());
    }

    //Enter the all Full Details new Customer

    public static void FullName(String fullName) throws InterruptedException {
        Thread.sleep(2000);
        WebElement full_Name = driver.findElement(By.xpath("//input[@id='fullname']"));
        full_Name.sendKeys(fullName);
    }


    public static void EmailId(String EmailId){
        WebElement email_id = driver.findElement(By.xpath("//input[@id='email']"));
        email_id.sendKeys(EmailId);
    }
    public static void PassWord(String passWord) {
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(passWord);
    }

    //Register the new customer
    public static void signUPButton(){
        WebElement sign_up = driver.findElement(By.xpath("//button[@class='button auth-button']"));
        sign_up.click();

        System.out.println(driver.getTitle());
    }

}