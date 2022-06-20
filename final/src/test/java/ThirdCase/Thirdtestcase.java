package ThirdCase;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Thirdtestcase {
    public void kalata() {
        Selenide.open("https://wishlist.ge/cart/");
        Configuration.browserSize="1920*1088";
        $(byText("თქვენი კალათა ცარიელია")).shouldBe(Condition.visible);
        Assert.assertTrue($(byText("თქვენი კალათა ცარიელია")).is(Condition.visible));
        $(byText("search_input")).click();
        $(byText("search_input")).setValue("სკამი");
        $("button_cart_66871", 0).click();
        $(byText("კალათის ნახვა")).click();
        $(byText("class=\"ty-btn ty-btn__tertiary text-button \"")).click();






    }
}


