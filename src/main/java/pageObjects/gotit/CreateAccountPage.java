package pageObjects.gotit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CreateAccountPage {

    /*
    #############################################################################
    Method Name: CreateAccountPage Constructor
    Method Description: The Constructor Initializes elements of this Page Class.
    Method Parameters: AppiumDriver
    #############################################################################
     */
    public CreateAccountPage(AppiumDriver mobileDriver){
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver,3, TimeUnit.SECONDS),this);
    }

    @iOSFindBy(xpath="//*[@contentDescription='email_input']")
    @AndroidFindBy(xpath="//*[@contentDescription='email_input']")
    private MobileElement txt_email;

    @iOSFindBy(xpath="//*[@contentDescription='user_name_input']")
    @AndroidFindBy(xpath="//*[@contentDescription='user_name_input']")
    private MobileElement txt_name;

    @iOSFindBy(xpath="//*[@contentDescription='password_input']")
    @AndroidFindBy(xpath="//*[@contentDescription='password_input']")
    private MobileElement txt_password;

    @iOSFindBy(xpath="//*[@contentDescription='repeat_password_input']")
    @AndroidFindBy(xpath="//*[@contentDescription='repeat_password_input']")
    private MobileElement txt_confirmPassword;

    @iOSFindBy(xpath="//*[@text='Create Account']")
    @AndroidFindBy(xpath="//*[@text='Create Account']")
    private MobileElement btn_create;

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

    public MobileElement getTxt_name(){
        return txt_name;
    }

    public MobileElement getTxt_password(){
        return txt_password;
    }

    public MobileElement getTxt_confirmPassword(){
        return txt_confirmPassword;
    }

    public MobileElement getBtn_create(){
        return btn_create;
    }
}
