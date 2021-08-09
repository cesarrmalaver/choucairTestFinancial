package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.UTestLocationInformationLogUpPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;



public class EnterLocationInformation implements Task {
    public static EnterLocationInformation onTheLocationFields() {
        return Tasks.instrumented(EnterLocationInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestLocationInformationLogUpPage.CITY),
                Clear.field(UTestLocationInformationLogUpPage.CITY),
                SendKeys.of("Popayan").into(UTestLocationInformationLogUpPage.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UTestLocationInformationLogUpPage.CITY),
                Hit.the(Keys.ENTER).keyIn(UTestLocationInformationLogUpPage.CITY),
                Click.on(UTestLocationInformationLogUpPage.ZIP),
                Clear.field(UTestLocationInformationLogUpPage.ZIP),
                SendKeys.of("1930").into(UTestLocationInformationLogUpPage.ZIP),

                Click.on(UTestLocationInformationLogUpPage.COUNTRY),
                Click.on(UTestLocationInformationLogUpPage.COLOMBIA),
                Click.on(UTestLocationInformationLogUpPage.BUTTON_NEXT_DEVICE)
        );
    }
}
