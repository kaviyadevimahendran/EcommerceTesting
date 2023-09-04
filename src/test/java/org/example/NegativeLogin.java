
package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class NegativeLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaviy\\Desktop\\drivers\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ecommerce-playground.lambdatest.io/");
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //click on login btn
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        // Finding UserName
        driver.findElement(By.id("input-email")).sendKeys("kaviyamahendran98@gmail.com");

        // Enter your login password (negative pwd)
        driver.findElement(By.id("input-password")).sendKeys("kaviya10");

        //click submit btn
        driver.findElement(By.xpath("//input[@type='submit']")).click();


    try {
        assertEquals(driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')]//i[1]")).getText(), " Warning: No match for E-Mail Address and/or Password.");

        //If the message is displayed

        System.out.println("PASS");

    } catch (Exception e) {

        //If the message is not displayed

        System.out.println("FAIL");

    }}
}
