//package org.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class loginFunctionality {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        System.setProperty((“WebDriver.chrome.driver”,https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)
//        // }
//
//}
package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

    public class LoginFunctionality {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaviy\\Downloads\\chromedriver_win32 (3)");
            WebDriver driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            // Finding UserName
            driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
            driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();



        }

    }