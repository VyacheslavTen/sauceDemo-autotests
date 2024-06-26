package saucedemo;

import org.example.config.Environment;
import org.example.extensions.Singleton;
import org.example.pages.InventoryPage;
import org.example.pages.LoginPage;
import org.example.pages.Pages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends Singleton{



    private String correctUserName = "standard_user";

    private String correctPassword = "secret_sauce";

    private String incorrectUserName = "incorrect_user";

    private String incorrectPassword = "incorrect_password";



    @Test
    public void successfulLogin() {
        boolean isListVisible = Pages.login.login(correctUserName, correctPassword)
                .isInventoryListVisible();

        assertTrue(isListVisible);
    }

    @Test
    public void wrongUserNameLogin() {
        Pages.login.wrongLogin(incorrectUserName, incorrectPassword).getErrorText();

        assertEquals("Epic sadface: Username and password do not match any user in this service", Pages.login.getErrorText(), "отобразилась неверная ошибка");
    }
}
