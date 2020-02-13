import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"usage"}, //Junit plugins and others
        monochrome = true, //readable
        glue = "stepdefs", //package format
        features = "src/test/java/features", //path format
        strict = true, //skip undefined steps from execution
        tags = "@OpenDBO" //tests
)
public class RunCucumberTest {

}