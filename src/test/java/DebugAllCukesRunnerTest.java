import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;

@CucumberOptions(
        features = "src/test/resources/",
        glue= "steps",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true,
        tags = {"@debug"}
)

public class DebugAllCukesRunnerTest extends AbstractTestNGCucumberTests {
        @AfterClass
        public static void writeExtentReport() {
            Reporter.loadXMLConfig("src/main/java/utils/extent-config.xml");
        }
}
