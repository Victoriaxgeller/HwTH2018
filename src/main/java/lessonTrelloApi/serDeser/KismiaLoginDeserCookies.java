package lessonTrelloApi.serDeser;

import lesson7.part2.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.Set;

/**
 * Created by lolik on 2/19/18.
 */
public class KismiaLoginDeserCookies extends BrowserFactory {



    @Test (priority = 0)
    public void saveCookies() throws InterruptedException {
        // Save Cookies to file
        driver.get("https://kismia.com");
        driver.findElement(By.cssSelector("#user-email")).clear();
        driver.findElement(By.cssSelector("#user-email")).sendKeys("Loliktest1@mail.ru");
        driver.findElement(By.cssSelector("#user-password")).clear();
        driver.findElement(By.cssSelector("#user-password")).sendKeys("qwe1rty2");
        driver.findElement(By.cssSelector("#sign-in-form .submit")).click();
        Thread.sleep(5000);
        Set<Cookie> cookies = driver.manage().getCookies();
        SerializationWorker.serializeStorage(cookies, "kismiaCookies");
        System.out.println("TETTETTETETTETETETTE" + cookies);
    }

    @Test(priority = 1)
    public void loadCookies() throws InterruptedException {
        driver.get("https://kismia.com");

        Set<Cookie> cookies = (Set<Cookie>) SerializationWorker.deserialzeStorage("kismiaCookies");
        System.out.println("TETETETTETTETTETET" + cookies);
        for (Cookie cookie : cookies) {
            driver.manage().addCookie(cookie);
        }





        // Open Page with Cookies
        driver.get("https://kismia.com");
        Thread.sleep(10000);
    }


}
