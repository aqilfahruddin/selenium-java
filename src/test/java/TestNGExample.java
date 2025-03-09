import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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

        String firstProduct, productDetails;

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

//      Click first item
        driver.findElement(By.id("item_4_title_link")).click();

        firstProduct = driver.findElement(By.className("inventory_details_name")).getText();
        productDetails = driver.findElement(By.className("inventory_details_desc")).getText();

        System.out.println("Page title: " + driver.getTitle());
        System.out.println("Product : " + firstProduct);
        System.out.println("Product Details : " + productDetails);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}