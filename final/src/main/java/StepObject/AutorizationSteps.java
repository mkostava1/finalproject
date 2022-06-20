package StepObject;

import PageObject.AvtorizationPage;

public class AutorizationSteps extends AvtorizationPage {
    public AutorizationSteps GoToAutPage() {
        AutorizationBtn.click();
        return this;
    }
    public AutorizationSteps Loginmain(String loginmain) {
        Login_main_loginInput.setValue(loginmain);
        return this;
    }
    public AutorizationSteps Password(String password) {
        Password_main_loginInput.setValue(password);
        return this;
    }
}