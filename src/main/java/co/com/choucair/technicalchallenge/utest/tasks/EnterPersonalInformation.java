package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.UTestPersonalInformationLogUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class EnterPersonalInformation implements Task {

    private String strFirstName;
    private String strLastName;

    public EnterPersonalInformation(String strFirstName, String strLastName){
        this.strFirstName=strFirstName;
        this.strLastName=strLastName;
    }

    public static EnterPersonalInformation onThePersonalFields(String strFirstName, String strLastName) {
        return Tasks.instrumented(EnterPersonalInformation.class,strFirstName,strLastName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(strFirstName).into(UTestPersonalInformationLogUpPage.FIRSTNAME ),
                SendKeys.of(strLastName).into(UTestPersonalInformationLogUpPage.LASTNAME),
                SendKeys.of("pepe"+(int)(Math.random()*100+1)+"@gmail.com").into(UTestPersonalInformationLogUpPage.EMAIL),
                SendKeys.of("May").into(UTestPersonalInformationLogUpPage.BIRTHMONTH),
                SendKeys.of("17").into(UTestPersonalInformationLogUpPage.BIRTHDAY),
                SendKeys.of("1990").into(UTestPersonalInformationLogUpPage.BIRTHYEAR),
                Click.on(UTestPersonalInformationLogUpPage.LENGUAGES),
                Click.on(UTestPersonalInformationLogUpPage.LENGUAGES),
                SendKeys.of("Spanish").into(UTestPersonalInformationLogUpPage.LENGUAGES),
                Click.on(UTestPersonalInformationLogUpPage.BUTTON_NEXT_LOCATION));
    }
}
