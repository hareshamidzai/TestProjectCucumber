@temp
Feature: Search GD Careers

  Background:
    Given The user is on the GD Jobs Search Page
    And The user click on careers link


  Scenario: Search job locations and job categories
    Given The user is on the GD Jobs Search Page
    When The user fill the form
    Then The Correct results should be displayed
