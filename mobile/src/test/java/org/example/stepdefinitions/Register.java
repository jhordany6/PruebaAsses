package org.example.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.tasks.RegisterUser;
import org.example.utils.Time;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.example.userinterfaces.pragma.HeaderPage.BTN_ACCOUNT;
import static org.example.userinterfaces.pragma.HeaderPage.BTN_REGISTER;
import static org.example.userinterfaces.pragma.RegisterPage.INP_NAME;

public class Register {


    @Cuando("^el usuario visualiza el header y sus componentes$")
    public void elUsuarioVisualizaElHeaderYSusComponentes() {
        theActorInTheSpotlight().attemptsTo(Click.on(BTN_ACCOUNT),
                Click.on(BTN_REGISTER));
        Time.getTimeFive();
    }

    @Y("^el usuario procede a llenar los campos respectivos$")
    public void elUsuarioProcedeALlenarLosCamposRespectivos() {
        theActorInTheSpotlight().attemptsTo(RegisterUser.RegisterUser());
    }

    @Entonces("^Then el usuario procede a visualizar dos mensajes de error$")
    public void thenElUsuarioProcedeAVisualizarDosMensajesDeError() {
    }
}