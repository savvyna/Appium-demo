package test;

import annotations.Feature;
import org.testng.annotations.Test;

import static constants.AlertConstants.LOGIN_ALERT;
import static constants.LoginConstants.EMAIL_ADDRESS;
import static constants.LoginConstants.PASSWORD;
import static org.testng.Assert.assertEquals;
import static test_features.Feature.LOGIN;

public class LoginTest extends BaseTest {
	@Feature(LOGIN)
	@Test(description = "VVerify that you can Sign up to Zilch with valid credentials")
	public void testLogin() {
		screen().getNavigationBarScreen()
				.tapOnSignInButton();
		screen().getLoginScreen()
				.login(EMAIL_ADDRESS, PASSWORD);
		assertEquals(
				uiComponent().getAlertScreen().getAlertTitle(),
				LOGIN_ALERT.getAlertMessage()
		);
		assertEquals(
				uiComponent().getAlertScreen().getAlertMessage(),
				LOGIN_ALERT.getAlertMessage()
		);
	}
}
