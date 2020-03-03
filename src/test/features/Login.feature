

Feature: Login

@run
Scenario:

  Given user is on google search page
  When user enters text "" into search
  Then user should navigate to page
