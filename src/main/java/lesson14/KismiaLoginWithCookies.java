package lesson14;


import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static lesson7.part2.BrowserFactory.driver;

/**
 * Created by lolik on 2/19/18.
 */
public class KismiaLoginWithCookies {


    @Test
    public void azaza() throws IOException, InterruptedException {
        driver.get("https://kismia.com");
        List<Cookie> loginCookies = PostRequestExample.getLoginCookies();
        for(Cookie cookie : loginCookies){
            driver.manage().addCookie(cookie);
        }
        driver.get("https://kismia.com/profile");
        Thread.sleep(20000);
    }
}
