package FFCase;

import Runner.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class FirstTestCase  extends ChromeRunner {
    @Test
    public void login(){
        Selenide.open("https://wishlist.ge/profiles-add/");
        Configuration.browserSize = "1920*1088";
        $(byText("რეგისტრაცია")).click();
        sleep(1000);
        $(byText("რეგისტრაცია")).shouldBe(Condition.visible);
        Assert.assertTrue($(byText("რეგისტრაცია")).is(Condition.visible));

        $("given-name").setValue("mariami");
        $("given-name").click();
        $("given-name").shouldBe(Condition.empty);
        $(byText("given-name")).shouldBe(Condition.visible);
        Assert.assertTrue($(byText("given-name")).is(Condition.visible));

        $(byText("surname")).setValue("kostava");
        $(byText("surname")).shouldBe(Condition.visible);
        $(byText("password1")).click();
        $(byText("password1")).setValue("27mariami");
        $(byText("რეგისტრაცია")).shouldBe(Condition.enabled);
        Assert.assertEquals("kostava",$("#surname").getText());



    }
}


