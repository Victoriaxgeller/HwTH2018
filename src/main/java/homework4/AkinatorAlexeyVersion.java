package homework4;

/**
 * Created by Victoria on 19.01.18.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AkinatorAlexeyVersion {

    public static void main(String[] args) throws InterruptedException {
        String answersOptions = ("Варианты ответов: " + "\n" +
                "1: Да" + "\n" +
                "2: Нет" + "\n" +
                "3: Я не знаю" + "\n" +
                "4: Возможно Частично" + "\n" +
                "5: Скорее нет Не совсем");
        boolean endLoop = true;

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        System.out.println("Информация об игроке\nВозраст: ");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();

        driver.get("http://ru.akinator.com/");
        driver.findElement(By.xpath("//a[@class='rouge']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(age);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        while (endLoop) {
            Thread.sleep(1000);
            String question = driver.findElement(By.cssSelector("div#bulle-inner")).getText();
            System.out.println(question);
            System.out.println(answersOptions);
            Scanner scanner1 = new Scanner(System.in);
            int answer = scanner1.nextInt();
            switch (answer) {
                case 1:
                    driver.findElement(By.id("reponse1")).click();
                    break;
                case 2:
                    driver.findElement(By.id("reponse2")).click();
                    break;
                case 3:
                    driver.findElement(By.id("reponse3")).click();
                    break;
                case 4:
                    driver.findElement(By.id("reponse4")).click();
                    break;
                case 5:
                    driver.findElement(By.id("reponse5")).click();
                    break;
                default:
                    System.out.println("Выберите один из предложенных авриантов ответа");
            }
            Thread.sleep(2000);
            String url = driver.getCurrentUrl();
            if (!url.equals("http://ru.akinator.com/personnages/jeu")) {
                endLoop = false;
            }
        }

        String character = driver.findElement(By.id("perso")).getText();
        String description = driver.findElement(By.id("description")).getText();
        System.out.println(character + "\n" + description);

    }
}