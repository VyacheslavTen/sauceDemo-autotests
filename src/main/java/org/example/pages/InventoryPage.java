package org.example.pages;
import org.example.extensions.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    private By inventoryList = By.cssSelector("div.inventory_list");

    private By addBackpack = By.id("add-to-cart-sauce-labs-backpack");

    private By addTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    private By cartLink = By.cssSelector("a.shopping_cart_link\n");

    public boolean isInventoryListVisible() {
        return Singleton.get().findElement(inventoryList).isDisplayed();
    }

    public CartPage addItemsToCart() {
        Singleton.get().findElement(addBackpack).click();
        Singleton.get().findElement(addTshirt).click();
        Singleton.get().findElement(cartLink).click();

        return Pages.cartList;
    }
}
