package drivers;

import constants.DriverConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.io.File;

import static constants.DriverConstants.IOS_PLATFORM_VERSION;

public class IOSDriverCustom implements MobileDriverService {
    private AppiumDriver iosDriver;

    @Override
    public void spinUpDriver(AppiumDriverLocalService appiumService) {
        XCUITestOptions options = new XCUITestOptions()
                .setDeviceName(DriverConstants.IOS_DEVICE_NAME)
                .setPlatformVersion(IOS_PLATFORM_VERSION)
                .setApp(new File(DriverConstants.IOS_APP_FILE_PATH).getAbsolutePath())
                .autoAcceptAlerts();

        iosDriver = new io.appium.java_client.ios.IOSDriver(appiumService.getUrl(), options);
        iosDriver.manage().timeouts().implicitlyWait(DriverConstants.APPIUM_DRIVER_TIMEOUT);
    }

    @Override
    public void closeDriver() {
        iosDriver.quit();
    }

    @Override
    public AppiumDriver getDriver() {
        return iosDriver;
    }
}
