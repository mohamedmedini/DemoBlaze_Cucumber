package StepDefinition;

import Hooks.SetUp;
import PageObject.PaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Payment_StepDef {

    WebDriver driver= SetUp.driver;
    PaymentPage pay= new PaymentPage(driver);

    @Given("i click placeOrder button")
    public void i_click_place_order_button() {
        pay.ClickPlaceOrder();
    }
    @When("i enter the name {string} the country {string} and the city {string}")
    public void i_enter_the_name_the_country_and_the_city(String string, String string2, String string3) {
      pay.enterName(string);
      pay.enterCountry(string2);
      pay.enterCity(string3);
    }
    @When("i enter the cardNumber {string} the month {string} and the year {string}")
    public void i_enter_the_card_number_the_month_and_the_year(String string, String string2, String string3) throws InterruptedException {
     pay.enterCard(string);
     pay.enterMonth(string2);
     pay.enterYear(string3);
     Thread.sleep(3000);
    }
    @When("i click purchase button")
    public void i_click_purchase_button() throws InterruptedException {
       pay.ClickPurchase();
       Thread.sleep(3000);
    }
    @Then("i validate the payment with the message {string} and i click OK")
    public void i_validate_the_payment_with_the_message_and_i_click_OK(String string) throws InterruptedException {
       Thread.sleep(3000);
       Assert.assertEquals(string,pay.ValidOrder());
       System.out.println("YOUR ORDER ARE PLACED SUCCESSFULLY");
       pay.ClickOK();
    }

}
