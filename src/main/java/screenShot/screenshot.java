package screenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static browser.openBrowser.driver;

public  class screenshot extends Exception {

    public static void takeSnapShot() throws Exception{

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(".\\screenshot\\home.jpg");
        FileUtils.copyFile(SrcFile, DestFile);

    }
}

