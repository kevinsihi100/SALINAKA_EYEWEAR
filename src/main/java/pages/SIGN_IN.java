package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browser.openBrowser.driver;

public class SIGN_IN {

    public static void signInButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signIn.click();
    }
    public static void forgetPassword(){
        WebElement forgetPassword = driver.findElement(By.xpath("//span[contains(text(),'Forgot password?')]"));
        forgetPassword.click();

        String forgot_password_message_exp = "Enter your email address and we will send you a password reset email.";
        String actual = "Enter your email address and we will send you a password reset email.";
        if (forgot_password_message_exp.equals(actual)){

            WebElement enterEmail = driver.findElement(By.xpath("//input[@class='input-form']"));
            enterEmail.sendKeys("1172nishant@gmail.com");

            WebElement sendLinkButton = driver.findElement(By.xpath("//button[@class='button w-100-mobile']"));
            sendLinkButton.click();
        }
    }
    public static void signIn(){
        WebElement signIn_button = driver.findElement(By.xpath("//button[@class='button auth-button']"));
        signIn_button.click();
    }
}
