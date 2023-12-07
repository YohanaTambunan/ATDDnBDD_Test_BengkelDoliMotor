Feature: Test Car Booking with valid credentials

  Scenario: Test Car Booking with valid information
    Given open chrome and start application
    When I enter valid email and valid username
    And I can login successfully
    And I navigate to the Services menu
    And I navigate to the Services submenu
    And I navigate to the Booking page from Car Rental
    And I fill in the fields with valid information
    Then the booking is successfully done
