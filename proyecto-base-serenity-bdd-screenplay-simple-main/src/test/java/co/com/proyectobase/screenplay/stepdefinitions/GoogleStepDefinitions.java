package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.DetailsProducts;
import co.com.proyectobase.screenplay.tasks.Home;
import co.com.proyectobase.screenplay.tasks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static co.com.proyectobase.screenplay.ui.DetailsProductsPage.LBL_SUCCESS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoogleStepDefinitions {


    @Given("el {string} esta en la pagina de yourStore")
    public void elEstaEnLaPaginaDeYourStore(String actorNamed) {
        actor.assignName(actorNamed);
        actor.attemptsTo(
                NavigateTo.theGooglePage());

    }

    @When("el usuario visualiza el producto MacBook")
    public void elUsuarioVisualizaElProductoMacBook() {
        actor.attemptsTo((Home.macBook())
        );
    }
    @And("interractua en la interna del producto")
    public void interractuaEnLaInternaDelProducto() {
        actor.attemptsTo((DetailsProducts.Details()));

    }

    @Then("el usuario valida el mensaje de success")
    public void elUsuarioValidaElMensajeDeSuccess() {
        actor.attemptsTo(WaitUntil.the(LBL_SUCCESS, isVisible())
                        .forNoMoreThan(10).seconds(), Ensure.that(LBL_SUCCESS).isEnabled());


    }

}
