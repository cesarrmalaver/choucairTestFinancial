package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSecurityInformationLogUpPage extends PageObject {

    public static final Target PASSWORD = Target.the("Field for the password").
            located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Field for confirm the password").
            located(By.id("confirmPassword"));

    public static final Target CHECKBOX_UTEST_TERMS = Target.the("Accept the Utest terms").
            located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));

    public static final Target CHECKBOX_PRIVACY = Target.the("Accept the privacy terms").
            located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));

    public static final Target BUTTON_FINAL = Target.the("Complete the register").
            located(By.id("laddaBtn"));
}
