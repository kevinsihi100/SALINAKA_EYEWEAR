package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static browser.openBrowser.driver;
import static utilis.random.randomNumber;

public class Featured {
    public static void featureOption() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Featured')]")).click();
        Thread.sleep(2000);
    }

    public static void selectFeatureItem() throws InterruptedException {
        List<WebElement> list_item = driver.findElements(By.xpath("//div[@class='product-display-details']"));
        int index_number = randomNumber(list_item.size());
        WebElement select = list_item.get(index_number);
        Thread.sleep(2000);
        System.out.println(select.getText());
        select.click();
    }
    public static void removeItemFormBasket() throws InterruptedException {
        WebElement  remove= driver.findElement(By.xpath("//button[contains(text(),'Remove From Basket')]"));
        String name = remove.getText();

        if(name.contains("Remove")){
            Thread.sleep(2000);
            remove.click();
            System.out.println(remove);
        }
    }
}
