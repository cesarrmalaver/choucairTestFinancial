package co.com.choucair.technicalchallenge.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/log_up_in-the_web.feature",
                            tags = "@Stories",
                            glue = "co.com.choucair.technicalchallenge.utest.stepdefinitions",
                            snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
