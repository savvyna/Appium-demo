package screens;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class SignUpScreen extends BaseScreen {
    public SignUpScreen(WebDriver driver) {
        super(driver);
    }


    public void signUp(String emailAddress, String password) {
        tapOnSignUpButton();
        tapOnGetStartedButton();
        inputRandomEmailAddress(emailAddress);
        inputRandomPassword(password);
        tapOnCheckCorrectEmail();
        tapOnCreateAccount();
    }

    private void tapOnSignUpButton() {
        tap(AppiumBy.accessibilityId("sign-up-button"));
    }

    private void tapOnGetStartedButton() {
        tap(AppiumBy.accessibilityId("welcome-screen-button-get-started"));
    }

    private void inputRandomEmailAddress(String emailAddress) {
        inputText(AppiumBy.accessibilityId("SignUpEmailField"), emailAddress);
    }

    private void inputRandomPassword(String password) {
        inputText(AppiumBy.accessibilityId("signUpPasswordField"), password);
    }

    private void tapOnCheckCorrectEmail() {
        tap(AppiumBy.linkText("I’ve checked my email is correct"));
    }

    private void tapOnCreateAccount () {
            tap(AppiumBy.accessibilityId("signup-submit-button"));
    }

}
