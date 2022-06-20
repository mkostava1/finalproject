package StepObject;

import PageObject.KalataPage;

public class KalataSteps extends KalataPage {
    public KalataSteps Search(String search_input) {
        SearchInput.setValue(search_input);
        return this;
    }

    public KalataSteps Searchh(String searchh) {
        SearchIn.setValue(searchh);
        return this;
    }
    public KalataSteps Kalatai(String kalatai) {
        KalataInput.setValue(kalatai);
        return this;
    }
}
