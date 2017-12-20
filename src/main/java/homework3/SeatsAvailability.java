package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Victoria on 14.12.17.
 */
public class SeatsAvailability {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Victoria/WebDrivers/chromedriver");



        WebDriver driver = new ChromeDriver();
        driver.get("http://liniakino.com/showtimes/aladdin/");
        //driver.findElement(By.xpath("//*[@id='closeButton']")).click();
        //driver.findElement(By.xpath("//*[@class='showtime-movie'][1]/div[@class='showtime']/div[1]//li[@class='showtime-item'][1]/a")).click();

        Thread.sleep(5000);

        WebElement starWarsFrame = driver.findElement(By.xpath("//*[@class='arcticmodal-container_i']//iframe"));
        driver.switchTo().frame(starWarsFrame);

        List<WebElement> atAllSeats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']/div/child::div"));
        System.out.println("Всего мест в зале: " + atAllSeats.size());
        List<WebElement> freeSeats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//div[@class='seat seat-color1']"));
        System.out.println("Свободных мест: " + freeSeats.size());
        List<WebElement> occupiedSeats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//div[@class='seat seat-occupied']"));
        System.out.println("Занятых мест: " + occupiedSeats.size());
        List<WebElement> reservedSeats = driver.findElements(By.xpath("//*[@id='hall-scheme-container']//div[@class='seat seat-reserved']"));
        System.out.println("Резерв мест: " + reservedSeats.size());

        int persentPlases = (((reservedSeats.size() + freeSeats.size()) * 100) / atAllSeats.size());
        System.out.println("Процент свободных мест: " + persentPlases + "%");
        System.out.println("Процент занятых мест: " + (100 - persentPlases) + "%");

        Thread.sleep(3000);
        driver.quit();
    }
}
