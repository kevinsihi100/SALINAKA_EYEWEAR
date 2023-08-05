package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
   public static WebDriver driver;
    public static void open(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void URL(String Url) throws InterruptedException {
        driver.get(Url);
        Thread.sleep(2000);

    }
    public static void close(){
        driver.quit();
    }

}
