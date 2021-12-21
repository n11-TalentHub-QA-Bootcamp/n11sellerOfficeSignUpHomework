package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.cocoads.login.LoginEnglishCoco;
import starter.cocoads.tasks.NavigateTo;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class CocoadsStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");
    @Managed
    WebDriver webDriver;

    @Given("Hasan continues in english")
    public void hasanContinuesInEnglish() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theCocoadsLogin());

    }

    @When("Hasan logs in to cocoads")
    public void hasanLogsInToCocoads() {
        actor.attemptsTo(LoginEnglishCoco.loginCoco("serenitysdet@gmail.com","serenitysdet-1"));
        //actor.attemptsTo(LoginEnglishCoco.loginCoco("serenitysdet@gmail.com","serenitysdet-1"));

    }

    @Then("he should see information about his account in cocoads")
    public void heShouldSeeInformationAboutHisAccountInCocoads() {
       /* actor.should(
                GivenWhenThen.seeThat(the(starter.cocoads.tasks.user_interface.CocoAdsHomePageElements.PROFILENAME_LABEL)
                        ,containsText("serenitysdet@gmail.com"))
        );*/
    }
}
