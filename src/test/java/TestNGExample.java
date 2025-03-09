import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {
    @Test
    public void testGoogleTitle() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//WebDriver//chromedriver134.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Page title: " + driver.getTitle());
        driver.quit();
    }
}