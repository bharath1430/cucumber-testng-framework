Feature: Web Application End-to-End Validation

  @regression
  Scenario: Verify user can login and navigate through application
    Given the user launches the application
    When the user enters valid username
    And the user enters valid password
    And the user clicks on login button
    Then the products page should be displayed
