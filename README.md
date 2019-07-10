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

![image](https://lh3.googleusercontent.com/-nVG-10LrloeNPH9NzIehNdOT2oAPl5dgjD1XFP_TLG1hhnWyAXqIKgwG5sGMDHgdHerVgS1OHBLlkxsoOzg7mkuOB-8ZC-ZLBHqqh0dP1xKHYAnGEm_QRnQCMTksmmeSrWkoG5uQ3WnNTBiDgfFhAo-W1WYDb8JJGNksnum311SNLXTmep4fvqj2rPh6SFqQKZZxY9NnH9NxW3Cx6iN7HrSMxis0_2GOdJKhMvXJwmQt3-8_hFBX-4yZTrS0_vf1SPGSVxsK-bhF26JcTgwHrimMFsCvkR8YpcSvzNYNenX-PPdWdjW9eR69ta8TBE7d_jMMn_Gnw_CCnOca7YAygZ25O1OR8xxA1FcJT1PvkryRTUohlToFaYzweml5JQIjBAJlDpkKjUNZ_zbMVWInjTdhIRXYx4VjSKyOGXLn_lYGPRvvWrdtZ-4XFudcBIySqUAf74qrTh87IBJB3DRAter4425rAF3zkvgaOsMPVTDyUh0y6GMKsQpoPcoUfQTQFBvk1cNcmwMBV4pn4DZdPbB96TpdAP5-rx5NWb_L7wMgS03yhUds6j0IT-p-burZ-ha_1zkmij659D6uG1z8MmXFPkiNrBGWAMINow=w3048-h1548)

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

- **_config:_** Defining cucumber class runner and cucumber options.
- **_pom:_** Defining page locators, page actions.
- **_stepdefs:_** Defining step definitions of the respective feature files.
- **_resources:_** Defining feature files in gherkin.
- **_target:_** Test report generation happens in this folder.

