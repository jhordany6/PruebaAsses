package org.example.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.example.utils.Time;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.pragma.HomePage.CARD_MAC;

public class HomeOpenCard implements Task {

    public HomeOpenCard() {

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("http://opencart.abstracta.us/"),
                Scroll.untilVisibleTarget(CARD_MAC).toBottom().untilMaxAttempts(5),
                Click.on(CARD_MAC));
        Time.getTimeThree();
    }

    public static Performable Home() {
        return instrumented(HomeOpenCard.class);
    }

}
