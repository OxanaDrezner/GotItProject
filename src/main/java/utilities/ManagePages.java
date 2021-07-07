package utilities;


import pageObjects.gotit.*;

public class ManagePages extends Base {

    /*
    ##############################################################################
    Method Name: initGotit
    Method Description: This Method creates Page Objects of all Pages used for
                        test cases.
    Method Parameters: void
    Method Return Type: void
    ##############################################################################
     */
    public static void initGotit(){
        gotItStart = new StartPage(mobileDriver);
        gotItCreateAccount = new CreateAccountPage(mobileDriver);
        gotItLogin = new LoginPage(mobileDriver);
        gotItTaskMain = new TaskMainPage(mobileDriver);
        gotItCreateTask = new CreateTaskPage(mobileDriver);
        gotItChooseAction = new ChooseActionPage(mobileDriver);
    }


}
