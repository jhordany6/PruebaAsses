package org.example.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.utils.Time;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.pragma.DetailsProductMacPage.BTN_ADD_CAR;


public class DetailsProductMac implements Task {

    public DetailsProductMac() {

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.untilVisibleTarget(BTN_ADD_CAR).toBottom().untilMaxAttempts(5),
                Click.on(BTN_ADD_CAR));
        Time.getTimeFive();
    }

    public static Performable DetailsMac() {
        return instrumented(DetailsProductMac.class);
    }

}
