package saucedemo;

import org.example.config.Environment;
import org.example.extensions.Singleton;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartListTest extends Singleton{



    private String correctUserName = "standard_user";

    private String correctPassword = "secret_sauce";



    @Test
    public void successfulLogin() {
        //login.login(correctUserName, correctPassword);

        assertTrue(Singleton.get().findElement(By.cssSelector("div.inventory_list")).isDisplayed());
    }
}
