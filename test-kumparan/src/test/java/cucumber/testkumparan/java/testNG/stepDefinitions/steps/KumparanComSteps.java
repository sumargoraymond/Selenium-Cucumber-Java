package cucumber.testkumparan.java.testNG.stepDefinitions.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.testkumparan.java.testNG.DriverManager;
import cucumber.testkumparan.java.testNG.page_objects.FacebookCom;
import cucumber.testkumparan.java.testNG.page_objects.GoogleCom;
import cucumber.testkumparan.java.testNG.page_objects.KumparanCom;
import org.openqa.selenium.*;

public class KumparanComSteps {

    WebDriver driver = DriverManager.getDriver();
    private KumparanCom kumparanCom;
    private FacebookCom facebookCom;
    private GoogleCom googleCom;

    @Given("^I go to Kumparan")
    public void givenIGoToKumparan() throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.go();
    }

    @Then("^I should see correct title page for Kumparan")
    public void assertPageTitleKumparan() throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.assertTitle();
    }

    @And("^I click on login Facebook button")
    public void clickFBLoginButton() throws Exception{
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.clickFBLoginButton();
    }

    @And("^I click on login Google button")
    public void clickGoogleLoginButton() throws Exception{
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.clickGoogleLoginButton();
    }

    @And("^I login to Facebook with valid credential")
    public void loginToFB() throws Exception{
        facebookCom = new FacebookCom(this.driver);
        facebookCom.enterEmail("automatedtestkumparan@gmail.com").enterPassword("automatedtest1").clickLogin().backToMainWindow();
    }

    @And("^I login to Facebook with invalid credential")
    public void loginToFBInvalid() throws Exception{
        facebookCom = new FacebookCom(this.driver);
        facebookCom.enterEmail("ashiyaap@gmail.com").enterPassword("ashiyapashiyapashyiap").clickLogin();
        this.driver.close();
        facebookCom.backToMainWindow();
    }

    @And("^I login to Google with valid credential")
    public void loginToGoogle() throws Exception{
        googleCom = new GoogleCom(this.driver);
        googleCom.enterEmail("automatedtestkumparan@gmail.com").clickNextAfterEmail().enterPassword("automatedtest1").clickNextAfterPassword().backToMainWindow();
    }

    @And("^I login to Google with invalid credential")
    public void loginToGoogleInvalid() throws Exception{
        googleCom = new GoogleCom(this.driver);
        googleCom.enterEmail("ashiyaap@gmail.com").clickNextAfterEmail().enterPassword("ashiyapashiyapashyiap").clickNextAfterPassword();
        this.driver.close();
        googleCom.backToMainWindow();
    }

    @Then("^I should be logged in to Kumparan")
    public void assertLoggedIn() throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.assertUserLoggedIn();
    }

    @Then("^I should not be logged in to Kumparan")
    public void assertNotLoggedIn() throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.assertUserNotLoggedIn();
    }

    @And("^I go to URL \"([^\"]*)\"$")
    public void goToURL(String url) throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.goToURL(url);
    }

    @Then("^I comment on article \"([^\"]*)\"$")
    public void commentOnArticle(String comment) throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.commentOnArticle(comment);
    }

    @Then("^I should be able to see my comment on article \"([^\"]*)\"$")
    public void assertCommentOnArticle(String comment) throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.assertCommentOnArticle(comment);
    }

    @Then("^I should not be able to comment and shown login options")
    public void commentOnArticleWithoutLogin() throws Exception {
        kumparanCom = new KumparanCom(this.driver);
        kumparanCom.assertLoginPopup();
    }
}