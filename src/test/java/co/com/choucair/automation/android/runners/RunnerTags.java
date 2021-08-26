package co.com.choucair.automation.android.runners;

import co.com.choucair.automation.android.questions.VarifyWith;
import co.com.choucair.automation.android.tasks.Login;
import co.com.choucair.automation.android.tasks.OpenThe;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/wordpress.feature",
        glue = {"co.com.choucair.automation.android.stepdefinitions","co.com.choucair.automation.android.utils"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}
