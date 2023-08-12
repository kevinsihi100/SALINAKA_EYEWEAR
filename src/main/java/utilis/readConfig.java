package utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readConfig {
    Properties pro;

    public readConfig() {
        File src = new File("./configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exceptaion is " + e.getMessage());
        }
    }

    public String getApplicationURL() {
        String URL = pro.getProperty("baseUrl");
        return URL;
    }
    public String getUsername(){
        String username = pro.getProperty("username");
        return username;
    }
    public String getEmailId(){
        String emailId = pro.getProperty("emailId");
        return emailId;
    }
    public String getPassword(){
        String password = pro.getProperty("password");
        return password;
    }
}

