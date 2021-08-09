package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestPersonalInformationLogUpPage extends PageObject {

    public static final Target FIRSTNAME = Target.the("Field for the first name").
            located(By.id("firstName"));

    public static final Target LASTNAME = Target.the("Field for the last name").
            located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Field for the email").
            located(By.id("email"));

    public static final Target BIRTHMONTH = Target.the("Field for the birth month").
            located(By.id("birthMonth"));

    public static final Target BIRTHDAY = Target.the("Field for the birth day").
            located(By.id("birthDay"));

    public static final Target BIRTHYEAR = Target.the("Field for the birth year").
            located(By.id("birthYear"));

    public static final Target LENGUAGES = Target.the("Field for the lenguage that you speak").
            located(By.xpath("//input[@class='ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button to advance to the location fields").
            located(By.xpath("//i[@class='material-icons']"));

    public static final Target FIRST_NAME_ERROR = Target.the("Error message whe the field is empty").
            located(By.id("firstNameError"));

    public static final Target LAST_NAME_ERROR = Target.the("Error message whe the field is empty").
            located(By.id("lastNameError"));



}
