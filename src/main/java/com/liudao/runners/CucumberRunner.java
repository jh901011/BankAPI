package com.liudao.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = {"classpath:"},
        glue = {"com.liudao.step"},
        plugin= {"pretty","html:target/cucumber-report/html","json:target/cucumber-report/api-test-report.json","io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"},
        monochrome = true
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
