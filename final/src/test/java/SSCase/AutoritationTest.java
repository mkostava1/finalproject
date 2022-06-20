package SSCase;

import Runner.ChromeRunner;
import StepObject.AutorizationSteps;
import org.testng.annotations.Test;

import static DataObject.AvtorizationData.*;

public class AutoritationTest extends ChromeRunner {
    @Test
    public void Autorization(){
        AutorizationSteps Steps =new AutorizationSteps();
        Steps
                .GoToAutPage()
                .Loginmain(login_main_login)
                .Password(psw_main_login);

    }
}

