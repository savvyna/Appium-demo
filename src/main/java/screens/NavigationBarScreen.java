package screens;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class NavigationBarScreen extends BaseScreen {
    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    //Zilch Customers -> Log in via Sign in button
    public void tapOnSignInButton() {
        tap(AppiumBy.name("Sign in"));
    }

}
