/*package CucumberReport; 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = (features = {/src/test/java/features/}, format = {" json :target/cucumber.json"}, glue = "steps")
)
/*    public class CucumberReport extends AbstractTestNGCucumberTests
    {
}*/
package CucumberReport; 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={"stepDefinition"}
 ,monochrome = false
 )
 
public class TestRunner {
 
}
