@navigate
Feature: Users should be able to see correct titles


  Scenario: Navigation Fleet --> Vehicle
    Given the user should be able to login
    And the user enters the sales manager information
    When the user navigates to Fleet, Vehicles
    Then the title should be Vehicles

  Scenario: Navigating Marketing - Campaigns
    Given the user should be able to login
    And the user enters the sales manager information
    When the user navigates to Merketing, Campaigns
    Then the title should be Campaigns

    @db
  Scenario: Navigating Activities-- Calendar Events
    Given the user should be able to login
    And the user enters the sales manager information
    When the user navigates to Activities, Calendar Events
    Then the title should be Calendar
