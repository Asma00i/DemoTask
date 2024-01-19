Feature: API Testing

  @GetAirlineDetails
  Scenario: Send get request to query about airline data
    Given we have URL to query about airline data
    When  send get request to server
    Then response should be returned with full data about airline details in jason format

  @GetHotelsDetails
  Scenario: Send get request to query about available hotels while check in date in the past
    Given we have URL to query about available hotels
    When  send get request to server
    Then response should be returned with error message




