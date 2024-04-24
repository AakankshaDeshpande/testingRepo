@tag
Feature: Registration with valid and invalid credentials

  @tag1
  Scenario Outline: Registering user with given fields
    Given The user opens Register Page
    When The user fill in the registration form with given data <username>, <password>, and <confirmPassword>
    Then User should see an error/success message <message>, <status>

    Examples: 
      | username     | password    | confirmPassword              | message                                                 | status  |
      | sdet1234567  | sdet1       | sdet12                       | password_mismatch:The two password fields didn’t match. | Invalid |
      | sdet12       |             | numpay                       | Please fill out this field.                             | Invalid |
      |              | numpy@12345 | numpy@12345                  | Please fill out this field.                             | Invalid |
      | sdet1        |       12345 |                              | Please fill out this field.                             | Invalid |
      | sdet1        |       12345 |                        12345 | password_mismatch:The two password fields didn’t match. | Invalid |
      | 111746789944 | numpy@123   | numpy@123                    | password_mismatch:The two password fields didn’t match. | Invalid |
      | @#$%^        | numpy@123   | numpy@123                    | password_mismatch:The two password fields didn’t match. | Invalid |
      | sde8978      | numpy@123   | numpy@123               Tada | Valid                                                   |         |
