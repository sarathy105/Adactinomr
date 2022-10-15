@Booking
Feature: Validating the BookHotelpage of Adactin Hotel

  Scenario Outline: 
    Validating the BookHotel page of Adactin hotel by selecting all the fields

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

    Examples: 
      | userName    | password | location | roomtype | noofRooms | checkInDate | checkOutDate | adultPerRoom | childPerRoom | firstname | lastname | billing address |
      | Sample12345 | OPAD39   | Sydney   | Standard |         1 | 10/09/2022  | 11/09/2022   |            1 |            1 | Vinoth    | Kumar    | Chennai         |

  Scenario Outline: 
      Validating the BookHotel page of Adactin hotel without selecting any fields

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should search hotels by selecting all the fields using "<location>" , "<roomtype>", "<noofRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>" and "<childPerRoom>"
    Then User should verify after search "Select Hotel"
    And User should select any hotel name
    Then User should verify after select hotel name success message "Book A Hotel"
    And User should click book now button without entering any fields
    Then User should verify after click book now error message "Please Enter your First Name" ,"Please Enter you Last Name", "Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName    | password | location | roomtype | noofRooms | checkInDate | checkOutDate | adultPerRoom | childPerRoom |
      | Sample12345 | OPAD39   | Sydney   | Standard |         1 | 10/09/2022  | 11/09/2022   |            1 |            1 |
