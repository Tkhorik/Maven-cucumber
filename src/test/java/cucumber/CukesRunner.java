package cucumber;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "cucumber",
        features="src/test/resources",
        tags = "@1234"
)
public class CukesRunner {}
