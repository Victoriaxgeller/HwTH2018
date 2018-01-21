package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailField.clear();
        emailField.sendKeys("Vika.smile1993@mail.ru");

        WebElement passField = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        passField.clear();
        passField.sendKeys("Fruttini32");

        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
        Thread.sleep(3000);

        System.out.println("TITLE: " + driver.getTitle());

        driver.quit();


    }
}
