Feature: SignUp Functionality of LetMeKnowOnline application

  Scenario Outline: verify the functionality of SignUp
    Given User is on LetMeKnowOnline home page
    When user click on SignUp
    And passes the details as "<firstName>" "<lastName>" "<email>" "<companyName>" "<password>" "<confirmPassword>"
    And select I'm not a robot
    And accept terms and conditions
    And click on Register button
    Then user should be able to register successfully

    Examples:
      | firstName | lastName | email               | companyName | password | confirmPassword |
      | Mahesh    | Kumar    | hydmahesh@gmail.com | mkninfo     | Xyz@123  | Xyz@123         |