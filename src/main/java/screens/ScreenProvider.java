package screens;

import org.openqa.selenium.WebDriver;

public class ScreenProvider extends BaseScreen {
    public ScreenProvider(WebDriver driver) {
        super(driver);
    }

    public NavigationBarScreen getNavigationBarScreen() {
        return new NavigationBarScreen(driver);
    }

    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver);
    }

    public SignUpScreen getSignUpScreen() {
        return new SignUpScreen(driver);
    }

}
