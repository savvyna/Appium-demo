# Mobile Appium automation for iOS & Android

## Prerequisites on macOS

1. Homebrew
2. Node.js/npm
3. JDK
4. Xcode for iOS and Android Studio for Android
5. Appium
6. Appium Inspector


## How to:
1. Install Appium

   `npm install -g appium`

2. Install Appium Drivers

    `appium driver install uiautomator2`

    `appium driver install xcuitest`

3. Run the server

    `appium &`

3. Run the tests - example for iOS:

    `mvn clean test -Pios,regression-test`

or
   * Right mouse click on any `src/test/java` test and `Run`




**Note**: There are no installable files in the "apps" folder yet and no valid credentials to Log In.
