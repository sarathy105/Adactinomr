@Select
Feature: Validating the SelectHotelpage of Adactin Hotel

  Scenario Outline: 
    Validating the Select page of Adactin hotel by selecting the Hotel

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should search hotels by selecting all the fields using "<location>" , "<roomtype>", "<noofRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>" and "<childPerRoom>"
    Then User should verify after search "Select Hotel"
    And User should select any hotel name
    Then User should verify after select hotel name success message "Book A Hotel"

    Examples: 
      | userName    | password | location | roomtype | noofRooms | checkInDate | checkOutDate | adultPerRoom | childPerRoom |
      | Sample12345 | OPAD39   | Sydney   | Standard |         1 | 10/09/2022  | 11/09/2022   |            1 |            1 |

  Scenario Outline: 
    Validating the Select page of Adactin hotel by not selecting the Hotel

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should search hotels by selecting all the fields using "<location>" , "<roomtype>", "<noofRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>" and "<childPerRoom>"
    Then User should verify after search "Select Hotel"
    And User should click continue without select any hotel
    Then User should verify without select any hotel error message "Please Select a Hotel"

    Examples: 
      | userName    | password | location | roomtype | noofRooms | checkInDate | checkOutDate | adultPerRoom | childPerRoom |
      | Sample12345 | OPAD39   | Sydney   | Standard |         1 | 10/09/2022  | 11/09/2022   |            1 |            1 |
