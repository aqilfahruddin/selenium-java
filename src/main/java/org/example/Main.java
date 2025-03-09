package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Selenium//WebDriver//chromedriver134.exe/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}