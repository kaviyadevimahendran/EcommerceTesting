
package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

    public class LoginFunctionality {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaviy\\Desktop\\drivers\\chrome-win64\\chrome.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.get("https://ecommerce-playground.lambdatest.io/");
            String url = "https://ecommerce-playground.lambdatest.io/";
            driver.get(url);
            //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //click on login btn
            driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
            // Finding UserName
            driver.findElement(By.id("input-email")).sendKeys("kaviyamahendran98@gmail.com");

            // Enter your login password
            driver.findElement(By.id("input-password")).sendKeys("kaviya@10");

            //click submit btn
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        }

    }
