package com.co.demo.stepdefinitios;

import com.co.demo.models.UserData;
import com.co.demo.steps.SerenityPageFormySteps;
import com.co.demo.utils.GlobalData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class serenityPageFormyStepDefinitions {

    @Steps
    private SerenityPageFormySteps pageSteps;

    @Given("que luis quiere consultar en wikipedia")
    public void whatLuisWantsToConsultOnWikipedia() {
        pageSteps.openPage(GlobalData.baseUrl);
    }
    @When("el ingresa la palabra testing en el buscador")
    public void heEntersTheWordTestingInTheSearch() {
        pageSteps.searchWord(UserData.label);

    }
    //@then("^el deberia ver la palabra (.*) en la pantalla$")
    @Then("el deberia ver la palabra Pruebas de software en la pantalla")
    //public void theShouldSeeTheWordSoftwareTestsOnTheScreen(String palabraEsperada) {
    public void theShouldSeeTheWordSoftwareTestsOnTheScreen() {
        pageSteps.viewWord(UserData.label);
    }
}
