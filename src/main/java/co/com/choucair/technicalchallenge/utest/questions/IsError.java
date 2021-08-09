package co.com.choucair.technicalchallenge.utest.questions;

import co.com.choucair.technicalchallenge.utest.userinterface.ConfirmPage;
import co.com.choucair.technicalchallenge.utest.userinterface.UTestPersonalInformationLogUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IsError implements Question<Boolean> {

    private String question;

    public IsError(String question) { this.question=question;}

    public static IsError toThe(String question){return new IsError(question);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String firstNameError = Text.of(UTestPersonalInformationLogUpPage.FIRST_NAME_ERROR).viewedBy(actor).asString();
        String lastNameError = Text.of(UTestPersonalInformationLogUpPage.LAST_NAME_ERROR).viewedBy(actor).asString();

        if (question.equals(firstNameError) || question.equals(lastNameError)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
