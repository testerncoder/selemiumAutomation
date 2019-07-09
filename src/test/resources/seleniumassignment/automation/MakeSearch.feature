Feature: Basic Searching
  As a user,
  I want to search using product name Paint.

  @web @chrome
  Scenario: Product search on the home page
    Given launch a browser and navigate website home page
    When the search phrase "Paint" is entered
    Then URL of the page should have "paint" on it
    When i click on any product on the page
    Then URL of the product details page should have "_p" on it
    #When i click on Add to Wish List button on the page
    And i click on Wish List link on the header
    Then URL of the page should have "wish-lists" on it
    And product should be added in my Wish List


