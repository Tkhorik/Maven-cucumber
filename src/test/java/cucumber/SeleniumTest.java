package cucumber;


import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(FirefoxDriver.MARIONETTE, false);
        //        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("log")).sendKeys("testuser_1");
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
        driver.findElement(By.id("login")).click();
        System.out.println("Login Successfully");
        driver.findElement(By.xpath("//INPUT[@id='login']")).click();
        System.out.println("LogOut Successfully " + Calendar.getInstance().getTime());
        driver.quit();

    }

}