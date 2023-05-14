Feature: Home page search

  Background:
    When I close consent banner without accepting cookies

  Scenario: Search for a term on Google
    Then Verify list of home menu items are present
      | Plans & Services |
      | Why Sunrun       |
      | Solar Storage    |
      | EV Charging      |
