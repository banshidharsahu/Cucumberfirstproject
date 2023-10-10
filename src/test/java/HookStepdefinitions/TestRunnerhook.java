package HookStepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuresforHook/Hooksfeature.feature", glue = {
		"HookStepdefinitions" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReport",
				"json:target/JsonReports/reports.json", "junit:target/JUnitReports/reports.xml" })
public class TestRunnerhook {

}
