package Hooks;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SetUp {

    public static WebDriver driver;

    @Before
    public static void initial () {
        driver= DriverManager.GetDriver();
    }

    @BeforeStep
    public static void Step () {
        System.out.println("Step in Progress");
    }

    @AfterStep
    public void TakeScreenshot(Scenario scenario) {
        final byte [] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png", "image");
    }

    @After
    public static void terminal () {
        driver.close();
    }

}
