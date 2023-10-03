package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class LeaveChromePage {

    public static final Locator BTN_NOT_ACCOUNT_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]").withIosXpathStatic("//XCUIElementTypeStaticText[@name=\"Ingresa\"]");
    public static final Target BTN_NOT_ACCOUNT = Target.the("Boton de usar sin una cuenta").located(theElementBy(BTN_NOT_ACCOUNT_LOCATOR));
    public static final Locator BTN_UNDERSTOOD_LOCATOR  = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]").withIosXpathStatic("1");
    public static final Target BTN_UNDERSTOOD = Target.the("Boton de entendido").located(theElementBy(BTN_UNDERSTOOD_LOCATOR));




    private LeaveChromePage() {
        throw new IllegalStateException("user interface class");
    }
}
