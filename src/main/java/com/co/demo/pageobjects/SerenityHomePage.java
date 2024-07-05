package com.co.demo.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SerenityHomePage extends PageObject {

    private static By TXT_SEARCH = By.id("searchInput");
    private static By TXT_BUTTON = By.xpath("//*[@id=\"search-form\"]/fieldset/button");

    public static By getTxtSearch() {
        return TXT_SEARCH;
    }
    public static By getTxtButton() {
        return TXT_BUTTON;
    }
}

