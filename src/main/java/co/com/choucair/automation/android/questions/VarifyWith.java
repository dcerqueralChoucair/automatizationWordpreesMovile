package co.com.choucair.automation.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.TEXT_LABEL;

public class VarifyWith implements Question<Boolean> {

    private  String quetions;

    public  VarifyWith(String quetions){
        this.quetions = quetions;
    }

    public static VarifyWith the(String question) {
        return new VarifyWith(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(TEXT_LABEL).viewedBy(actor).asString();
        return quetions.equals(answer);
    }
}
