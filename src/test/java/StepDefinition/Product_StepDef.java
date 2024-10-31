package StepDefinition;

import Hooks.SetUp;
import PageObject.ProductPage;
import PageObject.SignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Product_StepDef {

    WebDriver driver= SetUp.driver;
    ProductPage prod=new ProductPage(driver);

    @Given("i click to phone button and i choose {string}")
    public void i_click_to_phone_button_and_i_choose(String string) throws InterruptedException {
      prod.clickPhone();
      prod.choosePhone();
      prod.clickAdd();
      Thread.sleep(5000);
      driver.switchTo().alert().accept();
      prod.clickHome();
    }

    @When("i click to laptop and i choose {string}")
    public void i_click_to_laptop_and_i_choose(String string) throws InterruptedException {
      prod.clickLaptop();
      prod.chooseLaptop();
      prod.clickAdd();
      Thread.sleep(5000);
      driver.switchTo().alert().accept();
      prod.clickHome();
    }

    @When("i click to monitor and i choose {string}")
    public void i_click_to_monitor_and_i_choose(String string) throws InterruptedException {
       prod.clickMonitors();
       prod.chooseMonitor();
       prod.clickAdd();
       Thread.sleep(5000);
       driver.switchTo().alert().accept();

    }

    @Then("i click to cart button  verify that the three products are added successfully to the cart {string} and {string} and {string}")
    public void i_click_to_cart_button_verify_that_the_three_products_are_added_successfully_to_the_cart_and_and(String string, String string2, String string3) throws InterruptedException {
        prod.clickCart();
        Thread.sleep(5000);
        Assert.assertEquals(string,prod.prod1_added());
        Assert.assertEquals(string2,prod.prod2_added());
        Assert.assertEquals(string3,prod.prod3_added());
        System.out.println("THE 3 PRODUCTS ARE ADDED SUCCESSFULLY TO THE CART");
    }


}
