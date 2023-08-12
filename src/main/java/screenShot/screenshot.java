package screenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static browser.openBrowser.driver;

public  class screenshot extends Exception {

    public static void takeSnapShot(WebDriver driver,String tname) throws Exception{

        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("C:\\Testing Project\\SALINAKA_EYEWEAR\\src\\screenshot\\"+tname+".png");
        FileUtils.copyFile(SrcFile, DestFile);
        System.out.println("screenshot taken");
    }
}

