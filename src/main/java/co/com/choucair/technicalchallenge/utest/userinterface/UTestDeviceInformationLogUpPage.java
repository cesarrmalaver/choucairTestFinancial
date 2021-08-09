package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestDeviceInformationLogUpPage extends PageObject {

    public static final Target COMPUTER = Target.the("Field for the computer's OS ").
            located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]"));

    public static final Target LINUX = Target.the("Select linux").
            located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[2]"));

    public static final Target VERSION = Target.the("Field for the OS Version").
            located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]"));

    public static final Target MINT = Target.the("Select linux mint").
            located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[6]"));

    public static final Target LENGUAGE = Target.the("Field for the computer lenguage").
            located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[3]"));

    public static final Target SPANISH = Target.the("Select spanish").
            located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[38]"));

    public static final Target MOBILE_DEVICE = Target.the("Field for the mobile device").
            located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[4]"));

    public static final Target BRAND = Target.the("Select brand Device").
            located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[3]"));

    public static final Target MOBILE_DEVICE_MODEL = Target.the("Field for the model device model").
            located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[5]"));

    public static final Target MODEL = Target.the("Select Z2 Play").
            located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[45]"));

    public static final Target MOBILE_DEVICE_OS = Target.the("Field for the mobile device os").
            located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[6]"));

    public static final Target ANDROID_VERSION = Target.the("Select Android version").
            located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[1]"));

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("Button for the final step").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
