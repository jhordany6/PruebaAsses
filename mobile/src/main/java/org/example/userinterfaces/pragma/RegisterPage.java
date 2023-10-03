package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class RegisterPage {

    public static final Locator INP_NAME_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText").withIosXpathStatic("1");
    public static final Target INP_NAME = Target.the("Input de nombre").located(theElementBy(INP_NAME_LOCATOR));

    public static final Locator INP_LAST_NAME_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[5]/android.widget.EditText").withIosXpathStatic("1");
    public static final Target INP_LAST_NAME = Target.the("Campo de apellido").located(theElementBy(INP_LAST_NAME_LOCATOR));

    public static final Locator INP_EMAIL_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.widget.EditText").withIosXpathStatic("1");
    public static final Target INP_EMAIL = Target.the("Campo de correo electronico").located(theElementBy(INP_EMAIL_LOCATOR));

    public static final Locator INP_PHONE_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[9]/android.widget.EditText").withIosXpathStatic("1");
    public static final Target INP_PHONE = Target.the("Campo de telefono").located(theElementBy(INP_PHONE_LOCATOR));

    public static final Locator INP_PASS_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.EditText").withIosXpathStatic("1");
    public static final Target INP_PASS = Target.the("Campo de contraseña").located(theElementBy(INP_PASS_LOCATOR));

    public static final Locator INP_PASS_CONF_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.widget.EditText").withIosXpathStatic("1");
    public static final Target INP_PASS_CONF = Target.the("Input de confimar contraseña").located(theElementBy(INP_PASS_CONF_LOCATOR));

    public static final Locator BTN_CONTINUE_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button").withIosXpathStatic("1");
    public static final Target BTN_CONTINUE = Target.the("Boton de continuar formulario").located(theElementBy(BTN_CONTINUE_LOCATOR));






    private RegisterPage() {
        throw new IllegalStateException("user interface class");
    }
}
