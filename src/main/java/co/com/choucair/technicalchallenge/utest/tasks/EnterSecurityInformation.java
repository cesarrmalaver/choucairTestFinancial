package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.UTestSecurityInformationLogUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class EnterSecurityInformation implements Task {
    public static EnterSecurityInformation onThePasswordFields() {
        return Tasks.instrumented(EnterSecurityInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("CMll44l39l5617").into(UTestSecurityInformationLogUpPage.PASSWORD),
                SendKeys.of("CMll44l39l5617").into(UTestSecurityInformationLogUpPage.CONFIRM_PASSWORD),
                Click.on(UTestSecurityInformationLogUpPage.CHECKBOX_UTEST_TERMS),
                Click.on(UTestSecurityInformationLogUpPage.CHECKBOX_PRIVACY),
                Click.on(UTestSecurityInformationLogUpPage.BUTTON_FINAL)
        );

    }
}
