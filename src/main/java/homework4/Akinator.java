package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

/**
 * Created by Victoria on 25.12.17.
 */
public class Akinator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Scanner sc = new Scanner(System.in);


        //захожу на сайт
        driver.get("http://ru.akinator.com/");
        Thread.sleep(3000);


        //нажимаю играть
        WebElement playButton = driver.findElement(By.cssSelector("#bulle-inner > a"));
        playButton.click();

        System.out.println("Привет,\n" +
                "я - Акинатор.");

        System.out.println("Задумайте реального или вымышленного персонажа , Я попытаюсь отгадать его.");


        //спрашиваю возраст
        System.out.println("Введите Ваш возраст..");

        String age = sc.next();


        //ввожу возраст
        WebElement ageField = driver.findElement(By.id("elokence_sitebundle_identification_age"));
        ageField.clear();
        ageField.sendKeys(age);

        //нажимаю кнопки начать
        driver.findElement(By.cssSelector("#infos-area-footer > input[type=\"submit\"]")).click();

        Thread.sleep(1000);


        boolean flag = true;

        //   String question = null;


        WebElement reponse1 = driver.findElement(By.id("reponse1"));
        WebElement reponse2 = driver.findElement(By.id("reponse2"));
        WebElement reponse3 = driver.findElement(By.id("reponse3"));
        WebElement reponse4 = driver.findElement(By.id("reponse4"));
        WebElement reponse5 = driver.findElement(By.id("reponse5"));

        try {

            while (flag) {
                String question = driver.findElement(By.id("bulle-inner")).getText();
                System.out.println(question);
                System.out.println();
                System.out.println("да - 1 \n" + "нет - 2 \n" + "я не знаю - 3 \n" + "Возможно частично - 4 \n" + "Скорее нет не совсем - 5 \n");
                int answer = sc.nextInt();

                switch (answer) {
                    case 1:
                        reponse1.click();
                        break;
                    case 2:
                        reponse2.click();
                        break;
                    case 3:
                        reponse3.click();
                        break;
                    case 4:
                        reponse4.click();
                        break;
                    case 5:
                        reponse5.click();
                        break;
                }
                //Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("jhagshjcb");


        }


    }
}
