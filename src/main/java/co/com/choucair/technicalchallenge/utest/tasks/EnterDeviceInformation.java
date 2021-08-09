package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.UTestDeviceInformationLogUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;


public class EnterDeviceInformation implements Task {
    public static EnterDeviceInformation onTheDeviceFields() {
        return Tasks.instrumented(EnterDeviceInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDeviceInformationLogUpPage.COMPUTER),
                WaitUntil.the(UTestDeviceInformationLogUpPage.LINUX, WebElementStateMatchers.isVisible()),
                Click.on(UTestDeviceInformationLogUpPage.LINUX),
                Click.on(UTestDeviceInformationLogUpPage.VERSION),
                Click.on(UTestDeviceInformationLogUpPage.MINT),
                Click.on(UTestDeviceInformationLogUpPage.LENGUAGE),
                Click.on(UTestDeviceInformationLogUpPage.SPANISH),
                Click.on(UTestDeviceInformationLogUpPage.MOBILE_DEVICE),
                Click.on(UTestDeviceInformationLogUpPage.BRAND),
                Click.on(UTestDeviceInformationLogUpPage.MOBILE_DEVICE_MODEL),
                WaitUntil.the(UTestDeviceInformationLogUpPage.MODEL, WebElementStateMatchers.isVisible()),
                Click.on(UTestDeviceInformationLogUpPage.MODEL),
                WaitUntil.the(UTestDeviceInformationLogUpPage.MOBILE_DEVICE_OS, WebElementStateMatchers.isVisible()),
                Click.on(UTestDeviceInformationLogUpPage.MOBILE_DEVICE_OS),
                Click.on(UTestDeviceInformationLogUpPage.ANDROID_VERSION),
                Click.on(UTestDeviceInformationLogUpPage.BUTTON_NEXT_LAST_STEP)
        );

    }
}
