package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LiniaKino {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://liniakino.com/showtimes/aladdin/");

        // WebElement 3DSeans =
        //   driver.findElement(By.xpath("//*[@id=\"content-inner\"]/div/div/a[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"content-inner\"]/div/ul/li[3]/div[2]/div[1]/div/ul/li/a")).click();

        Thread.sleep(5000);


        WebElement starWarsFrame = driver.findElement(By.xpath("//*[@id=\"vkino-widget\"]/iframe"));
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
