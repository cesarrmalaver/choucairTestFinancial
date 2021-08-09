package co.com.choucair.technicalchallenge.utest.stepdefinitions;

import co.com.choucair.technicalchallenge.utest.model.UTestData;
import co.com.choucair.technicalchallenge.utest.questions.IsEmpty;
import co.com.choucair.technicalchallenge.utest.questions.IsError;
import co.com.choucair.technicalchallenge.utest.tasks.EnterPersonalInformation;
import co.com.choucair.technicalchallenge.utest.tasks.LogUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class LogUpEmptyFieldsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @When("^he create a empty user register$")
    public void heCreateAEmptyUserRegister(List<UTestData> uTestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogUp.onThePage(),
                EnterPersonalInformation.onThePersonalFields(
                        uTestDataList.get(1).getStrFirstName(),uTestDataList.get(1).getStrLastName()));
    }

    @Then("^he see the lastname empty fields error Last name is required (.*)$")
    public void heSeeTheLastnameEmptyFieldsErrorLastNameIsRequired(String question) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(IsEmpty.toThe(question)));
    }
}
