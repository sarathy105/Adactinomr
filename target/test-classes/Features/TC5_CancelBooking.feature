@Cancel
Feature: Validating the CancelHotelpage of Adactin Hotel

  Scenario Outline: 
    Validating the CancelHotel page of Adactin hotel by cancelling with order id

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should search hotels by selecting all the fields using "<location>" , "<roomtype>", "<noofRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>" and "<childPerRoom>"
    Then User should verify after search "Select Hotel"
    And User should select any hotel name
    Then User should verify after select hotel name success message "Book A Hotel"
    And User should book hotel using "<firstname>", "<lastname>" and "<billing address>"
      | cardNo           | creditCardType   | expiryMonth | expiryYear | cvv |
      | 1232216554788960 | Master           | August      |       2022 | 321 |
      | 2322165547880968 | Visa             | May         |       2022 | 369 |
      | 8789546521326580 | Other            | June        |       2022 | 358 |
      | 1234567891234567 | American Express | December    |       2022 | 596 |
    Then User should verify after booking success message "Booking Confirmation"
    And User should cancel the order id
    Then User should verify after cancel order id success message "The booking has been cancelled."

    Examples: 
      | userName    | password | location | roomtype | noofRooms | checkInDate | checkOutDate | adultPerRoom | childPerRoom | firstname | lastname | billing address |
      | Sample12345 | OPAD39   | Sydney   | Standard |         1 | 10/09/2022  | 11/09/2022   |            1 |            1 | Vinoth    | Kumar    | Chennai         |

  Scenario Outline: 
    Validating the BookHotel page of Adactin hotel by cancelling with existing order id

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And Use should cancel the existing "<order id>"
    Then User should verify after cancel order id success message "The booking has been cancelled."

    Examples: 
      | userName    | password | order id   |
      | Sample12345 | OPAD39   | GT2WU3S8NS |
