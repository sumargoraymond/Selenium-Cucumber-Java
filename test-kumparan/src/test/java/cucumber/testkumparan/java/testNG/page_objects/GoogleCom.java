package cucumber.testkumparan.java.testNG.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class GoogleCom {

    private By email_textfield = By.cssSelector("input[id='identifierId']");
    private By next_email_button = By.id("identifierNext");
    private By next_password_button = By.id("passwordNext");
    private By password_textfield = By.name("password");

    private WebDriver driver;
    private WebDriverWait wait;

    public GoogleCom(WebDriver driver) throws Exception {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 30);
    }

    public GoogleCom enterEmail(String email){
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[1]);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(email_textfield)).sendKeys(email);
        return this;
    }

    public GoogleCom enterPassword(String password) throws Exception {
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[1]);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(password_textfield)).sendKeys(password);
        return this;
    }

    public GoogleCom clickNextAfterEmail() throws Exception {
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[1]);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(next_email_button)).click();
        return this;
    }

    public GoogleCom clickNextAfterPassword() throws Exception {
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[1]);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(next_password_button)).click();
        return this;
    }

    public void backToMainWindow() throws Exception {
        Set handles = this.driver.getWindowHandles();
        this.driver.switchTo().window((String) handles.toArray()[0]);
    }
}
