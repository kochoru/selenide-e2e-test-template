package com.sample.project.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.ElementsCollection;

public class GoogleResultPage {

    @FindBy(how = How.CSS, using = "#ires li.g")
    public ElementsCollection results;
}
