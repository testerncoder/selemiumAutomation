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
      And I click on any product on the page
      And Page URL should have product id at the end
      When I click on Add to Wish List button on the page
      Then I should see the button text is turned as Added
      When I click on Wish List link on the header
      Then I should see the same product added in my Wish List
    Examples:
      |productname|
      |Paint  |
      #|Brush  |