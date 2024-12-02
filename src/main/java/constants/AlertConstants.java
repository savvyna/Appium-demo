package constants;

import lombok.Getter;

@Getter
public enum AlertConstants {
    LOGIN_ALERT("Logged in :)", "Some message that verifies You are logged in..."),
    SIGNUP_ALERT("Sign Up is in Progress", "Not too long now!");

    private final String alertTitle, alertMessage;

    AlertConstants(String alertTitle, String alertMessage) {
        this.alertTitle = alertTitle;
        this.alertMessage = alertMessage;
    }

    // Add getter methods manually if Lombok is removed
    public String getAlertTitle() {
        return alertTitle;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}
