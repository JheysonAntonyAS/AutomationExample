package com.co.demo.steps;

import com.co.demo.pageobjects.SerenityHomePage;
import com.co.demo.pageobjects.SerenityResultPage;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.getDriver;

public class SerenityPageFormySteps {

    SerenityHomePage homePage = new SerenityHomePage();
    SerenityResultPage result = new SerenityResultPage();

    @Step
    public void openPage(String url){
        getDriver().get(url);
    }

    @Step
    public void searchWord(String word){
        homePage.getDriver().findElement(SerenityHomePage.getTxtSearch()).sendKeys(word);
        homePage.getDriver().findElement(SerenityHomePage.getTxtButton()).click();
    }

    @Step
    public void viewWord(String text){
        assert result.getDriver().findElement(SerenityResultPage.getTxtLabelPalabra()).getText().contains(text);
    }


}
