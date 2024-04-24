  @Feature2
   Feature: DSIntroPage
   
   @Feature2
    Scenario: Successfully navigate to the dsportalapp home page
    Given the user is on the DS Introduction page
    When the user clicks on the DS Introduction Get Started button
    Then the user should get error message "You are not logged in"
    
    
    @Feature2
    Scenario: Successfully navigate to the dsportalapp home page
     Given the user is on the DS Introduction page
    When the user clicks on the register link
    Then The user should be redirected to "register" 
    
    
    @Feature2
    Scenario: Successfully navigate to the dsportalapp home page
    Given the user is on the DS Introduction page
    When the user clicks on data structure dropdown arrow
    Then The user should able to see six options Arrays Linked List Stack Queue Tree Graph in dropdown menu.
 