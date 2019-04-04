package cucumber.testkumparan.java.testNG.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class FacebookCom {

    private By email_textfield = By.id("email");
    private By password_textfield = By.id("pass");
    private By login_button = By.name("login");

    private WebDriver driver;
    private WebDriverWait wait;

    public FacebookCom(WebDriver driver) throws Exception {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 30);
    }

    public FacebookCom enterEmail(String email){
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[1]);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(email_textfield)).sendKeys(email);
        return this;
    }

    public FacebookCom enterPassword(String password) throws Exception {
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[1]);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(password_textfield)).sendKeys(password);
        return this;
    }

    public FacebookCom clickLogin() throws Exception {
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[1]);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(login_button)).click();
        return this;
    }

    public void backToMainWindow() throws Exception {
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[0]);
    }
}
