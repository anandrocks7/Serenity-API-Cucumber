Feature: Get Student

  @get @sanity
  Scenario: user calls web service to get student details
    Given User sets base url for API request
    When user sends the API request to fetch students
    Then response should contain status code