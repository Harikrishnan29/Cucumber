Feature: Test Smoke scenarios of login

  Scenario: Test guru99 login valid credentials	
    Given Open chrome and start guru99 application
    When  I provide valid username and password
    Then  User should be open manager home page

  
  Scenario: After gurur99 login  manager home page
    Given User should be add new customer 
    When  I provide valid information for add customer
    Then  User Should be click submit button
     




    