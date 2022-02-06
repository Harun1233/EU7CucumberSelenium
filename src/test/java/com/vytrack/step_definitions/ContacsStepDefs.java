package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContacsStepDefs {

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String > menuOptions) {

        //get the list of wbeelement and convert them to list of string and assert
        List<String> actaulOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actaulOptions);

    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {

    //use map information to ligon and also verify firstname and lastname

        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));

        String user = new DashboardPage().userName.getText();

        String[] s = user.trim().split(" ");



        Assert.assertEquals(userInfo.get("firstname"),s[0]);
        Assert.assertEquals(userInfo.get("lastname"),s[1]);


    }



}
