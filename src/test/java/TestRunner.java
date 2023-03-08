import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      // features = {"src\\test\\Feature\\Login.feature"},
        features = {"src\\test\\Feature\\Search.feature"},
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-html-report",
                "junit:target/cucumber-reports/Cucumber.xml"}
)
public class TestRunner {
}
