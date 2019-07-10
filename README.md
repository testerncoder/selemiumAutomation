# Selenium with Cucumber BDD

## Dependencies

- Cucumber
- junit
- selenium
- webdrivermanager

## Set up

- clone repository
  ```
  git clone https://github.com/Nidhisachan/selemiumAutomation.git
  cd /selemiumAutomation
  mvn clean install
  ```
- Test result generation on following path: /target/cucumber/index.html

## Folder Structure

```
├── README.md
├── pom.xml
├── src
│   └── test
│       ├── java
│       │   └── seleniumassignment
│       │       └── automation
│       │           ├── config
│       │           │   ├── RunCucumberTest.java
│       │           │   └── SharedContext.java
│       │           ├── pom
│       │           │   ├── actions
│       │           │   │   └── AbstractPage.java
│       │           │   ├── pages
│       │           │   │   ├── HomePage.java
│       │           │   │   ├── MyWishListPage.java
│       │           │   │   ├── ProductDetails.java
│       │           │   │   └── SearchResults.java
│       │           │   └── uielements
│       │           │       ├── HomePageElements.java
│       │           │       ├── ProductDetailPageElements.java
│       │           │       ├── SearchResultPageElements.java
│       │           │       └── WishListPageElements.java
│       │           └── stepdefs
│       │               ├── CommonSteps.java
│       │               ├── MyWishListSteps.java
│       │               └── SearchProductSteps.java
│       └── resources
│           └── seleniumassignment
│               └── automation
│                   ├── MyWishList.feature
│                   └── SearchProduct.feature
└── target
```
