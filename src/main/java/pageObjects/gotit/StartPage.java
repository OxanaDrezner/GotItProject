package pageObjects.gotit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class StartPage {

    /*
    #############################################################################
    Method Name: StartPage Constructor
    Method Description: The Constructor Initializes elements of this Page Class.
    Method Parameters: AppiumDriver
    #############################################################################
     */
    public StartPage(AppiumDriver mobileDriver){
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver,3, TimeUnit.SECONDS),this);
    }

    @iOSFindBy(xpath="//*[@contentDescription='start_button']")
    @AndroidFindBy(xpath="//*[@contentDescription='start_button']")
    private MobileElement btn_start;

    @iOSFindBy(xpath="//*[@text='Login']")
    @AndroidFindBy(xpath="//*[@text='Login']")
    private MobileElement btn_logIn;


    /*
    #############################################################################
    Methods Names: Getters
    Method Description: This Methods return MobileElements of this Page Class.
    Method Parameters: void
    Method Return Type: MobileElement
    #############################################################################
     */

    public MobileElement getBtn_start(){
        return btn_start;
    }

    public MobileElement getBtn_logIn(){
        return btn_logIn;
    }

}
