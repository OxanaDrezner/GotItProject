package workflows;

import extensions.MobileActions;
import io.qameta.allure.Step;
import utilities.CommonOps;
import utilities.ManagePages;


public class MobileFlows extends CommonOps {

    @Step("Business Flow: Fill Form Create Account")
    public static void createAccount(String email, String name, String password){
        MobileActions.tap(1,gotItStart.getBtn_start(),500);
        MobileActions.updateText(gotItCreateAccount.getTxt_email(), email);
        MobileActions.updateText(gotItCreateAccount.getTxt_name(), name);
        MobileActions.updateText(gotItCreateAccount.getTxt_password(), password);
        MobileActions.updateText(gotItCreateAccount.getTxt_confirmPassword(), password);
        MobileActions.tap(1,gotItCreateAccount.getBtn_create(),500);
    }

    @Step("Business Flow: Create New Task")
    public static void createTask(String type, String Title, String SubTask, String Day, String Hour, String Minutes) {
        MobileActions.tap(1, gotItTaskMain.getBtn_createTask(), 500);
        for (int i = 0; i < gotItCreateTask.getList_taskType().size(); i++) {
            MobileActions.tap(1, gotItCreateTask.getList_taskType().get(i), 500);
            if (gotItCreateTask.getList_images().get(1).getText().substring(18).equals(type))
                break;
            else if (i == gotItCreateTask.getList_taskType().size() - 1) {
                MobileActions.swipe(1100, 600, 100, 600, 200);
                ManagePages.initGotit();
                i = 0;
            }
        }
        MobileActions.updateText(gotItCreateTask.getTxt_taskTitle(), Title);
        MobileActions.updateText(gotItCreateTask.getTxt_taskSubTask(), SubTask);
        MobileActions.tap(1,1290,1500,500);

        //* Couldn't find a workable solution for uploading a picture. The marked lines work partially*//
//        MobileActions.tap(1,1318,1965,500);
//        MobileActions.tap(1, gotItChooseAction.getBtn_gallery(), 200);
//        MobileActions.tap(1,200,2900,500);
//        MobileActions.tap(1,100,320,500);

        for (int i = 365; i >= 0; i--) {
            if (!gotItCreateTask.getList_datePickerParams().get(0).getText().equalsIgnoreCase(Day))
                MobileActions.swipe(600, 2728, 600, 2500, 200);
            else
                break;
        }
        for (int i = 23; i >= 0; i--) {
            if (!gotItCreateTask.getList_datePickerParams().get(1).getText().equalsIgnoreCase(Hour))
                MobileActions.swipe(800, 2728, 800, 2500, 200);
            else
                break;
        }
        for (int i = 59; i >= 0; i--) {
            if (!gotItCreateTask.getList_datePickerParams().get(2).getText().equalsIgnoreCase(Minutes))
                MobileActions.swipe(1000, 2728, 1000, 2500, 200);
            else
                break;
        }
        MobileActions.swipe(0, 1300, 0, 500, 200);
        MobileActions.tap(1, gotItCreateTask.getBtn_createTask(), 500);
    }

}
