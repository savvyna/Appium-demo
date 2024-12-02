package test;

import annotations.Feature;
import org.testng.annotations.Test;

import static constants.AlertConstants.SIGNUP_ALERT;
import static constants.LoginConstants.PASSWORD;
import static test_features.Feature.SIGN_UP;
import static net.andreinc.mockneat.unit.user.Emails.emails;
import static org.testng.Assert.assertEquals;



public class SignupTest extends BaseTest {
    @Feature(SIGN_UP)

    @Test(description = "Verify that you can Sign up to Zilch")
    public void testSignup() {
        screen().getNavigationBarScreen()
                .tapOnSignInButton();


        screen().getSignUpScreen()
                .signUp(emails().domain("startup.io").val(), PASSWORD);

        assertEquals(
                uiComponent().getAlertScreen().getAlertTitle(),
                SIGNUP_ALERT.getAlertTitle()
        );
        assertEquals(
                uiComponent().getAlertScreen().getAlertMessage(),
                SIGNUP_ALERT.getAlertMessage()
        );
    }
}
