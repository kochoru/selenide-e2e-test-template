package com.sample.project.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.ElementsCollection;

/**
 * Google検索結果画面。
 *
 * @author kochoru
 *
 */
public class GoogleResultPage {

    /** 一つ一つの検索結果。 **/
    @FindBy(how = How.CSS, using = "#ires div.g")
    public ElementsCollection results;
}
