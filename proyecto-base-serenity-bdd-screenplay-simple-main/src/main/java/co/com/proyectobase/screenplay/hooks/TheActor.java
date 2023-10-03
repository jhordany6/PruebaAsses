package co.com.proyectobase.screenplay.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TheActor {

    public static Actor actor;
    @Managed
    public WebDriver hisBrowser;

    @Before
    public void setTheActor(){
        hisBrowser = new FirefoxDriver();
        actor = Actor.named("certificador");
        actor.can(BrowseTheWeb.with(hisBrowser));
    }

}
