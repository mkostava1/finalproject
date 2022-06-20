package FFCase;

import StepObject.RegistrationSteps;
import Utils.ChromeRunner;
import Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utils.TestLister.class)

public class User1 extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("user")
    public void RegistrationTesti(){
        RegistrationSteps steps=new RegistrationSteps();
        steps.GotoRegPage();



    }





}
