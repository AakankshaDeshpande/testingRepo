@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  #@Main
  #Scenario: Successfully navigate to the dsportalapp home page
    #Given the user is on the dsportalapp main page
    #When the user clicks on the Get Started button
    #Then the user navigates to the dsportalapp home page
#
  #@Login
  #Scenario: Login with valid data
    #Given The user navigates to login page
    #When the user gives username and password
    #Then The user logsin
#
  #@HomePage
  #Scenario: Open desired page
    #Given User is on "<page>" page
    #When The user clicks on "<page>" get started button
    #Then The user will be directed to "<page>" Page 
#
  #@practiceQuestions
  #Scenario: Validate Practice Questions Page
    #Given The user is on the "<page>" page
    #When The user clicks on "<page>" to the Practice Questions link
    #Then The user will be directed to practice questions of "<page>" Page
#
  #@tryRunBtn
  #Scenario Outline: Validate tryButton Page
    #Given The user is in "<page>" page
    #When The user clicks Try Here button on the "<page>" page
    #And The user will be redirected to tryEditor page with a Run button to test
    #And The user enters <text> in tryEditor and user clicks Run button
    #Then The user will be presented with the Run output <text> <status>
#
  #
  #
  #
  #
  #
  #
  #@RunBtnInvalid
  #Scenario Outline: Validate try editor run Page with invalid data
    #Given the user is directed to "<page>" page
    #When The user enters  <text> in tryEditor and user clicks Run button
    #Then The user will be presented with the Run output <text> <status>
#
    #Examples: 
      #| text              | status  |
      #| println 'Welcome' | Invalid |

      #
      #@trybutton
  #Scenario: Validate tryButton Page
    #Given The user is in <page> page
    #When The user clicks Try Here button on the <page> page
    #Then The user will be redirected to tryEditor page with a Run button to test
   #
      #
      #
      #@RunbuttonInvalid
      #Scenario: Validate RunButton Page with Invalid Data
    #Given The user is in TryEditor page
    #When The user enters invalid text in tryEditor and user clicks Run button
    #Then The user will be presented with the Run output text "Invalid"
    #
    #@RunbuttonValid
  #Scenario: Validate RunButton Page with Valid Data
    #Given The user is in TryEditor page
    #When The user enters valid text in tryEditor and user clicks Run button
    #Then The user will be presented with the Run output text "valid"