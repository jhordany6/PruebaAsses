package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.GooglePage;
import co.com.proyectobase.screenplay.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.HomePage.CARD_MACBOOK;

public class Home implements Task {

    public Home() {}

    public static Home macBook(){
        return new Home();
    }

    @Override
    @Step("Busca el producto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARD_MACBOOK)
        );
    }
}
