package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.DetailsProductsPage.*;

public class DetailsProducts implements Task {

    public DetailsProducts() {}

    public static DetailsProducts Details(){
        return new DetailsProducts();
    }

    @Override
    @Step("Busca el producto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LIKE),
                Enter.theValue("2").into(INPUT_QUANTITY),
                Click.on(BTN_ADD_CART)
                );
    }
}
