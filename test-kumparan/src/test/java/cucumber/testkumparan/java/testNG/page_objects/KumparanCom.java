package cucumber.testkumparan.java.testNG.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KumparanCom {

    private By login_facebook_button = By.cssSelector("button[data-qa-id='btn-login-fb']");
    private By login_google_button = By.cssSelector("button[data-qa-id='btn-login-google']");
    private By comment_text_field = By.cssSelector("div[role='textbox']");
    private By send_button = By.cssSelector("button[data-qa-id='btn-send-comment']");
    private By comment_section = By.cssSelector("span[data-slate-content]");
    private By popup_tidak_button = By.id("onesignal-popover-cancel-button");

    private WebDriver driver;
    private WebDriverWait wait;

    public KumparanCom(WebDriver driver) throws Exception {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 30);
    }

    public void go() throws Exception {
        this.driver.get("https://www.kumparan.com/");
        Thread.sleep(3000);
        waitForLoad(this.driver);
    }

    public void assertTitle() throws Exception {
        Assert.assertEquals(this.driver.getTitle(), "Platform Media Berita Kolaboratif, Terkini Indonesia Hari Ini");
    }

    public void clickFBLoginButton() throws Exception {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(login_facebook_button)).click();
    }

    public void clickPopUpOneSignalTidak(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(popup_tidak_button)).click();
    }

    public void clickGoogleLoginButton() throws Exception {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(login_google_button)).click();
    }

    public void assertUserLoggedIn(){
        try{
            this.wait.until(ExpectedConditions.invisibilityOfElementLocated(login_facebook_button));
        } catch(Exception e){
            Assert.fail("ERROR! User is not logged in!");
        }
    }

    public void assertUserNotLoggedIn(){
        try{
            this.wait.until(ExpectedConditions.visibilityOfElementLocated(login_facebook_button));
        } catch(Exception e){
            Assert.fail("ERROR! User is logged in!");
        }
    }

    public void goToURL(String url) throws Exception {
        this.driver.get(url);
        waitForLoad(this.driver);
    }

    public void commentOnArticle(String comment) throws Exception {
        WebElement commentTextField = this.wait.until(ExpectedConditions.visibilityOfElementLocated(comment_text_field));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", commentTextField);
        commentTextField.click();
        commentTextField.sendKeys(comment);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(send_button)).click();
        Thread.sleep(3000);
        waitForLoad(driver);
    }

    public void assertCommentOnArticle(String comment) throws Exception {
        String commentFromWeb = this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(comment_section)).get(0).getText();
        Assert.assertEquals(comment, commentFromWeb);
    }

    public void assertLoginPopup() throws Exception {
        try{
            this.wait.until(ExpectedConditions.visibilityOfElementLocated(login_facebook_button));
        } catch(Exception e){
            Assert.fail("ERROR! Non logged in user should be forced to login to comment!");
        }
    }

    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(pageLoadCondition);
    }
}
