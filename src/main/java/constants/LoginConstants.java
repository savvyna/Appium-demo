package constants;

import static utils.PropertyReader.getEnvironmentConfig;

public class LoginConstants {
    public static final String EMAIL_ADDRESS = getEnvironmentConfig("email_address");
    public static final String PASSWORD = getEnvironmentConfig("password");
}
