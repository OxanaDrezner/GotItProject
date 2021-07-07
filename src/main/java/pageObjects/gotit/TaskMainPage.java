package pageObjects.gotit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TaskMainPage {

    /*
    #############################################################################
    Method Name: TaskMainPage Constructor
    Method Description: The Constructor Initializes elements of this Page Class.
    Method Parameters: AppiumDriver
    #############################################################################
     */
    public TaskMainPage(AppiumDriver mobileDriver){
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver,3, TimeUnit.SECONDS),this);
    }

    @iOSFindBy(xpath = "//*[@class='android.widget.ScrollView']//*[@class='android.widget.TextView']")
    @AndroidFindBy(xpath = "//*[@class='android.widget.ScrollView']//*[@class='android.widget.TextView']")
    private List<MobileElement> list_tasksTexts;

    @iOSFindBy(xpath="//*[@contentDescription='bottom_bar_create_button']")
    @AndroidFindBy(xpath="//*[@contentDescription='bottom_bar_create_button']")
    private MobileElement btn_createTask;


     /*
    ################################################################################
    Methods Names: Getter
    Method Description: This Method return List of WebElement of this Page Class.
    Method Parameters: void
    Method Return Type: List of WebElement
    ################################################################################
     */

    public List<MobileElement> getList_tasksTexts() {
        return list_tasksTexts;
    }


    /*
    #############################################################################
    Methods Names: Getter
    Method Description: This Methods return MobileElements of this Page Class.
    Method Parameters: void
    Method Return Type: MobileElement
    #############################################################################
     */

    public MobileElement getBtn_createTask(){
        return btn_createTask;
    }
}
