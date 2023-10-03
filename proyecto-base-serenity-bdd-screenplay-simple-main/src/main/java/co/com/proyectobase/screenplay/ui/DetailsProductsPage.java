package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

public class DetailsProductsPage {

    public static By INPUT_QUANTITY = By.id("input-quantity");

    public static By BTN_LIKE = By.cssSelector("#content > div > div.col-sm-4 > div.btn-group > button:nth-child(1)");
    public static By BTN_ADD_CART = By.id("button-cart");

    public static By LBL_LIKE = By.cssSelector("#product-product > div.alert.alert-success.alert-dismissible");
    public static By LBL_SUCCESS = By.xpath("//*[@id=\"product-product\"]/div[1]");

}
