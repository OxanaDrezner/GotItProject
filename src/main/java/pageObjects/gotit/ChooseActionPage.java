package pageObjects.gotit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ChooseActionPage {

    /*
    #############################################################################
    Method Name: ChooseActionPage Constructor
    Method Description: The Constructor Initializes elements of this Page Class.
    Method Parameters: AppiumDriver
    #############################################################################
     */
    public ChooseActionPage(AppiumDriver mobileDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, 3, TimeUnit.SECONDS), this);
    }


    @iOSFindBy(xpath="//*[@text='Gallery']")
    @AndroidFindBy(xpath="//*[@text='Gallery']")
    private MobileElement btn_gallery;


     /*
   #############################################################################
   Methods Names: Getters
   Method Description: This Methods return MobileElements of this Page Class.
   Method Parameters: void
   Method Return Type: MobileElement
   #############################################################################
    */

    public MobileElement getBtn_gallery(){
        return btn_gallery;
    }
}
