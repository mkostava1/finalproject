package FFCase;

import Runner.ChromeRunner;
import StepObject.RegistrationSteps;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;

public class RegistrationTest extends ChromeRunner {
    @Test
    public void Registration(){
        RegistrationSteps Steps=new RegistrationSteps();
        Steps
                .GotoRegPage()
                .UserName(GivenName)
                .SurName(Surname)
                .Password(Password1);
        Assert.assertTrue(Steps.SubmintBtn.is(Condition.visible));



    }
}
