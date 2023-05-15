Feature: Home page search

  Background:

  Scenario: Verify top menu links on home page
    When I close consent banner without accepting cookies
    Then Verify list of home menu items are present
      | Plans & Services |
      | Why Sunrun       |
      | Solar Storage    |
      | EV Charging      |
