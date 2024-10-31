package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public WebDriver driver;

    //constructors creations
    public ProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //elements identification
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Laptops']")
    public static WebElement phone_bt;
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Laptops']")
    public static WebElement laptop_bt;
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Monitors']")
    public static WebElement monitors_bt;
    @FindBy(how=How.XPATH, using="//a[@id='cartur']")
    public static WebElement cart_bt;
    @FindBy(how=How.XPATH,using="//a[normalize-space()='Sony xperia z5']")
    public static WebElement phone;
    @FindBy(how=How.XPATH,using="//a[normalize-space()='Sony vaio i7']")
    public static WebElement laptop;
    @FindBy(how=How.XPATH,using="//a[normalize-space()='ASUS Full HD']")
    public static WebElement monitor;
    @FindBy(how=How.XPATH,using="//a[normalize-space()='Add to cart']")
    public static WebElement add_bt;
    @FindBy(how=How.XPATH,using="//li[@class='nav-item active']")
    public static WebElement home_bt;
    @FindBy(how=How.XPATH,using="//td[normalize-space()='Sony xperia z5']")
     WebElement product1;
    @FindBy(how=How.XPATH,using="//td[normalize-space()='Sony vaio i7']")
     WebElement product2;
    @FindBy(how=How.XPATH,using="//td[normalize-space()='ASUS Full HD']")
     WebElement product3;


    //methods creation
    public void clickPhone(){
        phone_bt.click();
    }
    public void clickLaptop(){
        laptop_bt.click();
    }
    public void clickMonitors(){
        monitors_bt.click();
    }
    public void clickCart(){
        cart_bt.click();
    }
    public void choosePhone(){
        phone.click();
    }
    public void chooseLaptop(){
        laptop.click();
    }
    public void chooseMonitor(){
        monitor.click();
    }
    public void clickAdd(){
        add_bt.click();
    }
    public void clickHome(){
        home_bt.click();
    }
    public String prod1_added() {
        return product1.getText();
    }
    public String prod2_added() {
        return product2.getText();
    }
    public String prod3_added() {
        return product3.getText();
    }

}