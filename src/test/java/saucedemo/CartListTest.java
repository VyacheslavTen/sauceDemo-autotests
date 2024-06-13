package saucedemo;

import org.example.config.Environment;
import org.example.extensions.Singleton;
import org.example.pages.LoginPage;
import org.example.pages.Pages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartListTest extends Singleton{



    private String correctUserName = "standard_user";

    private String correctPassword = "secret_sauce";



    @Test
    public void successfulLogin() {
        Pages.login.login(correctUserName, correctPassword)
                .isInventoryListVisible();
        Pages.inventoryList.addItemsToCart()
                .isCartListVisible();
        boolean isCheckoutVisible = Pages.cartList.clickCheckout().isCheckoutVisible();

        assertTrue(isCheckoutVisible);
    }
}
