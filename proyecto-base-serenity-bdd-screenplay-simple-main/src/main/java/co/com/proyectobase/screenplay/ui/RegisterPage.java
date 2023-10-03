package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

public class RegisterPage {

    public static By INP_NAME = By.id("input-firstname");
    public static By INP_LAST_NAME = By.id("input-lastname");
    public static By INP_EMAIL = By.id("input-email");
    public static By INP_PHONE = By.id("input-telephone");
    public static By INP_PASS = By.id("input-password");
    public static By INP_NEW_PASS = By.id("input-confirm");

    public static By BTN_CONTINUE = By.cssSelector("#content > form > div > div > input.btn.btn-primary");

    public static By LBL_NOT_MATCH = By.cssSelector("#content > form > fieldset:nth-child(2) > div.form-group.required.has-error > div > div");
    public static By LBL_MUST_BEETWEN = By.cssSelector("#account > div.form-group.required.has-error > div > div");

}
