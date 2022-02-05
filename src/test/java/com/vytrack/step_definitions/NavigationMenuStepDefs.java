package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("Navigate to Fleet Vehicle ");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("the title should be Vehicles");
    }

    @When("the user navigates to Merketing, Campaigns")
    public void the_user_navigates_to_Merketing_Campaigns() {
        System.out.println("the user navigates to Merketing, Campaigns");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("the title should be Campaigns");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities, Calendar Events");
    }

    @Then("the title should be Calendar")
    public void the_title_should_be_Calendar() {
        System.out.println("the title should be Calendar");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);

    }
    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {

        ContactsPage contactsPage=new ContactsPage();

        BrowserUtils.waitFor(10);
        Integer actualNUmber=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber,actualNUmber);
    }





}
