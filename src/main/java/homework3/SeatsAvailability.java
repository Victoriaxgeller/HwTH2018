package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Victoria on 14.12.17.
 */
public class SeatsAvailability {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("http://liniakino.com/showtimes/aladdin/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content-inner\"]/div/ul/li[1]//li[1]/a")).click();

        Thread.sleep(2000);
    }
}
