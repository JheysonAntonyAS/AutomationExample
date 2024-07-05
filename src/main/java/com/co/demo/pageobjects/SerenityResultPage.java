package com.co.demo.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SerenityResultPage extends PageObject {

    private static By LABEL_PALABRA = By.id("firstHeading");

    public static By getTxtLabelPalabra(){
        return LABEL_PALABRA;
    }
}
