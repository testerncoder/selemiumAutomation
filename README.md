# Automate Wishlist with Selenium & Cucumber (BDD)

## Dependencies

- [Cucumber](https://github.com/cucumber/cucumber)
- [Junit](https://mvnrepository.com/artifact/junit/junit/4.12)
- [Selenium](https://github.com/SeleniumHQ/selenium)
- [Webdrivermanager](https://github.com/bonigarcia/webdrivermanager)

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

## Folder Description

- **_config:_**
- **_pom:_**
- **_stepdefs:_**
- **_resources:_**
- **_target:_** Test report generation happens in this folder

