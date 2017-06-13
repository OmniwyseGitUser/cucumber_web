package cucumber.test;
import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "src/test/java/feature/google.feature",
		      format = { "pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json" }) 
public class RunTest {
}

