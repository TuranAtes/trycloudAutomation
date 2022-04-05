@wip
Feature: As a user, I should be accessing all the main modules of the app.
  Scenario Outline: Verify users accessing all the main modules of the app.
    Given user on the login page "http://qa2.trycloud.net/index.php/login?clear=1"
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |


    Examples:
      | username    | password     |
      | user7            | Userpass123 |
      | user34          | Userpass123 |
      | user99          | Userpass123 |