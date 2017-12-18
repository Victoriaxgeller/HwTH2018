package lesson4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/viktoriiakorda/webDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);

        driver.quit();
    }

}
