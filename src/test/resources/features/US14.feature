@US14
Feature:  As a user, I should be able to search any item/ users from the homepage.


  Scenario Outline: Verify users can search any files/folder/users from the search box.
    Given user on the dashboard page
    When the user clicks the magnifier icon on the right top
    And users search any existing "<searchValue>" file,folder,user name
    Then verify the app displays the "<expectedValue>" result option
    Examples:
      | searchValue | expectedValue |
      | User71      | User71        |
      | Readme      | Readme        |
      | Talk        | Talk          |


