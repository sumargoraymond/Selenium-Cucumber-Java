package cucumber.testkumparan.java.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver createInstance(String browserName) {
        WebDriver driver;
        if(browserName == null) browserName = "firefox";

        switch (Browser.valueOf(browserName.toUpperCase())) {
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

    enum Browser {
        FIREFOX,
        CHROME;
    }
}