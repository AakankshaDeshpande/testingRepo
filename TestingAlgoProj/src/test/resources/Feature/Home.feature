@Feature1
Feature: Browser Feature
  I want to use this template for my all feature file


  @Feature1
  Scenario: Get Start page
    Given The user should be able to open the browser
    When the user enters ds algo portal "https://dsportalapp.herokuapp.com"
    Then the user should landed on the DS_Algo Get Started page with message "You are at the right place" 