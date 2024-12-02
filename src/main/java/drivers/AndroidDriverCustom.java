package drivers;

import constants.DriverConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.io.File;

import static constants.DriverConstants.ANDROID_APP_PACKAGE;


public class AndroidDriverCustom implements MobileDriverService {
    private AndroidDriver androidDriver;

    @Override
    public void spinUpDriver(AppiumDriverLocalService appiumService) {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid(DriverConstants.ANDROID_DEVICE_NAME)
                .setApp(new File(DriverConstants.ANDROID_APP_FILE_PATH).getAbsolutePath())
                .autoGrantPermissions();

        androidDriver = new io.appium.java_client.android.AndroidDriver(appiumService.getUrl(), options);
        androidDriver.manage().timeouts().implicitlyWait(DriverConstants.APPIUM_DRIVER_TIMEOUT);
    }

    @Override
    public void closeDriver() {
        androidDriver.terminateApp(ANDROID_APP_PACKAGE);
    }

    @Override
    public AppiumDriver getDriver() {
        return androidDriver;
    }
}