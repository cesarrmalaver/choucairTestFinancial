package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.UTestDeviceInformationLogUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class EnterDeviceInformation implements Task {
    public static EnterDeviceInformation onTheDeviceFields() {
        return Tasks.instrumented(EnterDeviceInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDeviceInformationLogUpPage.COMPUTER),
                Click.on(UTestDeviceInformationLogUpPage.LINUX),
                Click.on(UTestDeviceInformationLogUpPage.VERSION),
                Click.on(UTestDeviceInformationLogUpPage.MINT),
                Click.on(UTestDeviceInformationLogUpPage.LENGUAGE),
                Click.on(UTestDeviceInformationLogUpPage.SPANISH),
                Click.on(UTestDeviceInformationLogUpPage.MOBILE_DEVICE),
                Click.on(UTestDeviceInformationLogUpPage.BRAND),
                Click.on(UTestDeviceInformationLogUpPage.MOBILE_DEVICE_MODEL),
                Click.on(UTestDeviceInformationLogUpPage.MODEL),
                Click.on(UTestDeviceInformationLogUpPage.MOBILE_DEVICE_OS),
                Click.on(UTestDeviceInformationLogUpPage.ANDROID_VERSION),
                Click.on(UTestDeviceInformationLogUpPage.BUTTON_NEXT_LAST_STEP)
        );

    }
}
