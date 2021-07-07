package utilities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.gotit.*;


public class Base {
    // General
    protected static WebDriverWait wait;
    protected static DesiredCapabilities dc;

    // Mobile
    protected static AppiumDriver mobileDriver;


    // Page Objects - Mobile
    protected static StartPage gotItStart;
    protected static CreateAccountPage gotItCreateAccount;
    protected static LoginPage gotItLogin;
    protected static TaskMainPage gotItTaskMain;
    protected static CreateTaskPage gotItCreateTask;
    protected static ChooseActionPage gotItChooseAction;


}
