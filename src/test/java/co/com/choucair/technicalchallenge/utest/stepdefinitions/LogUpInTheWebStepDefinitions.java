package co.com.choucair.technicalchallenge.utest.stepdefinitions;

import co.com.choucair.technicalchallenge.utest.model.UTestData;
import co.com.choucair.technicalchallenge.utest.questions.Answer;
import co.com.choucair.technicalchallenge.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class LogUpInTheWebStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Cesar wants to practice software automation$")
    public void thanCesarWantsToPracticeSoftwareAutomation() {
        OnStage.theActorCalled("Cesar").wasAbleTo(
                OpenUp.thePage());
    }
    @When("^he create a new user register with valid fields$")
    public void heCreateANewUserRegisterWithValidFields(List<UTestData> uTestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogUp.onThePage(),
                EnterPersonalInformation.onThePersonalFields(uTestDataList.get(1).getStrFirstName(),uTestDataList.get(1).getStrLastName()),
                EnterLocationInformation.onTheLocationFields(),
                EnterDeviceInformation.onTheDeviceFields(),
                EnterSecurityInformation.onThePasswordFields());
    }

    @Then("^he see the confirmation message (.*)$")
    public void heSeeTheConfirmationMessage(String question) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConfirmRegister.thePageMesagge());

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}
