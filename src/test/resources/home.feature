Feature: Home page search

  Background:
#    Given I am on the Google homepage
    When I close consent banner without accepting cookies

  Scenario: Search for a term on Google
    Then Verify list of home menu items are present
      | Plans & wServices |
      | Why Sunrun       |
      | Solar Storage    |
      | EV Charging      |