package pageObjects.gotit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    /*
    #############################################################################
    Method Name: LoginPage Constructor
    Method Description: The Constructor Initializes elements of this Page Class.
    Method Parameters: AppiumDriver
    #############################################################################
     */
    public LoginPage(AppiumDriver mobileDriver){
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver,3, TimeUnit.SECONDS),this);
    }

    @iOSFindBy(xpath="//*[@text='Email']")
    @AndroidFindBy(xpath="//*[@text='Email']")
    private MobileElement txt_email;

    @iOSFindBy(xpath="//*[@text='Password']")
    @AndroidFindBy(xpath="//*[@text='Password']")
    private MobileElement txt_password;

    @iOSFindBy(xpath="//*[@text='Login']")
    @AndroidFindBy(xpath="//*[@text='Login']")
    private MobileElement btn_login;


    /*
    #############################################################################
    Methods Names: Getters
    Method Description: This Methods return MobileElements of this Page Class.
    Method Parameters: void
    Method Return Type: MobileElement
    #############################################################################
     */

    public MobileElement getTxt_email(){
        return txt_email;
    }

    public MobileElement getTxt_password(){
        return txt_password;
    }

    public MobileElement getBtn_login(){
        return btn_login;
    }
}
