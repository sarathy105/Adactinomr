@Login
Feature: Validating the Loginpage of Adactin Hotel

  Scenario Outline: 
    Validating the login page of Adactin hotel using valid credientials

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"

    Examples: 
      | userName    | password |
      | Sample12345 | OPAD39   |

  Scenario Outline: 
    Validating the login page of Adactin hotel using Enter Key

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>" , "<password>" with Enter key
    Then User should verify after login "Hello Sample12345!"

    Examples: 
      | userName    | password |
      | Sample12345 | OPAD39   |

  Scenario Outline: 
    Validating the login page of Adactin hotel using invalid credientials

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login with invalid credentials error msg contains "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName    | password     |
      | Sample12345 | OPAD39213245 |
