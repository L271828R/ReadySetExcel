# Test Sample for Ready Set Test!
This is a sample written in TestNG the educational organization.

# To Run
clone this repo and run

```
mvn install
mvn test
```
# Dependencies
As described in the pom file, this test uses
TestNG, Selenium


# Troubleshooting
Kindly run with Chrome and the appropriate driver.
Place chromedriver in /target folder or one of your 
choosing my modifying.

AppTest.java
```
@BeforeTest
public void setBaseUrl() {
	System.setProperty("webdriver.chrome.driver", ".//chromedriver");
	driver = new ChromeDriver();
	page = new ReadySetExcelPage(driver);
	page.go();
}
```

