package Runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    @BeforeTest
    public static void Setup() {
        Selenide.open("https://wishlist.ge/profiles-add/");
        Configuration.browserSize = "1920*1088";
    }

    @BeforeTest
    public static void Setup1() {
        Selenide.open("https://wishlist.ge/login/?return_url=index.php");
        Configuration.browserSize = "1920*1088";
    }
     public static void Setup2(){
        Selenide.open("https://wishlist.ge/cart/");
        Configuration.browserSize="1920*1088";
}
}
