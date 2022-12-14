Feature: To test all the pages

  Background: 
    Given User is on Login page
    When User is logged in after entering the correct credentials
    And Clicks on Recognize link
    #When Clicks on Skill Insight link
    And Clicks on Wellness link
    When Clicks on Survey link
    And Clicks on My Summary link
    When Clicks on Redeem link
    And Clicks on Dashboard link
    When Clicks on Reports tab
    And Clicks on Budget Head Report option from Select Report dropdown
    When Clicks on Recognitions Report option from Select Report dropdown
    And Clicks on Redemption Report option from Select Report dropdown
    When Clicks on User Login Report option from Select Report dropdown
    And Clicks on Data Visualization tab
    #When Clicks on Admin Console link

  Scenario: To test all the pages on Staging environment
    Given user opened all the pages and now on its last step wrt Staging
    When Clicks on LogOut wrt Staging
    Then User is navigated to login page wrt Staging

  Scenario: To test all the pages on Ind-Production environment
    Given user opened all the pages and now on its last step wrt Ind-Production
    When Clicks on LogOut wrt Ind-Production
    Then User is navigated to login page wrt Ind-Production

  #Scenario: To test all the pages on US-Production environment
    Given user opened all the pages and now on its last step wrt US-Production
    When Clicks on LogOut wrt US-Production
    Then User is navigated to login page wrt US-Production

  #Scenario: To test all the pages on Beyond USdemo environment
    Given user opened all the pages and now on its last step wrt USdemo
    When Clicks on LogOut wrt USdemo
    Then User is navigated to login page wrt USdemo
