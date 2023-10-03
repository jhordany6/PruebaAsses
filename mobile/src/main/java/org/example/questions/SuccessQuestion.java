package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.userinterfaces.pragma.DetailsProductMacPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.example.userinterfaces.pragma.DetailsProductMacPage.LBL_SUCCESS;

public class SuccessQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String textSucess = "Success: You have added ";
        actor.attemptsTo(WaitUntil.the(LBL_SUCCESS, isEnabled()).forNoMoreThan(20).seconds());
        String SeeRetireSucess = LBL_SUCCESS.resolveFor(actor).getText();
        return textSucess.equals(SeeRetireSucess);


    }

    public static SuccessQuestion Success() {
        return new SuccessQuestion();

    }

}