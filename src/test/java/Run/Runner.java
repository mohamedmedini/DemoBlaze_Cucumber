package Run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        tags= "@Payment",
        features= "src/test/features/Payment/Pay.feature",
        glue={"Hooks","StepDefinition"},

        publish= true,
        plugin ={"pretty","html:target/htmlreport.html","json:target/report","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Runner {
}
