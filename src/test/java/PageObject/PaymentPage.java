package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    public WebDriver driver;

    //constructors creation
    public PaymentPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //elements identification
    @FindBy(how= How.XPATH,using="//button[normalize-space()='Place Order']")
    public static WebElement PlaceOrder_bt;
    @FindBy(how=How.ID,using="name")
    public static WebElement Name;
    @FindBy(how=How.ID,using="country")
    public static WebElement Country;
    @FindBy(how=How.ID,using="city")
    public static WebElement City;
    @FindBy(how=How.ID,using="card")
    public static WebElement CreditCard;
    @FindBy(how=How.ID,using="month")
    public static WebElement Month;
    @FindBy(how=How.ID,using="year")
    public static WebElement Year;
    @FindBy(how= How.XPATH,using="//button[normalize-space()='Purchase']")
    public static WebElement Purchase_bt;
    @FindBy(how= How.XPATH,using="//button[normalize-space()='OK']")
    public static WebElement OK_bt;
    @FindBy(how=How.XPATH,using="//h2[normalize-space()='Thank you for your purchase!']")
    WebElement OrderValidation ;

    //methods creation
    public void ClickPlaceOrder(){
        PlaceOrder_bt.click();
    }
    public void  enterName(String name) {
        Name.sendKeys(name);
    }
    public void enterCountry(String country) {
        Country.sendKeys(country);
    }
    public void enterCity(String city) {
        City.sendKeys(city);
    }
    public void enterCard(String card) {
        CreditCard.sendKeys(card);
    }
    public void enterMonth(String month) {
        Month.sendKeys(month);
    }
    public void enterYear(String year) {
        Year.sendKeys(year);
    }
    public void ClickPurchase(){
        Purchase_bt.click();
    }
    public void ClickOK(){
        OK_bt.click();
    }
    public String ValidOrder() {
        return OrderValidation.getText();
    }

}
