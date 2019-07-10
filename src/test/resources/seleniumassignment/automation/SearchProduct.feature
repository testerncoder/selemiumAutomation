# Defining application feature below which I want to test
Feature:Search products
        As a user,
        I want to search a product from home page

# Providing background steps which I want to perform before every scenario.
  Background:
      Given launch a browser and navigate website home page

# Defining Positive Scenario to search a product on the website successfully
  @web @chrome
  Scenario Outline: Product search on the home page
      When I type product name <productname> on the search box
      And I click on search icon or hit enter
    Examples:
      |productname|
      |Paint  |
      |Brush  |
