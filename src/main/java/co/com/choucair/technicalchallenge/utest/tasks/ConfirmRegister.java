package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.ConfirmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class ConfirmRegister implements Task {

    private ConfirmPage confirmPage;

    public static ConfirmRegister thePageMesagge() {
        return Tasks.instrumented(ConfirmRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(confirmPage));

    }
}
