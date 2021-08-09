package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.UTestLogUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class LogUp implements Task {
    public static LogUp onThePage() {
        return Tasks.instrumented(LogUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestLogUpPage.LOGUP_BUTTON));
    }
}
