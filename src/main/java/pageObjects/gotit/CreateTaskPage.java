package pageObjects.gotit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateTaskPage {

    /*
    #############################################################################
    Method Name: CreateTaskPage Constructor
    Method Description: The Constructor Initializes elements of this Page Class.
    Method Parameters: AppiumDriver
    #############################################################################
     */
    public CreateTaskPage(AppiumDriver mobileDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, 3, TimeUnit.SECONDS), this);
    }

    @iOSFindBy(xpath = "//*[@class='android.widget.HorizontalScrollView']//*[@class='android.widget.ImageView']")
    @AndroidFindBy(xpath = "//*[@class='android.widget.HorizontalScrollView']//*[@class='android.widget.ImageView']")
    private List<MobileElement> list_taskType;

    @iOSFindBy(xpath="//*[@class='android.widget.ScrollView']//*[@class='android.widget.TextView']")
    @AndroidFindBy(xpath="//*[@class='android.widget.ScrollView']//*[@class='android.widget.TextView']")
    private List<MobileElement> list_images;

    @iOSFindBy(id="numberpicker_input")
    @AndroidFindBy(id="numberpicker_input")
    private List<MobileElement> list_datePickerParams;

    @iOSFindBy(xpath="//*[@text='Title']")
    @AndroidFindBy(xpath="//*[@text='Title']")
    private MobileElement txt_taskTitle;

    @iOSFindBy(xpath="//*[@text='Sub task']")
    @AndroidFindBy(xpath="//*[@text='Sub task']")
    private MobileElement txt_taskSubTask;

    @iOSFindBy(xpath="//*[@text='Create']")
    @AndroidFindBy(xpath="//*[@text='Create']")
    private MobileElement btn_createTask;


     /*
    ################################################################################
    Methods Names: Getters
    Method Description: This Method return List of WebElement of this Page Class.
    Method Parameters: void
    Method Return Type: List of WebElement
    ################################################################################
     */

    public List<MobileElement> getList_taskType() {
        return list_taskType;
    }

    public List<MobileElement> getList_images(){
        return list_images;
    }

    public List<MobileElement> getList_datePickerParams(){
        return list_datePickerParams;
    }



    /*
   #############################################################################
   Methods Names: Getters
   Method Description: This Methods return MobileElements of this Page Class.
   Method Parameters: void
   Method Return Type: MobileElement
   #############################################################################
    */

    public MobileElement getTxt_taskTitle(){
        return txt_taskTitle;
    }

    public MobileElement getTxt_taskSubTask(){
        return txt_taskSubTask;
    }

    public MobileElement getBtn_createTask(){
        return btn_createTask;
    }
}
