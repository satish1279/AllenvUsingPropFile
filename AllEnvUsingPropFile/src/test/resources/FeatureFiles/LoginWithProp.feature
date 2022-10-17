Feature: To test all the pages

  Background: 
    Given User is on Login page
    When User is logged in after entering the correct credentials
    And Clicks on Recognize
    Then User is on to first page

  Scenario: To test all the pages on Staging environment
    Given user opened all the pages and now on its last step wrt Staging
    When Clicks on LogOut wrt Staging
    Then User is navigated to login page wrt Staging

  Scenario: To test all the pages on Beyond USdemo environment
    Given user opened all the pages and now on its last step wrt USdemo
    When Clicks on LogOut wrt USdemo
    Then User is navigated to login page wrt USdemo

  Scenario: To test all the pages on Ind-Production environment
    Given user opened all the pages and now on its last step wrt Ind-Production
    When Clicks on LogOut wrt Ind-Production
    Then User is navigated to login page wrt Ind-Production

  Scenario: To test all the pages on US-Production environment
    Given user opened all the pages and now on its last step wrt US-Production
    When Clicks on LogOut wrt US-Production
    Then User is navigated to login page wrt US-Production
