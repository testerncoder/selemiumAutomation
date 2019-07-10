# Defining application feature below which I want to test
  Feature:My Wish List products
        As a user,
        I want to search a product and add it into my Wish List.

# Providing background steps which I want to perform before every scenario.
  Background:
      Given launch a browser and navigate website home page

# Defining Positive Scenario to add a product in the Wish List successfully
  @web @chrome
  Scenario Outline: Add product into your Wish List from search result page
      When I type product name <productname> on the search box
      And I click on search icon or hit enter
      When I click on any product on the page
      Then I should be redirected to the next page, title should be "British Paints Clean & Protect Semi Gloss White Interior Paint - 4L"
      And URL of the page should have "_p" on it
      When I click on Add to Wish List button on the page
      And I click on Wish List link on the header
      Then URL of the page should have "wish-lists" on it
      And Product should be added in my Wish List
    Examples:
      |productname|
      |Paint  |
      |Brush  |