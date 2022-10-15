@Search
Feature: Validating the SearchHotelpage of Adactin Hotel

  Scenario Outline: 
    Validating the Search page of Adactin hotel by selecting all the fields

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should search hotels by selecting all the fields using "<location>" , "<roomtype>", "<noofRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>" and "<childPerRoom>"
    Then User should verify after search "Select Hotel"

    Examples: 
      | userName    | password | location | roomtype | noofRooms | checkInDate | checkOutDate | adultPerRoom | childPerRoom |
      | Sample12345 | OPAD39   | Sydney   | Standard |         1 | 10/09/2022  | 11/09/2022   |            1 |            1 |

  Scenario Outline: 
    Validating the Search page of Adactin hotel by selecting only the mandatory fields

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should search hotels by selecting only the mandatory fields using "<location>" , "<noofRooms>","<checkInDate>","<checkOutDate>" and "<adultPerRoom>"
    Then User should verify after search "Select Hotel"

    Examples: 
      | userName    | password | location | noofRooms | checkInDate | checkOutDate | adultPerRoom |
      | Sample12345 | OPAD39   | Sydney   |         1 | 10/09/2022  | 11/09/2022   |            1 |

  Scenario Outline: 
    Validating the Search page of Adactin hotel by invalid date

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should search hotels by selecting all the fields using "<location>" , "<roomtype>", "<noofRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>" and "<childPerRoom>"
    Then User should verify a date error message after search  "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName    | password | location | roomtype | noofRooms | checkInDate | checkOutDate | adultPerRoom | childPerRoom |
      | Sample12345 | OPAD39   | Sydney   | Standard |         1 | 21/09/2022  | 19/09/2022   |            1 |            1 |

  Scenario Outline: 
    Validating the Search page of Adactin hotel without selecting any of the fields

    Given User should be in the login page of Adactin hotel webpage
    When User should login using "<userName>", "<password>"
    Then User should verify after login "Hello Sample12345!"
    And User should  search the hotel without selecting any fields
    Then User should verify a location error messgage  after search  "Please Select a Location"

    Examples: 
      | userName    | password |
      | Sample12345 | OPAD39   |
