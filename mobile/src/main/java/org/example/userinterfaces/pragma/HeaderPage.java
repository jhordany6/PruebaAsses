package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class HeaderPage {

    public static final Locator BTN_ACCOUNT_LOCATOR = locator().withAndroidXpathStatic("//android.view.View[@content-desc=\"\uF007\"]/android.widget.TextView").withIosXpathStatic("1");
    public static final Target BTN_ACCOUNT = Target.the("Boton de mi cuenta").located(theElementBy(BTN_ACCOUNT_LOCATOR));

    public static final Locator BTN_REGISTER_LOCATOR = locator().withAndroidXpathStatic("//android.view.View[@content-desc=\"Register\"]/android.widget.TextView").withIosXpathStatic("1");
    public static final Target BTN_REGISTER = Target.the("Boton de registro").located(theElementBy(BTN_REGISTER_LOCATOR));
    public static final Locator BTN_LOGIN_LOCATOR = locator().withAndroidXpathStatic("(//android.view.View[@content-desc=\"Login\"])[1]").withIosXpathStatic("1");
    public static final Target BTN_LOGIN = Target.the("Boton de login").located(theElementBy(BTN_LOGIN_LOCATOR));




    private HeaderPage() {
        throw new IllegalStateException("user interface class");
    }
}
