package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AvtorizationPage {
    public SelenideElement
    AutorizationBtn= $(byText("ავტორიზაცია")),
    Login_main_loginInput=$(byText("login_main_login")),
    PasswordBtn=$(byText("psw_main_login")),
    Password_main_loginInput=$(byText("psw_main_login"));



}
