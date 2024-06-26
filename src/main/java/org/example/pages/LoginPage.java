package org.example.pages;
import org.example.extensions.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {



    private By usernameTextBox = By.id("user-name");

    private By passwordTextBox = By.id("password");

    private By loginButton = By.id("login-button");

    private By errorMessage = By.cssSelector("div.error-message-container");

    public InventoryPage login(String username, String password) {
        Singleton.get().findElement(usernameTextBox).sendKeys(username);
        Singleton.get().findElement(passwordTextBox).sendKeys(password);
        Singleton.get().findElement(loginButton).click();

        return Pages.inventoryList;
    }

    public String getErrorText() {

        return Singleton.get().findElement(errorMessage).getText();
    }

    public LoginPage wrongLogin(String username, String password) {
        Singleton.get().findElement(usernameTextBox).sendKeys(username);
        Singleton.get().findElement(passwordTextBox).sendKeys(password);
        Singleton.get().findElement(loginButton).click();

        return this;
    }
}
