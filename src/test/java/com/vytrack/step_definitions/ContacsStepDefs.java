package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ContacsStepDefs {

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String > menuOptions) {

        //get the list of wbeelement and convert them to list of string and assert
        List<String> actaulOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actaulOptions);

    }


}
