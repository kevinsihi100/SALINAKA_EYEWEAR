package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static browser.openBrowser.driver;
import static utilis.random.randomNumber;

public class shopItem {

    public static void shop(){
        driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
    }
    public static void selectItem() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> element = driver.findElements(By.xpath("//div[@class='product-details']"));
        int index_number = randomNumber(element.size());
        WebElement select =element.get(index_number);
        System.out.println(select.getText());
        select.click();
    }
    public static void selectSize() throws InterruptedException {
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/*[1]"));
        size.click();

        WebElement size36 = driver.findElement(By.xpath("//div[contains(text(),'36 mm')]"));
        WebElement size42 = driver.findElement(By.xpath("//div[contains(text(),'42 mm')]"));
        if (size36.equals(size36)) {
            if (size36.equals(size42)){
                size42.click();
            }else {
                size36.click();
            }
        }
        else {
            size42.click();
        }


//        WebElement overload = driver.findElement(By.xpath("//h1[contains(text(),'Quake Overload')]"));
//        String over = overload.getText();
//            if (over.equals("Quake Overload")){
//                WebElement add = driver.findElement(By.xpath("//button[contains(text(),'Add To Basket')]"));
//                add.click();
//            }
    }
    public static void selectColor(){
        WebElement title = driver.findElement(By.xpath("//h1[@class='margin-top-0']"));
        System.out.println(title.getText());

        String quake = "Quake Overload";
        WebElement add;
        if (title.equals(quake)){
            add = driver.findElement(By.xpath("//button[contains(text(),'Add To Basket')]"));
            add.click();
        }else {
            add = driver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div"));
            add.click();
        }

    }
    public static void addToBasket() throws InterruptedException {
        Thread.sleep(2000);
        WebElement add = driver.findElement(By.xpath("//button[contains(text(),'Add To Basket')]"));
        add.click();
    }
}
