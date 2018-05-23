package com.sample.project.scenario;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.sample.project.page.GoogleResultPage;
import com.sample.project.page.GoogleSearchPage;

public class SearchingTest {

    @BeforeClass
    public static void beforeClass() {
        Configuration.browser = WebDriverRunner.CHROME;
    }

    @Test
    public void testSearching() {
        GoogleSearchPage searchPage = open("https://www.google.com/", GoogleSearchPage.class);
        GoogleResultPage resultPage = searchPage.search("selenide");

        resultPage.results.get(0).shouldHave(text("Selenide: Concise UI Tests in Java"));
    }

}
