package co.com.choucair.technicalchallenge.utest.questions;

import co.com.choucair.technicalchallenge.utest.userinterface.ConfirmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question){
        this.question=question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String confirmMessage = Text.of(ConfirmPage.CONFIRM_MESSAGE).viewedBy(actor).asString();
        if (question.equals(confirmMessage)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}
