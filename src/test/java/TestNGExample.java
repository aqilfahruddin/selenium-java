import com.sun.source.tree.IfTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.function.Function;

import static org.testng.Assert.assertEquals;

public class TestNGExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C://Selenium//WebDriver//chromedriver134.exe/");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void LoginPage() {

        // Initialize variable
        String firstProduct, productDetails, currentUrl, expectedURL, error;
        String username = "standard_user";
        String password = "secret_sauce1";

        // Key in Login credential
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        currentUrl = driver.getCurrentUrl();
        expectedURL = "https://www.saucedemo.com/inventory.html";
//        Assert.assertEquals(currentUrl,expectedURL);

        if (!currentUrl.contains(expectedURL)){
            //Verify error message appear
//            error = driver.findElement(By.xpath("//form/div[3]/h3[contains(@data-test,'error')]")).getText();
            System.out.println(driver.findElement(By.xpath("//form/div[3]/h3[contains(@data-test,'error')]")).getText());
        }


        //If Error, it


        // Click first item
//        driver.findElement(By.id("item_4_title_link")).click();

        // Need to verify the page loaded is correct
        // --------

        // Get Current Product name & details
//        firstProduct = driver.findElement(By.className("inventory_details_name")).getText();
//        productDetails = driver.findElement(By.className("inventory_details_desc")).getText();
//
//        // Display in report
//        System.out.println("Page title: " + driver.getTitle());
//        System.out.println("Product : " + firstProduct);
//        System.out.println("Product Details : " + productDetails);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}