package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    //constructors creations
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    //elements identification
    @FindBy(how= How.ID,using="login2")
    public static WebElement login_bt;
    @FindBy(how= How.ID,using="loginusername")
    public static  WebElement Username;
    @FindBy(how= How.ID,using="loginpassword")
    public static  WebElement Password;
    @FindBy(how=How.XPATH,using="//button[normalize-space()='Log in']")
    public static WebElement Log_bt;
    @FindBy(how=How.XPATH,using="//a[normalize-space()='Welcome YtestYtest']" )
    static WebElement WelcomeMessage;

    //methode creation
    public void enter_URL(String url){
        driver.get(url);
    }
    public void clickLogin(){
        login_bt.click();
    }
    public void enterUsername(String User){
        Username.sendKeys(User);
    }
    public void enterPassword(String Pwd) {
        Password.sendKeys(Pwd);
    }
    public void clickLog(){
        Log_bt.click();
    }
    public static String getWelcomeMessage() {
        return WelcomeMessage.getText().trim();
    }
}
