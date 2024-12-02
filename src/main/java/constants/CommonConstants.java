package constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommonConstants {
    private final static Logger logger = LogManager.getLogger();

    private final static String QA = "qa";
    public static final String MOBILE_PLATFORM_NAME = getPlatformName();
    public static final String EXECUTION_ENV_NAME = getEnvironmentName();

    private static String getEnvironmentName() {
        String environmentNameFromPomXml = System.getProperty("environment");
        String envName;

        if (environmentNameFromPomXml != null)
            envName = environmentNameFromPomXml;
        else {
            logger.warn("The Maven Profile is missing the environment configuration.");
            logger.warn("The default environment '{}' will be enabled for this run.", QA);
            envName = QA;
        }

        return envName.toLowerCase();
    }

    private static String getPlatformName() {
        String platformNameFromPomXml = System.getProperty("platform");
        String platformName;

        if (platformNameFromPomXml != null)
            platformName = platformNameFromPomXml;
        else {
            logger.warn("The Maven Profile is missing the platform configuration.");
            logger.warn("The default platform '{}' will be enabled for this run.", DriverConstants.ANDROID);
            platformName = DriverConstants.ANDROID;
        }

        return platformName.toLowerCase();
    }
}
