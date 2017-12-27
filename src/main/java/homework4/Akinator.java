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


        driver.findElement(By.cssSelector("#infos-area-footer > input[type=\"submit\"]")).click();

        Thread.sleep(1000);


//        String question = driver.findElement(By.cssSelector("#bulle-inner")).getText();

        boolean flag = true;

//        while(question.e){

        String question = null;


        try {

            while (flag)
                question = driver.findElement(By.cssSelector("#bulle-inner")).getText();
            System.out.println(question);
            System.out.println();
            System.out.println("да - 1 \n" + "нет - 2 \n");
            int answer = sc.nextInt();

            switch (answer) {
                case 1:
                    System.out.println("decd");
                    break;
                case 2:
                    System.out.println("decvbcfgbdfbdfbd");
                    break;
            }

        } catch (Exception e) {
            System.out.println("jhagshjcb");


        }


    }
}
