@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  #Background: Successfully navigate to the dsportalapp home page
  #Given the user is on the dsportalapp main page
  #When the user clicks on the Get Started button
  #Then the user navigates to the dsportalapp home page
  @Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @HomePage
  Scenario: Open desired page
    Given User is on "home" page
    When The user clicks on "tree" get started button
    Then The user will be directed to "tree" Page

  #overview-of-trees
  @treepage
  Scenario: Validate tryButton Page overview-of-trees
    Given The user is in "tree" page
    When the user clicks on overview-of-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  ##terminologies
  @treepage
  Scenario: Validate tryButton Page terminologies
    Given The user is in "tree" page
    When the user clicks on terminologies link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  ##types-of-trees
  @treepage
  Scenario: Validate tryButton Page types-of-trees
    Given The user is in "tree" page
    When the user clicks on types-of-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  ##Tree Traversals
  @treepage
  Scenario: Validate tryButton Page Tree Traversals
    Given The user is in "tree" page
    When the user clicks on Tree Traversals link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  ##traversals-illustration
  @treepage
  Scenario: Validate tryButton Page traversals-illustration
    Given The user is in "tree" page
    When the user clicks on traversals-illustration link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

 ## binary-trees
  @treepage
  Scenario: Validate tryButton Page binary-trees
    Given The user is in "tree" page
    When the user clicks on binary-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  ##types-of-binary-trees
  @treepage
  Scenario: Validate tryButton Page types-of-binary-trees
    Given The user is in "tree" page
    When the user clicks on types-of-binary-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  ##implementation-in-python
  @treepage
  Scenario: Validate tryButton Page implementation-in-python
    Given The user is in "tree" page
    When the user clicks on implementation-in-python link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  ##binary-tree-traversals
  @treepage
  Scenario: Validate tryButton Page binary-tree-traversals
    Given The user is in "tree" page
    When the user clicks on binary-tree-traversals link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

 # #implementation-of-binary-trees
  @treepage
  Scenario: Validate tryButton Page implementation-of-binary-trees
    Given The user is in "tree" page
    When the user clicks on implementation-of-binary-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  #applications-of-binary-trees
  @treepage
  Scenario: Validate tryButton Page applications-of-binary-trees
    Given The user is in "tree" page
    When the user clicks on applications-of-binary-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |



 #Binary Search Trees
  @treepage
  Scenario: Validate tryButton Page Binary Search Trees
    Given The user is in "tree" page
    When the user clicks on Binary Search Trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |
  #implementation-of-bst
  @treepage
  Scenario: Validate tryButton Page implementation-of-bst
    Given The user is in "tree" page
    When the user clicks on implementation-of-bst link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @treepage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |
      
      
   ## Practice Questions
  @treepage
  Scenario: Validate Practice Questions Page
    Given The user is in "tree/overview-of-trees" page
    When the user clicks on Operation page
    Then The user clicks on Practice Questions link
    And The user will be directed to practice questions of the Page "tree"
    
    
    
    
    
 