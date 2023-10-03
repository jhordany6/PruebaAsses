package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.HeaderPage;
import co.com.proyectobase.screenplay.ui.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.HeaderPage.BTN_REGISTER;
import static co.com.proyectobase.screenplay.ui.HomePage.CARD_MACBOOK;
import static co.com.proyectobase.screenplay.ui.RegisterPage.*;

public class Register implements Task {

    public Register() {}

    public static Register Registeruser(){
        return new Register();
    }

    @Override
    @Step("El usuario llena el formulario de registro")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Camilo").into(INP_NAME),
                Enter.theValue("").into(INP_LAST_NAME),
                Enter.theValue("avecesar@emperador.com").into(INP_EMAIL),
                Enter.theValue("3232287722").into(INP_PHONE),
                Enter.theValue("123").into(INP_PASS),
                Enter.theValue("123").into(INP_NEW_PASS),
                Click.on(BTN_CONTINUE)
        );
    }
}
