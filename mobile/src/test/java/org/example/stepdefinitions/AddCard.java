package org.example.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.example.questions.SuccessQuestion;
import org.example.tasks.DetailsProductMac;
import org.example.tasks.HomeOpenCard;
import org.example.tasks.LeaveChrome;
import org.example.utils.Time;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddCard {

    @Dado("^el (.*) acepta los permisos de chrome$")
    public void elAceptaLosPermisosDeChrome(String actor) {
        theActorCalled(actor).entersTheScene();
        theActorInTheSpotlight().attemptsTo((LeaveChrome.Leave()));
        Time.getTimeFive();
    }
    @Cuando("^el 'usuario' inicializa y procede a ir a la interna del mac$")
    public void elUsuarioInicializaYProcedeAIrALaInternaDelMac() {
        theActorInTheSpotlight().attemptsTo(HomeOpenCard.Home(), DetailsProductMac.DetailsMac());
    }

    @Entonces("^el 'usuario' procede agregar el producto y visualiza el mensaje de success$")
    public void elUsuarioProcedeAgregarElProductoYVisualizaElMensajeDeSuccess() {
        //theActorInTheSpotlight().attemptsTo(Click.on(DetailsProductMacPage.BTN_ADD_CAR));
        theActorInTheSpotlight().should(seeThat(SuccessQuestion.Success()));

    }

}