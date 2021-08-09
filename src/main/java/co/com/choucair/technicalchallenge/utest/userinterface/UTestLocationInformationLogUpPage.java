package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLocationInformationLogUpPage extends PageObject {

    public static final Target CITY = Target.the("Field for the city").
            located(By.id("city"));

    public static final Target ZIP = Target.the("Field for the ZIP").
            located(By.id("zip"));

    public static final Target COUNTRY = Target.the("Field for the country").
            located(By.xpath("(//span[@class=\"ui-select-match-text pull-left\"])[1]"));

    public static final Target COLOMBIA = Target.the("Select Colombia").
            located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[47]"));

    public static final Target BUTTON_NEXT_DEVICE = Target.the("Button to advance to the device fields").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
