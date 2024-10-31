package StepDefinition;

import Hooks.SetUp;
import PageObject.SignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp_StepDef {

    WebDriver driver= SetUp.driver;
    SignupPage sign=new SignupPage(driver);

    @Given("i put the URL {string}")
    public void i_put_the_url(String string) {
         sign.put_URL(string);
    }

    @When("i click to signup button")
    public void i_click_to_signup_button() {
        sign.clickSignUp();
    }

    @When("i put the username {string}")
    public void i_put_the_username(String string) {
        sign.putUsername(string);
    }

    @When("i put the password {string}")
    public void i_put_the_password(String string) {
        sign.putPassword(string);
    }

    @When("i click signup")
    public void i_click_signup() {
        sign.signupClick();
    }

    @Then("i verify that the new account is created successfully with the message {string}")
    public void i_verify_that_the_new_account_is_created_successfully_with_the_message(String string) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println("expected message is: " + alert.getText());
        alert.accept();

    }
}
