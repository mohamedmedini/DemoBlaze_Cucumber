package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    public WebDriver driver;

    //constructors creation
    public SignupPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //element identifications
    @FindBy(how= How.ID,using="signin2")
    public static  WebElement signup_bt;
    @FindBy(how= How.ID,using="sign-username")
    public static  WebElement username;
    @FindBy(how= How.ID,using="sign-password")
    public static  WebElement password;
    @FindBy(how=How.XPATH,using="//button[normalize-space()='Sign up']")
    public static WebElement register_bt;


    //methods creations
    public void put_URL(String url){
        driver.get(url);
    }
    public void clickSignUp(){
        signup_bt.click();
    }
    public void putUsername(String user){
        username.sendKeys(user);
    }
    public void putPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void signupClick(){
        register_bt.click();
    }

}
