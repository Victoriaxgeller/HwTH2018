package kismia;

import io.qameta.allure.Step;
import kismia.MainPage;
import lesson10.DriverEventListener;
import lessonTrelloApi.serDeser.SerializationWorker;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FunctionalTests {

    public String email = "Vika.smile1993@mail.ru";
    public String password = "1234";
    private static final String INCORRECT_RESPONSE_TEXT = "Incorrect response: ";

    WebDriver driver = new ChromeDriver();

    MainPage login = new MainPage();

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver = new EventFiringWebDriver(driver).register(new DriverEventListener());
        driver.get("https://kismia.com/");
        //Thread.sleep(1000);
    }


    @Test(priority = 1)
    public void Login() throws IOException, InterruptedException {
        //WebElement emailLoginButton = driver.findElement(By.cssSelector(login.emailLoginButton));
        WebElement emailLoginButton = driver.findElement(By.cssSelector("#user-email"));

        Thread.sleep(1000);
        emailLoginButton.click();
        emailLoginButton.clear();
        emailLoginButton.sendKeys(email);

        //WebElement passwordLoginButton = driver.findElement(By.cssSelector(login.passwordLoginButton));
        WebElement passwordLoginButton = driver.findElement(By.cssSelector("#user-password"));

        Thread.sleep(1000);
        passwordLoginButton.click();
        passwordLoginButton.clear();
        passwordLoginButton.sendKeys(password);

        // WebElement submitButton = driver.findElement(By.cssSelector(login.submitButton));
        WebElement submitButton = driver.findElement(By.cssSelector("#sign-in-form > button"));
        Thread.sleep(1000);
        submitButton.click();
        Thread.sleep(5000);

        String title = driver.getTitle();
        System.out.println("TITLE " + title);

        WebElement matchesPage = driver.findElement(By.cssSelector("body > div.main_content > header > div > div.new-header-center > ul > li:nth-child(1) > a"));
        matchesPage.click();
        String currentURL = driver.getCurrentUrl();


        System.out.println("currentURL" + currentURL);
        //   assertDone(currentURL, "https://kismia.com/u17121788", INCORRECT_RESPONSE_TEXT);
        asserTrue(currentURL, "https://kismia.com/u17121788", INCORRECT_RESPONSE_TEXT);

    }

    @Test(priority = 2)
    public void getAndSetCookie() throws IOException, InterruptedException {
        Set<Cookie> cookies = driver.manage().getCookies();

        SerializationWorker.serializeStorage(cookies, "kismiaCookies");
        System.out.println("UYTYRTYRTRTRTRTY" + cookies);

    }

    @Test(priority = 3)
    public void LogOut() throws IOException, InterruptedException {

    }

    @Test(priority = 4)
    public void loadCookies() throws InterruptedException {
        driver.get("https://kismia.com");

        Set<Cookie> cookies = (Set<Cookie>) SerializationWorker.deserialzeStorage("kismiaCookies");
        for (Cookie cookie : cookies) {
            driver.manage().addCookie(cookie);
        }
        // Open Page with Cookies
        driver.get("https://kismia.com");
        Thread.sleep(10000);

        System.out.println("TETTETTETTETETTETETTETE " + cookies);
        driver.get("https://kismia.com/matches");
        Thread.sleep(10000);
    }

    @Test(priority = 5)
    public void sendMessage() throws InterruptedException {
        driver.get("https://kismia.com/thread17624531");
        Thread.sleep(10000);

        driver.findElement(By.cssSelector(".chat-controls__textarea")).sendKeys("Hello");

    }


//    @AfterTest
//    public void quit() {
//        driver.quit();
//        // driver.close();
//    }


//    @BeforeSuite
//    @Parameters({"before", "isStage"})
//    public void beforeAll(String before, @Optional("true") boolean isStage) {
//    }


    private void assertDone(String actual, String expected, String message) {

        assertEquals(actual, expected, message);
    }

    private void asserTrue(String actual, String expected, String message) {
        actual.contains(expected);
    }


}
