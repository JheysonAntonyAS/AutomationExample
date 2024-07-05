package com.co.demo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/consultarPageFormy.feature",
        glue = "com.co.demo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class serenityPageFormyRunner {
}
