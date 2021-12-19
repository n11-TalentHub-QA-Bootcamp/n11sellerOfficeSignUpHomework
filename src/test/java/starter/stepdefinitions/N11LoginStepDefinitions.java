package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.login.LoginAsUser;
import starter.n11.navigation.tasks.NavigateTo;

public class N11LoginStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;


    @Given("user launch browser and open the main page")
    public void userLaunchBrowserAndOpenTheMainPage() {

        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11HomePage());
    }

    @When("user logged in with valid credentials")
    public void userLoggedInWithValidCredentials() {
        actor.attemptsTo(LoginAsUser.loginThePage("walomim175", "walomim175@pyrelle.com","walomim175@pyrelle.com" ,"123123123","123123123", "walomim175pyrelle"));
    }

    @Then("user logged in successfully")
    public void userLoggedInSuccessfully() {
    }
}
