@US8
Feature: As a user, I should be able to delete a file/folder.
  Scenario: Verify users delete a file/folder
    Given user on the dashboard page
    When the user clicks the "Files" module
    And the user clicks action-icon  from any file on the pagem
    And user choose the "Delete folder" optionm
    When the user clicks the "Deleted files" sub-modulem
    Then Verify the deleted file is displayed on the page.m