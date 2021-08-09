package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLogUpPage extends PageObject {

    public static final Target LOGUP_BUTTON = Target.the("Button that starts the registration process").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));


}
