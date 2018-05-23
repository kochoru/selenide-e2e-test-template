package com.sample.project.page;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

public class GoogleSearchPage {

    @FindBy(how = How.ID, using = "lst-ib")
    private SelenideElement searchBox;

    public GoogleResultPage search(String query) {
        searchBox.setValue(query).pressEnter();
        return page(GoogleResultPage.class);
    }
}
