package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
    RegistrationBtn= $(byText("რეგისტრაცია")),
    GivenNameInput=$("given-name"),
    SurnameInput= $(byText("surname")),
    Password1Input=$(byText("password1")),
    SubmintBtn= $(byText("რეგისტრაცია"));





    }

