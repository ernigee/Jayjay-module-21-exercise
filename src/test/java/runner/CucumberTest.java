package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdef"},
        features = {"src/test/resources"},
        plugin = {"pretty"},
        tags = "@tags"
)
public class CucumberTest {
}
