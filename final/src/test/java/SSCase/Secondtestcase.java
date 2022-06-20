package SSCase;

import Runner.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Secondtestcase extends ChromeRunner {
    @Test
    public void avtorizacia() {
        Selenide.open("https://wishlist.ge/login/?return_url=index.php");
        Configuration.browserSize = "1920*1088";
       $(byText("ავტორიზაცია")).click();
        $(byText("login_main_login")).setValue("mariami.kostava.1@gmail.com");
        $(byText("login_main_login")).shouldBe(Condition.empty);
        $(byText("login_main_login")).shouldBe(Condition.visible);
        $(byText("login_main_login")).click();
        Assert.assertEquals("mariami.kostava.1@gmail.com",$("#login_main_login").getText());
        $(byText("psw_main_login")).click();
        $(byText("psw_main_login")).setValue("27mariami");


    }

}

