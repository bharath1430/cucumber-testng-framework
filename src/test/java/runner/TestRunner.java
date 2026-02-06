package runner;

import io.cucumber.testng.*;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepdefinitions", "hooks"},
    tags = "@smoke",
    plugin = {
        "pretty",
        "html:target/report.html",
        "rerun:target/failed_scenarios.txt"
    }
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
