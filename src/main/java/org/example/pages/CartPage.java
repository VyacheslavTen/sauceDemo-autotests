package org.example.pages;
import org.example.extensions.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {



    private By cartList = By.id("cart_contents_container");

    public boolean isCartListVisible() {
        return Singleton.get().findElement(cartList).isDisplayed();
    }
}
