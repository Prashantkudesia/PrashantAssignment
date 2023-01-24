package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)



@CucumberOptions(features = "C:\\Eclipse WorkSpace\\Automation_Amazon\\Features",
        glue = {"com.stepdefiniton"},
        monochrome = true,
        plugin = {"pretty",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/HTMLReports/report.html",
                "json:target/cucumber-reports/cucumber.json"},
        tags="@F1_Login or @F2_Search or @F3_Add_to_Cart or @F4_Purchasing or @F5_Buying or @F6_Logout",
        dryRun=false)

public class Amazon_runner {

}
