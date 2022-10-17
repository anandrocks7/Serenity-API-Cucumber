Feature: Add Student Scenario

  @post @sanity
  Scenario: user calls web service to add a new student
    Given User sets base url for API request
    When user sends the API request with new student details
      | firstName    | TestFNameAB |
      | id           | 87          |
      | lastName     | TestLNameA  |
      | nationality  | Singaporean |
      | studentClass | A           |
    Then response should contain the status code
      | status | 200 |
