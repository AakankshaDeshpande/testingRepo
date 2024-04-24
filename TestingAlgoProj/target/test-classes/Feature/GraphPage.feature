@tag
Feature: Reusable Feature
  I want to use this template for my all feature file
  
  

  @Login
  Scenario: Login with valid data
  Background:
    Given The user navigates to login page
    
    When the user gives username and password
    Then The user logsin

  @HomePage
  Scenario: Open desired page
  Background:
    Given User is on "home" page
    When The user clicks on "graph" get started button
    Then The user will be directed to "graph" Page
        
    
  @GraphPage
  Scenario: Validate tryButton Page Implementation
    Given The user is in "graph" page
    When the user clicks on graph page
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @GraphPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |
      
       @GraphPage
  Scenario: Validate tryButton Page Implementation
    Given The user is in "graph" page
    When the user clicks on graphRepresentation page
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @GraphPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |
      
       ## Practice Questions
  @graphpage
  Scenario: Validate Practice Questions Page
    Given The user is in "graph" page
    When the user clicks on graph page
    Then The user clicks on Practice Questions link
    And The user will be directed to practice questions of the Page "graph"
    
    
    
    
   
  