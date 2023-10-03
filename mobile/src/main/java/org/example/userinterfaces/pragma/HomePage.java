package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class HomePage {

    public static final Locator CARD_MAC_LOCATOR = locator().withAndroidXpathStatic("(//android.view.View[@content-desc=\"MacBook\"])[1]").withIosXpathStatic("1");
    public static final Target CARD_MAC = Target.the("Card de mac").located(theElementBy(CARD_MAC_LOCATOR));

    public static final Locator BTN_ITEM_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button").withIosXpathStatic("1");
    public static final Target BTN_ITEM = Target.the("Boton de items agregados").located(theElementBy(BTN_ITEM_LOCATOR));

    /*
    public static final Locator  = locator().withAndroidXpathStatic("").withIosXpathStatic("1");
    public static final Target LBL_MAC = Target.the("Copie de iphone").located(theElementBy());
*/
    private HomePage() {
        throw new IllegalStateException("user interface class");
    }
}
