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

![image](https://gm1.ggpht.com/AQtaBGiMikbfnw_53g7-_zeJMWH-igh7xatdD_6foXsQJ5xtg6z25AMLGvGAeUjNNYC3AyEUpigwj4YemfA7yzc6DhICSIWDO4-M4fWVa-qBZUtc9ItR8zoBxUF8tV9qkuVZrRHtuNDh21ofclL1zw3gNc_qh8O1UTHv1pNsHQeMvHNr1MOggFLoxDaUqDZgArAaVHwkLVlR_G-eMbyfyaIDgrQkG1yi7wl5qPFJdTelyzrWaX4m4d0r6p_82FnXzDlSe5mDp6jJk5WpZhJZ8FPNeB7P6A2fTE57LZEpqHa_IMXuDjYX_Wm4aZv-tj9U5LpLegYqmV3Jpr0Mu1_V4IHOTLg-FxiVqHBeAcOIyAB4SDjRQvrIp1kc4emFp4xKIDA6IdKg2TOMUX3jtZCY0LDbwg0Lh90bmnwFHGTHWLv1r5PJLUsCyJJZxiaoFkEtX6pWXBGRMtCXfIAxSA0bL3varjKuWNV_YwLZUhayVZmKx8siqtWqH18X9oFBVOP1xsUbGeue-Rskhhw6w2S3beLUoc7ajPWz6rsOEXqA25BR_Yf6FZSzQN8s8NuVCT00qG5g648wntGvfTv3vXSZYMZ9043R8IDM9l9-rOzJoHpgcc5YrS5K3gqUccnoVZohSJHGwQTakgxgME_kAXceRcXE_IUqutCu1WqJGpJiMQxDaLyrccMfasfP3bpTYxAo-Zst22nAhLm2dRzR3bEzkMnfxR5OXJrAnSpp=s0-l75-ft-l75-ftg)

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

