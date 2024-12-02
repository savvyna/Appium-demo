package screens;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends BaseScreen {
    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    public void login(String emailAddress, String password) {
        inputEmailAddress(emailAddress);
        inputPassword(password);
        tapOnLoginButton();
    }


    private void inputEmailAddress(String emailAddress) {
        inputText(AppiumBy.accessibilityId("email-field"), emailAddress);
    }

    private void inputPassword(String password) {
        inputText(AppiumBy.accessibilityId("password-field"), password);
    }

    private void tapOnLoginButton() {
        tap(AppiumBy.accessibilityId("log-in-button"));
    }


}
