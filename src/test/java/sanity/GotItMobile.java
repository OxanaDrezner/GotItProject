package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.MobileFlows;


@Listeners(utilities.Listeners.class)
public class GotItMobile extends CommonOps {

    @Test(description = "Test01 - Verify New Task")
    @Description("This test creates new account, creates new task and Verifies task is added to list")
    public void Test01_verifyNewTask() {
        MobileFlows.createAccount(getData("Email"), getData("Name"), getData("Password"));
        MobileFlows.createTask(getData("TaskType"),getData("TaskTitle"),getData("TaskSubTask"),
                                getData("TaskDay"),getData("TaskHour"), getData("TaskMinutes"));
        Verifications.assertTextInElement(gotItTaskMain.getList_tasksTexts().get(2), getData("TaskTitle"));
    }
}
