package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class DetailsProductMacPage {

    public static final Locator LBL_SUCCESS_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[4]/android.view.View[1]/android.widget.TextView[1]").withIosXpathStatic("1");
    public static final Target LBL_SUCCESS = Target.the("Success: You have added ").located(theElementBy(LBL_SUCCESS_LOCATOR));
    public static final Locator BTN_ADD_CAR_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button").withIosXpathStatic("1");
    public static final Target BTN_ADD_CAR = Target.the("AÑADIR AL CARRITO").located(theElementBy(BTN_ADD_CAR_LOCATOR));

    public static final Locator INPUT_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText").withIosXpathStatic("1");
    public static final Target INPUT = Target.the("INPUT").located(theElementBy(INPUT_LOCATOR));


    private DetailsProductMacPage() {
        throw new IllegalStateException("user interface class");
    }
}
