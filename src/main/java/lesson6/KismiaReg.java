package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KismiaReg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://kismia.com");
    }

}
