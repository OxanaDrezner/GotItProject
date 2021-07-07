package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base{

    /*
    ############################################################################
    Method Name: getData
    Method Description: This Method Extracts data from xml configuration file
    Method Parameters: String
    Method Return Type: String
    ############################################################################
     */
    public static String getData (String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

    /*
    ################################################################################################
    Method Name: startSession
    Method Description: This Method Initializes the Driver with desired Mobile Platform Driver.
                        Configures Objects and Parameters needed and launches the defined Mobile
                        Application.
    Method Parameters: void
    Method Return Type: void
    ################################################################################################
     */
    @BeforeClass
    public void startSession(){
        dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        if (getData("PlatformName").equalsIgnoreCase("Android")) {
            dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("AppPackage"));
            dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("AppActivity"));
            try {
                mobileDriver = new AndroidDriver(new URL(getData("AppiumServer")), dc);
            } catch (Exception e) {
                System.out.println("Can not connect to Appium Server, see details: " + e);
            }
        }
        else if(getData("PlatformName").equalsIgnoreCase("IOS")){
            dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, getData("BundleID"));
            dc.setCapability("instrumentApp",true);
            try {
                mobileDriver = new IOSDriver(new URL(getData("AppiumServer")), dc);
            } catch (Exception e) {
                System.out.println("Can not connect to Appium Server, see details: " + e);
            }
        }
        else throw new RuntimeException("Invalid Mobile Platform, should be Android or IOS");

        ManagePages.initGotit();
        mobileDriver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(mobileDriver,Long.parseLong(getData("TimeOut")));

    }

    /*
    ##################################################################
    Method Name: closeSession
    Method Description: This Method closes Connection to AUT.
    Method Parameters: void
    Method Return Type: void
    ##################################################################
     */
    @AfterClass
    public void closeSession(){
        mobileDriver.quit();
    }

}
