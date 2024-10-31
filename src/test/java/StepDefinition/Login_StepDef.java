package StepDefinition;

import Hooks.SetUp;
import PageObject.LoginPage;
import PageObject.SignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Login_StepDef {

    WebDriver driver= SetUp.driver;
    LoginPage log=new LoginPage(driver);

    @Given("i enter the URL {string}")
    public void i_enter_the_url(String string) {
         log.enter_URL(string);
    }

    @When("i click to login button")
    public void i_click_to_login_button() {
       log.clickLogin();
    }

    @When("i enter the username {string}")
    public void i_enter_the_username(String string) {
       log.enterUsername(string);
    }

    @When("i enter the password {string}")
    public void i_enter_the_password(String string) {
       log.enterPassword(string);
    }

    @When("i click login")
    public void i_click_login() {
        log.clickLog();
    }

    @Then("i verify that i connected successfully to my account with the message {string}")
    public void i_verify_that_i_connected_successfully_to_my_account_with_the_message(String string) {
        String actualMessage = LoginPage.getWelcomeMessage();
        Assert.assertEquals(string, actualMessage);
        System.out.println("YOU ARE CONNECTED SUCCESSFULLY TO YOUR ACCOUNT");

    }
}
