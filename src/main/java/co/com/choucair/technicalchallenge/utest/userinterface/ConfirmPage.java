package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/welcome?from=signup")
public class ConfirmPage extends PageObject {
    public static final Target CONFIRM_MESSAGE = Target.the("Get the confirm message").
            located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]"));
}
