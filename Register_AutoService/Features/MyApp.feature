#	Feature: Test for CIS (http://127.0.0.1:8000/login)
#Scenario: Test Login with Valid Credentials
#		Given open chrome and start application
#		When I enter valid username and valid password
#		Then I can login successfully
#	


			
Feature: Test Car Booking with valid credentials  (http://127.0.0.1:8000/login)

  Scenario: Test Car Booking with valid information
    Given open chrome and start application
    When I enter valid email and valid username
    And I can login successfully
    And I navigate to the Services menu
    And I navigate to the Services submenu
    And I fill in the fields with valid information
    Then the booking is successfully done