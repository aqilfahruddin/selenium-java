package org.example;

import org.openqa.selenium.By;
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

    public void LoginPage (){
        //Initialize Web Driver
        System.setProperty("webdriver.chrome.driver", "C://Selenium//WebDriver//chromedriver134.exe/");
        WebDriver driver = new ChromeDriver();

        //Redirect to Sauce Lab site
        driver.get("https://www.saucedemo.com/");

        //Key In login credential
        String currentURL;
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String username = "standard_user";
        String password = "secret_sauce";
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        currentURL = driver.getCurrentUrl();
//        Assert.isTrue(currentURL,expectedURL);






    }
}