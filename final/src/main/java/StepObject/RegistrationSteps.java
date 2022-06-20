package StepObject;

import PageObject.RegistrationPage;

public class RegistrationSteps extends RegistrationPage {
    public  RegistrationSteps GotoRegPage(){
        RegistrationBtn.click();
        return this;
    }
    public  RegistrationSteps UserName(String username){
        GivenNameInput.setValue(username);
        return this;
    }
    public  RegistrationSteps SurName(String surname ) {
        SurnameInput.setValue(surname);
        return this;
    }
    public  RegistrationSteps Password(String password ) {
        Password1Input.setValue(password);
        return this;
    }
    public  RegistrationSteps submint(String submint ) {
        SubmintBtn.setValue(submint);
        return this;
    }
}
