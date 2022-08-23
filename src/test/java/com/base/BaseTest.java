package com.base;

import com.util.GeneralUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public Properties properties;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public BaseTest(){
        try {
            properties = new Properties();
            String filepath = System.getProperty("user.dir") +"/src/test/java/com/config/config.Properties";
            FileInputStream inputStream = new FileInputStream(filepath);
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void initialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.Page_Load_Time));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GeneralUtil.Implicit_Wait));
        driver.get(properties.getProperty("baseUrl"));
    }
    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public void scrollToBottom() {
        js.executeScript("window.scrollBy(0,1000)");
    }
}