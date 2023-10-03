package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.Register;
import co.com.proyectobase.screenplay.ui.HeaderPage;
import co.com.proyectobase.screenplay.ui.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static co.com.proyectobase.screenplay.ui.DetailsProductsPage.LBL_SUCCESS;
import static co.com.proyectobase.screenplay.ui.HeaderPage.*;
import static co.com.proyectobase.screenplay.ui.RegisterPage.LBL_MUST_BEETWEN;
import static co.com.proyectobase.screenplay.ui.RegisterPage.LBL_NOT_MATCH;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterStepDefinitions {

    @When("el usuario visualiza el header y sus componentes")
    public void elUsuarioVisualizaElHeaderYSusComponentes() {
        actor.attemptsTo(
                WaitUntil.the(BTN_CHECKOUT, isVisible())
                        .forNoMoreThan(10).seconds(),
                WaitUntil.the(BTN_WISH, isVisible())
                        .forNoMoreThan(10).seconds(),
                (Click.on(HeaderPage.BTN_ACCOUNT)),
                (Click.on(BTN_REGISTER))
                );
    }

    @And("el usuario procede a llenar los campos respectivos")
    public void elUsuarioProcedeALlenarLosCamposRespectivos() {
       actor.attemptsTo(Register.Registeruser());
    }

    @Then("el usuario procede a visualizar dos mensajes de error")
    public void elUsuarioProcedeAVisualizarDosMensajesDeError() {
        actor.attemptsTo(
                WaitUntil.the(LBL_MUST_BEETWEN, isVisible())
                        .forNoMoreThan(10).seconds(), Ensure.that(LBL_MUST_BEETWEN).hasText("Last Name must be between 1 and 32 characters!"),
                WaitUntil.the(LBL_NOT_MATCH, isVisible())
                        .forNoMoreThan(10).seconds(), Ensure.that(LBL_NOT_MATCH).hasText("Password must be between 4 and 20 characters!"));
    }
}
