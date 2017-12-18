import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
    public static void main(String[] args) throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/login/");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.clear();
        emailField.sendKeys("testlogin@test.test");

        WebElement passField = driver.findElement(By.id("pass"));
        emailField.clear();
        emailField.sendKeys("TESTPASSWORD");

        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);

        System.out.println(driver.getTitle());
        driver.quit();
    }
}