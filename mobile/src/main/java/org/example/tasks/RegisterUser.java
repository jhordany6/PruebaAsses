package org.example.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.utils.Time;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.pragma.RegisterPage.*;

public class RegisterUser implements Task {


    public RegisterUser() {
     }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Time.getTimeFive();
        actor.attemptsTo(Scroll.untilVisibleTarget(INP_NAME).toBottom().untilMaxAttempts(3),
                Enter.keyValues("camila").into(INP_NAME),
                Scroll.untilVisibleTarget(INP_LAST_NAME).toBottom().untilMaxAttempts(3),
                Enter.keyValues("").into(INP_LAST_NAME),
                Enter.keyValues("dan@gmail.sds").into(INP_EMAIL),
                Enter.keyValues("DS").into(INP_PHONE),
                Enter.keyValues("123").into(INP_PASS),
                Scroll.untilVisibleTarget(INP_PASS_CONF).toBottom().untilMaxAttempts(3),
                Enter.keyValues("123").into(INP_PASS_CONF)
                );
        Time.getTimeFive();
    }

    public static Performable RegisterUser() {
        return instrumented(RegisterUser.class);
    }

}
