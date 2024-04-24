
Feature: Stack Data Structure
  
   

  @LoginStackPage
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @StackPage
  Scenario: Open desired page
    Given User is on "home" page
    When The user clicks on "stack" get started button
    Then The user will be directed to "stack" Page
    
    @StackPage
  Scenario: Validate tryButton Page Operation
    Given The user is in "stack" page
    When the user clicks on Operation page
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |
      
      @StackPage
  Scenario: Validate tryButton Page Implementation
    Given The user is in "stack" page
    When the user clicks on Implementation page
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |
    
@StackPage
  Scenario: Validate tryButton Page Application
    Given The user is in "stack" page
    When the user clicks on Application page
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |
      
      
 
    
    @StackPage
  Scenario: Validate Practice Questions Page
  	Given The user is in "stack" page
    When the user clicks on Operation page
    Then The user clicks on Practice Questions link 
    And The user will be directed to practice questions of the Page "stack"