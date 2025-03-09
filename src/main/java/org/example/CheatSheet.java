//package org.example;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class CheatSheet {
//}
//
////**************** 1) Setup Driver ****************************
//// For Chrome
//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//WebDriver driver = new ChromeDriver();
//
//// For Firefox
//System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
//WebDriver driver = new FirefoxDriver();
//
//// For Edge
//System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver");
//WebDriver driver = new EdgeDriver();
////*****************************************************************

//// *************** 2) Browser Action **************************
//// Open a URL
//driver.get("https://www.example.com");
//
//// Get the current URL
//String currentUrl = driver.getCurrentUrl();
//
//// Get the page title
//String pageTitle = driver.getTitle();
//
//// Navigate back
//driver.navigate().back();
//
//// Navigate forward
//driver.navigate().forward();
//
//// Refresh the page
//driver.navigate().refresh();
//
//// Close the browser
//driver.close(); // Closes the current window
//driver.quit();  // Closes all windows and ends the session
////**********************************************************

//// ********** 3) Locating Elements ***********
//// By ID
//WebElement element = driver.findElement(By.id("element-id"));
//
//// By Name
//WebElement element = driver.findElement(By.name("element-name"));
//
//// By Class Name
//WebElement element = driver.findElement(By.className("element-class"));
//
//// By Tag Name
//WebElement element = driver.findElement(By.tagName("h1"));
//
//// By Link Text
//WebElement element = driver.findElement(By.linkText("Click Here"));
//
//// By Partial Link Text
//WebElement element = driver.findElement(By.partialLinkText("Click"));
//
//// By CSS Selector
//WebElement element = driver.findElement(By.cssSelector("div#id .class"));
//
//// By XPath
//WebElement element = driver.findElement(By.xpath("//div[@id='id']"));
////*******************************************************************

////************* 4) Interacting with Elements *****************
//// Enter text into a text box
//element.sendKeys("Hello, World!");
//
//// Clear text from a text box
//element.clear();
//
//// Click a button or link
//element.click();
//
//// Get text from an element
//String text = element.getText();
//
//// Get attribute value
//String attributeValue = element.getAttribute("value");
//
//// Check if an element is displayed
//boolean isDisplayed = element.isDisplayed();
//
//// Check if an element is enabled
//boolean isEnabled = element.isEnabled();
//
//// Check if an element is selected (for checkboxes/radio buttons)
//boolean isSelected = element.isSelected();
////*****************************************************************

////*************** 5) Dropdown (Select Case) *************
//// Locate the dropdown element
//WebElement dropdownElement = driver.findElement(By.id("dropdown"));
//
//// Create a Select object
//Select dropdown = new Select(dropdownElement);
//
//// Select by visible text
//dropdown.selectByVisibleText("Option 1");
//
//// Select by value
//dropdown.selectByValue("value1");
//
//// Select by index
//dropdown.selectByIndex(0);
//
//// Get all options
//List<WebElement> options = dropdown.getOptions();
//
//// Get the selected option
//WebElement selectedOption = dropdown.getFirstSelectedOption();
////************************************************************

////*************** 6) Handling Alerts ********************
//// Switch to alert
//Alert alert = driver.switchTo().alert();
//
//// Accept the alert
//alert.accept();
//
//// Dismiss the alert
//alert.dismiss();
//
//// Get alert text
//String alertText = alert.getText();
//
//// Send text to an alert (for prompts)
//alert.sendKeys("Text to send");
////***********************************************

////**************** 7) Waits ****************
////Implicit Waits
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
////Explicit Waits
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element-id")));
////*********************************************************

//// ************* 8) Frame and Windows *****************
//// Switch to a frame by index
//driver.switchTo().frame(0);
//
//// Switch to a frame by name or ID
//driver.switchTo().frame("frame-name");
//
//// Switch back to the main content
//driver.switchTo().defaultContent();
//
//// Switch to a new window
//for (String windowHandle : driver.getWindowHandles()) {
//        driver.switchTo().window(windowHandle);
//}
/// /*******************************************

////************ 9) Screenshot **************
//// Take a screenshot
//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(screenshotFile, new File("/path/to/screenshot.png"));
////*********************************************

////*********** 10) Mouse & keyboard action ***************
//Actions actions = new Actions(driver);
//
//// Click and hold
//actions.clickAndHold(element).perform();
//
//// Double click
//actions.doubleClick(element).perform();
//
//// Right click
//actions.contextClick(element).perform();
//
//// Drag and drop
//actions.dragAndDrop(sourceElement, targetElement).perform();
//
//// Send keys
//actions.sendKeys(Keys.ENTER).perform();
////***********************************************************