package drivers;

import java.security.InvalidParameterException;

import static constants.CommonConstants.MOBILE_PLATFORM_NAME;
import static constants.DriverConstants.ANDROID;
import static constants.DriverConstants.IOS;

public class MobileDriverFactory {
    public MobileDriverService getDriverService() {
        MobileDriverService driver;

        switch (MOBILE_PLATFORM_NAME) {
            case ANDROID:
                driver = new AndroidDriverCustom();
                break;
            case IOS:
                driver = new IOSDriverCustom();
                break;
            default:
                throw new InvalidParameterException("Please use platform as '" + ANDROID + "' or '" + IOS + "'");
        }

        return driver;
    }
}
