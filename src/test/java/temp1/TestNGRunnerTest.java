package temp1;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","html:target/abc.html"},
		features="src/test/java/demo.feature",
		glue= {"stepdefinitions"},
		dryRun=false,
		tags="@Page23"
		
		
		)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests
{

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
