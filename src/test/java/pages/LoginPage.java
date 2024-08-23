package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public final By etUserName = By.id("username");

    public final By etUserPassword = By.name("password");

    public final By btnSignIn = By.name("commit");

    public void isOnLoginPage(){
        driver.get("https://travel.agileway.net/login");
        isVisible(btnSignIn);
    }

}
