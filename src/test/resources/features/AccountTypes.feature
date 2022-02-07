Feature: Accout Types

  Scenario: Driver user
    Given the user logged in as "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"

    Scenario: Sales manager user
      Given the user logged in as "sales manager"
      When the user navigates to "Customers" "Accounts"
      Then the title contains "Accounts - Customers"

      Scenario: Store manager user
        Given the