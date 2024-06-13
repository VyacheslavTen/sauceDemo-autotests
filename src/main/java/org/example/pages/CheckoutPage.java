package org.example.pages;
import org.example.extensions.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {



    private By firstNameField = By.id("first-name");

    public boolean isCheckoutVisible() {
        return Singleton.get().findElement(firstNameField).isDisplayed();
    }
}
