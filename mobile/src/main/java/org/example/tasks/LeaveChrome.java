package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.utils.Time;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.pragma.LeaveChromePage.BTN_NOT_ACCOUNT;
import static org.example.userinterfaces.pragma.LeaveChromePage.BTN_UNDERSTOOD;

public class LeaveChrome implements Task {


    public LeaveChrome() {
     }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Time.getTimeFive();
        actor.attemptsTo(Click.on(BTN_NOT_ACCOUNT));
        actor.attemptsTo(Click.on(BTN_UNDERSTOOD)
                );
    }

    public static Performable Leave() {
        return instrumented(LeaveChrome.class);
    }

}
