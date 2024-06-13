package org.example.pages;
import org.example.extensions.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {



    private By usernameTextBox = By.id("user-name");

    private By passwordTextBox = By.id("password");

    private By loginButton = By.id("login-button");

    public InventoryPage login(String username, String password) {
        Singleton.get().findElement(usernameTextBox).sendKeys(username);
        Singleton.get().findElement(passwordTextBox).sendKeys(password);
        Singleton.get().findElement(loginButton).click();

        return Pages.inventoryList;
    }
}
