package com.sample.project.page;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

/**
 * Google検索ページ
 *
 * @author kochoru
 *
 */
public class GoogleSearchPage {

    /** 検索窓。 **/
    @FindBy(how = How.ID, using = "lst-ib")
    private SelenideElement searchBox;

    /**
     * 検索する。
     *
     * @param query 検索文字列
     * @return 検索結果画面
     */
    public GoogleResultPage search(String query) {
        searchBox.setValue(query).pressEnter();
        return page(GoogleResultPage.class);
    }
}
