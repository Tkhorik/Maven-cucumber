package cucumber;


import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;

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

/*
public class GameSteps {
    private Game _target;
    private String _actualResult;

    @Given("^I am officiating a \"([^\"]*)\" game$")
    public void I_am_officiating_a_game(String gameTypeName) {
        GameType gameType = GameType.valueOf(gameTypeName);
        _target = GameFactory.createGame(gameType);
    }

    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int playedNumber) {
        _actualResult = _target.checkPlay(playedNumber);
    }

    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void I_should_be_told_the_correct_answer_is(String expectedResult) {
        assertEquals(expectedResult, _actualResult);
    }
}*/
