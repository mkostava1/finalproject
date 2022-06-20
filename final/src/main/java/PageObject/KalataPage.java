package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class KalataPage {
  public  SelenideElement
    SearchInput=$(byText("search_input")),
    SearchIn=$(byText("search_input")),
    KalataInput=$(byText("კალათის ნახვა"));
}

