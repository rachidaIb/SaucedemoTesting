package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

  @RunWith(Cucumber.class)
  @CucumberOptions(features="src/test/resources/features", glue="stepDefs",plugin={"html:target/cucumber-html-report.html","json:target/cucumber-json-report.json"})

  public class TestRun {

     
}
